package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDataGrid extends GridBase {
  
  def addColumn(columnOptions: String): Unit = js.native
  /**
    * [descr:dxDataGrid.addColumn(columnOptions)]
    */
  def addColumn(columnOptions: js.Any): Unit = js.native
  
  /**
    * [descr:dxDataGrid.addRow()]
    */
  def addRow(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxDataGrid.clearGrouping()]
    */
  def clearGrouping(): Unit = js.native
  
  /**
    * [descr:dxDataGrid.collapseAll(groupIndex)]
    */
  def collapseAll(): Unit = js.native
  def collapseAll(groupIndex: Double): Unit = js.native
  
  /**
    * [descr:dxDataGrid.collapseRow(key)]
    */
  def collapseRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxDataGrid.expandAll(groupIndex)]
    */
  def expandAll(): Unit = js.native
  def expandAll(groupIndex: Double): Unit = js.native
  
  /**
    * [descr:dxDataGrid.expandRow(key)]
    */
  def expandRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxDataGrid.exportToExcel(selectionOnly)]
    * @deprecated [depNote:dxDataGrid.exportToExcel(selectionOnly)]
    */
  def exportToExcel(selectionOnly: Boolean): Unit = js.native
  
  /**
    * [descr:dxDataGrid.getSelectedRowKeys()]
    */
  def getSelectedRowKeys(): js.Array[_] with Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:dxDataGrid.getSelectedRowsData()]
    */
  def getSelectedRowsData(): js.Array[_] with Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:dxDataGrid.getTotalSummaryValue(summaryItemName)]
    */
  def getTotalSummaryValue(summaryItemName: String): js.Any = js.native
  
  /**
    * [descr:dxDataGrid.getVisibleColumns()]
    */
  def getVisibleColumns(): js.Array[dxDataGridColumn] = js.native
  /**
    * [descr:dxDataGrid.getVisibleColumns(headerLevel)]
    */
  def getVisibleColumns(headerLevel: Double): js.Array[dxDataGridColumn] = js.native
  
  /**
    * [descr:dxDataGrid.getVisibleRows()]
    */
  def getVisibleRows(): js.Array[dxDataGridRowObject] = js.native
  
  /**
    * [descr:dxDataGrid.isRowExpanded(key)]
    */
  def isRowExpanded(key: js.Any): Boolean = js.native
  
  /**
    * [descr:dxDataGrid.totalCount()]
    */
  def totalCount(): Double = js.native
}
