package com.example.git_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitStudyApplication {

    public static void main(String[] args) {
        System.out.println("new line");
        System.out.println("");
        System.out.println("a");
        System.out.println("b");
        SpringApplication.run(GitStudyApplication.class, args);
    }

}
