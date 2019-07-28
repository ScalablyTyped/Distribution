package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxCardView.
  */
@js.native
trait ASPxClientCardView extends ASPxClientGridBase {
  /**
    * Occurs on the client side before a card is deleted in batch edit mode.
    */
  var BatchEditCardDeleting: ASPxClientEvent[ASPxClientCardViewBatchEditCardDeletingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs on the client side before a card is inserted in batch edit mode.
    */
  var BatchEditCardInserting: ASPxClientEvent[ASPxClientCardViewBatchEditCardInsertingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs on the client side before a card is recovered in batch edit mode.
    */
  var BatchEditCardRecovering: ASPxClientEvent[ASPxClientCardViewBatchEditCardRecoveringEventHandler[ASPxClientCardView]] = js.native
  /**
    * Enables you to specify whether card data is valid and provide an error text.
    */
  var BatchEditCardValidating: ASPxClientEvent[ASPxClientCardViewBatchEditCardValidatingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs on the client side before data changes are canceled in batch edit mode.
    */
  var BatchEditChangesCanceling: ASPxClientEvent[ASPxClientCardViewBatchEditChangesCancelingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs on the client side before data changes are saved in batch edit mode.
    */
  var BatchEditChangesSaving: ASPxClientEvent[ASPxClientCardViewBatchEditChangesSavingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Enables you to prevent a batch edit confirmation message from being displayed.
    */
  var BatchEditConfirmShowing: ASPxClientEvent[ASPxClientCardViewBatchEditConfirmShowingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs when a grid leaves batch edit mode.
    */
  var BatchEditEndEditing: ASPxClientEvent[ASPxClientCardViewBatchEditEndEditingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs when a grid switches to batch edit mode.
    */
  var BatchEditStartEditing: ASPxClientEvent[ASPxClientCardViewBatchEditStartEditingEventHandler[ASPxClientCardView]] = js.native
  /**
    * Enables you to provide navigation for editors contained in a templated cell in Batch Edit mode.
    */
  var BatchEditTemplateCellFocused: ASPxClientEvent[ASPxClientCardViewBatchEditTemplateCellFocusedEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientCardView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires on the client when a card is clicked.
    */
  var CardClick: ASPxClientEvent[ASPxClientCardViewCardClickEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires on the client when a card is double clicked.
    */
  var CardDblClick: ASPxClientEvent[ASPxClientCardViewCardClickEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires before a card has been focused.
    */
  var CardFocusing: ASPxClientEvent[ASPxClientCardViewCardFocusingEventHandler[ASPxClientCardView]] = js.native
  var ColumnGrouping: ASPxClientEvent[ASPxClientCardViewColumnCancelEventHandler[ASPxClientCardView]] = js.native
  /**
    * Enables you to prevent columns from being sorted.
    */
  var ColumnSorting: ASPxClientEvent[ASPxClientCardViewColumnCancelEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs when a custom command button has been clicked.
    */
  var CustomButtonClick: ASPxClientEvent[ASPxClientCardViewCustomButtonEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires after the customization window has been closed.
    */
  var CustomizationWindowCloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires in response to changing card focus.
    */
  var FocusedCardChanged: ASPxClientEvent[ASPxClientCardViewFocusEventHandler[ASPxClientCardView]] = js.native
  /**
    * Occurs on the client side when the focused cell is about to be changed.
    */
  var FocusedCellChanging: ASPxClientEvent[ASPxClientCardViewFocusedCellChangingEventHandler[ASPxClientCardView]] = js.native
  var GroupRowCollapsing: ASPxClientEvent[ASPxClientCardViewGroupCancelEventHandler[ASPxClientCardView]] = js.native
  var GroupRowExpanding: ASPxClientEvent[ASPxClientCardViewGroupCancelEventHandler[ASPxClientCardView]] = js.native
  /**
    * Fires after the selection has been changed.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientCardViewSelectionEventHandler[ASPxClientCardView]] = js.native
  /**
    * Provides access to the batch editing client API.
    * Value: A <see cref="ASPxClientCardViewBatchEditApi" /> object that exposes the batch editing client API methods.
    */
  var batchEditApi: ASPxClientCardViewBatchEditApi = js.native
  /**
    * Adds a new card.
    */
  def AddNewCard(): Unit = js.native
  /**
    * Applies the specified filter expression to the grid.
    * @param filterExpression A string value that specifies the filter expression.
    */
  def ApplyFilter(filterExpression: String): Unit = js.native
  /**
    * Applies the specified search panel filter criterion to grid data.
    * @param value A string value that specifies the filter criterion.
    */
  def ApplySearchPanelFilter(value: String): Unit = js.native
  /**
    * Cancels all the changes made and switches the CardView to browse mode.
    */
  def CancelEdit(): Unit = js.native
  /**
    * Clears the filter expression applied to a client CardView.
    */
  def ClearFilter(): Unit = js.native
  /**
    * Hides the Filter Control.
    */
  def CloseFilterControl(): Unit = js.native
  def CollapseAll(): Unit = js.native
  /**
    * 
    * @param visibleIndex 
    */
  def CollapseGroupRow(visibleIndex: Double): Unit = js.native
  /**
    * Deletes the specified card.
    * @param visibleIndex An integer value that identifies the card.
    */
  def DeleteCard(visibleIndex: Double): Unit = js.native
  /**
    * Deletes a card with the specified key value.
    * @param key An object that uniquely identifies the card.
    */
  def DeleteCardByKey(key: js.Object): Unit = js.native
  def ExpandAll(): Unit = js.native
  /**
    * 
    * @param visibleIndex 
    */
  def ExpandGroupRow(visibleIndex: Double): Unit = js.native
  /**
    * Exports grid data to a file in the specified format.
    * @param format An ASPxClientCardViewExportFormat object specifying the export format.
    */
  def ExportTo(format: ASPxClientCardViewExportFormat): Unit = js.native
  /**
    * Sets input focus to the grid.
    */
  def Focus(): Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited card.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def FocusEditor(columnFieldNameOrId: String): Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited card.
    * @param columnIndex An integer value that specifies the column's position within the columns collection.
    */
  def FocusEditor(columnIndex: Double): Unit = js.native
  /**
    * Moves focus to the specified edit cell within the edited card.
    * @param column An ASPxClientCardViewColumn object that represents the data column within the client grid.
    */
  def FocusEditor(column: ASPxClientCardViewColumn): Unit = js.native
  /**
    * Returns the key value of the specified card.
    * @param visibleIndex An integer value that specifies the card's visible index.
    */
  def GetCardKey(visibleIndex: Double): String = js.native
  /**
    * Returns the values of the specified data source fields within the specified card.
    * @param visibleIndex An integer value that identifies the data card.
    * @param fieldNames The names of data source fields separated via a semicolon, whose values within the specified card are returned.
    * @param onCallback An ASPxClientCardViewValuesCallback object that represents the JavaScript function which receives the list of card values as a parameter.
    */
  def GetCardValues(visibleIndex: Double, fieldNames: String, onCallback: ASPxClientCardViewValuesCallback): Unit = js.native
  /**
    * Returns the client column that resides at the specified position within the column collection.
    * @param columnIndex A zero-based index that identifies the column within the column collection (the column's Index property value).
    */
  def GetColumn(columnIndex: Double): ASPxClientCardViewColumn = js.native
  /**
    * Returns the client column to which the specified data source field is bound.
    * @param columnFieldName A string value that specifies the name of the data source field to which the column is bound (the column's FieldName property value).
    */
  def GetColumnByField(columnFieldName: String): ASPxClientCardViewColumn = js.native
  /**
    * Returns the column with the specified unique identifier.
    * @param columnId A string value that specifies the column's unique identifier (the column's Name property value).
    */
  def GetColumnById(columnId: String): ASPxClientCardViewColumn = js.native
  /**
    * Returns the number of columns within the client grid.
    */
  def GetColumnCount(): Double = js.native
  /**
    * Returns the value of the specified edit cell.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def GetEditValue(columnFieldNameOrId: String): String = js.native
  /**
    * Returns the value of the specified edit cell.
    * @param columnIndex An integer value that identifies the data column within the grid's column collection.
    */
  def GetEditValue(columnIndex: Double): String = js.native
  /**
    * Returns the value of the specified edit cell.
    * @param column An ASPxClientCardViewColumn object that represents the data column within the client grid.
    */
  def GetEditValue(column: ASPxClientCardViewColumn): String = js.native
  /**
    * Returns the editor used to edit the specified column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def GetEditor(columnFieldNameOrId: String): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    */
  def GetEditor(columnIndex: Double): ASPxClientEdit = js.native
  /**
    * Returns the editor used to edit the specified column's values.
    * @param column An ASPxClientCardViewColumn object that specifies the required column within the client grid.
    */
  def GetEditor(column: ASPxClientCardViewColumn): ASPxClientEdit = js.native
  /**
    * Returns the focused card's index.
    */
  def GetFocusedCardIndex(): Double = js.native
  /**
    * Gets information about a focused cell.
    */
  def GetFocusedCell(): ASPxClientCardViewCellInfo = js.native
  /**
    * Returns the card values displayed within the current page.
    * @param fieldNames The names of data source fields whose values are returned.
    * @param onCallback An ASPxClientCardViewValuesCallback object that represents the JavaScript function which receives the list of card values as a parameter.
    */
  def GetPageCardValues(fieldNames: String, onCallback: ASPxClientCardViewValuesCallback): Unit = js.native
  /**
    * Gets the number of pages to which the grid's data is divided.
    */
  def GetPageCount(): Double = js.native
  /**
    * Gets the index of the page currently being selected.
    */
  def GetPageIndex(): Double = js.native
  /**
    * Gets the Popup Edit Form.
    */
  def GetPopupEditForm(): ASPxClientPopupControl = js.native
  /**
    * Returns the number of selected cards.
    */
  def GetSelectedCardCount(): Double = js.native
  /**
    * Returns the card values displayed within all selected cards.
    * @param fieldNames The names of data source fields separated via a semicolon, whose values within the selected cards are returned.
    * @param onCallback An ASPxClientCardViewValuesCallback object that represents the JavaScript function which receives the list of card values as a parameter.
    */
  def GetSelectedFieldValues(fieldNames: String, onCallback: ASPxClientCardViewValuesCallback): Unit = js.native
  /**
    * Returns key values of selected cards displayed within the current page.
    */
  def GetSelectedKeysOnPage(): js.Array[js.Object] = js.native
  /**
    * Returns the index of the first card displayed within the grid's active page.
    */
  def GetTopVisibleIndex(): Double = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomDataCallback event.
    * @param args A string value that is any information that needs to be sent to the server-side CustomDataCallback event.
    * @param onCallback An ASPxClientCardViewValuesCallback object that is the JavaScript function which receives the information on the client side.
    */
  def GetValuesOnCustomCallback(args: String, onCallback: ASPxClientCardViewValuesCallback): Unit = js.native
  /**
    * Returns the current vertical scroll position of the grid's content.
    */
  def GetVerticalScrollPosition(): Double = js.native
  /**
    * Returns the number of cards actually displayed within the active page.
    */
  def GetVisibleCardsOnPage(): Double = js.native
  /**
    * Selects the specified page.
    * @param pageIndex An integer value that specifies the active page's index.
    */
  def GotoPage(pageIndex: Double): Unit = js.native
  /**
    * 
    * @param columnFieldNameOrId 
    */
  def GroupBy(columnFieldNameOrId: String): Unit = js.native
  /**
    * 
    * @param columnFieldNameOrId 
    * @param groupIndex 
    */
  def GroupBy(columnFieldNameOrId: String, groupIndex: Double): Unit = js.native
  /**
    * 
    * @param columnFieldNameOrId 
    * @param groupIndex 
    * @param sortOrder 
    */
  def GroupBy(columnFieldNameOrId: String, groupIndex: Double, sortOrder: String): Unit = js.native
  /**
    * 
    * @param columnIndex 
    */
  def GroupBy(columnIndex: Double): Unit = js.native
  /**
    * 
    * @param columnIndex 
    * @param groupIndex 
    */
  def GroupBy(columnIndex: Double, groupIndex: Double): Unit = js.native
  /**
    * 
    * @param columnIndex 
    * @param groupIndex 
    * @param sortOrder 
    */
  def GroupBy(columnIndex: Double, groupIndex: Double, sortOrder: String): Unit = js.native
  /**
    * 
    * @param column 
    */
  def GroupBy(column: ASPxClientCardViewColumn): Unit = js.native
  /**
    * 
    * @param column 
    * @param groupIndex 
    */
  def GroupBy(column: ASPxClientCardViewColumn, groupIndex: Double): Unit = js.native
  /**
    * 
    * @param column 
    * @param groupIndex 
    * @param sortOrder 
    */
  def GroupBy(column: ASPxClientCardViewColumn, groupIndex: Double, sortOrder: String): Unit = js.native
  /**
    * Closes the customization window.
    */
  def HideCustomizationWindow(): Unit = js.native
  /**
    * Indicates whether or not the specified card is selected within the current page.
    * @param visibleIndex An integer value that identifies the card by its visible index.
    */
  def IsCardSelectedOnPage(visibleIndex: Double): Boolean = js.native
  /**
    * Indicates whether the customization window is displayed.
    */
  def IsCustomizationWindowVisible(): Boolean = js.native
  /**
    * Indicates whether the grid is in edit mode.
    */
  def IsEditing(): Boolean = js.native
  /**
    * Indicates whether or not a new card is being edited.
    */
  def IsNewCardEditing(): Boolean = js.native
  /**
    * Hides the specified column.
    * @param columnFieldNameOrId A string value that identifies the column to be hidden by the name of the data source field to which the column is bound, or by the column's name.
    */
  def MoveColumn(columnFieldNameOrId: String): Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the ASPxCardView.
    * @param columnFieldNameOrId A string value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the ASPxCardView.
    */
  def MoveColumn(columnFieldNameOrId: String, moveToColumnVisibleIndex: Double): Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the ASPxCardView.
    * @param columnFieldNameOrId A string value that identifies the column to be moved by the name of the data source field to which the column is bound or by the column's name.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    */
  def MoveColumn(columnFieldNameOrId: String, moveToColumnVisibleIndex: Double, moveBefore: Boolean): Unit = js.native
  /**
    * Hides the specified column.
    * @param columnIndex An integer value that specifies the absolute index of the column to hide.
    */
  def MoveColumn(columnIndex: Double): Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the ASPxCardView.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the grid.
    */
  def MoveColumn(columnIndex: Double, moveToColumnVisibleIndex: Double): Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the ASPxCardView.
    * @param columnIndex An integer value that specifies the absolute index of the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the grid.
    * @param moveBefore true to move the column before the target column; otherwise, false.
    */
  def MoveColumn(columnIndex: Double, moveToColumnVisibleIndex: Double, moveBefore: Boolean): Unit = js.native
  /**
    * Hides the specified column.
    * @param column An ASPxClientCardViewColumn object that represents the column to hide.
    */
  def MoveColumn(column: ASPxClientCardViewColumn): Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the ASPxCardView.
    * @param column An ASPxClientCardViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that specifies the column's position among the visible columns within the ASPxCardView.
    */
  def MoveColumn(column: ASPxClientCardViewColumn, moveToColumnVisibleIndex: Double): Unit = js.native
  /**
    * Moves the specified column to the specified visual position within the ASPxCardView.
    * @param column An ASPxClientCardViewColumn object that represents the column to move.
    * @param moveToColumnVisibleIndex An integer value that identifies the target column displayed within the CardView.
    * @param moveBefore true, to move the column before the target column; otherwise, false.
    */
  def MoveColumn(column: ASPxClientCardViewColumn, moveToColumnVisibleIndex: Double, moveBefore: Boolean): Unit = js.native
  /**
    * Activates the next page.
    */
  def NextPage(): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
    * @param args A string value that represents any information that needs to be sent to the server-side CustomCallback event.
    */
  def PerformCallback(args: String): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side event, passing the specified argument to it.
    * @param args A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: String, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
  /**
    * Activates the previous page.
    */
  def PrevPage(): Unit = js.native
  /**
    * Updates data displayed within the grid.
    */
  def Refresh(): Unit = js.native
  /**
    * Selects all unselected cards displayed on the current page.
    */
  def SelectAllCardsOnPage(): Unit = js.native
  /**
    * Allows you to select or deselect all cards displayed on the current page based on the parameter passed.
    * @param selected true to select all unselected cards displayed on the current page; false to deselect all selected cards on the page.
    */
  def SelectAllCardsOnPage(selected: Boolean): Unit = js.native
  /**
    * Selects the specified card displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the card's visible index.
    */
  def SelectCardOnPage(visibleIndex: Double): Unit = js.native
  def SelectCardOnPage(visibleIndex: Double, selected: Boolean): Unit = js.native
  /**
    * Selects all the unselected cards within the CardView.
    */
  def SelectCards(): Unit = js.native
  /**
    * Selects the specified card displayed within the CardView.
    * @param visibleIndex A zero-based integer value that specifies the card's visible index.
    */
  def SelectCards(visibleIndex: Double): Unit = js.native
  def SelectCards(visibleIndex: Double, selected: Boolean): Unit = js.native
  /**
    * Selects the specified cards within the CardView.
    * @param visibleIndices An array of zero-based indices that identify data cards within the grid.
    */
  def SelectCards(visibleIndices: js.Array[Double]): Unit = js.native
  /**
    * Selects or deselects the specified cards within the CardView.
    * @param visibleIndices An array of zero-based indices that identify data cards within the grid.
    * @param selected true to select the specified cards; false to deselect the cards.
    */
  def SelectCards(visibleIndices: js.Array[Double], selected: Boolean): Unit = js.native
  /**
    * Selects or deselects the specified card displayed within the CardView.
    * @param key An object that uniquely identifies the card.
    * @param selected true to select the specified card; false to deselect the card.
    */
  def SelectCardsByKey(key: js.Object): Unit = js.native
  def SelectCardsByKey(key: js.Object, selected: Boolean): Unit = js.native
  /**
    * Selects or deselects the specified cards displayed within the CardView.
    * @param keys An array of objects that uniquely identify the cards.
    * @param selected true to select the specified cards; false to deselect the cards.
    */
  def SelectCardsByKey(keys: js.Array[js.Object]): Unit = js.native
  def SelectCardsByKey(keys: js.Array[js.Object], selected: Boolean): Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(columnFieldNameOrId: String, value: String): Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param columnIndex An integer value that identifies the data column within the grid's column collection.
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(columnIndex: Double, value: String): Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param column An ASPxClientCardViewColumn object that represents the data column within the client grid.
    * @param value A string value that specifies the edit cell's new value.
    */
  def SetEditValue(column: ASPxClientCardViewColumn, value: String): Unit = js.native
  /**
    * Enables or disables the current filter.
    * @param isFilterEnabled true to enable the current filter; otherwise, false.
    */
  def SetFilterEnabled(isFilterEnabled: Boolean): Unit = js.native
  /**
    * Moves focus to the specified card.
    * @param visibleIndex An integer value that specifies the focused card's index.
    */
  def SetFocusedCardIndex(visibleIndex: Double): Unit = js.native
  /**
    * Focuses the specified cell.
    * @param cardVisibleIndex An  value that specifies the visible index of the card.
    * @param columnIndex A zero-based index that identifies the column in the column collection (the column's Index property value).
    */
  def SetFocusedCell(cardVisibleIndex: Double, columnIndex: Double): Unit = js.native
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
    * Invokes the customization window.
    */
  def ShowCustomizationWindow(): Unit = js.native
  def ShowCustomizationWindow(showAtElement: js.Object): Unit = js.native
  /**
    * Displays the Filter Control.
    */
  def ShowFilterControl(): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    */
  def SortBy(columnFieldNameOrId: String): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(columnFieldNameOrId: String, sortOrder: String): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(columnFieldNameOrId: String, sortOrder: String, reset: Boolean): Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param columnFieldNameOrId A string value that specifies the column's field name or unique identifier (the column's Name property value).
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based column's index among the sorted columns. -1 if data is not sorted by this column.
    */
  def SortBy(columnFieldNameOrId: String, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    */
  def SortBy(columnIndex: Double): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(columnIndex: Double, sortOrder: String): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(columnIndex: Double, sortOrder: String, reset: Boolean): Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param columnIndex An integer value that specifies the column's position within the column collection.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex An integer value that specifies the zero-based column's index among the sorted columns. -1 if data is not sorted by this column.
    */
  def SortBy(columnIndex: Double, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param column An ASPxClientCardViewColumn object that represents the data column.
    */
  def SortBy(column: ASPxClientCardViewColumn): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param column An ASPxClientCardViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    */
  def SortBy(column: ASPxClientCardViewColumn, sortOrder: String): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param column An ASPxClientCardViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(column: ASPxClientCardViewColumn, sortOrder: String, reset: Boolean): Unit = js.native
  /**
    * Sorts data by the specified data column's values, and places the column to the specified position among the sorted columns.
    * @param column An ASPxClientCardViewColumn object that represents the data column.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DSC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    * @param sortIndex 
    */
  def SortBy(column: ASPxClientCardViewColumn, sortOrder: String, reset: Boolean, sortIndex: Double): Unit = js.native
  /**
    * Switches the CardView to edit mode.
    * @param visibleIndex A zero-based integer that identifies a card to be edited.
    */
  def StartEditCard(visibleIndex: Double): Unit = js.native
  /**
    * Switches the ASPxCardView to edit mode.
    * @param key An object that uniquely identifies a card to be edited.
    */
  def StartEditCardByKey(key: js.Object): Unit = js.native
  /**
    * 
    * @param columnFieldNameOrId 
    */
  def Ungroup(columnFieldNameOrId: String): Unit = js.native
  /**
    * 
    * @param columnIndex 
    */
  def Ungroup(columnIndex: Double): Unit = js.native
  /**
    * 
    * @param column 
    */
  def Ungroup(column: ASPxClientCardViewColumn): Unit = js.native
  /**
    * Deselects all selected cards displayed on the current page.
    */
  def UnselectAllCardsOnPage(): Unit = js.native
  /**
    * Deselects the specified cards (if selected) displayed on the current page.
    * @param visibleIndex A zero-based integer value that specifies the card's visible index.
    */
  def UnselectCardOnPage(visibleIndex: Double): Unit = js.native
  /**
    * Deselects all the selected cards within the ASPxCardView.
    */
  def UnselectCards(): Unit = js.native
  /**
    * Deselects the specified cards (if selected) within the ASPxCardView.
    * @param visibleIndex A zero-based integer value that specifies the card's visible index.
    */
  def UnselectCards(visibleIndex: Double): Unit = js.native
  /**
    * Deselects the specified cards (if selected) within the ASPxCardView.
    * @param visibleIndices An array of zero-based indices that identify data cards within the grid.
    */
  def UnselectCards(visibleIndices: js.Array[Double]): Unit = js.native
  /**
    * Deselects the specified card displayed within the ASPxCardView.
    * @param key An object that uniquely identifies the card.
    */
  def UnselectCardsByKey(key: js.Object): Unit = js.native
  /**
    * Deselects the specified cards displayed within the ASPxCardView.
    * @param keys An array of objects that uniquely identify the cards.
    */
  def UnselectCardsByKey(keys: js.Array[js.Object]): Unit = js.native
  /**
    * Deselects all grid cards that match the filter criteria currently applied to the CardView.
    */
  def UnselectFilteredCards(): Unit = js.native
  /**
    * Saves all the changes made and switches the grid to browse mode.
    */
  def UpdateEdit(): Unit = js.native
}

