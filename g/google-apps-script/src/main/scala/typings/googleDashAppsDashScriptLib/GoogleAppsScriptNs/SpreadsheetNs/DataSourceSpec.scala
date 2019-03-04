package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSpec extends js.Object {
  def asBigQuery(): BigQueryDataSourceSpec
  def copy(): DataSourceSpecBuilder
  def getParameters(): js.Array[DataSourceParameter]
  def getType(): DataSourceType
}

object DataSourceSpec {
  @scala.inline
  def apply(
    asBigQuery: js.Function0[BigQueryDataSourceSpec],
    copy: js.Function0[DataSourceSpecBuilder],
    getParameters: js.Function0[js.Array[DataSourceParameter]],
    getType: js.Function0[DataSourceType]
  ): DataSourceSpec = {
    val __obj = js.Dynamic.literal(asBigQuery = asBigQuery, copy = copy, getParameters = getParameters, getType = getType)
  
    __obj.asInstanceOf[DataSourceSpec]
  }
}

