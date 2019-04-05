package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomersCollection extends js.Object {
  // Get a customer account.
  def get(customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer = js.native
  // Order a new customer's account.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer = js.native
  // Order a new customer's account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer = js.native
  // Update a customer account's settings. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer = js.native
  // Update a customer account's settings.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer = js.native
}

