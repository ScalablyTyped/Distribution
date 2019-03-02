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
  
  val DATA_EXECUTION_ERROR_CODE_UNSUPPORTED: DATA_EXECUTION_ERROR_CODE_UNSUPPORTED with java.lang.String = js.native
  val DUPLICATE_COLUMN_NAMES: DUPLICATE_COLUMN_NAMES with java.lang.String = js.native
  val ENGINE: ENGINE with java.lang.String = js.native
  val INTERRUPTED: INTERRUPTED with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val OTHER: OTHER with java.lang.String = js.native
  val PARAMETER_INVALID: PARAMETER_INVALID with java.lang.String = js.native
  val TIME_OUT: TIME_OUT with java.lang.String = js.native
  val TOO_MANY_CELLS: TOO_MANY_CELLS with java.lang.String = js.native
  val TOO_MANY_CHARS_PER_CELL: TOO_MANY_CHARS_PER_CELL with java.lang.String = js.native
  val TOO_MANY_ROWS: TOO_MANY_ROWS with java.lang.String = js.native
  val UNSUPPORTED_DATA_TYPE: UNSUPPORTED_DATA_TYPE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionErrorCode with java.lang.String
  ] = js.native
}

