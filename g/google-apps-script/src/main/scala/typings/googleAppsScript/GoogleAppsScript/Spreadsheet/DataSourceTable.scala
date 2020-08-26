package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify existing data source table. To create a new data source table on a new sheet,
  * use Spreadsheet.insertSheetWithDataSourceTable(spec).
  *
  * This example shows how to create a new data source table.
  *
  *     SpreadsheetApp.enableBigQueryExecution();
  *     var spreadsheet = SpreadsheetApp.getActive();
  *     var spec = SpreadsheetApp.newDataSourceSpec()
  *                .asBigQuery()
  *                .setProjectId('big_query_project')
  *                .setRawQuery('select @FIELD from table limit @LIMIT')
  *                .setParameterFromCell('FIELD', 'Sheet1!A1')
  *                .setParameterFromCell('LIMIT', 'namedRangeCell')
  *                .build();
  *     // Starts data execution asynchronously.
  *     var dataSheet = spreadsheet.insertSheetWithDataSourceTable(spec);
  *     var dataSourceTable = dataSheet.getDataSourceTables()[0];
  *     // waitForCompletion() blocks script execution until data execution completes.
  *     dataSourceTable.waitForCompletion(60);
  *     // Check status after execution.
  *     Logger.log("Data execution state: %s.", dataSourceTable.getStatus().getExecutionState());
  *
  * This example shows how to edit a data source.
  *
  *     SpreadsheetApp.enableBigQueryExecution();
  *     var dataSheet = SpreadsheetApp.getActive().getSheetByName("Data Sheet 1");
  *     var dataSourceTable = dataSheet.getDataSourceTables()[0];
  *     var dataSource = dataSourceTable.getDataSource();
  *     var newSpec = dataSource.getSpec()
  *                   .copy()
  *                   .asBigQuery()
  *                   .setRawQuery('select name from table limit 2')
  *                   .removeAllParameters()
  *                   .build();
  *     // Updates data source specification and starts data execution asynchronously.
  *     dataSource.updateSpec(newSpec);
  *     // Check status during execution.
  *     Logger.log("Data execution state: %s.", dataSourceTable.getStatus().getExecutionState());
  *     // waitForCompletion() blocks script execution until data execution completes.
  *     dataSourceTable.waitForCompletion(60);
  *     // Check status after execution.
  *     Logger.log("Data execution state: %s.", dataSourceTable.getStatus().getExecutionState());
  */
@js.native
trait DataSourceTable extends js.Object {
  def forceRefreshData(): DataSourceTable = js.native
  def getDataSource(): DataSource = js.native
  def getRange(): Range = js.native
  def getStatus(): DataExecutionStatus = js.native
  def refreshData(): DataSourceTable = js.native
  def waitForCompletion(timeoutInSeconds: Integer): DataExecutionStatus = js.native
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
  @scala.inline
  implicit class DataSourceTableOps[Self <: DataSourceTable] (val x: Self) extends AnyVal {
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
    def setForceRefreshData(value: () => DataSourceTable): Self = this.set("forceRefreshData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDataSource(value: () => DataSource): Self = this.set("getDataSource", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRange(value: () => Range): Self = this.set("getRange", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatus(value: () => DataExecutionStatus): Self = this.set("getStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setRefreshData(value: () => DataSourceTable): Self = this.set("refreshData", js.Any.fromFunction0(value))
    @scala.inline
    def setWaitForCompletion(value: Integer => DataExecutionStatus): Self = this.set("waitForCompletion", js.Any.fromFunction1(value))
  }
  
}

