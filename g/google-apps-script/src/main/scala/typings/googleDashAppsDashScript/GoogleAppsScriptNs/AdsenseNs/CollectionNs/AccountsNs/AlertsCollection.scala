package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Alerts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertsCollection extends js.Object {
  // List the alerts for the specified AdSense account.
  def list(accountId: String): Alerts = js.native
  // List the alerts for the specified AdSense account.
  def list(accountId: String, optionalArgs: js.Object): Alerts = js.native
  // Dismiss (delete) the specified alert from the specified publisher AdSense account.
  def remove(accountId: String, alertId: String): Unit = js.native
}

