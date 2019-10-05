package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Domains2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainsCollection extends js.Object {
  // Retrieves a domain of the customer.
  def get(customer: String, domainName: String): Domains
  // Inserts a domain of the customer.
  def insert(resource: Domains, customer: String): Domains
  // Lists the domains of the customer.
  def list(customer: String): Domains2
  // Deletes a domain of the customer.
  def remove(customer: String, domainName: String): Unit
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
}

