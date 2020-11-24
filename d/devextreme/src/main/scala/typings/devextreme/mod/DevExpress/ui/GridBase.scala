package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBase extends Widget {
  
  /**
    * [descr:GridBase.beginCustomLoading(messageText)]
    */
  def beginCustomLoading(messageText: String): Unit = js.native
  
  def byKey(key: String): Promise[_] with JQueryPromise[_] = js.native
  /**
    * [descr:GridBase.byKey(key)]
    */
  def byKey(key: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:GridBase.cancelEditData()]
    */
  def cancelEditData(): Unit = js.native
  
  /**
    * [descr:GridBase.cellValue(rowIndex, dataField)]
    */
  def cellValue(rowIndex: Double, dataField: String): js.Any = js.native
  /**
    * [descr:GridBase.cellValue(rowIndex, dataField, value)]
    */
  def cellValue(rowIndex: Double, dataField: String, value: js.Any): Unit = js.native
  /**
    * [descr:GridBase.cellValue(rowIndex, visibleColumnIndex)]
    */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double): js.Any = js.native
  /**
    * [descr:GridBase.cellValue(rowIndex, visibleColumnIndex, value)]
    */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double, value: js.Any): Unit = js.native
  
  /**
    * [descr:GridBase.clearFilter()]
    */
  def clearFilter(): Unit = js.native
  /**
    * [descr:GridBase.clearFilter(filterName)]
    */
  def clearFilter(filterName: String): Unit = js.native
  
  /**
    * [descr:GridBase.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:GridBase.clearSorting()]
    */
  def clearSorting(): Unit = js.native
  
  /**
    * [descr:GridBase.closeEditCell()]
    */
  def closeEditCell(): Unit = js.native
  
  /**
    * [descr:GridBase.collapseAdaptiveDetailRow()]
    */
  def collapseAdaptiveDetailRow(): Unit = js.native
  
  /**
    * [descr:GridBase.columnCount()]
    */
  def columnCount(): Double = js.native
  
  def columnOption(id: String): js.Any = js.native
  def columnOption(id: String, optionName: String): js.Any = js.native
  def columnOption(id: String, optionName: String, optionValue: js.Any): Unit = js.native
  def columnOption(id: String, options: js.Any): Unit = js.native
  /**
    * [descr:GridBase.columnOption(id)]
    */
  def columnOption(id: Double): js.Any = js.native
  /**
    * [descr:GridBase.columnOption(id, optionName)]
    */
  def columnOption(id: Double, optionName: String): js.Any = js.native
  /**
    * [descr:GridBase.columnOption(id, optionName, optionValue)]
    */
  def columnOption(id: Double, optionName: String, optionValue: js.Any): Unit = js.native
  /**
    * [descr:GridBase.columnOption(id, options)]
    */
  def columnOption(id: Double, options: js.Any): Unit = js.native
  
  def deleteColumn(id: String): Unit = js.native
  /**
    * [descr:GridBase.deleteColumn(id)]
    */
  def deleteColumn(id: Double): Unit = js.native
  
  /**
    * [descr:GridBase.deleteRow(rowIndex)]
    */
  def deleteRow(rowIndex: Double): Unit = js.native
  
  /**
    * [descr:GridBase.deselectAll()]
    */
  def deselectAll(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:GridBase.deselectRows(keys)]
    */
  def deselectRows(keys: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:GridBase.editCell(rowIndex, dataField)]
    */
  def editCell(rowIndex: Double, dataField: String): Unit = js.native
  /**
    * [descr:GridBase.editCell(rowIndex, visibleColumnIndex)]
    */
  def editCell(rowIndex: Double, visibleColumnIndex: Double): Unit = js.native
  
  /**
    * [descr:GridBase.editRow(rowIndex)]
    */
  def editRow(rowIndex: Double): Unit = js.native
  
  /**
    * [descr:GridBase.endCustomLoading()]
    */
  def endCustomLoading(): Unit = js.native
  
  /**
    * [descr:GridBase.expandAdaptiveDetailRow(key)]
    */
  def expandAdaptiveDetailRow(key: js.Any): Unit = js.native
  
  /**
    * [descr:GridBase.filter()]
    */
  def filter(): js.Any = js.native
  /**
    * [descr:GridBase.filter(filterExpr)]
    */
  def filter(filterExpr: js.Any): Unit = js.native
  
  def focus(element: JQuery): Unit = js.native
  /**
    * [descr:GridBase.focus(element)]
    */
  def focus(element: Element): Unit = js.native
  
  /**
    * [descr:GridBase.getCellElement(rowIndex, dataField)]
    */
  def getCellElement(rowIndex: Double, dataField: String): js.UndefOr[dxElement] = js.native
  /**
    * [descr:GridBase.getCellElement(rowIndex, visibleColumnIndex)]
    */
  def getCellElement(rowIndex: Double, visibleColumnIndex: Double): js.UndefOr[dxElement] = js.native
  
  /**
    * [descr:GridBase.getCombinedFilter()]
    */
  def getCombinedFilter(): js.Any = js.native
  /**
    * [descr:GridBase.getCombinedFilter(returnDataField)]
    */
  def getCombinedFilter(returnDataField: Boolean): js.Any = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:GridBase.getKeyByRowIndex(rowIndex)]
    */
  def getKeyByRowIndex(rowIndex: Double): js.Any = js.native
  
  /**
    * [descr:GridBase.getRowElement(rowIndex)]
    */
  def getRowElement(rowIndex: Double): js.UndefOr[js.Array[Element] with JQuery] = js.native
  
  def getRowIndexByKey(key: String): Double = js.native
  /**
    * [descr:GridBase.getRowIndexByKey(key)]
    */
  def getRowIndexByKey(key: js.Any): Double = js.native
  def getRowIndexByKey(key: Double): Double = js.native
  
  /**
    * [descr:GridBase.getScrollable()]
    */
  def getScrollable(): dxScrollable = js.native
  
  def getVisibleColumnIndex(id: String): Double = js.native
  /**
    * [descr:GridBase.getVisibleColumnIndex(id)]
    */
  def getVisibleColumnIndex(id: Double): Double = js.native
  
  /**
    * [descr:GridBase.hasEditData()]
    */
  def hasEditData(): Boolean = js.native
  
  /**
    * [descr:GridBase.hideColumnChooser()]
    */
  def hideColumnChooser(): Unit = js.native
  
  /**
    * [descr:GridBase.isAdaptiveDetailRowExpanded(key)]
    */
  def isAdaptiveDetailRowExpanded(key: js.Any): Boolean = js.native
  
  /**
    * [descr:GridBase.isRowFocused(key)]
    */
  def isRowFocused(key: js.Any): Boolean = js.native
  
  /**
    * [descr:GridBase.isRowSelected(key)]
    */
  def isRowSelected(key: js.Any): Boolean = js.native
  
  /**
    * [descr:GridBase.keyOf(obj)]
    */
  def keyOf(obj: js.Any): js.Any = js.native
  
  /**
    * [descr:GridBase.navigateToRow(key)]
    */
  def navigateToRow(key: js.Any): Unit = js.native
  
  /**
    * [descr:GridBase.pageCount()]
    */
  def pageCount(): Double = js.native
  
  /**
    * [descr:GridBase.pageIndex()]
    */
  def pageIndex(): Double = js.native
  /**
    * [descr:GridBase.pageIndex(newIndex)]
    */
  def pageIndex(newIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:GridBase.pageSize()]
    */
  def pageSize(): Double = js.native
  /**
    * [descr:GridBase.pageSize(value)]
    */
  def pageSize(value: Double): Unit = js.native
  
  /**
    * [descr:GridBase.refresh()]
    */
  def refresh(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:GridBase.refresh(changesOnly)]
    */
  def refresh(changesOnly: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:GridBase.repaintRows(rowIndexes)]
    */
  def repaintRows(rowIndexes: js.Array[Double]): Unit = js.native
  
  /**
    * [descr:GridBase.saveEditData()]
    */
  def saveEditData(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:GridBase.searchByText(text)]
    */
  def searchByText(text: String): Unit = js.native
  
  /**
    * [descr:GridBase.selectAll()]
    */
  def selectAll(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:GridBase.selectRows(keys, preserve)]
    */
  def selectRows(keys: js.Array[_], preserve: Boolean): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:GridBase.selectRowsByIndexes(indexes)]
    */
  def selectRowsByIndexes(indexes: js.Array[Double]): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:GridBase.showColumnChooser()]
    */
  def showColumnChooser(): Unit = js.native
  
  /**
    * [descr:GridBase.state()]
    */
  def state(): js.Any = js.native
  /**
    * [descr:GridBase.state(state)]
    */
  def state(state: js.Any): Unit = js.native
  
  /**
    * [descr:GridBase.undeleteRow(rowIndex)]
    */
  def undeleteRow(rowIndex: Double): Unit = js.native
  
  /**
    * [descr:GridBase.updateDimensions()]
    */
  def updateDimensions(): Unit = js.native
}
