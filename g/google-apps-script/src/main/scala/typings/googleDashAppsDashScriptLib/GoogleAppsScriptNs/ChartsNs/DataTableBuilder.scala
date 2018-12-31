package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableBuilder extends js.Object {
  def addColumn(`type`: ColumnType, label: java.lang.String): DataTableBuilder
  def addRow(values: js.Array[js.Object]): DataTableBuilder
  def build(): DataTable
  def setValue(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    value: js.Object
  ): DataTableBuilder
}

