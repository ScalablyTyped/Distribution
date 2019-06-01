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
  
  val GRID: GRID with java.lang.String = js.native
  val any: any with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.SheetType with java.lang.String
  ] = js.native
}

