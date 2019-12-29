package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataExecutionState extends js.Object

/**
  * An enumeration of data execution states.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataExecutionState with Double] = js.native
  /* 0 */ @js.native
  object DATA_EXECUTION_STATE_UNSUPPORTED extends TopLevel[DATA_EXECUTION_STATE_UNSUPPORTED with Double]
  
  /* 3 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 4 */ @js.native
  object NOT_STARTED extends TopLevel[NOT_STARTED with Double]
  
  /* 1 */ @js.native
  object RUNNING extends TopLevel[RUNNING with Double]
  
  /* 2 */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with Double]
  
}

