package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsCollection extends js.Object {
  var Customchannels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.AccountsNs.AdunitsNs.CustomchannelsCollection
  ] = js.native
  // Gets the specified ad unit in the specified ad client for the specified account.
  def get(accountId: java.lang.String, adClientId: java.lang.String, adUnitId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdUnit = js.native
  // Get ad code for the specified ad unit.
  def getAdCode(accountId: java.lang.String, adClientId: java.lang.String, adUnitId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdCode = js.native
  // List all ad units in the specified ad client for the specified account.
  def list(accountId: java.lang.String, adClientId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdUnits = js.native
  // List all ad units in the specified ad client for the specified account.
  def list(accountId: java.lang.String, adClientId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.AdUnits = js.native
}

