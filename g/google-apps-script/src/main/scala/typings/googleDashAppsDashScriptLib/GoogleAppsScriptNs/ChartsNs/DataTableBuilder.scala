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

object DataTableBuilder {
  @scala.inline
  def apply(
    addColumn: js.Function2[ColumnType, java.lang.String, DataTableBuilder],
    addRow: js.Function1[js.Array[js.Object], DataTableBuilder],
    build: js.Function0[DataTable],
    setValue: js.Function3[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      js.Object, 
      DataTableBuilder
    ]
  ): DataTableBuilder = {
    val __obj = js.Dynamic.literal(addColumn = addColumn, addRow = addRow, build = build, setValue = setValue)
  
    __obj.asInstanceOf[DataTableBuilder]
  }
}

