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
  
  val DATA_EXECUTION_STATE_UNSUPPORTED: DATA_EXECUTION_STATE_UNSUPPORTED with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val NOT_STARTED: NOT_STARTED with java.lang.String = js.native
  val RUNNING: RUNNING with java.lang.String = js.native
  val SUCCESS: SUCCESS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs.DataExecutionState with java.lang.String
  ] = js.native
}

