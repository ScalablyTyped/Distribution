package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTable extends js.Object {
  def forceRefreshData(): DataSourceTable
  def getDataSource(): DataSource
  def getRange(): Range
  def getStatus(): DataExecutionStatus
  def refreshData(): DataSourceTable
  def waitForCompletion(timeoutInSeconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): DataExecutionStatus
}

object DataSourceTable {
  @scala.inline
  def apply(
    forceRefreshData: js.Function0[DataSourceTable],
    getDataSource: js.Function0[DataSource],
    getRange: js.Function0[Range],
    getStatus: js.Function0[DataExecutionStatus],
    refreshData: js.Function0[DataSourceTable],
    waitForCompletion: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, DataExecutionStatus]
  ): DataSourceTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceRefreshData")(forceRefreshData)
    __obj.updateDynamic("getDataSource")(getDataSource)
    __obj.updateDynamic("getRange")(getRange)
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.updateDynamic("refreshData")(refreshData)
    __obj.updateDynamic("waitForCompletion")(waitForCompletion)
    __obj.asInstanceOf[DataSourceTable]
  }
}

