package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The builder for DataSourceSpec. To create a specification for certain type, use as...() method. To create a new builder, use SpreadsheetApp.newDataSourceSpec(). To use the specification, see DataSourceTable.
  *
  * This examples show how to build a BigQuery data source specification.
  *
  *     var spec = SpreadsheetApp.newDataSourceSpec()
  *                .asBigQuery()
  *                .setProjectId('big_query_project')
  *                .setRawQuery('select @FIELD from table limit @LIMIT')
  *                .setParameterFromCell('FIELD', 'Sheet1!A1')
  *                .setParameterFromCell('LIMIT', 'namedRangeCell')
  *                .build();
  */
@js.native
trait DataSourceSpecBuilder extends js.Object {
  
  def asBigQuery(): BigQueryDataSourceSpecBuilder = js.native
  
  def build(): DataSourceSpec = js.native
  
  def copy(): DataSourceSpecBuilder = js.native
  
  def getParameters(): js.Array[DataSourceParameter] = js.native
  
  def getType(): DataSourceType = js.native
  
  def removeAllParameters(): DataSourceSpecBuilder = js.native
  
  def removeParameter(parameterName: String): DataSourceSpecBuilder = js.native
  
  def setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder = js.native
}
object DataSourceSpecBuilder {
  
  @scala.inline
  def apply(
    asBigQuery: () => BigQueryDataSourceSpecBuilder,
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getType: () => DataSourceType,
    removeAllParameters: () => DataSourceSpecBuilder,
    removeParameter: String => DataSourceSpecBuilder,
    setParameterFromCell: (String, String) => DataSourceSpecBuilder
  ): DataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(asBigQuery = js.Any.fromFunction0(asBigQuery), build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell))
    __obj.asInstanceOf[DataSourceSpecBuilder]
  }
  
  @scala.inline
  implicit class DataSourceSpecBuilderOps[Self <: DataSourceSpecBuilder] (val x: Self) extends AnyVal {
    
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
    def setAsBigQuery(value: () => BigQueryDataSourceSpecBuilder): Self = this.set("asBigQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBuild(value: () => DataSourceSpec): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => DataSourceSpecBuilder): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => DataSourceType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllParameters(value: () => DataSourceSpecBuilder): Self = this.set("removeAllParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveParameter(value: String => DataSourceSpecBuilder): Self = this.set("removeParameter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetParameterFromCell(value: (String, String) => DataSourceSpecBuilder): Self = this.set("setParameterFromCell", js.Any.fromFunction2(value))
  }
}
