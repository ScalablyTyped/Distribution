package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableSource extends js.Object {
  def getDataTable(): DataTable
}

object DataTableSource {
  @scala.inline
  def apply(getDataTable: js.Function0[DataTable]): DataTableSource = {
    val __obj = js.Dynamic.literal(getDataTable = getDataTable)
  
    __obj.asInstanceOf[DataTableSource]
  }
}

