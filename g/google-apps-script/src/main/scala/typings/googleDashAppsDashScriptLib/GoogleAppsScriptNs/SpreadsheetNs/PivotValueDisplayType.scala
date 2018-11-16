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
  
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val PERCENT_OF_COLUMN_TOTAL: PERCENT_OF_COLUMN_TOTAL with java.lang.String = js.native
  val PERCENT_OF_GRAND_TOTAL: PERCENT_OF_GRAND_TOTAL with java.lang.String = js.native
  val PERCENT_OF_ROW_TOTAL: PERCENT_OF_ROW_TOTAL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.PivotValueDisplayType with java.lang.String
  ] = js.native
}

