package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdCode
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdUnit
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdunitsCollection extends js.Object {
  var Customchannels: js.UndefOr[
    typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Adunits.CustomchannelsCollection
  ] = js.native
  // Gets the specified ad unit in the specified ad client.
  def get(adClientId: String, adUnitId: String): AdUnit = js.native
  // Get ad code for the specified ad unit.
  def getAdCode(adClientId: String, adUnitId: String): AdCode = js.native
  // List all ad units in the specified ad client for this AdSense account.
  def list(adClientId: String): AdUnits = js.native
  // List all ad units in the specified ad client for this AdSense account.
  def list(adClientId: String, optionalArgs: js.Object): AdUnits = js.native
}

