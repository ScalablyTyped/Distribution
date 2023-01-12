package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait DataSourceSpec extends StObject {
  
  def asBigQuery(): BigQueryDataSourceSpec
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getType(): DataSourceType
}
object DataSourceSpec {
  
  inline def apply(
    asBigQuery: () => BigQueryDataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getType: () => DataSourceType
  ): DataSourceSpec = {
    val __obj = js.Dynamic.literal(asBigQuery = js.Any.fromFunction0(asBigQuery), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[DataSourceSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSpec] (val x: Self) extends AnyVal {
    
    inline def setAsBigQuery(value: () => BigQueryDataSourceSpec): Self = StObject.set(x, "asBigQuery", js.Any.fromFunction0(value))
    
    inline def setCopy(value: () => DataSourceSpecBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => DataSourceType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}
