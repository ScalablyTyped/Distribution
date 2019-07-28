package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomersCollection extends js.Object {
  // Get a customer account.
  def get(customerId: String): Customer = js.native
  // Order a new customer's account.
  def insert(resource: Customer): Customer = js.native
  // Order a new customer's account.
  def insert(resource: Customer, optionalArgs: js.Object): Customer = js.native
  // Update a customer account's settings. This method supports patch semantics.
  def patch(resource: Customer, customerId: String): Customer = js.native
  // Update a customer account's settings.
  def update(resource: Customer, customerId: String): Customer = js.native
}

