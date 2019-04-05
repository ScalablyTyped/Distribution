package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersCollection extends js.Object {
  // Retrieves a customer.
  def get(customerKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer
  // Updates a customer. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer,
    customerKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer
  // Updates a customer.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer,
    customerKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer
}

object CustomersCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer,
    patch: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer,
    update: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Customer
  ): CustomersCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction2(patch), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[CustomersCollection]
  }
}

