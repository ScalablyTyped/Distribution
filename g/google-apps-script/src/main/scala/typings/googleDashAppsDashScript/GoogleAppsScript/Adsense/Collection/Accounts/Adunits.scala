package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.CustomChannels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Adsense.Collection.Accounts.Adunits")
@js.native
object Adunits extends js.Object {
  @js.native
  trait CustomchannelsCollection extends js.Object {
    // List all custom channels which the specified ad unit belongs to.
    def list(accountId: String, adClientId: String, adUnitId: String): CustomChannels = js.native
    // List all custom channels which the specified ad unit belongs to.
    def list(accountId: String, adClientId: String, adUnitId: String, optionalArgs: js.Object): CustomChannels = js.native
  }
  
}

