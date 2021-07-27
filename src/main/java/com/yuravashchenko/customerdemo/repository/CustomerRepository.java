package com.yuravashchenko.customerdemo.repository;

import com.yuravashchenko.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * repository interface for {@link Customer} class
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
