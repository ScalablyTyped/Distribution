package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the existing BigQuery data source specification. To create a new data source
  * specification, use SpreadsheetApp.newDataSourceSpec().
  */
trait BigQueryDataSourceSpec extends StObject {
  
  def copy(): DataSourceSpecBuilder
  
  def getParameters(): js.Array[DataSourceParameter]
  
  def getProjectId(): String
  
  def getRawQuery(): String
  
  def getType(): DataSourceType
}
object BigQueryDataSourceSpec {
  
  @scala.inline
  def apply(
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
  
  @scala.inline
  implicit class BigQueryDataSourceSpecMutableBuilder[Self <: BigQueryDataSourceSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => DataSourceSpecBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProjectId(value: () => String): Self = StObject.set(x, "getProjectId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawQuery(value: () => String): Self = StObject.set(x, "getRawQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DataSourceType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
  }
}
