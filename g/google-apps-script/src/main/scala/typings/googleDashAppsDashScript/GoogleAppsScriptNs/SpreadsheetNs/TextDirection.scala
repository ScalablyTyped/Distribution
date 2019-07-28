package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextDirection extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.TextDirection")
@js.native
object TextDirection extends js.Object {
  @js.native
  sealed trait LEFT_TO_RIGHT extends TextDirection
  
  @js.native
  sealed trait RIGHT_TO_LEFT extends TextDirection
  
  /* 0 */ val LEFT_TO_RIGHT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.TextDirection.LEFT_TO_RIGHT with Double = js.native
  /* 1 */ val RIGHT_TO_LEFT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.TextDirection.RIGHT_TO_LEFT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextDirection with Double] = js.native
}

