package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait DataSourceSpecBuilder extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpecBuilder
  def build(): DataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getType(): DataSourceType
  def removeAllParameters(): DataSourceSpecBuilder
  def removeParameter(parameterName: String): DataSourceSpecBuilder
  def setParameterFromCell(parameterName: String, sourceCell: String): DataSourceSpecBuilder
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
}

