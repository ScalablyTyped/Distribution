package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<exceljs.exceljs.TableProperties> */
@js.native
trait Table extends js.Object {
  var columns: js.Array[TableColumnProperties] = js.native
  var displayName: String = js.native
  var headerRow: Boolean = js.native
  var name: String = js.native
  var ref: String = js.native
  var rows: js.Array[js.Array[_]] = js.native
  var style: TableStyleProperties = js.native
  var totalsRow: Boolean = js.native
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[_], colIndex: Double): Unit = js.native
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[_], rowNumber: Double): Unit = js.native
  /**
  	 * Commit changes
  	 */
  def commit(): Unit = js.native
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn = js.native
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit = js.native
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit = js.native
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
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddColumn(value: (TableColumnProperties, js.Array[_], Double) => Unit): Self = this.set("addColumn", js.Any.fromFunction3(value))
    @scala.inline
    def setAddRow(value: (js.Array[_], Double) => Unit): Self = this.set("addRow", js.Any.fromFunction2(value))
    @scala.inline
    def setColumnsVarargs(value: TableColumnProperties*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[TableColumnProperties]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: () => Unit): Self = this.set("commit", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetColumn(value: Double => TableColumn): Self = this.set("getColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderRow(value: Boolean): Self = this.set("headerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveColumns(value: (Double, Double) => Unit): Self = this.set("removeColumns", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveRows(value: (Double, Double) => Unit): Self = this.set("removeRows", js.Any.fromFunction2(value))
    @scala.inline
    def setRowsVarargs(value: js.Array[js.Any]*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[_]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: TableStyleProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalsRow(value: Boolean): Self = this.set("totalsRow", value.asInstanceOf[js.Any])
  }
  
}

