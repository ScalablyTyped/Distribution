package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Dimension extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
@js.native
object Dimension extends js.Object {
  @js.native
  sealed trait COLUMNS extends Dimension
  
  @js.native
  sealed trait ROWS extends Dimension
  
  /* 0 */ val COLUMNS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Dimension.COLUMNS with Double = js.native
  /* 1 */ val ROWS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.Dimension.ROWS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Dimension with Double] = js.native
}

