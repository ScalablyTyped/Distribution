package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.AdUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Adsense.Collection.Accounts.Customchannels")
@js.native
object Customchannels extends js.Object {
  @js.native
  trait AdunitsCollection extends js.Object {
    // List all ad units in the specified custom channel.
    def list(accountId: String, adClientId: String, customChannelId: String): AdUnits = js.native
    // List all ad units in the specified custom channel.
    def list(accountId: String, adClientId: String, customChannelId: String, optionalArgs: js.Object): AdUnits = js.native
  }
  
}

