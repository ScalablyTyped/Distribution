package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataExecutionState extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionState")
@js.native
object DataExecutionState extends js.Object {
  @js.native
  sealed trait DATA_EXECUTION_STATE_UNSUPPORTED extends DataExecutionState
  
  @js.native
  sealed trait ERROR extends DataExecutionState
  
  @js.native
  sealed trait NOT_STARTED extends DataExecutionState
  
  @js.native
  sealed trait RUNNING extends DataExecutionState
  
  @js.native
  sealed trait SUCCESS extends DataExecutionState
  
  /* 0 */ val DATA_EXECUTION_STATE_UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState.DATA_EXECUTION_STATE_UNSUPPORTED with Double = js.native
  /* 3 */ val ERROR: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState.ERROR with Double = js.native
  /* 4 */ val NOT_STARTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState.NOT_STARTED with Double = js.native
  /* 1 */ val RUNNING: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState.RUNNING with Double = js.native
  /* 2 */ val SUCCESS: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState.SUCCESS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataExecutionState with Double] = js.native
}

