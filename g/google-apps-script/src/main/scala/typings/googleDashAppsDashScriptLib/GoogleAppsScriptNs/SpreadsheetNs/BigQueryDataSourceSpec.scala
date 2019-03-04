package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigQueryDataSourceSpec extends js.Object {
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getProjectId(): java.lang.String
  def getRawQuery(): java.lang.String
  def getType(): DataSourceType
}

object BigQueryDataSourceSpec {
  @scala.inline
  def apply(
    copy: js.Function0[DataSourceSpecBuilder],
    getParameters: js.Function0[js.Array[DataSourceParameter]],
    getProjectId: js.Function0[java.lang.String],
    getRawQuery: js.Function0[java.lang.String],
    getType: js.Function0[DataSourceType]
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal(copy = copy, getParameters = getParameters, getProjectId = getProjectId, getRawQuery = getRawQuery, getType = getType)
  
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
}

