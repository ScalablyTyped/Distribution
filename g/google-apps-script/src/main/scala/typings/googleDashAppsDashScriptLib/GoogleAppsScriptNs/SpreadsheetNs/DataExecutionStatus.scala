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
    getErrorCode: js.Function0[DataExecutionErrorCode],
    getErrorMessage: js.Function0[java.lang.String],
    getExecutionState: js.Function0[DataExecutionState],
    getLastRefreshedTime: js.Function0[stdLib.Date],
    isTruncated: js.Function0[scala.Boolean]
  ): DataExecutionStatus = {
    val __obj = js.Dynamic.literal(getErrorCode = getErrorCode, getErrorMessage = getErrorMessage, getExecutionState = getExecutionState, getLastRefreshedTime = getLastRefreshedTime, isTruncated = isTruncated)
  
    __obj.asInstanceOf[DataExecutionStatus]
  }
}

