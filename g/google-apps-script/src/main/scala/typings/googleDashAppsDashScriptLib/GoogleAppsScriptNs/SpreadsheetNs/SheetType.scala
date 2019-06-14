package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
@js.native
object SheetType extends js.Object {
  @js.native
  sealed trait GRID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.SheetType
  
  @js.native
  sealed trait any
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.SheetType
  
  /* 0 */ val GRID: GRID with scala.Double = js.native
  /* 1 */ val any: any with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.SheetType with scala.Double
  ] = js.native
}

