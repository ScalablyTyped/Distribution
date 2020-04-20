package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder of DataTable objects. Building a data table consists of first specifying its columns, and
  * then adding its rows, one at a time. Example:
  *
  *     var data = Charts.newDataTable()
  *         .addColumn(Charts.ColumnType.STRING, "Month")
  *         .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *         .addColumn(Charts.ColumnType.NUMBER, "Online")
  *         .addRow(["January", 10, 1])
  *         .addRow(["February", 12, 1])
  *         .addRow(["March", 20, 2])
  *         .addRow(["April", 25, 3])
  *         .addRow(["May", 30, 4])
  *         .build();
  */
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

