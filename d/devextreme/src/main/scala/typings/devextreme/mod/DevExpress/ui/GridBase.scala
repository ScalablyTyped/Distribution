package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.UserDefinedElementsArray
import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Scrollable
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBase[TRowData, TKey] extends StObject {
  
  /**
    * Shows the load panel.
    */
  def beginCustomLoading(messageText: String): Unit = js.native
  
  /**
    * Gets a data object with a specific key.
    */
  def byKey(key: TKey): DxPromise[TRowData] = js.native
  
  /**
    * Discards changes that a user made to data.
    */
  def cancelEditData(): Unit = js.native
  
  /**
    * Gets the value of a cell with a specific row index and a data field, column caption or name.
    */
  def cellValue(rowIndex: Double, dataField: String): Any = js.native
  /**
    * Sets a new value to a cell with a specific row index and a data field, column caption or name.
    */
  def cellValue(rowIndex: Double, dataField: String, value: Any): Unit = js.native
  /**
    * Gets the value of a cell with specific row and column indexes.
    */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double): Any = js.native
  /**
    * Sets a new value to a cell with specific row and column indexes.
    */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double, value: Any): Unit = js.native
  
  /**
    * Clears all filters applied to UI component rows.
    */
  def clearFilter(): Unit = js.native
  /**
    * Clears all row filters of a specific type.
    */
  def clearFilter(filterName: String): Unit = js.native
  
  /**
    * Clears selection of all rows on all pages.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Clears sorting settings of all columns at once.
    */
  def clearSorting(): Unit = js.native
  
  /**
    * Switches the cell being edited back to the normal state. Takes effect only if editing.mode is batch or cell and showEditorAlways is false.
    */
  def closeEditCell(): Unit = js.native
  
  /**
    * Collapses the currently expanded adaptive detail row (if there is one).
    */
  def collapseAdaptiveDetailRow(): Unit = js.native
  
  /**
    * Gets the data column count. Includes visible and hidden columns, excludes command columns.
    */
  def columnCount(): Double = js.native
  
  def columnOption(id: String): Any = js.native
  def columnOption(id: String, optionName: String): Any = js.native
  def columnOption(id: String, optionName: String, optionValue: Any): Unit = js.native
  def columnOption(id: String, options: Any): Unit = js.native
  /**
    * Gets all properties of a column with a specific identifier.
    */
  def columnOption(id: Double): Any = js.native
  /**
    * Gets the value of a single column property.
    */
  def columnOption(id: Double, optionName: String): Any = js.native
  /**
    * Updates the value of a single column property.
    */
  def columnOption(id: Double, optionName: String, optionValue: Any): Unit = js.native
  /**
    * Updates the values of several column properties.
    */
  def columnOption(id: Double, options: Any): Unit = js.native
  
  def deleteColumn(id: String): Unit = js.native
  /**
    * Removes a column.
    */
  def deleteColumn(id: Double): Unit = js.native
  
  /**
    * Removes a row with a specific index.
    */
  def deleteRow(rowIndex: Double): Unit = js.native
  
  /**
    * Clears the selection of all rows on all pages or the currently rendered page only.
    */
  def deselectAll(): DxPromise[Unit] = js.native
  
  /**
    * Cancels the selection of rows with specific keys.
    */
  def deselectRows(keys: js.Array[Any]): DxPromise[Any] = js.native
  
  /**
    * Switches a cell with a specific row index and a data field to the editing state. Takes effect only if the editing mode is &apos;batch&apos; or &apos;cell&apos;.
    */
  def editCell(rowIndex: Double, dataField: String): Unit = js.native
  /**
    * Switches a cell with specific row and column indexes to the editing state. Takes effect only if the editing mode is &apos;batch&apos; or &apos;cell&apos;.
    */
  def editCell(rowIndex: Double, visibleColumnIndex: Double): Unit = js.native
  
  /**
    * Switches a row with a specific index to the editing state. Takes effect only if the editing mode is &apos;row&apos;, &apos;popup&apos; or &apos;form&apos;.
    */
  def editRow(rowIndex: Double): Unit = js.native
  
  /**
    * Hides the load panel.
    */
  def endCustomLoading(): Unit = js.native
  
  /**
    * Expands an adaptive detail row.
    */
  def expandAdaptiveDetailRow(key: TKey): Unit = js.native
  
  /**
    * Gets a filter expression applied to the UI component&apos;s data source using the filter(filterExpr) method and the DataSource&apos;s filter property.
    */
  def filter(): Any = js.native
  /**
    * Applies a filter to the dataSource.
    */
  def filter(filterExpr: Any): Unit = js.native
  
  def focus(): Unit = js.native
  /**
    * Sets focus on a specific cell.
    */
  def focus(element: UserDefinedElement[Element]): Unit = js.native
  
  /**
    * Gets a cell with a specific row index and a data field, column caption or name.
    */
  def getCellElement(rowIndex: Double, dataField: String): js.UndefOr[DxElement_[HTMLElement]] = js.native
  /**
    * Gets a cell with specific row and column indexes.
    */
  def getCellElement(rowIndex: Double, visibleColumnIndex: Double): js.UndefOr[DxElement_[HTMLElement]] = js.native
  
  /**
    * Gets the total filter that combines all the filters applied.
    */
  def getCombinedFilter(): Any = js.native
  /**
    * Gets the total filter that combines all the filters applied.
    */
  def getCombinedFilter(returnDataField: Boolean): Any = js.native
  
  def getDataSource(): DataSource[TRowData, TKey] = js.native
  
  /**
    * Gets the key of a row with a specific index.
    */
  def getKeyByRowIndex(rowIndex: Double): js.UndefOr[TKey] = js.native
  
  /**
    * Gets the container of a row with a specific index.
    */
  def getRowElement(rowIndex: Double): js.UndefOr[UserDefinedElementsArray] = js.native
  
  /**
    * Gets the index of a row with a specific key.
    */
  def getRowIndexByKey(key: TKey): Double = js.native
  
  /**
    * Gets the instance of the UI component&apos;s scrollable part.
    */
  def getScrollable(): Scrollable = js.native
  
  def getVisibleColumnIndex(id: String): Double = js.native
  /**
    * Gets the index of a visible column.
    */
  def getVisibleColumnIndex(id: Double): Double = js.native
  
  /**
    * Checks whether the UI component has unsaved changes.
    */
  def hasEditData(): Boolean = js.native
  
  /**
    * Hides the column chooser.
    */
  def hideColumnChooser(): Unit = js.native
  
  /**
    * Checks whether an adaptive detail row is expanded or collapsed.
    */
  def isAdaptiveDetailRowExpanded(key: TKey): Boolean = js.native
  
  /**
    * Checks whether a row with a specific key is focused.
    */
  def isRowFocused(key: TKey): Boolean = js.native
  
  /**
    * Checks whether a row with a specific key is selected.
    */
  def isRowSelected(key: TKey): Boolean = js.native
  
  /**
    * Gets a data object&apos;s key.
    */
  def keyOf(obj: TRowData): TKey = js.native
  
  /**
    * Navigates to a row with the specified key.
    */
  def navigateToRow(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Gets the total page count.
    */
  def pageCount(): Double = js.native
  
  /**
    * Gets the current page index.
    */
  def pageIndex(): Double = js.native
  /**
    * Switches the UI component to a specific page using a zero-based index.
    */
  def pageIndex(newIndex: Double): DxPromise[Unit] = js.native
  
  /**
    * Gets the current page size.
    */
  def pageSize(): Double = js.native
  /**
    * Sets the page size.
    */
  def pageSize(value: Double): Unit = js.native
  
  /**
    * Reloads data and repaints data rows.
    */
  def refresh(): DxPromise[Unit] = js.native
  /**
    * Reloads data and repaints all or only updated data rows.
    */
  def refresh(changesOnly: Boolean): DxPromise[Unit] = js.native
  
  /**
    * Repaints specific rows.
    */
  def repaintRows(rowIndexes: js.Array[Double]): Unit = js.native
  
  /**
    * Saves changes that a user made to data.
    */
  def saveEditData(): DxPromise[Unit] = js.native
  
  /**
    * Seeks a search string in the columns whose allowSearch property is true.
    */
  def searchByText(text: String): Unit = js.native
  
  /**
    * Selects all rows.
    */
  def selectAll(): DxPromise[Unit] = js.native
  
  /**
    * Selects rows with specific keys.
    */
  def selectRows(keys: js.Array[TKey], preserve: Boolean): DxPromise[js.Array[TRowData]] = js.native
  
  /**
    * Selects rows with specific indexes.
    */
  def selectRowsByIndexes(indexes: js.Array[Double]): DxPromise[js.Array[TRowData]] = js.native
  
  /**
    * Shows the column chooser.
    */
  def showColumnChooser(): Unit = js.native
  
  /**
    * Gets the current UI component state.
    */
  def state(): Any = js.native
  /**
    * Sets the UI component state.
    */
  def state(state: Any): Unit = js.native
  
  /**
    * Recovers a row deleted in batch editing mode.
    */
  def undeleteRow(rowIndex: Double): Unit = js.native
  
  /**
    * Updates the UI component&apos;s content after resizing.
    */
  def updateDimensions(): Unit = js.native
}
