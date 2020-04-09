package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGrid extends GridBase {
  def addColumn(columnOptions: String): Unit = js.native
  /** @name dxDataGrid.addColumn(columnOptions) */
  def addColumn(columnOptions: js.Any): Unit = js.native
  /** @name dxDataGrid.addRow() */
  def addRow(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDataGrid.clearGrouping() */
  def clearGrouping(): Unit = js.native
  /** @name dxDataGrid.collapseAll(groupIndex) */
  def collapseAll(): Unit = js.native
  def collapseAll(groupIndex: Double): Unit = js.native
  /** @name dxDataGrid.collapseRow(key) */
  def collapseRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDataGrid.expandAll(groupIndex) */
  def expandAll(): Unit = js.native
  def expandAll(groupIndex: Double): Unit = js.native
  /** @name dxDataGrid.expandRow(key) */
  def expandRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDataGrid.exportToExcel(selectionOnly) */
  def exportToExcel(selectionOnly: Boolean): Unit = js.native
  /** @name dxDataGrid.getSelectedRowKeys() */
  def getSelectedRowKeys(): js.Array[_] with Promise[_] with JQueryPromise[_] = js.native
  /** @name dxDataGrid.getSelectedRowsData() */
  def getSelectedRowsData(): js.Array[_] with Promise[_] with JQueryPromise[_] = js.native
  /** @name dxDataGrid.getTotalSummaryValue(summaryItemName) */
  def getTotalSummaryValue(summaryItemName: String): js.Any = js.native
  /** @name dxDataGrid.getVisibleColumns() */
  def getVisibleColumns(): js.Array[dxDataGridColumn] = js.native
  /** @name dxDataGrid.getVisibleColumns(headerLevel) */
  def getVisibleColumns(headerLevel: Double): js.Array[dxDataGridColumn] = js.native
  /** @name dxDataGrid.getVisibleRows() */
  def getVisibleRows(): js.Array[dxDataGridRowObject] = js.native
  /** @deprecated */
  /** @name dxDataGrid.insertRow() */
  def insertRow(): Unit = js.native
  /** @name dxDataGrid.isRowExpanded(key) */
  def isRowExpanded(key: js.Any): Boolean = js.native
  /** @deprecated */
  /** @name dxDataGrid.removeRow(rowIndex) */
  def removeRow(rowIndex: Double): Unit = js.native
  /** @name dxDataGrid.totalCount() */
  def totalCount(): Double = js.native
}

