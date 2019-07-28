package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ChartsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableBuilder extends js.Object {
  def addColumn(`type`: ColumnType, label: String): DataTableBuilder
  def addRow(values: js.Array[_]): DataTableBuilder
  def build(): DataTable
  def setValue(row: Integer, column: Integer, value: js.Any): DataTableBuilder
}

object DataTableBuilder {
  @scala.inline
  def apply(
    addColumn: (ColumnType, String) => DataTableBuilder,
    addRow: js.Array[_] => DataTableBuilder,
    build: () => DataTable,
    setValue: (Integer, Integer, js.Any) => DataTableBuilder
  ): DataTableBuilder = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction2(addColumn), addRow = js.Any.fromFunction1(addRow), build = js.Any.fromFunction0(build), setValue = js.Any.fromFunction3(setValue))
  
    __obj.asInstanceOf[DataTableBuilder]
  }
}

