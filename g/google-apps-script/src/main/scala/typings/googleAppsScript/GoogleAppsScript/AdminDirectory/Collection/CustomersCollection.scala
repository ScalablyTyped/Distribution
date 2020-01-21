package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersCollection extends js.Object {
  // Retrieves a customer.
  def get(customerKey: String): Customer
  // Updates a customer. This method supports patch semantics.
  def patch(resource: Customer, customerKey: String): Customer
  // Updates a customer.
  def update(resource: Customer, customerKey: String): Customer
}

object CustomersCollection {
  @scala.inline
  def apply(
    get: String => Customer,
    patch: (Customer, String) => Customer,
    update: (Customer, String) => Customer
  ): CustomersCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[CustomersCollection]
  }
}

