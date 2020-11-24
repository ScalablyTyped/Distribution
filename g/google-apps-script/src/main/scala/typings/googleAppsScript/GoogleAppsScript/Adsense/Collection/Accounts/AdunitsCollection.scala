package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdCode
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdUnit
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.AdUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdunitsCollection extends js.Object {
  
  var Customchannels: js.UndefOr[
    typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts.Adunits.CustomchannelsCollection
  ] = js.native
  
  // Gets the specified ad unit in the specified ad client for the specified account.
  def get(accountId: String, adClientId: String, adUnitId: String): AdUnit = js.native
  
  // Get ad code for the specified ad unit.
  def getAdCode(accountId: String, adClientId: String, adUnitId: String): AdCode = js.native
  
  // List all ad units in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String): AdUnits = js.native
  // List all ad units in the specified ad client for the specified account.
  def list(accountId: String, adClientId: String, optionalArgs: js.Object): AdUnits = js.native
}
