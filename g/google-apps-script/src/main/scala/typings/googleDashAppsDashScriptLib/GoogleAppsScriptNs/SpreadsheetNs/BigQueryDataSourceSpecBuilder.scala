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
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => java.lang.String,
    getRawQuery: () => java.lang.String,
    getType: () => DataSourceType,
    removeAllParameters: () => BigQueryDataSourceSpecBuilder,
    removeParameter: java.lang.String => BigQueryDataSourceSpecBuilder,
    setParameterFromCell: (java.lang.String, java.lang.String) => BigQueryDataSourceSpecBuilder,
    setProjectId: java.lang.String => BigQueryDataSourceSpecBuilder,
    setRawQuery: java.lang.String => BigQueryDataSourceSpecBuilder
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell), setProjectId = js.Any.fromFunction1(setProjectId), setRawQuery = js.Any.fromFunction1(setRawQuery))
  
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
}

