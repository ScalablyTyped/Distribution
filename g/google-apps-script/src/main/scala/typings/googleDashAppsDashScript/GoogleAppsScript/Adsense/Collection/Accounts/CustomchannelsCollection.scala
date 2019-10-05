package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.CustomChannel
import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.CustomChannels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomchannelsCollection extends js.Object {
  var Adunits: js.UndefOr[
    typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts.Customchannels.AdunitsCollection
  ] = js.native
  // Get the specified custom channel from the specified ad client for the specified account.
  def get(accountId: String, adClientId: String, customChannelId: String): CustomChannel = js.native
  // List all custom channels in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String): CustomChannels = js.native
  // List all custom channels in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String, optionalArgs: js.Object): CustomChannels = js.native
}

