package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

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

