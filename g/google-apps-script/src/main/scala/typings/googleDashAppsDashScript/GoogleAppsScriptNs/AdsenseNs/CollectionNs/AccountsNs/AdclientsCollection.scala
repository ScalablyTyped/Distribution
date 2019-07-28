package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdClients
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsCollection extends js.Object {
  // Get Auto ad code for a given ad client.
  def getAdCode(accountId: String, adClientId: String): AdCode = js.native
  // List all ad clients in the specified account.
  def list(accountId: String): AdClients = js.native
  // List all ad clients in the specified account.
  def list(accountId: String, optionalArgs: js.Object): AdClients = js.native
}

