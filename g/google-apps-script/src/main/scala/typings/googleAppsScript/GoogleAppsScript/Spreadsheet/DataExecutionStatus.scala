package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data execution status.
  */
@js.native
trait DataExecutionStatus extends StObject {
  
  def getErrorCode(): DataExecutionErrorCode = js.native
  
  def getErrorMessage(): String = js.native
  
  def getExecutionState(): DataExecutionState = js.native
  
  def getLastRefreshedTime(): Date | Null = js.native
  
  def isTruncated(): Boolean = js.native
}
object DataExecutionStatus {
  
  @scala.inline
  def apply(
    getErrorCode: () => DataExecutionErrorCode,
    getErrorMessage: () => String,
    getExecutionState: () => DataExecutionState,
    getLastRefreshedTime: () => Date | Null,
    isTruncated: () => Boolean
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getExecutionState = js.Any.fromFunction0(getExecutionState), getLastRefreshedTime = js.Any.fromFunction0(getLastRefreshedTime), isTruncated = js.Any.fromFunction0(isTruncated))
    __obj.asInstanceOf[DataExecutionStatus]
  }
  
  @scala.inline
  implicit class DataExecutionStatusMutableBuilder[Self <: DataExecutionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetErrorCode(value: () => DataExecutionErrorCode): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExecutionState(value: () => DataExecutionState): Self = StObject.set(x, "getExecutionState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastRefreshedTime(value: () => Date | Null): Self = StObject.set(x, "getLastRefreshedTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTruncated(value: () => Boolean): Self = StObject.set(x, "isTruncated", js.Any.fromFunction0(value))
  }
}
