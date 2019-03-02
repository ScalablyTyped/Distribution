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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getParameters")(getParameters)
    __obj.updateDynamic("getProjectId")(getProjectId)
    __obj.updateDynamic("getRawQuery")(getRawQuery)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("removeAllParameters")(removeAllParameters)
    __obj.updateDynamic("removeParameter")(removeParameter)
    __obj.updateDynamic("setParameterFromCell")(setParameterFromCell)
    __obj.updateDynamic("setProjectId")(setProjectId)
    __obj.updateDynamic("setRawQuery")(setRawQuery)
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
}

