package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

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
    asBigQuery: () => BigQueryDataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getType: () => DataSourceType
  ): DataSourceSpec = {
    val __obj = js.Dynamic.literal(asBigQuery = js.Any.fromFunction0(asBigQuery), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getType = js.Any.fromFunction0(getType))
  
    __obj.asInstanceOf[DataSourceSpec]
  }
}

