package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<exceljs.exceljs.TableProperties> */
trait Table extends js.Object {
  var columns: js.Array[TableColumnProperties]
  var displayName: String
  var headerRow: Boolean
  var name: String
  var ref: String
  var rows: js.Array[js.Array[_]]
  var style: TableStyleProperties
  var totalsRow: Boolean
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[_], colIndex: Double): Unit
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[_], rowNumber: Double): Unit
  /**
  	 * Commit changes
  	 */
  def commit(): Unit
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit
}

object Table {
  @scala.inline
  def apply(
    addColumn: (TableColumnProperties, js.Array[_], Double) => Unit,
    addRow: (js.Array[_], Double) => Unit,
    columns: js.Array[TableColumnProperties],
    commit: () => Unit,
    displayName: String,
    getColumn: Double => TableColumn,
    headerRow: Boolean,
    name: String,
    ref: String,
    removeColumns: (Double, Double) => Unit,
    removeRows: (Double, Double) => Unit,
    rows: js.Array[js.Array[_]],
    style: TableStyleProperties,
    totalsRow: Boolean
  ): Table = {
    val __obj = js.Dynamic.literal(addColumn = js.Any.fromFunction3(addColumn), addRow = js.Any.fromFunction2(addRow), columns = columns.asInstanceOf[js.Any], commit = js.Any.fromFunction0(commit), displayName = displayName.asInstanceOf[js.Any], getColumn = js.Any.fromFunction1(getColumn), headerRow = headerRow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], removeColumns = js.Any.fromFunction2(removeColumns), removeRows = js.Any.fromFunction2(removeRows), rows = rows.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], totalsRow = totalsRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

