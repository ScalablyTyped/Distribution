package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTable extends js.Object {
  def forceRefreshData(): DataSourceTable
  def getDataSource(): DataSource
  def getRange(): Range
  def getStatus(): DataExecutionStatus
  def refreshData(): DataSourceTable
  def waitForCompletion(timeoutInSeconds: Integer): DataExecutionStatus
}

object DataSourceTable {
  @scala.inline
  def apply(
    forceRefreshData: () => DataSourceTable,
    getDataSource: () => DataSource,
    getRange: () => Range,
    getStatus: () => DataExecutionStatus,
    refreshData: () => DataSourceTable,
    waitForCompletion: Integer => DataExecutionStatus
  ): DataSourceTable = {
    val __obj = js.Dynamic.literal(forceRefreshData = js.Any.fromFunction0(forceRefreshData), getDataSource = js.Any.fromFunction0(getDataSource), getRange = js.Any.fromFunction0(getRange), getStatus = js.Any.fromFunction0(getStatus), refreshData = js.Any.fromFunction0(refreshData), waitForCompletion = js.Any.fromFunction1(waitForCompletion))
  
    __obj.asInstanceOf[DataSourceTable]
  }
}

