package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.SavedAdStyle
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs.SavedAdStyles
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

