package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomersCollection extends js.Object {
  // Get a customer account.
  def get(customerId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer = js.native
  // Order a new customer's account.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer = js.native
  // Order a new customer's account.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer = js.native
  // Update a customer account's settings. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer = js.native
  // Update a customer account's settings.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer,
    customerId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs.Customer = js.native
}

