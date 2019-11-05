package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxVerticalGrid object.
  */
@JSGlobal("ASPxClientVerticalGrid")
@js.native
class ASPxClientVerticalGrid () extends ASPxClientGridBase {
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
    */
  var batchEditApi: ASPxClientVerticalGridBatchEditApi = js.native
  /**
    * Adds a new record.
    */
  def AddNewRecord(): Unit = js.native
  /**
    * Applies the specified filter expression to the ASPxVerticalGrid.
    * @param filterExpression A string value that specifies the filter expression.
    */
  def ApplyFilter(filterExpression: String): Unit = js.native
  /**
    * Applies the specified search panel filter criterion to grid data.
    * @param value A string value that specifies the filter criterion.
    */
  def ApplySearchPanelFilter(value: String): Unit = js.native
  /**
    * Cancels all the changes made and switches the ASPxVerticalGrid to browse mode.
    */
  def CancelEdit(): Unit = js.native
  /**
    * Clears the filter expression applied to a client vertical grid.
    */
  def ClearFilter(): Unit = js.native
  /**
    * Hides the Filter Control.
    */
  def CloseFilterControl(): Unit = js.native
  /**
    * Deletes the specified record.
    * @param visibleIndex An integer value that identifies the record.
    */
  def DeleteRecord(visibleIndex: Double): Unit = js.native
  /**
    * Deletes a record with the specified key value.
    * @param key An object that uniquely identifies the record.
    */
  def DeleteRecordByKey(key: js.Any): Unit = js.native
  /**
    * Exports a grid data to a file in the specified format.
    * @param format An ASPxClientVerticalGridExportFormat object specifying the export format.
    */
  def ExportTo(format: ASPxClientVerticalGridExportFormat): Unit = js.native
  /**
    * Sets input focus to the grid.
    */
  def Focus(): Unit = js.native
  def GetEditor(row: String): ASPxClientEdit = js.native
  def GetEditor(row: Double): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified row's values. An ASPxClientEdit object that is the specified row's editor.
    * @param row An ASPxClientVerticalGridRowobject that specifies the required row within the client grid.
    */
  def GetEditor(row: ASPxClientVerticalGridRow): ASPxClientEdit = js.native
  /**
    * Returns the current horizontal scroll position of the grid's content.
    */
  def GetHorizontalScrollPosition(): Double = js.native
  /**
    * Gets the number of pages to which the grid's data is divided.
    */
  def GetPageCount(): Double = js.native
  /**
    * Gets the index of the page currently being selected.
    */
  def GetPageIndex(): Double = js.native
  /**
    * Returns the record values displayed within the current page.
    * @param fieldNames The names of data source fields whose values are returned.
    * @param onCallback A ASPxClientVerticalGridValuesCallback object that represents the JavaScript function which receives the list of record values as a parameter.
    */
  def GetPageRecordValues(fieldNames: String, onCallback: ASPxClientVerticalGridValuesCallback): Unit = js.native
  /**
    * Returns the key value of the specified data row (record in the vertical grid). A string representing the specified data row's key value. If the index passed using the visibleIndex parameter is wrong or the ASPxGridBase.KeyFieldName property is not set, null is returned.
    * @param visibleIndex An integer value that specifies the record's visible index.
    */
  def GetRecordKey(visibleIndex: Double): String = js.native
  /**
    * Returns the values of the specified data source fields within the specified record.
    * @param visibleIndex An integer value that identifies the record.
    * @param fieldNames The names of data source fields separated using a semicolon, whose values within the specified record are returned.
    * @param onCallback An ASPxClientVerticalGridValuesCallback object that represents the JavaScript function which receives the list of record values as a parameter.
    */
  def GetRecordValues(visibleIndex: Double, fieldNames: String, onCallback: ASPxClientVerticalGridValuesCallback): Unit = js.native
  /**
    * Returns the client row that resides at the specified position within the row collection. An ASPxClientVerticalGridRow object that represents the client row.
    * @param rowIndex A zero-based index that identifies the row within the row collection (the row's CollectionItem.Index property value).
    */
  def GetRow(rowIndex: Double): ASPxClientVerticalGridRow = js.native
  /**
    * Returns the client row which is bound to the specified data source field. An ASPxClientVerticalGridRow object that represents the client row bound to the specified data source field.
    * @param rowFieldName A string value that specifies the name of the data source field to which the row is bound (the row's ASPxClientVerticalGridRow.fieldName property value).
    */
  def GetRowByField(rowFieldName: String): ASPxClientVerticalGridRow = js.native
  /**
    * Returns the row with the specified unique identifier. An ASPxClientVerticalGridRow object that represents the client row.
    * @param rowId A string value that specifies the row's unique identifier (the row's WebColumnBase.Name property value).
    */
  def GetRowById(rowId: String): ASPxClientVerticalGridRow = js.native
  /**
    * Returns the number of rows within the client vertical grid.
    */
  def GetRowCount(): Double = js.native
  def GetRowExpanded(row: String): Boolean = js.native
  def GetRowExpanded(row: Double): Boolean = js.native
  /**
    * Gets the value that specifies whether the required row is expanded. true, if the row is expanded; otherwise, false.
    * @param row An ASPxClientVerticalGridRowobject that specifies the row.
    */
  def GetRowExpanded(row: ASPxClientVerticalGridRow): Boolean = js.native
  /**
    * Returns the record values displayed within all selected records.
    * @param fieldNames The names of data source fields separated by a semicolon, whose values within the selected records are returned.
    * @param onCallback A ASPxClientVerticalGridValuesCallback object that represents the JavaScript function which receives the list of record values as a parameter.
    */
  def GetSelectedFieldValues(fieldNames: String, onCallback: ASPxClientVerticalGridValuesCallback): Unit = js.native
  /**
    * Returns key values of selected records displayed within the current page.
    */
  def GetSelectedKeysOnPage(): js.Array[_] = js.native
  /**
    * Returns the number of selected records.
    */
  def GetSelectedRecordCount(): Double = js.native
  /**
    * Returns the index of the first record displayed within the vertical grid's active page.
    */
  def GetTopVisibleIndex(): Double = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxVerticalGrid.CustomDataCallback event.
    * @param args A string value that is any information that needs to be sent to the server-side ASPxVerticalGrid.CustomDataCallback event.
    * @param onCallback A ASPxClientVerticalGridValuesCallback object that is the JavaScript function which receives the information on the client side.
    */
  def GetValuesOnCustomCallback(args: String, onCallback: ASPxClientVerticalGridValuesCallback): Unit = js.native
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVerticalScrollPosition(): Double = js.native
  /**
    * Returns the number of records actually displayed on the active page.
    */
  def GetVisibleRecordsOnPage(): Double = js.native
  /**
    * Selects the specified page.
    * @param pageIndex An integer value that specifies the active page's index.
    */
  def GotoPage(pageIndex: Double): Unit = js.native
  /**
    * Indicates whether or not the specified record is selected within the current page. true if the specified record is selected within the current page; otherwise, false.
    * @param visibleIndex An integer value that identifies the record by its visible index.
    */
  def IsRecordSelectedOnPage(visibleIndex: Double): Boolean = js.native
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
    * Allows you to select or deselect all records displayed on the current page based on the parameter passed.
    * @param selected true to select all unselected records displayed on the current page; false to deselect all selected records on the page.
    */
  def SelectAllRecordsOnPage(): Unit = js.native
  def SelectAllRecordsOnPage(selected: Boolean): Unit = js.native
  /**
    * Selects or deselects the specified record displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the record's visible index.
    * @param selected true to select the specified record; false to deselect the record.
    */
  def SelectRecordOnPage(visibleIndex: Double): Unit = js.native
  def SelectRecordOnPage(visibleIndex: Double, selected: Boolean): Unit = js.native
  /**
    * Selects or deselects the specified records within the grid.
    * @param visibleIndices An array of zero-based indices that identify records within the grid.
    * @param selected true to select the specified records; false to deselect the records.
    */
  def SelectRecords(): Unit = js.native
  def SelectRecords(visibleIndices: js.Array[Double]): Unit = js.native
  def SelectRecords(visibleIndices: js.Array[Double], selected: Boolean): Unit = js.native
  def SelectRecords(visibleIndices: Double): Unit = js.native
  def SelectRecords(visibleIndices: Double, selected: Boolean): Unit = js.native
  def SelectRecordsByKey(keys: js.Any): Unit = js.native
  def SelectRecordsByKey(keys: js.Any, selected: Boolean): Unit = js.native
  /**
    * Selects or deselects the specified records displayed within the grid.
    * @param keys An array of objects that uniquely identify the records.
    * @param selected true to select the specified records; false to deselect the records.
    */
  def SelectRecordsByKey(keys: js.Array[_]): Unit = js.native
  def SelectRecordsByKey(keys: js.Array[_], selected: Boolean): Unit = js.native
  /**
    * Enables or disables the current filter.
    * @param isFilterEnabled true to enable the current filter; otherwise, false.
    */
  def SetFilterEnabled(isFilterEnabled: Boolean): Unit = js.native
  /**
    * Sets the offset from the container's top border to fixed rows while scrolling the page.
    * @param offset The top offset.
    */
  def SetFixedRowsTopOffset(offset: Double): Unit = js.native
  /**
    * Specifies the horizontal scroll position for the grid's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorizontalScrollPosition(position: Double): Unit = js.native
  def SetRowExpanded(row: String, value: Boolean): Unit = js.native
  def SetRowExpanded(row: Double, value: Boolean): Unit = js.native
  /**
    * Sets a value indicating whether the row is expanded.
    * @param value true, to expand the row; otherwise, false.
    */
  def SetRowExpanded(row: ASPxClientVerticalGridRow, value: Boolean): Unit = js.native
  /**
    * Specifies a custom editor for the search panel on the client side.
    * @param editor An ASPxClientEdit object representing a custom editor.
    */
  def SetSearchPanelCustomEditor(editor: ASPxClientEdit): Unit = js.native
  /**
    * Specifies the vertical scroll position for the grid's content.
    * @param position An integer value specifying the vertical scroll position.
    */
  def SetVerticalScrollPosition(position: Double): Unit = js.native
  /**
    * Displays the Filter Control.
    */
  def ShowFilterControl(): Unit = js.native
  def SortBy(row: String): Unit = js.native
  def SortBy(row: String, sortOrder: String): Unit = js.native
  def SortBy(row: String, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(row: String, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  def SortBy(row: Double): Unit = js.native
  def SortBy(row: Double, sortOrder: String): Unit = js.native
  def SortBy(row: Double, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(row: Double, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  /**
    * Sorts data by the specified data row's values, and places the row to the specified position among the sorted rows.
    * @param sortOrder A string value that specifies the row's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based row's index among the sorted rows. &#0045;1 if data is not sorted by this row.
    */
  def SortBy(row: ASPxClientVerticalGridRow): Unit = js.native
  def SortBy(row: ASPxClientVerticalGridRow, sortOrder: String): Unit = js.native
  def SortBy(row: ASPxClientVerticalGridRow, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(row: ASPxClientVerticalGridRow, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  /**
    * Deselects all selected records displayed on the current page.
    */
  def UnselectAllRecordsOnPage(): Unit = js.native
  /**
    * Deselects all grid records that match the filter criteria currently applied to the grid.
    */
  def UnselectFilteredRecords(): Unit = js.native
  /**
    * Deselects the specified record (if selected) displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the record's visible index.
    */
  def UnselectRecordOnPage(visibleIndex: Double): Unit = js.native
  /**
    * Deselects the specified records (if selected) within the grid.
    * @param visibleIndices An array of zero-based indices that identify records within the grid.
    */
  def UnselectRecords(): Unit = js.native
  def UnselectRecords(visibleIndices: js.Array[Double]): Unit = js.native
  def UnselectRecords(visibleIndices: Double): Unit = js.native
  def UnselectRecordsByKey(keys: js.Any): Unit = js.native
  /**
    * Deselects the specified records displayed within the grid.
    * @param keys An array of objects that uniquely identify the records.
    */
  def UnselectRecordsByKey(keys: js.Array[_]): Unit = js.native
  /**
    * Saves all the changes made and switches the grid to browse mode.
    */
  def UpdateEdit(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientVerticalGrid")
@js.native
object ASPxClientVerticalGrid extends js.Object {
  /**
    * Converts the specified object to the ASPxClientVerticalGrid type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientVerticalGrid = js.native
}

