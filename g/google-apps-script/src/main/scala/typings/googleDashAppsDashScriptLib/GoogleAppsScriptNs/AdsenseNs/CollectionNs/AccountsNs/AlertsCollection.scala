package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsCollection extends js.Object {
  // List the alerts for the specified AdSense account.
  def list(accountId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Alerts = js.native
  // List the alerts for the specified AdSense account.
  def list(accountId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Alerts = js.native
  // Dismiss (delete) the specified alert from the specified publisher AdSense account.
  def remove(accountId: java.lang.String, alertId: java.lang.String): scala.Unit = js.native
}

