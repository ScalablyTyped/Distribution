package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
