package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataExecutionErrorCode extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
@js.native
object DataExecutionErrorCode extends js.Object {
  @js.native
  sealed trait DATA_EXECUTION_ERROR_CODE_UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait DUPLICATE_COLUMN_NAMES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait ENGINE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait INTERRUPTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait OTHER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait PARAMETER_INVALID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait TIME_OUT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CELLS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CHARS_PER_CELL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_ROWS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_DATA_TYPE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode
  
  /* 0 */ val DATA_EXECUTION_ERROR_CODE_UNSUPPORTED: DATA_EXECUTION_ERROR_CODE_UNSUPPORTED with scala.Double = js.native
  /* 8 */ val DUPLICATE_COLUMN_NAMES: DUPLICATE_COLUMN_NAMES with scala.Double = js.native
  /* 5 */ val ENGINE: ENGINE with scala.Double = js.native
  /* 9 */ val INTERRUPTED: INTERRUPTED with scala.Double = js.native
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 10 */ val OTHER: OTHER with scala.Double = js.native
  /* 6 */ val PARAMETER_INVALID: PARAMETER_INVALID with scala.Double = js.native
  /* 2 */ val TIME_OUT: TIME_OUT with scala.Double = js.native
  /* 4 */ val TOO_MANY_CELLS: TOO_MANY_CELLS with scala.Double = js.native
  /* 11 */ val TOO_MANY_CHARS_PER_CELL: TOO_MANY_CHARS_PER_CELL with scala.Double = js.native
  /* 3 */ val TOO_MANY_ROWS: TOO_MANY_ROWS with scala.Double = js.native
  /* 7 */ val UNSUPPORTED_DATA_TYPE: UNSUPPORTED_DATA_TYPE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode with scala.Double
  ] = js.native
}

