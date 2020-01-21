package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyle
import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.SavedAdStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedadstylesCollection extends js.Object {
  // Get a specific saved ad style from the user's account.
  def get(savedAdStyleId: String): SavedAdStyle = js.native
  // List all saved ad styles in the user's account.
  def list(): SavedAdStyles = js.native
  // List all saved ad styles in the user's account.
  def list(optionalArgs: js.Object): SavedAdStyles = js.native
}

