package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxGridView object.
  */
@js.native
trait ASPxClientGridView extends ASPxClientGridBase {
  /**
    * Occurs on the client side before data changes are canceled in batch edit mode.
    */
  var BatchEditChangesCanceling: ASPxClientEvent[ASPxClientGridViewBatchEditChangesCancelingEventHandler[ASPxClientGridView]] = js.native
  var BatchEditChangesPreviewShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientGridView]] = js.native
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
    * Occurs on the client side before a row is deleted in batch edit mode.
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
    * Occurs when a custom command button has been clicked.
    */
  var CustomButtonClick: ASPxClientEvent[ASPxClientGridViewCustomButtonEventHandler[ASPxClientGridView]] = js.native
  /**
    * Fires after the Customization Window has been closed.
    */
  var CustomizationWindowCloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGridView]] = js.native
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
    * Occurs on the client side when the focused cell is about to be changed.
    */
  var FocusedCellChanging: ASPxClientEvent[ASPxClientGridViewFocusedCellChangingEventHandler[ASPxClientGridView]] = js.native
  /**
    * Fires in response to changing row focus.
    */
  var FocusedRowChanged: ASPxClientEvent[ASPxClientGridViewFocusEventHandler[ASPxClientGridView]] = js.native
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
    * Fires after the selection has been changed.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientGridViewSelectionEventHandler[ASPxClientGridView]] = js.native
  /**
    * Provides access to the batch editing client API.
    * Value: A <see cref="ASPxClientGridViewBatchEditApi" /> object that exposes the batch editing client API methods.
    */
  var batchEditApi: ASPxClientGridViewBatchEditApi = js.native
  /**
    * Adds a new record.
    */
  def AddNewRow(): scala.Unit = js.native
  /**
    * Applies the specified filter expression to the GridView.
    * @param filterExpression A string value that specifies the filter expression.
    */
  def ApplyFilter(filterExpression: java.lang.String): scala.Unit = js.native
  /**
    * Applies a filter specified in the filter row to the GridView.
    */
  def ApplyOnClickRowFilter(): scala.Unit = js.native
  /**
    * Applies the specified search panel filter criterion to grid data.
    * @param value A string value that specifies the filter criterion.
    */
  def ApplySearchPanelFilter(value: java.lang.String): scala.Unit = js.native
  /**
    * Applies a filter to the specified data column.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param val A string value that specifies the filter expression.
    */
  def AutoFilterByColumn(columnFieldNameOrId: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  /**
    * Applies a filter to the specified data column.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param val A string value that specifies the filter expression.
    */
  def AutoFilterByColumn(columnIndex: scala.Double, `val`: java.lang.String): scala.Unit = js.native
  /**
    * Applies a filter to the specified data column.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the client GridView.
    * @param val A string value that specifies the filter expression.
    */
  def AutoFilterByColumn(column: ASPxClientGridViewColumn, `val`: java.lang.String): scala.Unit = js.native
  /**
    * Cancels all the changes made and switches the GridView to browse mode.
    */
  def CancelEdit(): scala.Unit = js.native
  /**
    * Clears the filter expression applied to a client GridView.
    */
  def ClearFilter(): scala.Unit = js.native
  /**
    * Hides the Filter Control.
    */
  def CloseFilterControl(): scala.Unit = js.native
  /**
    * Collapses all group rows.
    */
  def CollapseAll(): scala.Unit = js.native
  /**
    * Collapses all detail rows.
    */
  def CollapseAllDetailRows(): scala.Unit = js.native
  /**
    * Collapses the specified detail row.
    * @param visibleIndex A zero-based integer index that identifies the detail row.
    */
  def CollapseDetailRow(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Collapses the specified group row preserving the expanded state of child group rows.
    * @param visibleIndex An integer value that identifies the group row by its visible index.
    */
  def CollapseRow(visibleIndex: scala.Double): scala.Unit = js.native
  def CollapseRow(visibleIndex: scala.Double, recursive: scala.Boolean): scala.Unit = js.native
  /**
    * Deletes the specified row.
    * @param visibleIndex An integer value that identifies the row.
    */
  def DeleteRow(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deletes a row with the specified key value.
    * @param key An object that uniquely identifies the row.
    */
  def DeleteRowByKey(key: js.Object): scala.Unit = js.native
  /**
    * Expands all group rows.
    */
  def ExpandAll(): scala.Unit = js.native
  /**
    * Expands all detail rows.
    */
  def ExpandAllDetailRows(): scala.Unit = js.native
  /**
    * Expands the specified detail row.
    * @param visibleIndex A zero-based integer index that identifies the detail row.
    */
  def ExpandDetailRow(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Expands the specified group row preserving the collapsed state of any child group row.
    * @param visibleIndex An integer value that identifies the group row.
    */
  def ExpandRow(visibleIndex: scala.Double): scala.Unit = js.native
  def ExpandRow(visibleIndex: scala.Double, recursive: scala.Boolean): scala.Unit = js.native
  /**
    * Exports a grid data to a file in the specified format.
    * @param format An ASPxClientGridViewExportFormat object specifying the export format.
    */
  def ExportTo(format: ASPxClientGridViewExportFormat): scala.Unit = js.native
  /**
    * Sets input focus to the grid.
    */
  def Focus(): scala.Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited row.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def FocusEditor(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited row.
    * @param columnIndex An integer value that specifies the column's position within the columns collection.
    */
  def FocusEditor(columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited row.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the client grid.
    */
  def FocusEditor(column: ASPxClientGridViewColumn): scala.Unit = js.native
  /**
    * Returns the editor used to edit the value in the auto filter row for the specified data column.
    * @param columnFieldNameOrId A string value that specifies the column's name or its data base field name.
    */
  def GetAutoFilterEditor(columnFieldNameOrId: java.lang.String): js.Object = js.native
  /**
    * Returns the editor used to edit the value in the auto filter row for the specified data column.
    * @param columnIndex An integer value that identifies the data column by its index.
    */
  def GetAutoFilterEditor(columnIndex: scala.Double): js.Object = js.native
  /**
    * Returns the editor used to edit the value in the auto filter row for the specified data column.
    * @param column An ASPxClientGridViewColumn object that represents the data colum within the ASPxGridView.
    */
  def GetAutoFilterEditor(column: ASPxClientGridViewColumn): js.Object = js.native
  /**
    * Returns the client column that resides at the specified position within the column collection.
    * @param columnIndex A zero-based index that identifies the column within the column collection (the column's Index property value).
    */
  def GetColumn(columnIndex: scala.Double): ASPxClientGridViewColumn = js.native
  /**
    * Returns the client column which is bound to the specified data source field.
    * @param columnFieldName A string value that specifies the name of the data source field to which the column is bound (the column's FieldName property value).
    */
  def GetColumnByField(columnFieldName: java.lang.String): ASPxClientGridViewColumn = js.native
  /**
    * Returns the column with the specified unique identifier.
    * @param columnId A string value that specifies the column's unique identifier (the column's Name property value).
    */
  def GetColumnById(columnId: java.lang.String): ASPxClientGridViewColumn = js.native
  /**
    * Returns the number of columns within the client GridView.
    */
  def GetColumnCount(): scala.Double = js.native
  /**
    * Returns an object specifying the grid column's layout.
    */
  def GetColumnLayout(): js.Object = js.native
  /**
    * Returns the number of columns within the client GridView.
    */
  def GetColumnsCount(): scala.Double = js.native
  /**
    * Returns the value of the specified edit cell.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def GetEditValue(columnFieldNameOrId: java.lang.String): java.lang.String = js.native
  /**
    * Returns the value of the specified edit cell.
    * @param columnIndex An integer value that identifies the data column within the grid's column collection.
    */
  def GetEditValue(columnIndex: scala.Double): java.lang.String = js.native
  /**
    * Returns the value of the specified edit cell.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the client grid.
    */
  def GetEditValue(column: ASPxClientGridViewColumn): java.lang.String = js.native
  /**
    * Returns the editor used to edit the specified column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def GetEditor(columnFieldNameOrId: java.lang.String): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    */
  def GetEditor(columnIndex: scala.Double): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified column's values.
    * @param column An ASPxClientGridViewColumn object that specifies the required column within the client grid.
    */
  def GetEditor(column: ASPxClientGridViewColumn): ASPxClientEdit = js.native
  /**
    * Gets information about a focused cell.
    */
  def GetFocusedCell(): ASPxClientGridViewCellInfo = js.native
  /**
    * Returns the focused row's index.
    */
  def GetFocusedRowIndex(): scala.Double = js.native
  /**
    * Returns the current horizontal scroll position of the grid's content.
    */
  def GetHorizontalScrollPosition(): scala.Double = js.native
  /**
    * Returns the current horizontal scroll position of the grid's content.
    */
  def GetHorzScrollPos(): scala.Double = js.native
  /**
    * Gets the number of pages to which the grid's data is divided.
    */
  def GetPageCount(): scala.Double = js.native
  /**
    * Gets the index of the page currently being selected.
    */
  def GetPageIndex(): scala.Double = js.native
  /**
    * Returns the row values displayed within the current page.
    * @param fieldNames The names of data source fields whose values are returned.
    * @param onCallback A ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetPageRowValues(fieldNames: java.lang.String, onCallback: ASPxClientGridViewValuesCallback): scala.Unit = js.native
  /**
    * Gets the Popup Edit Form.
    */
  def GetPopupEditForm(): ASPxClientPopupControl = js.native
  /**
    * Returns a value specifying the indices of the rows visible in the browser's view port.
    * @param includePartiallyVisible true, to include partially visible rows, otherwise, false.
    */
  def GetRowIndicesVisibleInViewPort(includePartiallyVisible: scala.Boolean): js.Array[scala.Double] = js.native
  /**
    * Returns the key value of the specified data row.
    * @param visibleIndex An integer value that specifies the row's visible index.
    */
  def GetRowKey(visibleIndex: scala.Double): java.lang.String = js.native
  /**
    * Returns the values of the specified data source fields within the specified row.
    * @param visibleIndex An integer value that identifies the data row.
    * @param fieldNames The names of data source fields separated via a semicolon, whose values within the specified row are returned.
    * @param onCallback An ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetRowValues(
    visibleIndex: scala.Double,
    fieldNames: java.lang.String,
    onCallback: ASPxClientGridViewValuesCallback
  ): scala.Unit = js.native
  /**
    * Returns the row values displayed within all selected rows.
    * @param fieldNames The names of data source fields separated via a semicolon, whose values within the selected rows are returned.
    * @param onCallback A ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the list of row values as a parameter.
    */
  def GetSelectedFieldValues(fieldNames: java.lang.String, onCallback: ASPxClientGridViewValuesCallback): scala.Unit = js.native
  /**
    * Returns key values of selected rows displayed within the current page.
    */
  def GetSelectedKeysOnPage(): js.Array[js.Object] = js.native
  /**
    * Returns the number of selected rows.
    */
  def GetSelectedRowCount(): scala.Double = js.native
  /**
    * Returns the index of the first data row displayed within the GridView's active page.
    */
  def GetTopVisibleIndex(): scala.Double = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomDataCallback event.
    * @param args A string value that is any information that needs to be sent to the server-side CustomDataCallback event.
    * @param onCallback A ASPxClientGridViewValuesCallback object that is the JavaScript function which receives the information on the client side.
    */
  def GetValuesOnCustomCallback(args: java.lang.String, onCallback: ASPxClientGridViewValuesCallback): scala.Unit = js.native
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVertScrollPos(): scala.Double = js.native
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVerticalScrollPosition(): scala.Double = js.native
  /**
    * Returns the number of rows actually displayed within the active page.
    */
  def GetVisibleRowsOnPage(): scala.Double = js.native
  /**
    * Selects the specified page.
    * @param pageIndex An integer value that specifies the active page's index.
    */
  def GotoPage(pageIndex: scala.Double): scala.Unit = js.native
  /**
    * Groups data by the values of the specified column.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def GroupBy(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Groups data by the values of the specified data column. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param groupIndex An integer value that specifies the grouping level. -1 to cancel grouping by the column's values.
    */
  def GroupBy(columnFieldNameOrId: java.lang.String, groupIndex: scala.Double): scala.Unit = js.native
  /**
    * Groups data by the values of the specified data column with the specified sort order. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param groupIndex An integer value that specifies the grouping level. -1 to cancel grouping by the column's values.
    * @param sortOrder A string value that specifies the column's sort order.
    */
  def GroupBy(columnFieldNameOrId: java.lang.String, groupIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Groups data by the values of the specified column.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    */
  def GroupBy(columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Groups data by the values of the specified data column. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param groupIndex An integer value that specifies the grouping level. -1 to cancel grouping by the column's values.
    */
  def GroupBy(columnIndex: scala.Double, groupIndex: scala.Double): scala.Unit = js.native
  /**
    * Groups data by the values of the specified data column with the specified sort order. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param groupIndex An integer value that specifies the grouping level. -1 to cancel grouping by the column's values.
    * @param sortOrder A string value that specifies the column's sort order.
    */
  def GroupBy(columnIndex: scala.Double, groupIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Groups data by the values of the specified column.
    * @param column An ASPxClientGridViewColumn object that represents the data column by whose values data is grouped.
    */
  def GroupBy(column: ASPxClientGridViewColumn): scala.Unit = js.native
  /**
    * Groups data by the values of the specified data column. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param column An ASPxClientGridViewColumn object that represents the data column by whose values data is grouped.
    * @param groupIndex An integer value that specifies the grouping level. -1 to cancel grouping by the column's values.
    */
  def GroupBy(column: ASPxClientGridViewColumn, groupIndex: scala.Double): scala.Unit = js.native
  /**
    * Groups data by the values of the specified data column with the specified sort order. If several columns are involved in grouping, the specified column will reside at the specified grouping level.
    * @param column An ASPxClientGridViewColumn object that represents the data column by whose values data is grouped.
    * @param groupIndex An integer value that specifies the grouping level. -1 to cancel grouping by the column's values.
    * @param sortOrder A string value that specifies the column's sort order.
    */
  def GroupBy(column: ASPxClientGridViewColumn, groupIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Closes the Customization Window.
    */
  def HideCustomizationWindow(): scala.Unit = js.native
  /**
    * Indicates whether the Customization Window is displayed.
    */
  def IsCustomizationWindowVisible(): scala.Boolean = js.native
  /**
    * Indicates whether the specified row is a data row.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsDataRow(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether the grid is in edit mode.
    */
  def IsEditing(): scala.Boolean = js.native
  /**
    * Indicates whether the specified row is a group row.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsGroupRow(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether the specified group row is expanded.
    * @param visibleIndex An integer value that identifies the group row by its visible index.
    */
  def IsGroupRowExpanded(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether or not a new row is being edited.
    */
  def IsNewRowEditing(): scala.Boolean = js.native
  /**
    * Indicates whether or not the specified row is selected within the current page.
    * @param visibleIndex An integer value that identifies the row by its visible index.
    */
  def IsRowSelectedOnPage(visibleIndex: scala.Double): scala.Boolean = js.native
  /**
    * Scrolls the view to the specified row.
    * @param visibleIndex An integer value that identifies a row by its visible index.
    */
  def MakeRowVisible(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Hides the specified column.
    * @param columnFieldNameOrId A String value that identifies the column to be hidden by the name of the data source field to which the column is bound, or by the column's name.
    */
  def MoveColumn(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param columnFieldNameOrId A String value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the grid.
    */
  def MoveColumn(columnFieldNameOrId: java.lang.String, moveToColumnVisibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param columnFieldNameOrId A string value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    */
  def MoveColumn(
    columnFieldNameOrId: java.lang.String,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups the grid's data by this column.
    * @param columnFieldNameOrId A string value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    columnFieldNameOrId: java.lang.String,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean,
    moveToGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups or ungroups the grid's data by this column.
    * @param columnFieldNameOrId A string value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the grid's data by the column; otherwise, false.
    * @param moveFromGroup true to ungroup the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    columnFieldNameOrId: java.lang.String,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean,
    moveToGroup: scala.Boolean,
    moveFromGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param columnFieldNameOrId A String value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the grid.
    * @param targetPosition An ASPxClientGridColumnMovingTargetPosition enumeration value specifying the position relative to the target column in which to place the moved column.
    */
  def MoveColumn(
    columnFieldNameOrId: java.lang.String,
    moveToColumnVisibleIndex: scala.Double,
    targetPosition: ASPxClientGridColumnMovingTargetPosition
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups or ungroups the grid's data by this column.
    * @param columnFieldNameOrId A string value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param targetPosition An ASPxClientGridColumnMovingTargetPosition enumeration value specifying the position relative to the target column in which to place the moved column.
    * @param moveToGroup true, to group the grid's data by the column; otherwise, false.
    * @param moveFromGroup true, to ungroup the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    columnFieldNameOrId: java.lang.String,
    moveToColumnVisibleIndex: scala.Double,
    targetPosition: ASPxClientGridColumnMovingTargetPosition,
    moveToGroup: scala.Boolean,
    moveFromGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Hides the specified column.
    * @param columnIndex An integer value that specifies the absolute index of the column to hide.
    */
  def MoveColumn(columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the grid.
    */
  def MoveColumn(columnIndex: scala.Double, moveToColumnVisibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    */
  def MoveColumn(columnIndex: scala.Double, moveToColumnVisibleIndex: scala.Double, moveBefore: scala.Boolean): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups the grid's data by this column.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the ASPxGridView's data by the column; otherwise, false.
    */
  def MoveColumn(
    columnIndex: scala.Double,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean,
    moveToGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups or ungroups the grid's data by this column.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the grid's data by the column; otherwise, false.
    * @param moveFromGroup true to ungroup the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    columnIndex: scala.Double,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean,
    moveToGroup: scala.Boolean,
    moveFromGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the grid.
    * @param targetPosition An ASPxClientGridColumnMovingTargetPosition enumeration value specifying the position relative to the target column in which to place the moved column.
    */
  def MoveColumn(
    columnIndex: scala.Double,
    moveToColumnVisibleIndex: scala.Double,
    targetPosition: ASPxClientGridColumnMovingTargetPosition
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups or ungroups the grid's data by this column.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param targetPosition An ASPxClientGridColumnMovingTargetPosition enumeration value specifying the position relative to the target column in which to place the moved column.
    * @param moveToGroup true, to group the ASPxGridView's data by the column; otherwise, false.
    * @param moveFromGroup true, to ungroup the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    columnIndex: scala.Double,
    moveToColumnVisibleIndex: scala.Double,
    targetPosition: ASPxClientGridColumnMovingTargetPosition,
    moveToGroup: scala.Boolean,
    moveFromGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Hides the specified column.
    * @param column An ASPxClientGridViewColumn object that represents the column to hide.
    */
  def MoveColumn(column: ASPxClientGridViewColumn): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param column An ASPxClientGridViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the grid.
    */
  def MoveColumn(column: ASPxClientGridViewColumn, moveToColumnVisibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid.
    * @param column An ASPxClientGridViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    */
  def MoveColumn(
    column: ASPxClientGridViewColumn,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups the grid's data by this column.
    * @param column An ASPxClientGridViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    column: ASPxClientGridViewColumn,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean,
    moveToGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the grid and optionally groups or ungroups the grid's data by this column.
    * @param column An ASPxClientGridViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    * @param moveToGroup true to group the grid's data by the column; otherwise, false.
    * @param moveFromGroup true to ungroup the grid's data by the column; otherwise, false.
    */
  def MoveColumn(
    column: ASPxClientGridViewColumn,
    moveToColumnVisibleIndex: scala.Double,
    moveBefore: scala.Boolean,
    moveToGroup: scala.Boolean,
    moveFromGroup: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Activates the next page.
    */
  def NextPage(): scala.Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
    * @param args A string value that represents any information that needs to be sent to the server-side CustomCallback event.
    */
  def PerformCallback(args: java.lang.String): scala.Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side event, passing the specified argument to it.
    * @param args A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Activates the previous page.
    */
  def PrevPage(): scala.Unit = js.native
  /**
    * Updates data displayed within the grid.
    */
  def Refresh(): scala.Unit = js.native
  /**
    * Selects all unselected rows displayed on the current page.
    */
  def SelectAllRowsOnPage(): scala.Unit = js.native
  /**
    * Allows you to select or deselect all rows displayed on the current page based on the parameter passed.
    * @param selected true to select all unselected rows displayed on the current page; false to deselect all selected rows on the page.
    */
  def SelectAllRowsOnPage(selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the specified row displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the row's visible index.
    */
  def SelectRowOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  def SelectRowOnPage(visibleIndex: scala.Double, selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects all the unselected rows within the grid.
    */
  def SelectRows(): scala.Unit = js.native
  /**
    * Selects the specified row displayed within the grid.
    * @param visibleIndex A zero-based integer value that specifies the row's visible index.
    */
  def SelectRows(visibleIndex: scala.Double): scala.Unit = js.native
  def SelectRows(visibleIndex: scala.Double, selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the specified rows within the grid.
    * @param visibleIndices An array of zero-based indices that identify data rows within the grid.
    */
  def SelectRows(visibleIndices: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Selects or deselects the specified rows within the grid.
    * @param visibleIndices An array of zero-based indices that identify data rows within the grid.
    * @param selected true to select the specified rows; false to deselect the rows.
    */
  def SelectRows(visibleIndices: js.Array[scala.Double], selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects or deselects the specified row displayed within the grid.
    * @param key An object that uniquely identifies the row.
    * @param selected true to select the specified row; false to deselect the row.
    */
  def SelectRowsByKey(key: js.Object): scala.Unit = js.native
  def SelectRowsByKey(key: js.Object, selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects or deselects the specified rows displayed within the grid.
    * @param keys An array of objects that uniquely identify the rows.
    * @param selected true to select the specified rows; false to deselect the rows.
    */
  def SelectRowsByKey(keys: js.Array[js.Object]): scala.Unit = js.native
  def SelectRowsByKey(keys: js.Array[js.Object], selected: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies the grid column's layout.
    * @param columnLayout An object specifying the grid column's layout.
    */
  def SetColumnLayout(columnLayout: js.Object): scala.Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(columnFieldNameOrId: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param columnIndex An integer value that identifies the data column within the grid's column collection.
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(columnIndex: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the client grid.
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(column: ASPxClientGridViewColumn, value: java.lang.String): scala.Unit = js.native
  /**
    * Enables or disables the current filter.
    * @param isFilterEnabled true to enable the current filter; otherwise, false.
    */
  def SetFilterEnabled(isFilterEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the scrollability of various types of grid rows when the grid displays fixed columns.
    * @param scrollableRowSettings An object specifying which types of grid rows should or should not be scrollable.
    */
  def SetFixedColumnScrollableRows(scrollableRowSettings: js.Object): scala.Unit = js.native
  /**
    * Focuses the specified cell.
    * @param rowVisibleIndex An integer value that specifies the visible index of the row.
    * @param columnIndex A zero-based index that identifies the column in the column collection (the column's Index property value).
    */
  def SetFocusedCell(rowVisibleIndex: scala.Double, columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Moves focus to the specified row.
    * @param visibleIndex An integer value that specifies the focused row's index.
    */
  def SetFocusedRowIndex(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Specifies the horizontal scroll position for the grid's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorizontalScrollPosition(position: scala.Double): scala.Unit = js.native
  /**
    * Specifies the horizontal scroll position for the grid's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorzScrollPos(position: scala.Double): scala.Unit = js.native
  /**
    * Specifies a custom editor for the search panel on the client side.
    * @param editor An ASPxClientEdit object representing a custom editor.
    */
  def SetSearchPanelCustomEditor(editor: ASPxClientEdit): scala.Unit = js.native
  /**
    * Specifies the vertical scroll position for the grid's content.
    * @param position An integer value specifying the vertical scroll position.
    */
  def SetVertScrollPos(position: scala.Double): scala.Unit = js.native
  /**
    * Specifies the vertical scroll position for the grid's content.
    * @param position An integer value specifying the vertical scroll position.
    */
  def SetVerticalScrollPosition(position: scala.Double): scala.Unit = js.native
  /**
    * Invokes the Customization Dialog and displays it over the grid.
    */
  def ShowCustomizationDialog(): scala.Unit = js.native
  /**
    * Invokes the Customization Window.
    */
  def ShowCustomizationWindow(): scala.Unit = js.native
  def ShowCustomizationWindow(showAtElement: js.Object): scala.Unit = js.native
  /**
    * Displays the Filter Control.
    */
  def ShowFilterControl(): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def SortBy(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(columnFieldNameOrId: java.lang.String, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(columnFieldNameOrId: java.lang.String, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based column's index among the sorted columns. -1 if data is not sorted by this column.
    */
  def SortBy(
    columnFieldNameOrId: java.lang.String,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    */
  def SortBy(columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(columnIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(columnIndex: scala.Double, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based column's index among the sorted columns. -1 if data is not sorted by this column.
    */
  def SortBy(
    columnIndex: scala.Double,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param column An ASPxClientGridViewColumn object that represents the data column.
    */
  def SortBy(column: ASPxClientGridViewColumn): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param column An ASPxClientGridViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(column: ASPxClientGridViewColumn, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param column An ASPxClientGridViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(column: ASPxClientGridViewColumn, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param column An ASPxClientGridViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based column's index among the sorted columns. -1 if data is not sorted by this column.
    */
  def SortBy(
    column: ASPxClientGridViewColumn,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  /**
    * Switches the grid to edit mode.
    * @param visibleIndex A zero-based integer that identifies a data row to be edited.
    */
  def StartEditRow(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Switches the grid to edit mode.
    * @param key An object that uniquely identifies a data row to be edited.
    */
  def StartEditRowByKey(key: js.Object): scala.Unit = js.native
  /**
    * Ungroups data by the values of the specified column.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def UnGroup(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Ungroups data by the values of the specified column.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    */
  def UnGroup(columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Ungroups data by the values of the specified column.
    * @param column An ASPxClientGridViewColumn object that represents the data column within the ASPxGridView.
    */
  def UnGroup(column: ASPxClientGridViewColumn): scala.Unit = js.native
  /**
    * Ungroups data by the values of a specified column.
    * @param columnFieldNameOrId A string value that is the column's FieldName or ID.
    */
  def Ungroup(columnFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Ungroups data by the values of a specified column.
    * @param columnIndex An integer value that is the column index.
    */
  def Ungroup(columnIndex: scala.Double): scala.Unit = js.native
  /**
    * Ungroups data by the values of a specified column.
    * @param column A ASPxClientGridViewColumn object that is the grid column.
    */
  def Ungroup(column: ASPxClientGridViewColumn): scala.Unit = js.native
  /**
    * Deselects all selected rows displayed on the current page.
    */
  def UnselectAllRowsOnPage(): scala.Unit = js.native
  /**
    * Deselects all grid rows that match the filter criteria currently applied to the grid.
    */
  def UnselectFilteredRows(): scala.Unit = js.native
  /**
    * Deselects the specified row (if selected) displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the row's visible index.
    */
  def UnselectRowOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deselects all the selected rows within the grid.
    */
  def UnselectRows(): scala.Unit = js.native
  /**
    * Deselects the specified row (if selected) within the grid.
    * @param visibleIndex A zero-based integer value that specifies the row's visible index.
    */
  def UnselectRows(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deselects the specified rows (if selected) within the grid.
    * @param visibleIndices An array of zero-based indices that identify data rows within the grid.
    */
  def UnselectRows(visibleIndices: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Deselects the specified row displayed within the grid.
    * @param key An object that uniquely identifies the row.
    */
  def UnselectRowsByKey(key: js.Object): scala.Unit = js.native
  /**
    * Deselects the specified rows displayed within the grid.
    * @param keys An array of objects that uniquely identify the rows.
    */
  def UnselectRowsByKey(keys: js.Array[js.Object]): scala.Unit = js.native
  /**
    * Saves all the changes made and switches the grid to browse mode.
    */
  def UpdateEdit(): scala.Unit = js.native
}

