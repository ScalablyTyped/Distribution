package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataExecutionStatus extends js.Object {
  def getErrorCode(): DataExecutionErrorCode
  def getErrorMessage(): String
  def getExecutionState(): DataExecutionState
  def getLastRefreshedTime(): Date
  def isTruncated(): Boolean
}

object DataExecutionStatus {
  @scala.inline
  def apply(
    getErrorCode: () => DataExecutionErrorCode,
    getErrorMessage: () => String,
    getExecutionState: () => DataExecutionState,
    getLastRefreshedTime: () => Date,
    isTruncated: () => Boolean
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getExecutionState = js.Any.fromFunction0(getExecutionState), getLastRefreshedTime = js.Any.fromFunction0(getLastRefreshedTime), isTruncated = js.Any.fromFunction0(isTruncated))
  
    __obj.asInstanceOf[DataExecutionStatus]
  }
}

