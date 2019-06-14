package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Dimension extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
@js.native
object Dimension extends js.Object {
  @js.native
  sealed trait COLUMNS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Dimension
  
  @js.native
  sealed trait ROWS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Dimension
  
  /* 0 */ val COLUMNS: COLUMNS with scala.Double = js.native
  /* 1 */ val ROWS: ROWS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.Dimension with scala.Double
  ] = js.native
}

