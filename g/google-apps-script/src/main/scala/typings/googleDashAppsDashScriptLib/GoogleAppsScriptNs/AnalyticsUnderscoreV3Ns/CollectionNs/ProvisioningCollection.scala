package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningCollection extends js.Object {
  // Creates an account ticket.
  def createAccountTicket(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTicket
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTicket
  // Provision account.
  def createAccountTree(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTreeRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTreeResponse
}

object ProvisioningCollection {
  @scala.inline
  def apply(
    createAccountTicket: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTicket => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTicket,
    createAccountTree: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTreeRequest => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs.AccountTreeResponse
  ): ProvisioningCollection = {
    val __obj = js.Dynamic.literal(createAccountTicket = js.Any.fromFunction1(createAccountTicket), createAccountTree = js.Any.fromFunction1(createAccountTree))
  
    __obj.asInstanceOf[ProvisioningCollection]
  }
}

