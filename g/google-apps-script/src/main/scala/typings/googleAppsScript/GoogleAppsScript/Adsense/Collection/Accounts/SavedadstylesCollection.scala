package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyle
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesCollection extends js.Object {
  // List a specific saved ad style for the specified account.
  def get(accountId: String, savedAdStyleId: String): SavedAdStyle = js.native
  // List all saved ad styles in the specified account.
  def list(accountId: String): SavedAdStyles = js.native
  // List all saved ad styles in the specified account.
  def list(accountId: String, optionalArgs: js.Object): SavedAdStyles = js.native
}

