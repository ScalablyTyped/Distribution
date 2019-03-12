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
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => java.lang.String,
    getRawQuery: () => java.lang.String,
    getType: () => DataSourceType
  ): BigQueryDataSourceSpec = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[BigQueryDataSourceSpec]
  }
}

