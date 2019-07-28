package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.SheetType")
@js.native
object SheetType extends js.Object {
  @js.native
  sealed trait GRID extends SheetType
  
  @js.native
  sealed trait any extends SheetType
  
  /* 0 */ val GRID: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.SheetType.GRID with Double = js.native
  /* 1 */ val any: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.SheetType.any with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SheetType with Double] = js.native
}

