package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomersCollection extends js.Object {
  
  // Retrieves a customer.
  def get(customerKey: String): Customer = js.native
  
  // Updates a customer. This method supports patch semantics.
  def patch(resource: Customer, customerKey: String): Customer = js.native
  
  // Updates a customer.
  def update(resource: Customer, customerKey: String): Customer = js.native
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
  
  @scala.inline
  implicit class CustomersCollectionOps[Self <: CustomersCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: String => Customer): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: (Customer, String) => Customer): Self = this.set("patch", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (Customer, String) => Customer): Self = this.set("update", js.Any.fromFunction2(value))
  }
}
