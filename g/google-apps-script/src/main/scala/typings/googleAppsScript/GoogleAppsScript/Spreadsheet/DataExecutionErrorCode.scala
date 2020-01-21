package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataExecutionErrorCode extends js.Object

/**
  * An enumeration of data execution error codes.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.DataExecutionErrorCode")
@js.native
object DataExecutionErrorCode extends js.Object {
  @js.native
  sealed trait DATA_EXECUTION_ERROR_CODE_UNSUPPORTED extends DataExecutionErrorCode
  
  @js.native
  sealed trait DUPLICATE_COLUMN_NAMES extends DataExecutionErrorCode
  
  @js.native
  sealed trait ENGINE extends DataExecutionErrorCode
  
  @js.native
  sealed trait INTERRUPTED extends DataExecutionErrorCode
  
  @js.native
  sealed trait NONE extends DataExecutionErrorCode
  
  @js.native
  sealed trait OTHER extends DataExecutionErrorCode
  
  @js.native
  sealed trait PARAMETER_INVALID extends DataExecutionErrorCode
  
  @js.native
  sealed trait TIME_OUT extends DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CELLS extends DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_CHARS_PER_CELL extends DataExecutionErrorCode
  
  @js.native
  sealed trait TOO_MANY_ROWS extends DataExecutionErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_DATA_TYPE extends DataExecutionErrorCode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataExecutionErrorCode with Double] = js.native
  /* 0 */ @js.native
  object DATA_EXECUTION_ERROR_CODE_UNSUPPORTED extends TopLevel[DATA_EXECUTION_ERROR_CODE_UNSUPPORTED with Double]
  
  /* 8 */ @js.native
  object DUPLICATE_COLUMN_NAMES extends TopLevel[DUPLICATE_COLUMN_NAMES with Double]
  
  /* 5 */ @js.native
  object ENGINE extends TopLevel[ENGINE with Double]
  
  /* 9 */ @js.native
  object INTERRUPTED extends TopLevel[INTERRUPTED with Double]
  
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 10 */ @js.native
  object OTHER extends TopLevel[OTHER with Double]
  
  /* 6 */ @js.native
  object PARAMETER_INVALID extends TopLevel[PARAMETER_INVALID with Double]
  
  /* 2 */ @js.native
  object TIME_OUT extends TopLevel[TIME_OUT with Double]
  
  /* 4 */ @js.native
  object TOO_MANY_CELLS extends TopLevel[TOO_MANY_CELLS with Double]
  
  /* 11 */ @js.native
  object TOO_MANY_CHARS_PER_CELL extends TopLevel[TOO_MANY_CHARS_PER_CELL with Double]
  
  /* 3 */ @js.native
  object TOO_MANY_ROWS extends TopLevel[TOO_MANY_ROWS with Double]
  
  /* 7 */ @js.native
  object UNSUPPORTED_DATA_TYPE extends TopLevel[UNSUPPORTED_DATA_TYPE with Double]
  
}

