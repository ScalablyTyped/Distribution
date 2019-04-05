package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningCollection extends js.Object {
  // Creates an account ticket.
  def createAccountTicket(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTicket): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTicket
  // Provision account.
  def createAccountTree(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTreeRequest): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTreeResponse
}

object ProvisioningCollection {
  @scala.inline
  def apply(
    createAccountTicket: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTicket => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTicket,
    createAccountTree: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTreeRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs.AccountTreeResponse
  ): ProvisioningCollection = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket), createAccountTree = js.Any.fromFunction1(createAccountTree))
  
    __obj.asInstanceOf[ProvisioningCollection]
  }
}

