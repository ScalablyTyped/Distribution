package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBase extends Widget {
  /** @name GridBase.beginCustomLoading(messageText) */
  def beginCustomLoading(messageText: String): Unit = js.native
  def byKey(key: String): Promise[_] with JQueryPromise[_] = js.native
  /** @name GridBase.byKey(key) */
  def byKey(key: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double): Promise[_] with JQueryPromise[_] = js.native
  /** @name GridBase.cancelEditData() */
  def cancelEditData(): Unit = js.native
  /** @name GridBase.cellValue(rowIndex, dataField) */
  def cellValue(rowIndex: Double, dataField: String): js.Any = js.native
  /** @name GridBase.cellValue(rowIndex, dataField, value) */
  def cellValue(rowIndex: Double, dataField: String, value: js.Any): Unit = js.native
  /** @name GridBase.cellValue(rowIndex, visibleColumnIndex) */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double): js.Any = js.native
  /** @name GridBase.cellValue(rowIndex, visibleColumnIndex, value) */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double, value: js.Any): Unit = js.native
  /** @name GridBase.clearFilter() */
  def clearFilter(): Unit = js.native
  /** @name GridBase.clearFilter(filterName) */
  def clearFilter(filterName: String): Unit = js.native
  /** @name GridBase.clearSelection() */
  def clearSelection(): Unit = js.native
  /** @name GridBase.clearSorting() */
  def clearSorting(): Unit = js.native
  /** @name GridBase.closeEditCell() */
  def closeEditCell(): Unit = js.native
  /** @name GridBase.collapseAdaptiveDetailRow() */
  def collapseAdaptiveDetailRow(): Unit = js.native
  /** @name GridBase.columnCount() */
  def columnCount(): Double = js.native
  def columnOption(id: String): js.Any = js.native
  def columnOption(id: String, optionName: String): js.Any = js.native
  def columnOption(id: String, optionName: String, optionValue: js.Any): Unit = js.native
  def columnOption(id: String, options: js.Any): Unit = js.native
  /** @name GridBase.columnOption(id) */
  def columnOption(id: Double): js.Any = js.native
  /** @name GridBase.columnOption(id, optionName) */
  def columnOption(id: Double, optionName: String): js.Any = js.native
  /** @name GridBase.columnOption(id, optionName, optionValue) */
  def columnOption(id: Double, optionName: String, optionValue: js.Any): Unit = js.native
  /** @name GridBase.columnOption(id, options) */
  def columnOption(id: Double, options: js.Any): Unit = js.native
  def deleteColumn(id: String): Unit = js.native
  /** @name GridBase.deleteColumn(id) */
  def deleteColumn(id: Double): Unit = js.native
  /** @name GridBase.deleteRow(rowIndex) */
  def deleteRow(rowIndex: Double): Unit = js.native
  /** @name GridBase.deselectAll() */
  def deselectAll(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name GridBase.deselectRows(keys) */
  def deselectRows(keys: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  /** @name GridBase.editCell(rowIndex, dataField) */
  def editCell(rowIndex: Double, dataField: String): Unit = js.native
  /** @name GridBase.editCell(rowIndex, visibleColumnIndex) */
  def editCell(rowIndex: Double, visibleColumnIndex: Double): Unit = js.native
  /** @name GridBase.editRow(rowIndex) */
  def editRow(rowIndex: Double): Unit = js.native
  /** @name GridBase.endCustomLoading() */
  def endCustomLoading(): Unit = js.native
  /** @name GridBase.expandAdaptiveDetailRow(key) */
  def expandAdaptiveDetailRow(key: js.Any): Unit = js.native
  /** @name GridBase.filter() */
  def filter(): js.Any = js.native
  /** @name GridBase.filter(filterExpr) */
  def filter(filterExpr: js.Any): Unit = js.native
  def focus(element: JQuery): Unit = js.native
  /** @name GridBase.focus(element) */
  def focus(element: Element): Unit = js.native
  /** @name GridBase.getCellElement(rowIndex, dataField) */
  def getCellElement(rowIndex: Double, dataField: String): js.UndefOr[dxElement] = js.native
  /** @name GridBase.getCellElement(rowIndex, visibleColumnIndex) */
  def getCellElement(rowIndex: Double, visibleColumnIndex: Double): js.UndefOr[dxElement] = js.native
  /** @name GridBase.getCombinedFilter() */
  def getCombinedFilter(): js.Any = js.native
  /** @name GridBase.getCombinedFilter(returnDataField) */
  def getCombinedFilter(returnDataField: Boolean): js.Any = js.native
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  /** @name GridBase.getKeyByRowIndex(rowIndex) */
  def getKeyByRowIndex(rowIndex: Double): js.Any = js.native
  /** @name GridBase.getRowElement(rowIndex) */
  def getRowElement(rowIndex: Double): js.UndefOr[js.Array[Element] with JQuery] = js.native
  def getRowIndexByKey(key: String): Double = js.native
  /** @name GridBase.getRowIndexByKey(key) */
  def getRowIndexByKey(key: js.Any): Double = js.native
  def getRowIndexByKey(key: Double): Double = js.native
  /** @name GridBase.getScrollable() */
  def getScrollable(): dxScrollable = js.native
  def getVisibleColumnIndex(id: String): Double = js.native
  /** @name GridBase.getVisibleColumnIndex(id) */
  def getVisibleColumnIndex(id: Double): Double = js.native
  /** @name GridBase.hasEditData() */
  def hasEditData(): Boolean = js.native
  /** @name GridBase.hideColumnChooser() */
  def hideColumnChooser(): Unit = js.native
  /** @name GridBase.isAdaptiveDetailRowExpanded(key) */
  def isAdaptiveDetailRowExpanded(key: js.Any): Boolean = js.native
  /** @name GridBase.isRowFocused(key) */
  def isRowFocused(key: js.Any): Boolean = js.native
  /** @name GridBase.isRowSelected(key) */
  def isRowSelected(key: js.Any): Boolean = js.native
  /** @name GridBase.keyOf(obj) */
  def keyOf(obj: js.Any): js.Any = js.native
  /** @name GridBase.navigateToRow(key) */
  def navigateToRow(key: js.Any): Unit = js.native
  /** @name GridBase.pageCount() */
  def pageCount(): Double = js.native
  /** @name GridBase.pageIndex() */
  def pageIndex(): Double = js.native
  /** @name GridBase.pageIndex(newIndex) */
  def pageIndex(newIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name GridBase.pageSize() */
  def pageSize(): Double = js.native
  /** @name GridBase.pageSize(value) */
  def pageSize(value: Double): Unit = js.native
  /** @name GridBase.refresh() */
  def refresh(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name GridBase.refresh(changesOnly) */
  def refresh(changesOnly: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name GridBase.repaintRows(rowIndexes) */
  def repaintRows(rowIndexes: js.Array[Double]): Unit = js.native
  /** @name GridBase.saveEditData() */
  def saveEditData(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name GridBase.searchByText(text) */
  def searchByText(text: String): Unit = js.native
  /** @name GridBase.selectAll() */
  def selectAll(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name GridBase.selectRows(keys, preserve) */
  def selectRows(keys: js.Array[_], preserve: Boolean): Promise[_] with JQueryPromise[_] = js.native
  /** @name GridBase.selectRowsByIndexes(indexes) */
  def selectRowsByIndexes(indexes: js.Array[Double]): Promise[_] with JQueryPromise[_] = js.native
  /** @name GridBase.showColumnChooser() */
  def showColumnChooser(): Unit = js.native
  /** @name GridBase.state() */
  def state(): js.Any = js.native
  /** @name GridBase.state(state) */
  def state(state: js.Any): Unit = js.native
  /** @name GridBase.undeleteRow(rowIndex) */
  def undeleteRow(rowIndex: Double): Unit = js.native
  /** @name GridBase.updateDimensions() */
  def updateDimensions(): Unit = js.native
}

