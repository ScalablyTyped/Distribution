package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSpecBuilder extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpecBuilder
  def build(): DataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getType(): DataSourceType
  def removeAllParameters(): DataSourceSpecBuilder
  def removeParameter(parameterName: java.lang.String): DataSourceSpecBuilder
  def setParameterFromCell(parameterName: java.lang.String, sourceCell: java.lang.String): DataSourceSpecBuilder
}

object DataSourceSpecBuilder {
  @scala.inline
  def apply(
    asBigQuery: js.Function0[BigQueryDataSourceSpecBuilder],
    build: js.Function0[DataSourceSpec],
    copy: js.Function0[DataSourceSpecBuilder],
    getParameters: js.Function0[js.Array[DataSourceParameter]],
    getType: js.Function0[DataSourceType],
    removeAllParameters: js.Function0[DataSourceSpecBuilder],
    removeParameter: js.Function1[java.lang.String, DataSourceSpecBuilder],
    setParameterFromCell: js.Function2[java.lang.String, java.lang.String, DataSourceSpecBuilder]
  ): DataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asBigQuery")(asBigQuery)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getParameters")(getParameters)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("removeAllParameters")(removeAllParameters)
    __obj.updateDynamic("removeParameter")(removeParameter)
    __obj.updateDynamic("setParameterFromCell")(setParameterFromCell)
    __obj.asInstanceOf[DataSourceSpecBuilder]
  }
}

