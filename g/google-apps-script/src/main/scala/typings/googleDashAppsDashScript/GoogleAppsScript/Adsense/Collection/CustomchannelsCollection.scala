package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.CustomChannel
import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.CustomChannels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsCollection extends js.Object {
  var Adunits: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Customchannels.AdunitsCollection
  ] = js.native
  // Get the specified custom channel from the specified ad client.
  def get(adClientId: String, customChannelId: String): CustomChannel = js.native
  // List all custom channels in the specified ad client for this AdSense account.
  def list(adClientId: String): CustomChannels = js.native
  // List all custom channels in the specified ad client for this AdSense account.
  def list(adClientId: String, optionalArgs: js.Object): CustomChannels = js.native
}

