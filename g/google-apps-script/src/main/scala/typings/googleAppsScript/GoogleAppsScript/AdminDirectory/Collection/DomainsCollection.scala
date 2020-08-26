package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainsCollection extends js.Object {
  // Retrieves a domain of the customer.
  def get(customer: String, domainName: String): Domains = js.native
  // Inserts a domain of the customer.
  def insert(resource: Domains, customer: String): Domains = js.native
  // Lists the domains of the customer.
  def list(customer: String): Domains2 = js.native
  // Deletes a domain of the customer.
  def remove(customer: String, domainName: String): Unit = js.native
}

object DomainsCollection {
  @scala.inline
  def apply(
    get: (String, String) => Domains,
    insert: (Domains, String) => Domains,
    list: String => Domains2,
    remove: (String, String) => Unit
  ): DomainsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[DomainsCollection]
  }
  @scala.inline
  implicit class DomainsCollectionOps[Self <: DomainsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => Domains): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setInsert(value: (Domains, String) => Domains): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => Domains2): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
  
}

