package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableSource extends js.Object {
  def getDataTable(): DataTable
}

object DataTableSource {
  @scala.inline
  def apply(getDataTable: () => DataTable): DataTableSource = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable))
  
    __obj.asInstanceOf[DataTableSource]
  }
}

