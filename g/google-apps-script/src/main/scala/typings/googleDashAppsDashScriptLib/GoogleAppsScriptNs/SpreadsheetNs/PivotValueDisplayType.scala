package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PivotValueDisplayType extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.PivotValueDisplayType")
@js.native
object PivotValueDisplayType extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_COLUMN_TOTAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_GRAND_TOTAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.PivotValueDisplayType
  
  @js.native
  sealed trait PERCENT_OF_ROW_TOTAL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.PivotValueDisplayType
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 2 */ val PERCENT_OF_COLUMN_TOTAL: PERCENT_OF_COLUMN_TOTAL with scala.Double = js.native
  /* 3 */ val PERCENT_OF_GRAND_TOTAL: PERCENT_OF_GRAND_TOTAL with scala.Double = js.native
  /* 1 */ val PERCENT_OF_ROW_TOTAL: PERCENT_OF_ROW_TOTAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.PivotValueDisplayType with scala.Double
  ] = js.native
}

