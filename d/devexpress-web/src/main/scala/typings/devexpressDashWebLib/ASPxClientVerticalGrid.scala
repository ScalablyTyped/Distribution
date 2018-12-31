package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxVerticalGrid object.
  */
@js.native
trait ASPxClientVerticalGrid extends ASPxClientGridBase {
  /**
    * Occurs on the client side before data changes are canceled in batch edit mode.
    */
  var BatchEditChangesCanceling: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditChangesCancelingEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Occurs on the client side before data changes are saved in batch edit mode.
    */
  var BatchEditChangesSaving: ASPxClientEvent[ASPxClientVerticalGridBatchEditChangesSavingEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Enables you to prevent a batch edit confirmation message from being displayed.
    */
  var BatchEditConfirmShowing: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditConfirmShowingEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Occurs when a grid leaves the batch edit mode.
    */
  var BatchEditEndEditing: ASPxClientEvent[ASPxClientVerticalGridBatchEditEndEditingEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Occurs on the client side before a record is deleted in batch edit mode.
    */
  var BatchEditRecordDeleting: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditRecordDeletingEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Occurs on the client side before a record is inserted in batch edit mode.
    */
  var BatchEditRecordInserting: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditRecordInsertingEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Occurs on the client side before a record is deleted in batch edit mode.
    */
  var BatchEditRecordRecovering: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditRecordRecoveringEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Enables you to specify whether record data is valid and provide an error text.
    */
  var BatchEditRecordValidating: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditRecordValidatingEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Occurs when a grid switches to batch edit mode.
    */
  var BatchEditStartEditing: ASPxClientEvent[ASPxClientVerticalGridBatchEditStartEditingEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Enables you to provide navigation for editors contained in a templated cell in Batch Edit mode.
    */
  var BatchEditTemplateCellFocused: ASPxClientEvent[
    ASPxClientVerticalGridBatchEditTemplateCellFocusedEventHandler[ASPxClientVerticalGrid]
  ] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientVerticalGrid.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Occurs when a custom command button has been clicked.
    */
  var CustomButtonClick: ASPxClientEvent[ASPxClientVerticalGridCustomButtonEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Occurs on the client side when the focused cell is about to be changed.
    */
  var FocusedCellChanging: ASPxClientEvent[ASPxClientVerticalGridFocusedCellChangingEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Fires on the client when a record is clicked.
    */
  var RecordClick: ASPxClientEvent[ASPxClientVerticalGridRecordClickEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Fires on the client when a record is double clicked.
    */
  var RecordDblClick: ASPxClientEvent[ASPxClientVerticalGridRecordClickEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Fires on the client side after a row's expansion state has been changed by end-user interaction.
    */
  var RowExpandedChanged: ASPxClientEvent[ASPxClientVerticalGridRowExpandedEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Fires on the client side before the expansion state of a row is changed by end-user interaction.
    */
  var RowExpandedChanging: ASPxClientEvent[ASPxClientVerticalGridRowExpandingEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Enables you to prevent rows from being sorted.
    */
  var RowSorting: ASPxClientEvent[ASPxClientVerticalGridRowCancelEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Fires after the selection has been changed.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientVerticalGridSelectionEventHandler[ASPxClientVerticalGrid]] = js.native
  /**
    * Provides access to the batch editing client API.
    * Value: A <see cref="ASPxClientVerticalGridBatchEditApi" /> object that exposes the batch editing client API methods.
    */
  var batchEditApi: ASPxClientVerticalGridBatchEditApi = js.native
  /**
    * Adds a new record.
    */
  def AddNewRecord(): scala.Unit = js.native
  /**
    * Applies the specified filter expression to the ASPxVerticalGrid.
    * @param filterExpression A string value that specifies the filter expression.
    */
  def ApplyFilter(filterExpression: java.lang.String): scala.Unit = js.native
  /**
    * Applies the specified search panel filter criterion to grid data.
    * @param value A string value that specifies the filter criterion.
    */
  def ApplySearchPanelFilter(value: java.lang.String): scala.Unit = js.native
  /**
    * Cancels all the changes made and switches the ASPxVerticalGrid to browse mode.
    */
  def CancelEdit(): scala.Unit = js.native
  /**
    * Clears the filter expression applied to a client vertical grid.
    */
  def ClearFilter(): scala.Unit = js.native
  /**
    * Hides the Filter Control.
    */
  def CloseFilterControl(): scala.Unit = js.native
  /**
    * Deletes the specified record.
    * @param visibleIndex An integer value that identifies the record.
    */
  def DeleteRecord(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deletes a record with the specified key value.
    * @param key An object that uniquely identifies the record.
    */
  def DeleteRecordByKey(key: js.Object): scala.Unit = js.native
  /**
    * Exports a grid data to a file in the specified format.
    * @param format An ASPxClientVerticalGridExportFormat object specifying the export format.
    */
  def ExportTo(format: ASPxClientVerticalGridExportFormat): scala.Unit = js.native
  /**
    * Sets input focus to the grid.
    */
  def Focus(): scala.Unit = js.native
  /**
    * Returns the editor used to edit the specified row's values.
    * @param rowFieldNameOrId A string value that specifies the row's field name or unique identifier (the row's Name property value).
    */
  def GetEditor(rowFieldNameOrId: java.lang.String): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified row's values.
    * @param rowIndex An integer value that specifies the row's position within the rows collection.
    */
  def GetEditor(rowIndex: scala.Double): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified row's values.
    * @param row An ASPxClientVerticalGridRowobject that specifies the required row within the client grid.
    */
  def GetEditor(row: ASPxClientVerticalGridRow): ASPxClientEdit = js.native
  /**
    * Returns the current horizontal scroll position of the grid's content.
    */
  def GetHorizontalScrollPosition(): scala.Double = js.native
  /**
    * Gets the number of pages to which the grid's data is divided.
    */
  def GetPageCount(): scala.Double = js.native
  /**
    * Gets the index of the page currently being selected.
    */
  def GetPageIndex(): scala.Double = js.native
  /**
    * Returns the record values displayed within the current page.
    * @param fieldNames The names of data source fields whose values are returned.
    * @param onCallback A ASPxClientVerticalGridValuesCallback object that represents the JavaScript function which receives the list of record values as a parameter.
    */
  def GetPageRecordValues(fieldNames: java.lang.String, onCallback: ASPxClientVerticalGridValuesCallback): scala.Unit = js.native
  /**
    * Returns the key value of the specified data row (record in the vertical grid).
    * @param visibleIndex An integer value that specifies the record's visible index.
    */
  def GetRecordKey(visibleIndex: scala.Double): java.lang.String = js.native
  /**
    * Returns the values of the specified data source fields within the specified record.
    * @param visibleIndex An integer value that identifies the record.
    * @param fieldNames The names of data source fields separated using a semicolon, whose values within the specified record are returned.
    * @param onCallback An ASPxClientVerticalGridValuesCallback object that represents the JavaScript function which receives the list of record values as a parameter.
    */
  def GetRecordValues(
    visibleIndex: scala.Double,
    fieldNames: java.lang.String,
    onCallback: ASPxClientVerticalGridValuesCallback
  ): scala.Unit = js.native
  /**
    * Returns the client row that resides at the specified position within the row collection.
    * @param rowIndex A zero-based index that identifies the row within the row collection (the row's Index property value).
    */
  def GetRow(rowIndex: scala.Double): ASPxClientVerticalGridRow = js.native
  /**
    * Returns the client row which is bound to the specified data source field.
    * @param rowFieldName A string value that specifies the name of the data source field to which the row is bound (the row's fieldName property value).
    */
  def GetRowByField(rowFieldName: java.lang.String): ASPxClientVerticalGridRow = js.native
  /**
    * Returns the row with the specified unique identifier.
    * @param rowId A string value that specifies the row's unique identifier (the row's Name property value).
    */
  def GetRowById(rowId: java.lang.String): ASPxClientVerticalGridRow = js.native
  /**
    * Returns the number of rows within the client vertical grid.
    */
  def GetRowCount(): scala.Double = js.native
  /**
    * Gets the value that specifies whether the row with the specified field name or ID is expanded.
    * @param rowFieldNameOrId A string value specifying the row's field name or ID.
    */
  def GetRowExpanded(rowFieldNameOrId: java.lang.String): scala.Boolean = js.native
  /**
    * Gets the value that specifies whether the row with the specified index is expanded.
    * @param rowIndex An integer value specifying the row's index.
    */
  def GetRowExpanded(rowIndex: scala.Double): scala.Boolean = js.native
  /**
    * Gets the value that specifies whether the required row is expanded.
    * @param row An ASPxClientVerticalGridRowobject that specifies the row.
    */
  def GetRowExpanded(row: ASPxClientVerticalGridRow): scala.Boolean = js.native
  /**
    * Returns the record values displayed within all selected records.
    * @param fieldNames The names of data source fields separated by a semicolon, whose values within the selected records are returned.
    * @param onCallback A ASPxClientVerticalGridValuesCallback object that represents the JavaScript function which receives the list of record values as a parameter.
    */
  def GetSelectedFieldValues(fieldNames: java.lang.String, onCallback: ASPxClientVerticalGridValuesCallback): scala.Unit = js.native
  /**
    * Returns key values of selected records displayed within the current page.
    */
  def GetSelectedKeysOnPage(): js.Array[js.Object] = js.native
  /**
    * Returns the number of selected records.
    */
  def GetSelectedRecordCount(): scala.Double = js.native
  /**
    * Returns the index of the first record displayed within the vertical grid's active page.
    */
  def GetTopVisibleIndex(): scala.Double = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomDataCallback event.
    * @param args A string value that is any information that needs to be sent to the server-side CustomDataCallback event.
    * @param onCallback A ASPxClientVerticalGridValuesCallback object that is the JavaScript function which receives the information on the client side.
    */
  def GetValuesOnCustomCallback(args: java.lang.String, onCallback: ASPxClientVerticalGridValuesCallback): scala.Unit = js.native
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVerticalScrollPosition(): scala.Double = js.native
  /**
    * Returns the number of records actually displayed on the active page.
    */
  def GetVisibleRecordsOnPage(): scala.Double = js.native
  /**
    * Selects the specified page.
    * @param pageIndex An integer value that specifies the active page's index.
    */
  def GotoPage(pageIndex: scala.Double): scala.Unit = js.native
  /**
    * Indicates whether or not the specified record is selected within the current page.
    * @param visibleIndex An integer value that identifies the record by its visible index.
    */
  def IsRecordSelectedOnPage(visibleIndex: scala.Double): scala.Boolean = js.native
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
    * Selects all unselected records displayed on the current page.
    */
  def SelectAllRecordsOnPage(): scala.Unit = js.native
  /**
    * Allows you to select or deselect all records displayed on the current page based on the parameter passed.
    * @param selected true to select all unselected records displayed on the current page; false to deselect all selected records on the page.
    */
  def SelectAllRecordsOnPage(selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the specified record displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the record's visible index.
    */
  def SelectRecordOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  def SelectRecordOnPage(visibleIndex: scala.Double, selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects all the unselected records within the grid.
    */
  def SelectRecords(): scala.Unit = js.native
  /**
    * Selects the specified record displayed within the grid.
    * @param visibleIndex A zero-based integer value that specifies the record's visible index.
    */
  def SelectRecords(visibleIndex: scala.Double): scala.Unit = js.native
  def SelectRecords(visibleIndex: scala.Double, selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects the specified rercords within the grid.
    * @param visibleIndices An array of zero-based indices that identify records within the grid.
    */
  def SelectRecords(visibleIndices: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Selects or deselects the specified records within the grid.
    * @param visibleIndices An array of zero-based indices that identify records within the grid.
    * @param selected true to select the specified records; false to deselect the records.
    */
  def SelectRecords(visibleIndices: js.Array[scala.Double], selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects or deselects the specified record displayed within the grid.
    * @param key An object that uniquely identifies the record.
    * @param selected true to select the specified record; false to deselect the record.
    */
  def SelectRecordsByKey(key: js.Object): scala.Unit = js.native
  def SelectRecordsByKey(key: js.Object, selected: scala.Boolean): scala.Unit = js.native
  /**
    * Selects or deselects the specified records displayed within the grid.
    * @param keys An array of objects that uniquely identify the records.
    * @param selected true to select the specified records; false to deselect the records.
    */
  def SelectRecordsByKey(keys: js.Array[js.Object]): scala.Unit = js.native
  def SelectRecordsByKey(keys: js.Array[js.Object], selected: scala.Boolean): scala.Unit = js.native
  /**
    * Enables or disables the current filter.
    * @param isFilterEnabled true to enable the current filter; otherwise, false.
    */
  def SetFilterEnabled(isFilterEnabled: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies the horizontal scroll position for the grid's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorizontalScrollPosition(position: scala.Double): scala.Unit = js.native
  /**
    * Sets a value indicating whether the row is expanded.
    * @param rowFieldNameOrId A string value that specifies the row's field name or unique identifier (the row's Name property value).
    * @param value true, to expand the row; otherwise, false.
    */
  def SetRowExpanded(rowFieldNameOrId: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a value indicating whether the row is expanded.
    * @param rowIndex An integer value specifying the index of the row.
    * @param value true, to expand the row; otherwise, false.
    */
  def SetRowExpanded(rowIndex: scala.Double, value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets a value indicating whether the row is expanded.
    * @param row An ASPxClientVerticalGridRowobject that specifies the required row within the client grid.
    * @param value true, to expand the row; otherwise, false.
    */
  def SetRowExpanded(row: ASPxClientVerticalGridRow, value: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies a custom editor for the search panel on the client side.
    * @param editor An ASPxClientEdit object representing a custom editor.
    */
  def SetSearchPanelCustomEditor(editor: ASPxClientEdit): scala.Unit = js.native
  /**
    * Specifies the vertical scroll position for the grid's content.
    * @param position An integer value specifying the vertical scroll position.
    */
  def SetVerticalScrollPosition(position: scala.Double): scala.Unit = js.native
  /**
    * Displays the Filter Control.
    */
  def ShowFilterControl(): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param rowFieldNameOrId A string value that specifies the row's field name or unique identifier (the row's Name property value).
    */
  def SortBy(rowFieldNameOrId: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param rowFieldNameOrId A string value that specifies the row's field name or unique identifier (the row's Name property value).
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(rowFieldNameOrId: java.lang.String, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param rowFieldNameOrId A string value that specifies the row's field name or unique identifier (the row's Name property value).
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(rowFieldNameOrId: java.lang.String, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values, and places the row to the specified position among the sorted rows.
    * @param rowFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based row's index among the sorted rows. -1 if data is not sorted by this row.
    */
  def SortBy(
    rowFieldNameOrId: java.lang.String,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param rowIndex An integer value that specifies the row's position within the row collection.
    */
  def SortBy(rowIndex: scala.Double): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param rowIndex An integer value that specifies the row's position within the row collection.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(rowIndex: scala.Double, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param rowIndex An integer value that specifies the row's position within the row collection.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true, to clear any previous sorting; otherwise, false.
    */
  def SortBy(rowIndex: scala.Double, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values, and places the row to the specified position among the sorted rows.
    * @param rowIndex An integer value that specifies the row's position within the row collection.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex 
    */
  def SortBy(rowIndex: scala.Double, sortOrder: java.lang.String, reset: scala.Boolean, sortIndex: scala.Double): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param row An ASPxClientVerticalGridRow object that represents the data row.
    */
  def SortBy(row: ASPxClientVerticalGridRow): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param row An ASPxClientVerticalGridRow object that represents the data row.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(row: ASPxClientVerticalGridRow, sortOrder: java.lang.String): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values.
    * @param row An ASPxClientVerticalGridRow object that represents the data row.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(row: ASPxClientVerticalGridRow, sortOrder: java.lang.String, reset: scala.Boolean): scala.Unit = js.native
  /**
    * Sorts data by the specified data row's values, and places the row to the specified position among the sorted rows.
    * @param row An ASPxClientGridViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based row's index among the sorted rows. -1 if data is not sorted by this row.
    */
  def SortBy(
    row: ASPxClientVerticalGridRow,
    sortOrder: java.lang.String,
    reset: scala.Boolean,
    sortIndex: scala.Double
  ): scala.Unit = js.native
  /**
    * Deselects all selected records displayed on the current page.
    */
  def UnselectAllRecordsOnPage(): scala.Unit = js.native
  /**
    * Deselects all grid records that match the filter criteria currently applied to the grid.
    */
  def UnselectFilteredRecords(): scala.Unit = js.native
  /**
    * Deselects the specified record (if selected) displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the record's visible index.
    */
  def UnselectRecordOnPage(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deselects all the selected records within the grid.
    */
  def UnselectRecords(): scala.Unit = js.native
  /**
    * Deselects the specified record (if selected) within the grid.
    * @param visibleIndex A zero-based integer value that specifies the record's visible index.
    */
  def UnselectRecords(visibleIndex: scala.Double): scala.Unit = js.native
  /**
    * Deselects the specified records (if selected) within the grid.
    * @param visibleIndices An array of zero-based indices that identify records within the grid.
    */
  def UnselectRecords(visibleIndices: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Deselects the specified record displayed within the grid.
    * @param key An object that uniquely identifies the record.
    */
  def UnselectRecordsByKey(key: js.Object): scala.Unit = js.native
  /**
    * Deselects the specified records displayed within the grid.
    * @param keys An array of objects that uniquely identify the records.
    */
  def UnselectRecordsByKey(keys: js.Array[js.Object]): scala.Unit = js.native
  /**
    * Saves all the changes made and switches the grid to browse mode.
    */
  def UpdateEdit(): scala.Unit = js.native
}

