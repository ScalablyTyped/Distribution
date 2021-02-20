package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxGridView object.
  */
@js.native
trait ASPxClientGridView extends ASPxClientGridBase {
  
  /**
    * Adds a new record.
    */
  def AddNewRow(): Unit = js.native
  
  /**
    * Applies the specified filter expression to the GridView.
    * @param filterExpression A string value that specifies the filter expression.
    */
  def ApplyFilter(filterExpression: String): Unit = js.native
  
  /**
    * Applies a filter specified in the filter row to the GridView.
    */
  def ApplyOnClickRowFilter(): Unit = js.native
  
  /**
    * Applies the specified search panel filter criterion to grid data.
    * @param value A string value that specifies the filter criterion.
    */
  def ApplySearchPanelFilter(value: String): Unit = js.native
  
  def AutoFilterByColumn(column: String, `val`: String): Unit = js.native
  def AutoFilterByColumn(column: Double, `val`: String): Unit = js.native
  /**
    * Applies a filter to the specified data column.
    * @param val A string value that specifies the filter expression.
    */
  def AutoFilterByColumn(column: ASPxClientGridViewColumn, `val`: String): Unit = js.native
  
  /**
    * Occurs on the client side before data changes are canceled in batch edit mode.
    */
  var BatchEditChangesCanceling: ASPxClientEvent[ASPxClientGridViewBatchEditChangesCancelingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client side before the Changes Preview window is shown.
    */
  var BatchEditChangesPreviewShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client side when the Changes Preview window is shown.
    */
  var BatchEditChangesPreviewShown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client side before data changes are saved in batch edit mode.
    */
  var BatchEditChangesSaving: ASPxClientEvent[ASPxClientGridViewBatchEditChangesSavingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Enables you to prevent a batch edit confirmation message from being displayed.
    */
  var BatchEditConfirmShowing: ASPxClientEvent[ASPxClientGridViewBatchEditConfirmShowingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs when a grid leaves the batch edit mode.
    */
  var BatchEditEndEditing: ASPxClientEvent[ASPxClientGridViewBatchEditEndEditingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client side before a data row is deleted in batch edit mode.
    */
  var BatchEditRowDeleting: ASPxClientEvent[ASPxClientGridViewBatchEditRowDeletingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client side before a data row is inserted in batch edit mode.
    */
  var BatchEditRowInserting: ASPxClientEvent[ASPxClientGridViewBatchEditRowInsertingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client side before a row is recovered in batch edit mode.
    */
  var BatchEditRowRecovering: ASPxClientEvent[ASPxClientGridViewBatchEditRowRecoveringEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Enables you to specify whether row data is valid and provide an error text.
    */
  var BatchEditRowValidating: ASPxClientEvent[ASPxClientGridViewBatchEditRowValidatingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs when a grid switches to batch edit mode.
    */
  var BatchEditStartEditing: ASPxClientEvent[ASPxClientGridViewBatchEditStartEditingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Enables you to provide navigation for editors contained in a templated cell in Batch Edit mode.
    */
  var BatchEditTemplateCellFocused: ASPxClientEvent[ASPxClientGridViewBatchEditTemplateCellFocusedEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientGridView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Cancels all the changes made and switches the GridView to browse mode.
    */
  def CancelEdit(): Unit = js.native
  
  /**
    * Clears the filter expression applied to a client GridView.
    */
  def ClearFilter(): Unit = js.native
  
  /**
    * Hides the Filter Control.
    */
  def CloseFilterControl(): Unit = js.native
  
  /**
    * Collapses all group rows.
    */
  def CollapseAll(): Unit = js.native
  
  /**
    * Collapses all detail rows.
    */
  def CollapseAllDetailRows(): Unit = js.native
  
  /**
    * Collapses the specified detail row.
    * @param visibleIndex A zero-based integer index that identifies the detail row.
    */
  def CollapseDetailRow(visibleIndex: Double): Unit = js.native
  
  /**
    * Collapses the specified group row and optionally child group rows at all nesting levels.
    * @param visibleIndex An integer value that identifies the group row by its visible index.
    * @param recursive true to collapse child group rows at all nesting levels; false to preserve the expanded state of any child group row.
    */
  def CollapseRow(visibleIndex: Double): Unit = js.native
  def CollapseRow(visibleIndex: Double, recursive: Boolean): Unit = js.native
  
  /**
    * Enables you to cancel data grouping.
    */
  var ColumnGrouping: ASPxClientEvent[ASPxClientGridViewColumnCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Enables you to control column movement.
    */
  var ColumnMoving: ASPxClientEvent[ASPxClientGridViewColumnMovingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs after a column's width has been changed by an end-user.
    */
  var ColumnResized: ASPxClientEvent[ASPxClientGridViewColumnProcessingModeEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Enables you to prevent columns from being resized.
    */
  var ColumnResizing: ASPxClientEvent[ASPxClientGridViewColumnCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Enables you to prevent columns from being sorted.
    */
  var ColumnSorting: ASPxClientEvent[ASPxClientGridViewColumnCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires when an end-user starts dragging the column's header and enables you to cancel this operation.
    */
  var ColumnStartDragging: ASPxClientEvent[ASPxClientGridViewColumnCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs after an end-user right clicks in the GridView, and enables you to provide a custom context menu.
    */
  var ContextMenu: ASPxClientEvent[ASPxClientGridViewContextMenuEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires on the client side when a context menu item has been clicked.
    */
  var ContextMenuItemClick: ASPxClientEvent[ASPxClientGridViewContextMenuItemClickEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs when a user clicks a custom command button.
    */
  var CustomButtonClick: ASPxClientEvent[ASPxClientGridViewCustomButtonEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires after the Customization Window has been closed.
    */
  var CustomizationWindowCloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Deletes the specified row.
    * @param visibleIndex An integer value that identifies the row.
    */
  def DeleteRow(visibleIndex: Double): Unit = js.native
  
  /**
    * Deletes a row with the specified key value.
    * @param key An object that uniquely identifies the row.
    */
  def DeleteRowByKey(key: js.Any): Unit = js.native
  
  /**
    * Fires before a detail row is collapsed.
    */
  var DetailRowCollapsing: ASPxClientEvent[ASPxClientGridViewRowCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires before a detail row is expanded.
    */
  var DetailRowExpanding: ASPxClientEvent[ASPxClientGridViewRowCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Expands all group rows.
    */
  def ExpandAll(): Unit = js.native
  
  /**
    * Expands all detail rows.
    */
  def ExpandAllDetailRows(): Unit = js.native
  
  /**
    * Expands the specified detail row.
    * @param visibleIndex A zero-based integer index that identifies the detail row.
    */
  def ExpandDetailRow(visibleIndex: Double): Unit = js.native
  
  /**
    * Expands the specified group row and optionally child group rows at all nesting levels.
    * @param visibleIndex An integer value that identifies the group row.
    * @param recursive true to expand any child group rows at all nesting levels; false to preserve the collapsed state of any child group rows.
    */
  def ExpandRow(visibleIndex: Double): Unit = js.native
  def ExpandRow(visibleIndex: Double, recursive: Boolean): Unit = js.native
  
  /**
    * Exports a grid data to a file in the specified format.
    * @param format An ASPxClientGridViewExportFormat object specifying the export format.
    */
  def ExportTo(format: ASPxClientGridViewExportFormat): Unit = js.native
  
  /**
    * Sets input focus to the grid.
    */
  def Focus(): Unit = js.native
  
  def FocusEditor(column: String): Unit = js.native
  def FocusEditor(column: Double): Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited row.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the client grid.
    */
  def FocusEditor(column: ASPxClientGridViewColumn): Unit = js.native
  
  /**
    * Occurs on the client side when the focused cell is about to be changed.
    */
  var FocusedCellChanging: ASPxClientEvent[ASPxClientGridViewFocusedCellChangingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires in response to changing row focus.
    */
  var FocusedRowChanged: ASPxClientEvent[ASPxClientGridViewFocusEventHandler[ASPxClientGridView]] = js.native
  
  def GetAutoFilterEditor(column: String): js.Any = js.native
  def GetAutoFilterEditor(column: Double): js.Any = js.native
  /**
    * Returns the editor used to edit the value in the auto filter row for the specified data column. An object that represents the editor used to edit the value in the specified auto filter row cell. null (Nothing in Visual Basic) if the editor was not found.
    */
  def GetAutoFilterEditor(column: ASPxClientGridViewColumn): js.Any = js.native
  
  /**
    * Returns the client column that resides at the specified position within the column collection. An ASPxClientGridViewColumn object that represents the client column.
    * @param columnIndex A zero-based index that identifies the column within the column collection (the column's CollectionItem.Index property value).
    */
  def GetColumn(columnIndex: Double): ASPxClientGridViewColumn = js.native
  
  /**
    * Returns the client column which is bound to the specified data source field. An ASPxClientGridViewColumn object that represents the client column bound to the specified data source field.
    * @param columnFieldName A string value that specifies the name of the data source field to which the column is bound (the column's GridViewDataColumn.FieldName property value).
    */
  def GetColumnByField(columnFieldName: String): ASPxClientGridViewColumn = js.native
  
  /**
    * Returns the column with the specified unique identifier. An ASPxClientGridViewColumn object that represents the client column.
    * @param columnId A string value that specifies the column's unique identifier (the column's WebColumnBase.Name property value).
    */
  def GetColumnById(columnId: String): ASPxClientGridViewColumn = js.native
  
  /**
    * Returns the number of columns within the client GridView.
    */
  def GetColumnCount(): Double = js.native
  
  /**
    * Returns an object specifying the grid column's layout.
    */
  def GetColumnLayout(): js.Any = js.native
  
  /** @deprecated Use the GetColumnCount method instead. */
  /**
    * Returns the number of columns within the client GridView.
    */
  def GetColumnsCount(): Double = js.native
  
  /**
    * Returns the edit form layout.
    */
  def GetEditFormLayout(): ASPxClientFormLayout = js.native
  
  def GetEditFormLayoutItemByColumn(column: String): ASPxClientLayoutItem = js.native
  def GetEditFormLayoutItemByColumn(column: Double): ASPxClientLayoutItem = js.native
  /**
    * Returns the form layout item. The form layout item.
    * @param column The column, its index or name.
    */
  def GetEditFormLayoutItemByColumn(column: ASPxClientGridViewColumn): ASPxClientLayoutItem = js.native
  
  /**
    * Returns the form layout item or group. The layout item.
    * @param name The item's or group's name.
    */
  def GetEditFormLayoutItemOrGroup(name: String): ASPxClientLayoutItem = js.native
  
  def GetEditValue(column: String): String = js.native
  def GetEditValue(column: Double): String = js.native
  /**
    * Returns the value of the specified edit cell. A string value that represents the value of the edit cell which corresponds to the specified data column.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the client grid.
    */
  def GetEditValue(column: ASPxClientGridViewColumn): String = js.native
  
  def GetEditor(column: String): ASPxClientEdit = js.native
  def GetEditor(column: Double): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified column's values. Specifies a column's editor.
    * @param column Specifies the required column in the client grid.
    */
  def GetEditor(column: ASPxClientGridViewColumn): ASPxClientEdit = js.native
  
  /**
    * Gets information about a focused cell.
    */
  def GetFocusedCell(): ASPxClientGridViewCellInfo = js.native
  
  /**
    * Returns the focused row's index.
    */
  def GetFocusedRowIndex(): Double = js.native
  
  /**
    * Returns the current horizontal scroll position of the grid's content.
    */
  def GetHorizontalScrollPosition(): Double = js.native
  
  /** @deprecated Use the GetHorizontalScrollPosition method instead. */
  /**
    * Returns the current horizontal scroll position of the grid's content.
    */
  def GetHorzScrollPos(): Double = js.native
  
  /**
    * Gets the number of pages to which the grid's data is divided.
    */
  def GetPageCount(): Double = js.native
  
  /**
    * Gets the index of the page currently being selected.
    */
  def GetPageIndex(): Double = js.native
  
  /**
    * Returns the row values displayed within the current page.
    * @param fieldNames The names of data source fields whose values are returned.
    * @param onCallback A ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetPageRowValues(fieldNames: String, onCallback: ASPxClientGridViewValuesCallback): Unit = js.native
  
  /**
    * Gets the Popup Edit Form.
    */
  def GetPopupEditForm(): ASPxClientPopupControl = js.native
  
  /**
    * Returns a value specifying the indices of the rows visible in the browser's view port. An array of integer values that are the indices of the rows visible in the browser's view port.
    * @param includePartiallyVisible true, to include partially visible rows, otherwise, false.
    */
  def GetRowIndicesVisibleInViewPort(includePartiallyVisible: Boolean): js.Array[Double] = js.native
  
  /**
    * Returns the key value of the specified data row. A string representing the specified data row's key value. If the index passed via the visibleIndex parameter is wrong, or the ASPxGridBase.KeyFieldName property is not set, null is returned.
    * @param visibleIndex An integer value that specifies the row's visible index.
    */
  def GetRowKey(visibleIndex: Double): String = js.native
  
  /**
    * Returns the values of the specified data source fields within the specified row.
    * @param visibleIndex An integer value that identifies the data row's index.
    * @param fieldNames The names of data source fields separated by a semicolon, whose values within the specified row are returned.
    * @param onCallback An ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetRowValues(visibleIndex: Double, fieldNames: String, onCallback: ASPxClientGridViewValuesCallback): Unit = js.native
  
  /**
    * Returns the row values displayed within all selected rows.
    * @param fieldNames The names of data source fields separated via a semicolon, whose values within the selected rows are returned.
    * @param onCallback A ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetSelectedFieldValues(fieldNames: String, onCallback: ASPxClientGridViewValuesCallback): Unit = js.native
  
  /**
    * Returns key values of selected rows displayed within the current page.
    */
  def GetSelectedKeysOnPage(): js.Array[_] = js.native
  
  /**
    * Returns the number of selected rows.
    */
  def GetSelectedRowCount(): Double = js.native
  
  /**
    * Returns the index of the first data row displayed within the GridView's active page.
    */
  def GetTopVisibleIndex(): Double = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxGridView.CustomDataCallback event.
    * @param args Information that you need to send to the ASPxGridView.CustomDataCallback server-side event.
    * @param onCallback A JavaScript function that receives the information on the client side.
    */
  def GetValuesOnCustomCallback(args: String, onCallback: ASPxClientGridViewValuesCallback): Unit = js.native
  
  /** @deprecated Use the GetVerticalScrollPosition method instead. */
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVertScrollPos(): Double = js.native
  
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVerticalScrollPosition(): Double = js.native
  
  /**
    * Returns the number of rows actually displayed within the active page.
    */
  def GetVisibleRowsOnPage(): Double = js.native
  
  /**
    * Selects the specified page.
    * @param pageIndex An integer value that specifies the active page's index.
    */
  def GotoPage(pageIndex: Double): Unit = js.native
  
  def GroupBy(column: String): Unit = js.native
  def GroupBy(column: String, groupIndex: js.UndefOr[scala.Nothing], sortOrder: String): Unit = js.native
  def GroupBy(column: String, groupIndex: Double): Unit = js.native
  def GroupBy(column: String, groupIndex: Double, sortOrder: String): Unit = js.native
  def GroupBy(column: Double): Unit = js.native
  def GroupBy(column: Double, groupIndex: js.UndefOr[scala.Nothing], sortOrder: String): Unit = js.native
  def GroupBy(column: Double, groupIndex: Double): Unit = js.native
  def GroupBy(column: Double, groupIndex: Double, sortOrder: String): Unit = js.native
  /**
    * Groups data by the values of the specified data column with the specified sort order. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param groupIndex An integer value that specifies the grouping level. &#0045;1 to cancel grouping by the column's values.
    * @param sortOrder A string value that specifies the column's sort order.
    */
  def GroupBy(column: ASPxClientGridViewColumn): Unit = js.native
  def GroupBy(column: ASPxClientGridViewColumn, groupIndex: js.UndefOr[scala.Nothing], sortOrder: String): Unit = js.native
  def GroupBy(column: ASPxClientGridViewColumn, groupIndex: Double): Unit = js.native
  def GroupBy(column: ASPxClientGridViewColumn, groupIndex: Double, sortOrder: String): Unit = js.native
  
  /**
    * Closes the Customization Window.
    */
  def HideCustomizationWindow(): Unit = js.native
  
  /**
    * Indicates whether the Customization Window is displayed.
    */
  def IsCustomizationWindowVisible(): Boolean = js.native
  
  /**
    * Indicates whether the specified row is a data row. true if the specified row is a data row; otherwise, false.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsDataRow(visibleIndex: Double): Boolean = js.native
  
  /**
    * Indicates whether the grid is in edit mode.
    */
  def IsEditing(): Boolean = js.native
  
  /**
    * Indicates whether the specified row is a group row. true if the specified row is a group row; otherwise, false.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsGroupRow(visibleIndex: Double): Boolean = js.native
  
  /**
    * Indicates whether the specified group row is expanded. true if the specified group row is expanded; otherwise, false.
    * @param visibleIndex An integer value that identifies the group row by its visible index.
    */
  def IsGroupRowExpanded(visibleIndex: Double): Boolean = js.native
  
  /**
    * Indicates whether or not a new row is being edited.
    */
  def IsNewRowEditing(): Boolean = js.native
  
  /**
    * Indicates whether or not the specified row is selected within the current page. true if the specified row is selected within the current page; otherwise, false.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsRowSelectedOnPage(visibleIndex: Double): Boolean = js.native
  
  /**
    * Scrolls the view to the specified row.
    * @param visibleIndex An integer value that identifies a row by its visible index.
    */
  def MakeRowVisible(visibleIndex: Double): Unit = js.native
  
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups or ungroups the grid's data by this column.
    * @param column An ASPxClientGridViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the grid's data by the column; otherwise, false.
    * @param moveFromGroup true to ungroup the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    column: ASPxClientGridViewColumn | Double | String,
    moveToColumnVisibleIndex: js.UndefOr[Double],
    moveBefore: js.UndefOr[Boolean | ASPxClientGridColumnMovingTargetPosition],
    moveToGroup: js.UndefOr[Boolean],
    moveFromGroup: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /**
    * Activates the next page.
    */
  def NextPage(): Unit = js.native
  
  /**
    * Sends a callback to the server and generates the server-side event, passing the specified argument to it.
    * @param args A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: String): Unit = js.native
  def PerformCallback(args: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Activates the previous page.
    */
  def PrevPage(): Unit = js.native
  
  /**
    * Updates data displayed within the grid.
    */
  def Refresh(): Unit = js.native
  
  /**
    * Fires on the client when a data row is clicked.
    */
  var RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires before a group row is collapsed.
    */
  var RowCollapsing: ASPxClientEvent[ASPxClientGridViewRowCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires on the client when a data row is double clicked.
    */
  var RowDblClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires before a group row is expanded.
    */
  var RowExpanding: ASPxClientEvent[ASPxClientGridViewRowCancelEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Fires before a row has been focused.
    */
  var RowFocusing: ASPxClientEvent[ASPxClientGridViewRowFocusingEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Allows you to select or deselect all rows displayed on the current page based on the parameter passed.
    * @param selected true to select all unselected rows displayed on the current page; false to deselect all selected rows on the page.
    */
  def SelectAllRowsOnPage(): Unit = js.native
  def SelectAllRowsOnPage(selected: Boolean): Unit = js.native
  
  /**
    * Selects or deselects the specified row displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the row's visible index.
    * @param selected true to select the specified row; false to deselect the row.
    */
  def SelectRowOnPage(visibleIndex: Double): Unit = js.native
  def SelectRowOnPage(visibleIndex: Double, selected: Boolean): Unit = js.native
  
  /**
    * Selects or deselects the specified rows within the grid.
    * @param visibleIndices An array of zero-based indices that identify data rows within the grid.
    * @param selected true to select the specified rows; false to deselect the rows.
    */
  def SelectRows(): Unit = js.native
  def SelectRows(visibleIndices: js.UndefOr[scala.Nothing], selected: Boolean): Unit = js.native
  def SelectRows(visibleIndices: js.Array[Double]): Unit = js.native
  def SelectRows(visibleIndices: js.Array[Double], selected: Boolean): Unit = js.native
  def SelectRows(visibleIndices: Double): Unit = js.native
  def SelectRows(visibleIndices: Double, selected: Boolean): Unit = js.native
  
  def SelectRowsByKey(keys: js.Any): Unit = js.native
  def SelectRowsByKey(keys: js.Any, selected: Boolean): Unit = js.native
  /**
    * Selects or deselects the specified row in the grid.
    * @param selected true to select the specified row; false to deselect the row.
    */
  def SelectRowsByKey(keys: js.Array[_]): Unit = js.native
  def SelectRowsByKey(keys: js.Array[_], selected: Boolean): Unit = js.native
  
  /**
    * Fires when a user selects a row.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientGridViewSelectionEventHandler[ASPxClientGridView]] = js.native
  
  /**
    * Specifies the grid column's layout.
    * @param columnLayout An object specifying the grid column's layout.
    */
  def SetColumnLayout(columnLayout: js.Any): Unit = js.native
  
  def SetEditValue(column: String, value: String): Unit = js.native
  def SetEditValue(column: Double, value: String): Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(column: ASPxClientGridViewColumn, value: String): Unit = js.native
  
  /**
    * Enables or disables the current filter.
    * @param isFilterEnabled true to enable the current filter; otherwise, false.
    */
  def SetFilterEnabled(isFilterEnabled: Boolean): Unit = js.native
  
  /**
    * Sets the scrollability of various types of grid rows when the grid displays fixed columns.
    * @param scrollableRowSettings An object specifying which types of grid rows should or should not be scrollable.
    */
  def SetFixedColumnScrollableRows(scrollableRowSettings: js.Any): Unit = js.native
  
  /**
    * Focuses the specified cell.
    * @param rowVisibleIndex An integer value that specifies the visible index of the row.
    * @param columnIndex Focuses the specified cell.
    */
  def SetFocusedCell(rowVisibleIndex: Double, columnIndex: Double): Unit = js.native
  
  /**
    * Focuses the specified cell.
    * @param key A String value that identifies the row by its key value.
    * @param columnIndex A zero-based index that identifies the column in the column collection (the column's CollectionItem.Index property value).
    */
  def SetFocusedCellByKey(key: js.Any, columnIndex: Double): Unit = js.native
  
  /**
    * Moves focus to the specified row.
    * @param visibleIndex An integer value that specifies the focused row's index.
    */
  def SetFocusedRowIndex(visibleIndex: Double): Unit = js.native
  
  /**
    * Specifies the horizontal scroll position for the grid's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorizontalScrollPosition(position: Double): Unit = js.native
  
  /** @deprecated Use the SetHorizontalScrollPosition method instead. */
  /**
    * Specifies the horizontal scroll position for the grid's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorzScrollPos(position: Double): Unit = js.native
  
  /**
    * Specifies a custom editor for the search panel on the client side.
    * @param editor An ASPxClientEdit object representing a custom editor.
    */
  def SetSearchPanelCustomEditor(editor: ASPxClientEdit): Unit = js.native
  
  /** @deprecated Use the SetVerticalScrollPosition method instead. */
  /**
    * Specifies the vertical scroll position for the grid's content.
    * @param position An integer value specifying the vertical scroll position.
    */
  def SetVertScrollPos(position: Double): Unit = js.native
  
  /**
    * Specifies the vertical scroll position for the grid's content.
    * @param position An integer value that specifies the vertical scroll position.
    */
  def SetVerticalScrollPosition(position: Double): Unit = js.native
  
  /**
    * Invokes the Customization Dialog and displays it over the grid.
    */
  def ShowCustomizationDialog(): Unit = js.native
  
  /**
    * Invokes the Customization Window and displays it over the specified HTML element.
    * @param showAtElement An object that specifies the HTML element relative to whose position the customization window is invoked.
    */
  def ShowCustomizationWindow(): Unit = js.native
  def ShowCustomizationWindow(showAtElement: js.Any): Unit = js.native
  
  /**
    * Displays the Filter Control.
    */
  def ShowFilterControl(): Unit = js.native
  
  def SortBy(column: String): Unit = js.native
  def SortBy(
    column: String,
    sortOrder: js.UndefOr[scala.Nothing],
    reset: js.UndefOr[scala.Nothing],
    sortIndex: Double
  ): Unit = js.native
  def SortBy(column: String, sortOrder: js.UndefOr[scala.Nothing], reset: Boolean): Unit = js.native
  def SortBy(column: String, sortOrder: js.UndefOr[scala.Nothing], reset: Boolean, sortIndex: Double): Unit = js.native
  def SortBy(column: String, sortOrder: String): Unit = js.native
  def SortBy(column: String, sortOrder: String, reset: js.UndefOr[scala.Nothing], sortIndex: Double): Unit = js.native
  def SortBy(column: String, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(column: String, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  def SortBy(column: Double): Unit = js.native
  def SortBy(
    column: Double,
    sortOrder: js.UndefOr[scala.Nothing],
    reset: js.UndefOr[scala.Nothing],
    sortIndex: Double
  ): Unit = js.native
  def SortBy(column: Double, sortOrder: js.UndefOr[scala.Nothing], reset: Boolean): Unit = js.native
  def SortBy(column: Double, sortOrder: js.UndefOr[scala.Nothing], reset: Boolean, sortIndex: Double): Unit = js.native
  def SortBy(column: Double, sortOrder: String): Unit = js.native
  def SortBy(column: Double, sortOrder: String, reset: js.UndefOr[scala.Nothing], sortIndex: Double): Unit = js.native
  def SortBy(column: Double, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(column: Double, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param column An ASPxClientGridViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based column's index among the sorted columns. &#0045;1 if data is not sorted by this column.
    */
  def SortBy(column: ASPxClientGridViewColumn): Unit = js.native
  def SortBy(
    column: ASPxClientGridViewColumn,
    sortOrder: js.UndefOr[scala.Nothing],
    reset: js.UndefOr[scala.Nothing],
    sortIndex: Double
  ): Unit = js.native
  def SortBy(column: ASPxClientGridViewColumn, sortOrder: js.UndefOr[scala.Nothing], reset: Boolean): Unit = js.native
  def SortBy(
    column: ASPxClientGridViewColumn,
    sortOrder: js.UndefOr[scala.Nothing],
    reset: Boolean,
    sortIndex: Double
  ): Unit = js.native
  def SortBy(column: ASPxClientGridViewColumn, sortOrder: String): Unit = js.native
  def SortBy(
    column: ASPxClientGridViewColumn,
    sortOrder: String,
    reset: js.UndefOr[scala.Nothing],
    sortIndex: Double
  ): Unit = js.native
  def SortBy(column: ASPxClientGridViewColumn, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(column: ASPxClientGridViewColumn, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  
  /**
    * Switches the grid to edit mode.
    * @param visibleIndex A zero-based integer that identifies a data row to be edited.
    */
  def StartEditRow(visibleIndex: Double): Unit = js.native
  
  /**
    * Switches the grid to edit mode.
    * @param key An object that uniquely identifies a data row to be edited.
    */
  def StartEditRowByKey(key: js.Any): Unit = js.native
  
  def UnGroup(column: String): Unit = js.native
  def UnGroup(column: Double): Unit = js.native
  /** @deprecated Use the Ungroup method instead. */
  /**
    * Ungroups data by the values of the specified column.
    */
  def UnGroup(column: ASPxClientGridViewColumn): Unit = js.native
  
  def Ungroup(column: String): Unit = js.native
  def Ungroup(column: Double): Unit = js.native
  /**
    * Ungroups data by the values of a specified column.
    * @param column A ASPxClientGridViewColumn object that is the grid column.
    */
  def Ungroup(column: ASPxClientGridViewColumn): Unit = js.native
  
  /**
    * Deselects all selected rows displayed on the current page.
    */
  def UnselectAllRowsOnPage(): Unit = js.native
  
  /**
    * Deselects all grid rows that match the filter criteria currently applied to the grid.
    */
  def UnselectFilteredRows(): Unit = js.native
  
  /**
    * Deselects the specified row (if selected) displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the row's visible index.
    */
  def UnselectRowOnPage(visibleIndex: Double): Unit = js.native
  
  /**
    * Deselects the specified row (if selected) within the grid.
    * @param visibleIndices Visible indices of rows to unselect.
    */
  def UnselectRows(): Unit = js.native
  def UnselectRows(visibleIndices: js.Array[Double]): Unit = js.native
  def UnselectRows(visibleIndices: Double): Unit = js.native
  
  def UnselectRowsByKey(keys: js.Any): Unit = js.native
  /**
    * Deselects the specified row displayed within the grid.
    */
  def UnselectRowsByKey(keys: js.Array[_]): Unit = js.native
  
  /**
    * Saves all the changes made and switches the grid to browse mode.
    */
  def UpdateEdit(): Unit = js.native
  
  /**
    * Provides access to the batch editing client API.
    */
  var batchEditApi: ASPxClientGridViewBatchEditApi = js.native
}
