package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsCollection extends js.Object {
  var Adunits: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.CustomchannelsNs.AdunitsCollection
  ] = js.native
  // Get the specified custom channel from the specified ad client.
  def get(adClientId: java.lang.String, customChannelId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.CustomChannel = js.native
  // List all custom channels in the specified ad client for this AdSense account.
  def list(adClientId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.CustomChannels = js.native
  // List all custom channels in the specified ad client for this AdSense account.
  def list(adClientId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.CustomChannels = js.native
}

