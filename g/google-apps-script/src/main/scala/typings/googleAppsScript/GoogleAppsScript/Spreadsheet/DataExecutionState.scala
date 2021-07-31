package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataExecutionState extends StObject
/**
  * An enumeration of data execution states.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionState")
@js.native
object DataExecutionState extends StObject {
  
  @js.native
  sealed trait DATA_EXECUTION_STATE_UNSUPPORTED
    extends StObject
       with DataExecutionState
  
  @js.native
  sealed trait ERROR
    extends StObject
       with DataExecutionState
  
  @js.native
  sealed trait NOT_STARTED
    extends StObject
       with DataExecutionState
  
  @js.native
  sealed trait RUNNING
    extends StObject
       with DataExecutionState
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with DataExecutionState
}
