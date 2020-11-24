package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data execution status.
  */
@js.native
trait DataExecutionStatus extends js.Object {
  
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
  implicit class DataExecutionStatusOps[Self <: DataExecutionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetErrorCode(value: () => DataExecutionErrorCode): Self = this.set("getErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorMessage(value: () => String): Self = this.set("getErrorMessage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExecutionState(value: () => DataExecutionState): Self = this.set("getExecutionState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLastRefreshedTime(value: () => Date | Null): Self = this.set("getLastRefreshedTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTruncated(value: () => Boolean): Self = this.set("isTruncated", js.Any.fromFunction0(value))
  }
}
