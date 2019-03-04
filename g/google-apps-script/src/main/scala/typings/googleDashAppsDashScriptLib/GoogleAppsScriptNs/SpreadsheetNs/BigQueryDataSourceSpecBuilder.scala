package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryDataSourceSpecBuilder extends js.Object {
  def build(): DataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getProjectId(): java.lang.String
  def getRawQuery(): java.lang.String
  def getType(): DataSourceType
  def removeAllParameters(): BigQueryDataSourceSpecBuilder
  def removeParameter(parameterName: java.lang.String): BigQueryDataSourceSpecBuilder
  def setParameterFromCell(parameterName: java.lang.String, sourceCell: java.lang.String): BigQueryDataSourceSpecBuilder
  def setProjectId(projectId: java.lang.String): BigQueryDataSourceSpecBuilder
  def setRawQuery(rawQuery: java.lang.String): BigQueryDataSourceSpecBuilder
}

object BigQueryDataSourceSpecBuilder {
  @scala.inline
  def apply(
    build: js.Function0[DataSourceSpec],
    copy: js.Function0[DataSourceSpecBuilder],
    getParameters: js.Function0[js.Array[DataSourceParameter]],
    getProjectId: js.Function0[java.lang.String],
    getRawQuery: js.Function0[java.lang.String],
    getType: js.Function0[DataSourceType],
    removeAllParameters: js.Function0[BigQueryDataSourceSpecBuilder],
    removeParameter: js.Function1[java.lang.String, BigQueryDataSourceSpecBuilder],
    setParameterFromCell: js.Function2[java.lang.String, java.lang.String, BigQueryDataSourceSpecBuilder],
    setProjectId: js.Function1[java.lang.String, BigQueryDataSourceSpecBuilder],
    setRawQuery: js.Function1[java.lang.String, BigQueryDataSourceSpecBuilder]
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = build, copy = copy, getParameters = getParameters, getProjectId = getProjectId, getRawQuery = getRawQuery, getType = getType, removeAllParameters = removeAllParameters, removeParameter = removeParameter, setParameterFromCell = setParameterFromCell, setProjectId = setProjectId, setRawQuery = setRawQuery)
  
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
}

