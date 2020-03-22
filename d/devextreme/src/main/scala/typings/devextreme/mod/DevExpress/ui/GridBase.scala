package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod._Global_.JQuery
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBase extends Widget {
  /** Shows the load panel. */
  def beginCustomLoading(messageText: String): Unit = js.native
  def byKey(key: String): Promise[_] with JQueryPromise[_] = js.native
  /** Gets a data object with a specific key. */
  def byKey(key: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double): Promise[_] with JQueryPromise[_] = js.native
  /** Discards changes that a user made to data. */
  def cancelEditData(): Unit = js.native
  /** Gets the value of a cell with a specific row index and a data field, column caption or name. */
  def cellValue(rowIndex: Double, dataField: String): js.Any = js.native
  /** Sets a new value to a cell with a specific row index and a data field, column caption or name. */
  def cellValue(rowIndex: Double, dataField: String, value: js.Any): Unit = js.native
  /** Gets the value of a cell with specific row and column indexes. */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double): js.Any = js.native
  /** Sets a new value to a cell with specific row and column indexes. */
  def cellValue(rowIndex: Double, visibleColumnIndex: Double, value: js.Any): Unit = js.native
  /** Clears all filters applied to widget rows. */
  def clearFilter(): Unit = js.native
  /** Clears all row filters of a specific type. */
  def clearFilter(filterName: String): Unit = js.native
  /** Clears selection of all rows on all pages. */
  def clearSelection(): Unit = js.native
  /** Clears sorting settings of all columns at once. */
  def clearSorting(): Unit = js.native
  /** Switches the cell being edited back to the normal state. Takes effect only if editing.mode is batch and showEditorAlways is false. */
  def closeEditCell(): Unit = js.native
  /** Collapses the currently expanded adaptive detail row (if there is one). */
  def collapseAdaptiveDetailRow(): Unit = js.native
  /** Gets the data column count. Includes visible and hidden columns, excludes command columns. */
  def columnCount(): Double = js.native
  def columnOption(id: String): js.Any = js.native
  def columnOption(id: String, optionName: String): js.Any = js.native
  def columnOption(id: String, optionName: String, optionValue: js.Any): Unit = js.native
  def columnOption(id: String, options: js.Any): Unit = js.native
  /** Gets all options of a column with a specific identifier. */
  def columnOption(id: Double): js.Any = js.native
  /** Gets the value of a single column option. */
  def columnOption(id: Double, optionName: String): js.Any = js.native
  /** Updates the value of a single column option. */
  def columnOption(id: Double, optionName: String, optionValue: js.Any): Unit = js.native
  /** Updates the values of several column options. */
  def columnOption(id: Double, options: js.Any): Unit = js.native
  def deleteColumn(id: String): Unit = js.native
  /** Removes a column. */
  def deleteColumn(id: Double): Unit = js.native
  /** Removes a row with a specific index. */
  def deleteRow(rowIndex: Double): Unit = js.native
  /** Clears the selection of all rows on all pages or the currently rendered page only. */
  def deselectAll(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Cancels the selection of rows with specific keys. */
  def deselectRows(keys: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  /** Switches a cell with a specific row index and a data field to the editing state. Takes effect only if the editing mode is "batch" or "cell". */
  def editCell(rowIndex: Double, dataField: String): Unit = js.native
  /** Switches a cell with specific row and column indexes to the editing state. Takes effect only if the editing mode is "batch" or "cell". */
  def editCell(rowIndex: Double, visibleColumnIndex: Double): Unit = js.native
  /** Switches a row with a specific index to the editing state. Takes effect only if the editing mode is "row", "popup" or "form". */
  def editRow(rowIndex: Double): Unit = js.native
  /** Hides the load panel. */
  def endCustomLoading(): Unit = js.native
  /** Expands an adaptive detail row. */
  def expandAdaptiveDetailRow(key: js.Any): Unit = js.native
  /** Gets a filter expression applied to the widget's data source using the filter(filterExpr) method and the DataSource's filter option. */
  def filter(): js.Any = js.native
  /** Applies a filter to the widget's data source. */
  def filter(filterExpr: js.Any): Unit = js.native
  def focus(element: JQuery): Unit = js.native
  /** Sets focus on a specific cell. */
  def focus(element: Element): Unit = js.native
  /** Gets a cell with a specific row index and a data field, column caption or name. */
  def getCellElement(rowIndex: Double, dataField: String): js.UndefOr[dxElement] = js.native
  /** Gets a cell with specific row and column indexes. */
  def getCellElement(rowIndex: Double, visibleColumnIndex: Double): js.UndefOr[dxElement] = js.native
  /** Gets the total filter that combines all the filters applied. */
  def getCombinedFilter(): js.Any = js.native
  /** Gets the total filter that combines all the filters applied. */
  def getCombinedFilter(returnDataField: Boolean): js.Any = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets the key of a row with a specific index. */
  def getKeyByRowIndex(rowIndex: Double): js.Any = js.native
  /** Gets the container of a row with a specific index. */
  def getRowElement(rowIndex: Double): js.UndefOr[js.Array[Element] with JQuery] = js.native
  def getRowIndexByKey(key: String): Double = js.native
  /** Gets the index of a row with a specific key. */
  def getRowIndexByKey(key: js.Any): Double = js.native
  def getRowIndexByKey(key: Double): Double = js.native
  /** Gets the instance of the widget's scrollable part. */
  def getScrollable(): dxScrollable = js.native
  def getVisibleColumnIndex(id: String): Double = js.native
  /** Gets the index of a visible column. */
  def getVisibleColumnIndex(id: Double): Double = js.native
  /** Checks whether the widget has unsaved changes. */
  def hasEditData(): Boolean = js.native
  /** Hides the column chooser. */
  def hideColumnChooser(): Unit = js.native
  /** Checks whether an adaptive detail row is expanded or collapsed. */
  def isAdaptiveDetailRowExpanded(key: js.Any): Boolean = js.native
  /** Checks whether a row with a specific key is focused. */
  def isRowFocused(key: js.Any): Boolean = js.native
  /** Checks whether a row with a specific key is selected. */
  def isRowSelected(key: js.Any): Boolean = js.native
  /** Gets a data object's key. */
  def keyOf(obj: js.Any): js.Any = js.native
  /** Navigates the grid to the data page that contains the row with the specified key and scrolls the grid to display the row if it is not in the viewport. */
  def navigateToRow(key: js.Any): Unit = js.native
  /** Gets the total page count. */
  def pageCount(): Double = js.native
  /** Gets the current page index. */
  def pageIndex(): Double = js.native
  /** Switches the widget to a specific page using a zero-based index. */
  def pageIndex(newIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Gets the current page size. */
  def pageSize(): Double = js.native
  /** Sets the page size. */
  def pageSize(value: Double): Unit = js.native
  /** Reloads data and repaints the widget. */
  def refresh(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Reloads data and repaints the widget or elements whose data changed. */
  def refresh(changesOnly: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Repaints specific rows. */
  def repaintRows(rowIndexes: js.Array[Double]): Unit = js.native
  /** Saves changes that a user made to data. */
  def saveEditData(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Seeks a search string in the columns whose allowSearch option is true. */
  def searchByText(text: String): Unit = js.native
  /** Selects all rows. */
  def selectAll(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Selects rows with specific keys. */
  def selectRows(keys: js.Array[_], preserve: Boolean): Promise[_] with JQueryPromise[_] = js.native
  /** Selects rows with specific indexes. */
  def selectRowsByIndexes(indexes: js.Array[Double]): Promise[_] with JQueryPromise[_] = js.native
  /** Shows the column chooser. */
  def showColumnChooser(): Unit = js.native
  /** Gets the current widget state. */
  def state(): js.Any = js.native
  /** Sets the widget state. */
  def state(state: js.Any): Unit = js.native
  /** Recovers a row deleted in batch editing mode. */
  def undeleteRow(rowIndex: Double): Unit = js.native
  /** Updates the widget's content after resizing. */
  def updateDimensions(): Unit = js.native
}

