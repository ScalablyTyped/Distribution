package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsCollection extends js.Object {
  var Customchannels: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AdunitsNs.CustomchannelsCollection
  ] = js.native
  // Gets the specified ad unit in the specified ad client.
  def get(adClientId: java.lang.String, adUnitId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.AdUnit = js.native
  // Get ad code for the specified ad unit.
  def getAdCode(adClientId: java.lang.String, adUnitId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.AdCode = js.native
  // List all ad units in the specified ad client for this AdSense account.
  def list(adClientId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.AdUnits = js.native
  // List all ad units in the specified ad client for this AdSense account.
  def list(adClientId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.AdUnits = js.native
}

