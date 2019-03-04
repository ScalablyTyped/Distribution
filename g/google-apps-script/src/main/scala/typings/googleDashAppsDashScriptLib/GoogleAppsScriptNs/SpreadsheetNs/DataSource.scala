package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  def getSpec(): DataSourceSpec
  def updateSpec(spec: DataSourceSpec): DataSource
}

object DataSource {
  @scala.inline
  def apply(getSpec: js.Function0[DataSourceSpec], updateSpec: js.Function1[DataSourceSpec, DataSource]): DataSource = {
    val __obj = js.Dynamic.literal(getSpec = getSpec, updateSpec = updateSpec)
  
    __obj.asInstanceOf[DataSource]
  }
}

