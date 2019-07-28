package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryDataSourceSpecBuilder extends js.Object {
  def build(): DataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getProjectId(): String
  def getRawQuery(): String
  def getType(): DataSourceType
  def removeAllParameters(): BigQueryDataSourceSpecBuilder
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder
}

object BigQueryDataSourceSpecBuilder {
  @scala.inline
  def apply(
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType,
    removeAllParameters: () => BigQueryDataSourceSpecBuilder,
    removeParameter: String => BigQueryDataSourceSpecBuilder,
    setParameterFromCell: (String, String) => BigQueryDataSourceSpecBuilder,
    setProjectId: String => BigQueryDataSourceSpecBuilder,
    setRawQuery: String => BigQueryDataSourceSpecBuilder
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell), setProjectId = js.Any.fromFunction1(setProjectId), setRawQuery = js.Any.fromFunction1(setRawQuery))
  
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
}

