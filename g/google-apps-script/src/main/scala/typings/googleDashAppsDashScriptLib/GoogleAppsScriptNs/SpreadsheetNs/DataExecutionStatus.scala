package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataExecutionStatus extends js.Object {
  def getErrorCode(): DataExecutionErrorCode
  def getErrorMessage(): java.lang.String
  def getExecutionState(): DataExecutionState
  def getLastRefreshedTime(): stdLib.Date
  def isTruncated(): scala.Boolean
}

object DataExecutionStatus {
  @scala.inline
  def apply(
    getErrorCode: () => DataExecutionErrorCode,
    getErrorMessage: () => java.lang.String,
    getExecutionState: () => DataExecutionState,
    getLastRefreshedTime: () => stdLib.Date,
    isTruncated: () => scala.Boolean
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorMessage = js.Any.fromFunction0(getErrorMessage), getExecutionState = js.Any.fromFunction0(getExecutionState), getLastRefreshedTime = js.Any.fromFunction0(getLastRefreshedTime), isTruncated = js.Any.fromFunction0(isTruncated))
  
    __obj.asInstanceOf[DataExecutionStatus]
  }
}

