package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  def getSpec(): DataSourceSpec
  def updateSpec(spec: DataSourceSpec): DataSource
}

object DataSource {
  @scala.inline
  def apply(getSpec: () => DataSourceSpec, updateSpec: DataSourceSpec => DataSource): DataSource = {
    val __obj = js.Dynamic.literal(getSpec = js.Any.fromFunction0(getSpec), updateSpec = js.Any.fromFunction1(updateSpec))
  
    __obj.asInstanceOf[DataSource]
  }
}

