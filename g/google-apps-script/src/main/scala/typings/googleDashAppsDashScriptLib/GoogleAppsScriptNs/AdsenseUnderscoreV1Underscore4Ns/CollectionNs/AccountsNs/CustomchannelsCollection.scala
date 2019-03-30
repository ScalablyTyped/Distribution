package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsCollection extends js.Object {
  var Adunits: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.AccountsNs.CustomchannelsNs.AdunitsCollection
  ] = js.native
  // Get the specified custom channel from the specified ad client for the specified account.
  def get(accountId: java.lang.String, adClientId: java.lang.String, customChannelId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.CustomChannel = js.native
  // List all custom channels in the specified ad client for the specified account.
  def list(accountId: java.lang.String, adClientId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.CustomChannels = js.native
  // List all custom channels in the specified ad client for the specified account.
  def list(accountId: java.lang.String, adClientId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.CustomChannels = js.native
}

