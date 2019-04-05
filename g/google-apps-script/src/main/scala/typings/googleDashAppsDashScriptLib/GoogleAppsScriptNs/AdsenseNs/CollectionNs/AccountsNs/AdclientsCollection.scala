package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdclientsCollection extends js.Object {
  // Get Auto ad code for a given ad client.
  def getAdCode(accountId: java.lang.String, adClientId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdCode = js.native
  // List all ad clients in the specified account.
  def list(accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdClients = js.native
  // List all ad clients in the specified account.
  def list(accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdClients = js.native
}

