package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.CustomChannels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Adsense.Collection.Adunits")
@js.native
object Adunits extends js.Object {
  
  @js.native
  trait CustomchannelsCollection extends js.Object {
    
    // List all custom channels which the specified ad unit belongs to.
    def list(adClientId: String, adUnitId: String): CustomChannels = js.native
    // List all custom channels which the specified ad unit belongs to.
    def list(adClientId: String, adUnitId: String, optionalArgs: js.Object): CustomChannels = js.native
  }
}
