package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the general settings of an existing data source spec. To access data source spec for
  * certain type, use as...() method. To create a new data source spec, use SpreadsheetApp.newDataSourceSpec().
  *
  * This example shows how to get information from a BigQuery data source spec.
  *
  *     var dataSourceTable =
  *         SpreadsheetApp.getActive().getSheetByName("Data Sheet 1").getDataSourceTables()[0];
  *     var spec = dataSourceTable.getDataSource().getSpec();
  *     if (spec.getType() == SpreadsheetApp.DataSourceType.BIGQUERY) {
  *       var bqSpec = spec.asBigQuery();
  *       Logger.log("Project ID: %s\n", bqSpec.getProjectId());
  *       Logger.log("Raw query string: %s\n", bqSpec.getRawQuery());
  *     }
  */
@js.native
trait DataSourceSpec extends js.Object {
  
  def asBigQuery(): BigQueryDataSourceSpec = js.native
  
  def copy(): DataSourceSpecBuilder = js.native
  
  def getParameters(): js.Array[DataSourceParameter] = js.native
  
  def getType(): DataSourceType = js.native
}
object DataSourceSpec {
  
  @scala.inline
  def apply(
    asBigQuery: () => BigQueryDataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getType: () => DataSourceType
  ): DataSourceSpec = {
    val __obj = js.Dynamic.literal(asBigQuery = js.Any.fromFunction0(asBigQuery), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[DataSourceSpec]
  }
  
  @scala.inline
  implicit class DataSourceSpecOps[Self <: DataSourceSpec] (val x: Self) extends AnyVal {
    
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
    def setAsBigQuery(value: () => BigQueryDataSourceSpec): Self = this.set("asBigQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => DataSourceSpecBuilder): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DataSourceType): Self = this.set("getType", js.Any.fromFunction0(value))
  }
}
