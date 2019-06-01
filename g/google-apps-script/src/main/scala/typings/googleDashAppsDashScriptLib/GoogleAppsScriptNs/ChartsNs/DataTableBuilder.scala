package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ChartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableBuilder extends js.Object {
  def addColumn(`type`: ColumnType, label: java.lang.String): DataTableBuilder
  def addRow(values: js.Array[_]): DataTableBuilder
  def build(): DataTable
  def setValue(
    row: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    column: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    value: js.Any
  ): DataTableBuilder
}

object DataTableBuilder {
  @scala.inline
  def apply(
    addColumn: (ColumnType, java.lang.String) => DataTableBuilder,
    addRow: js.Array[_] => DataTableBuilder,
    build: () => DataTable,
    setValue: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, js.Any) => DataTableBuilder
  ): DataTableBuilder = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction2(addColumn), addRow = js.Any.fromFunction1(addRow), build = js.Any.fromFunction0(build), setValue = js.Any.fromFunction3(setValue))
  
    __obj.asInstanceOf[DataTableBuilder]
  }
}

