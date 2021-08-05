package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data execution status.
  */
trait DataExecutionStatus extends StObject {
  
  def getErrorCode(): DataExecutionErrorCode
  
  def getErrorMessage(): String
  
  def getExecutionState(): DataExecutionState
  
  def getLastRefreshedTime(): Date | Null
  
  def isTruncated(): Boolean
}
object DataExecutionStatus {
  
  inline def apply(
    getErrorCode: () => DataExecutionErrorCode,
    getErrorMessage: () => String,
    getExecutionState: () => DataExecutionState,
    getLastRefreshedTime: () => Date | Null,
    isTruncated: () => Boolean
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getExecutionState = js.Any.fromFunction0(getExecutionState), getLastRefreshedTime = js.Any.fromFunction0(getLastRefreshedTime), isTruncated = js.Any.fromFunction0(isTruncated))
    __obj.asInstanceOf[DataExecutionStatus]
  }
  
  extension [Self <: DataExecutionStatus](x: Self) {
    
    inline def setGetErrorCode(value: () => DataExecutionErrorCode): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    inline def setGetErrorMessage(value: () => String): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
    
    inline def setGetExecutionState(value: () => DataExecutionState): Self = StObject.set(x, "getExecutionState", js.Any.fromFunction0(value))
    
    inline def setGetLastRefreshedTime(value: () => Date | Null): Self = StObject.set(x, "getLastRefreshedTime", js.Any.fromFunction0(value))
    
    inline def setIsTruncated(value: () => Boolean): Self = StObject.set(x, "isTruncated", js.Any.fromFunction0(value))
  }
}
