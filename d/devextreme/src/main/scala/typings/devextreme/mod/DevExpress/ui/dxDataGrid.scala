package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGrid extends GridBase {
  def addColumn(columnOptions: String): Unit = js.native
  /** Adds a new column. */
  def addColumn(columnOptions: js.Any): Unit = js.native
  /** Adds an empty data row and switches it to the editing state. */
  def addRow(): Unit = js.native
  /** Ungroups grid records. */
  def clearGrouping(): Unit = js.native
  /** Collapses master rows or groups of a specific level. */
  def collapseAll(): Unit = js.native
  def collapseAll(groupIndex: Double): Unit = js.native
  /** Collapses a group or a master row with a specific key. */
  def collapseRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Expands master rows or groups of a specific level. Does not apply if data is remote. */
  def expandAll(): Unit = js.native
  def expandAll(groupIndex: Double): Unit = js.native
  /** Expands a group or a master row with a specific key. */
  def expandRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Exports grid data to Excel. */
  def exportToExcel(selectionOnly: Boolean): Unit = js.native
  /** Gets the currently selected rows' keys. */
  def getSelectedRowKeys(): js.Array[_] with Promise[_] with JQueryPromise[_] = js.native
  /** Gets the selected rows' data objects. */
  def getSelectedRowsData(): js.Array[_] with Promise[_] with JQueryPromise[_] = js.native
  /** Gets the value of a total summary item. */
  def getTotalSummaryValue(summaryItemName: String): js.Any = js.native
  /** Gets all visible columns. */
  def getVisibleColumns(): js.Array[dxDataGridColumn] = js.native
  /** Gets all visible columns at a specific hierarchical level of column headers. Use it to access banded columns. */
  def getVisibleColumns(headerLevel: Double): js.Array[dxDataGridColumn] = js.native
  /** Gets currently rendered rows. */
  def getVisibleRows(): js.Array[dxDataGridRowObject] = js.native
  /** @deprecated Use addRow instead. */
  /** Adds a new data row to a grid. */
  def insertRow(): Unit = js.native
  /** Checks whether a specific group or master row is expanded or collapsed. */
  def isRowExpanded(key: js.Any): Boolean = js.native
  /** @deprecated Use deleteRow instead. */
  /** Removes a row with a specific index. */
  def removeRow(rowIndex: Double): Unit = js.native
  /** Gets the total row count. */
  def totalCount(): Double = js.native
}

