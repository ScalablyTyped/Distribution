package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdCode
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdUnit
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsCollection extends js.Object {
  var Customchannels: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.AdunitsNs.CustomchannelsCollection
  ] = js.native
  // Gets the specified ad unit in the specified ad client for the specified account.
  def get(accountId: String, adClientId: String, adUnitId: String): AdUnit = js.native
  // Get ad code for the specified ad unit.
  def getAdCode(accountId: String, adClientId: String, adUnitId: String): AdCode = js.native
  // List all ad units in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String): AdUnits = js.native
  // List all ad units in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String, optionalArgs: js.Object): AdUnits = js.native
}

