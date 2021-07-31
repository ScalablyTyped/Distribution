package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataExecutionErrorCode extends StObject
/**
  * An enumeration of data execution error codes.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
@js.native
object DataExecutionErrorCode extends StObject {
  
  @js.native
  sealed trait DATA_EXECUTION_ERROR_CODE_UNSUPPORTED
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait DUPLICATE_COLUMN_NAMES
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait ENGINE
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait INTERRUPTED
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait NONE
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait OTHER
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait PARAMETER_INVALID
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait TIME_OUT
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CELLS
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CHARS_PER_CELL
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_ROWS
    extends StObject
       with DataExecutionErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_DATA_TYPE
    extends StObject
       with DataExecutionErrorCode
}
