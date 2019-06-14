package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataExecutionState extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionState")
@js.native
object DataExecutionState extends js.Object {
  @js.native
  sealed trait DATA_EXECUTION_STATE_UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState
  
  @js.native
  sealed trait ERROR
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState
  
  @js.native
  sealed trait NOT_STARTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState
  
  @js.native
  sealed trait RUNNING
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState
  
  @js.native
  sealed trait SUCCESS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState
  
  /* 0 */ val DATA_EXECUTION_STATE_UNSUPPORTED: DATA_EXECUTION_STATE_UNSUPPORTED with scala.Double = js.native
  /* 3 */ val ERROR: ERROR with scala.Double = js.native
  /* 4 */ val NOT_STARTED: NOT_STARTED with scala.Double = js.native
  /* 1 */ val RUNNING: RUNNING with scala.Double = js.native
  /* 2 */ val SUCCESS: SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState with scala.Double
  ] = js.native
}

