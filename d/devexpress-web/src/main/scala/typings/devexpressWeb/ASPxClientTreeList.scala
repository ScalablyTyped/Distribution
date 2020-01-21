package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxTreeList.
  */
@JSGlobal("ASPxClientTreeList")
@js.native
class ASPxClientTreeList () extends ASPxClientControl {
  /**
    * Occurs on the client side before data changes are canceled in batch edit mode.
    */
  var BatchEditChangesCanceling: ASPxClientEvent[ASPxClientTreeListBatchEditChangesCancelingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs on the client side before data changes are saved in batch edit mode.
    */
  var BatchEditChangesSaving: ASPxClientEvent[ASPxClientTreeListBatchEditChangesSavingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Enables you to prevent a batch edit confirmation message from being displayed.
    */
  var BatchEditConfirmShowing: ASPxClientEvent[ASPxClientTreeListBatchEditConfirmShowingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs when a tree list leaves the batch edit mode.
    */
  var BatchEditEndEditing: ASPxClientEvent[ASPxClientTreeListBatchEditEndEditingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs on the client side before a node is deleted in batch edit mode.
    */
  var BatchEditNodeDeleting: ASPxClientEvent[ASPxClientTreeListBatchEditNodeDeletingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs on the client side before a node is inserted in batch edit mode.
    */
  var BatchEditNodeInserting: ASPxClientEvent[ASPxClientTreeListBatchEditNodeInsertingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs on the client side before a node is recovered in batch edit mode.
    */
  var BatchEditNodeRecovering: ASPxClientEvent[ASPxClientTreeListBatchEditNodeRecoveringEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Enables you to specify whether the node date is valid and provide an error text.
    */
  var BatchEditNodeValidating: ASPxClientEvent[ASPxClientTreeListBatchEditNodeValidatingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs when a tree list switches to batch edit mode.
    */
  var BatchEditStartEditing: ASPxClientEvent[ASPxClientTreeListBatchEditStartEditingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Enables you to provide navigation for editors contained in a templated cell in Batch Edit mode.
    */
  var BatchEditTemplateCellFocused: ASPxClientEvent[ASPxClientTreeListBatchEditTemplateCellFocusedEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientTreeList.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs after a column's width has been changed by an end-user.
    */
  var ColumnResized: ASPxClientEvent[ASPxClientTreeListColumnResizedEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Enables you to prevent columns from being resized.
    */
  var ColumnResizing: ASPxClientEvent[ASPxClientTreeListColumnResizingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Enables you to display a context menu.
    */
  var ContextMenu: ASPxClientEvent[ASPxClientTreeListContextMenuEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs when a custom command button has been clicked.
    */
  var CustomButtonClick: ASPxClientEvent[ASPxClientTreeListCustomButtonEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires after the callback has been processed in the ASPxTreeList.CustomDataCallback event handler.
    */
  var CustomDataCallback: ASPxClientEvent[ASPxClientTreeListCustomDataCallbackEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires after the Customization Window has been closed.
    */
  var CustomizationWindowCloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs after a node drag and drop operation is completed.
    */
  var EndDragNode: ASPxClientEvent[ASPxClientTreeListEndDragNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs on the client side when the focused cell is about to be changed.
    */
  var FocusedCellChanging: ASPxClientEvent[ASPxClientTreeListFocusedCellChangingEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires in response to changing node focus.
    */
  var FocusedNodeChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires on the client when a node is clicked.
    */
  var NodeClick: ASPxClientEvent[ASPxClientTreeListNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires before a node is collapsed.
    */
  var NodeCollapsing: ASPxClientEvent[ASPxClientTreeListNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires on the client when a node is double clicked.
    */
  var NodeDblClick: ASPxClientEvent[ASPxClientTreeListNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires before a node is expanded.
    */
  var NodeExpanding: ASPxClientEvent[ASPxClientTreeListNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires before the focused node has been changed.
    */
  var NodeFocusing: ASPxClientEvent[ASPxClientTreeListNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires after the selection has been changed via end-user interaction.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Occurs before a node is dragged by an end-user.
    */
  var StartDragNode: ASPxClientEvent[ASPxClientTreeListStartDragNodeEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Fires after a toolbar item has been clicked.
    */
  var ToolbarItemClick: ASPxClientEvent[ASPxClientTreeListToolbarItemClickEventHandler[ASPxClientTreeList]] = js.native
  /**
    * Provides access to the batch editing client API.
    */
  var batchEditApi: ASPxClientTreeListBatchEditApi = js.native
  /**
    * Applies the specified filter expression to the tree list.
    * @param filterExpression A string value that specifies the filter expression.
    */
  def ApplyFilter(filterExpression: String): Unit = js.native
  /**
    * Applies a filter specified in the filter row to the ASPxTreeList.
    */
  def ApplyOnClickRowFilter(): Unit = js.native
  /**
    * Applies the specified search panel filter criterion to tree list data.
    * @param value A string value that specifies the filter criterion.
    */
  def ApplySearchPanelFilter(value: String): Unit = js.native
  def AutoFilterByColumn(column: String, `val`: String): Unit = js.native
  def AutoFilterByColumn(column: Double, `val`: String): Unit = js.native
  /**
    * Applies a filter to the specified data column.
    * @param val A string value that specifies the filter expression.
    */
  def AutoFilterByColumn(column: ASPxClientTreeListColumn, `val`: String): Unit = js.native
  /**
    * Cancels all the changes made and switches the ASPxTreeList to browse mode.
    */
  def CancelEdit(): Unit = js.native
  /**
    * Clears the filter expression applied to a client Tree List.
    */
  def ClearFilter(): Unit = js.native
  /**
    * Hides the Filter Control.
    */
  def CloseFilterControl(): Unit = js.native
  /**
    * Collapses all Node.
    */
  def CollapseAll(): Unit = js.native
  /**
    * Collapses the specified node preserving the expanded state of child nodes.
    * @param key A String value that uniquely identifies the node.
    */
  def CollapseNode(key: String): Unit = js.native
  /**
    * Deletes the specified node.
    * @param nodeKey A string value that identifies the node.
    */
  def DeleteNode(nodeKey: String): Unit = js.native
  /**
    * Expands all nodes.
    */
  def ExpandAll(): Unit = js.native
  /**
    * Expands the specified node preserving the collapsed state of child nodes.
    * @param key A String value that uniquely identifies the node.
    */
  def ExpandNode(key: String): Unit = js.native
  /**
    * Exports tree list data to a file in the specified format.
    * @param format An ASPxClientTreeListExportFormat object specifying the export format.
    */
  def ExportTo(format: ASPxClientTreeListExportFormat): Unit = js.native
  /**
    * Sets input focus to the ASPxTreeList.
    */
  def Focus(): Unit = js.native
  def FocusEditor(column: String): Unit = js.native
  def FocusEditor(column: Double): Unit = js.native
  /**
    * Moves focus to the specified editor within the edited node.
    */
  def FocusEditor(column: ASPxClientTreeListColumn): Unit = js.native
  def GetAutoFilterEditor(column: String): js.Any = js.native
  def GetAutoFilterEditor(column: Double): js.Any = js.native
  /**
    * Returns the editor used to edit the value in the auto filter row for the specified data column. An object that represents the editor used to edit the value in the specified auto filter row cell. null (Nothing in Visual Basic) if the editor was not found.
    * @param column An ASPxClientTreeListColumn object that represents the data column within the ASPxTreeList.
    */
  def GetAutoFilterEditor(column: ASPxClientTreeListColumn): js.Any = js.native
  /**
    * Returns the client column which is bound to the specified data source field. An ASPxClientTreeListColumn object that represents the client column bound to the specified data source field.
    * @param fieldName A string value that specifies the name of the data source field to which the column is bound (the column's TreeListDataColumn.FieldName property value).
    */
  def GetColumnByFieldName(fieldName: String): ASPxClientTreeListColumn = js.native
  /**
    * Returns the column located at the specified position within the ASPxTreeList.Columns collection. An ASPxClientTreeListColumn object that represents the client column located at the specified position within the collection.
    * @param index An integer value that identifies the column within the collection (the column's CollectionItem.Index property value).
    */
  def GetColumnByIndex(index: Double): ASPxClientTreeListColumn = js.native
  /**
    * Returns the column with the specified name. An ASPxClientTreeListColumn object that represents the column with the specified name.
    * @param name A string value that specifies the column's name (the column's WebColumnBase.Name property value).
    */
  def GetColumnByName(name: String): ASPxClientTreeListColumn = js.native
  /**
    * Returns the number of columns within the client ASPxTreeList.
    */
  def GetColumnCount(): Double = js.native
  def GetEditValue(column: String): js.Any = js.native
  def GetEditValue(column: Double): js.Any = js.native
  /**
    * Returns the value of the specified edit cell. A String value that represents the value of the edit cell, which corresponds to the specified data column.
    * @param column An ASPxClientTreeListColumn object that represents the data column within the client ASPxTreeList.
    */
  def GetEditValue(column: ASPxClientTreeListColumn): js.Any = js.native
  /**
    * Gets the key value of the node currently being edited.
    */
  def GetEditingNodeKey(): String = js.native
  def GetEditor(column: String): js.Any = js.native
  def GetEditor(column: Double): js.Any = js.native
  /**
    * Returns the editor used to edit the specified column's values. An object that represents the specified column's editor.
    * @param column An ASPxClientTreeListColumn object that represents the data column within the client ASPxTreeList.
    */
  def GetEditor(column: ASPxClientTreeListColumn): js.Any = js.native
  /**
    * Gets information about a focused cell.
    */
  def GetFocusedCell(): ASPxClientTreeListCellInfo = js.native
  /**
    * Returns the focused node's key value.
    */
  def GetFocusedNodeKey(): String = js.native
  /**
    * Returns the current horizontal scroll position of the tree list's content.
    */
  def GetHorizontalScrollPosition(): Double = js.native
  /**
    * Returns an HTML table row that represents the specified node. An object that represents the HTML table row, which corresponds to the specified node.
    * @param nodeKey A string value that identifies the node.
    */
  def GetNodeHtmlElement(nodeKey: String): js.Any = js.native
  /**
    * Returns the specified node's state. A String value that represents the specified node's state.
    * @param nodeKey A String value that identifies the node.
    */
  def GetNodeState(nodeKey: String): String = js.native
  /**
    * Obtains specified data source field values within a specified node, and submits them to the specified JavaScript function.
    * @param nodeKey A string value that identifies the node.
    * @param fieldNames The names of data source fields whose values within the specified node are returned.
    * @param onCallback A ASPxClientTreeListValuesCallback object that represents the JavaScript function which receives the list of values as a parameter.
    */
  def GetNodeValues(nodeKey: String, fieldNames: String, onCallback: ASPxClientTreeListValuesCallback): Unit = js.native
  def GetNodeValues(nodeKey: String, fieldNames: js.Array[String], onCallback: ASPxClientTreeListValuesCallback): Unit = js.native
  /**
    * Gets the number of pages to which the ASPxTreeList's data is divided.
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
    * Obtains specified data source field values within selected nodes, and submits them to the specified JavaScript function.
    * @param fieldNames The names of data source fields whose values within selected nodes are returned.
    * @param onCallback A ASPxClientTreeListValuesCallback object that represents the JavaScript function which receives the list of values as a parameter.
    * @param visibleOnly true to return values within selected nodes that are displayed within the current page; false to return values within all selected nodes.
    */
  def GetSelectedNodeValues(fieldNames: String, onCallback: ASPxClientTreeListValuesCallback): Unit = js.native
  def GetSelectedNodeValues(fieldNames: String, onCallback: ASPxClientTreeListValuesCallback, visibleOnly: Boolean): Unit = js.native
  def GetSelectedNodeValues(fieldNames: js.Array[String], onCallback: ASPxClientTreeListValuesCallback): Unit = js.native
  def GetSelectedNodeValues(fieldNames: js.Array[String], onCallback: ASPxClientTreeListValuesCallback, visibleOnly: Boolean): Unit = js.native
  /**
    * Returns a toolbar specified by its index. An ASPxClientMenu object that is the toolbar located at the specified index within the control's ASPxTreeList.Toolbars collection.
    * @param index An integer value specifying the zero-based index of the toolbar object to retrieve.
    */
  def GetToolbar(index: Double): ASPxClientMenu = js.native
  /**
    * Returns a toolbar specified by its name. An ASPxClientMenu object that is the toolbar with the specified name.
    * @param name A string value specifying the toolbar name.
    */
  def GetToolbarByName(name: String): ASPxClientMenu = js.native
  /**
    * Returns the current vertical scroll position of the tree list's content.
    */
  def GetVerticalScrollPosition(): Double = js.native
  /**
    * Returns the number of visible columns within the client ASPxTreeList.
    */
  def GetVisibleColumnCount(): Double = js.native
  /**
    * Obtains key values of nodes that are displayed within the current page.
    */
  def GetVisibleNodeKeys(): js.Array[String] = js.native
  /**
    * Obtains specified data source field values within nodes that are displayed within the current page, and submits them to the specified JavaScript function.
    * @param fieldNames The names of data source fields whose values within visible nodes are returned.
    * @param onCallback A ASPxClientTreeListValuesCallback object that represents the JavaScript function which receives the list of values as a parameter.
    */
  def GetVisibleNodeValues(fieldNames: String, onCallback: ASPxClientTreeListValuesCallback): Unit = js.native
  def GetVisibleNodeValues(fieldNames: js.Array[String], onCallback: ASPxClientTreeListValuesCallback): Unit = js.native
  /**
    * Obtains key values of selected nodes that are displayed within the current page.
    */
  def GetVisibleSelectedNodeKeys(): js.Array[String] = js.native
  /**
    * Selects the specified page.
    * @param index An integer value that specifies the active page's index.
    */
  def GoToPage(index: Double): Unit = js.native
  /**
    * Closes the Customization Window.
    */
  def HideCustomizationWindow(): Unit = js.native
  /**
    * Indicates whether the Customization Window is displayed.
    */
  def IsCustomizationWindowVisible(): Boolean = js.native
  /**
    * Indicates whether the ASPxTreeList is in edit mode.
    */
  def IsEditing(): Boolean = js.native
  /**
    * Indicates whether the specified node is selected. true if the specified node is selected; false if the specified node isn't selected. null if the specified node was not found on the client.
    * @param nodeKey A String value that identifies the node by its key value.
    */
  def IsNodeSelected(nodeKey: String): Boolean | Null = js.native
  /**
    * Scrolls the tree list so that the specified node becomes visible.
    * @param nodeKey An integer value that specifies the node index within the tree list's client item list.
    */
  def MakeNodeVisible(nodeKey: String): Unit = js.native
  /**
    * Moves the specified node to a new position.
    * @param nodeKey A string value that identifies the target node by its key value.
    * @param parentNodeKey A string value that identifies the node to whose child collection the target node is moved. An empty string to display the target node within the root.
    */
  def MoveNode(nodeKey: String, parentNodeKey: String): Unit = js.native
  /**
    * Activates the next page.
    */
  def NextPage(): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxTreeList.CustomCallback event, passing it the specified argument.
    * @param args A string value that represents any information that needs to be sent to the server-side ASPxTreeList.CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: String): Unit = js.native
  def PerformCallback(args: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /** @deprecated Use the PerformCallback method instead */
  /**
    * Sends a callback to the server and generates the server-side ASPxTreeList.CustomCallback event, passing it the specified argument.
    * @param arg A string value that represents any information that needs to be sent to the server-side ASPxTreeList.CustomCallback event.
    */
  def PerformCustomCallback(arg: String): Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side ASPxTreeList.CustomDataCallback event passing it the specified argument.
    * @param arg A string value that represents any information that needs to be sent to the server-side ASPxTreeList.CustomDataCallback event.
    */
  def PerformCustomDataCallback(arg: String): Unit = js.native
  /**
    * Activates the previous page.
    */
  def PrevPage(): Unit = js.native
  /**
    * Updates the tree list data.
    */
  def Refresh(): Unit = js.native
  /**
    * Selects or deselects the specified node.
    * @param nodeKey A string value that identifies the node.
    * @param state true to select the node; otherwise, false.
    */
  def SelectNode(nodeKey: String): Unit = js.native
  def SelectNode(nodeKey: String, state: Boolean): Unit = js.native
  def SetEditValue(column: String, value: js.Any): Unit = js.native
  def SetEditValue(column: Double, value: js.Any): Unit = js.native
  /**
    * Sets the value of the specified edit cell.
    * @param value An object that specifies the edit cell's new value.
    */
  def SetEditValue(column: ASPxClientTreeListColumn, value: js.Any): Unit = js.native
  /**
    * Enables or disables the current filter.
    * @param isFilterEnabled true to enable the current filter; otherwise, false.
    */
  def SetFilterEnabled(isFilterEnabled: Boolean): Unit = js.native
  /**
    * Focuses a specified cell.
    * @param nodeKey An integer value that specifies a node key.
    * @param columnIndex A zero-based index that identifies the column in the column collection (the column's CollectionItem.Index property value).
    */
  def SetFocusedCell(nodeKey: String, columnIndex: Double): Unit = js.native
  /**
    * Moves focus to the specified node.
    * @param key A String value that uniquely identifies the node.
    */
  def SetFocusedNodeKey(key: String): Unit = js.native
  /**
    * Specifies the horizontal scroll position for the tree list's content.
    * @param position An integer value specifying the horizontal scroll position.
    */
  def SetHorizontalScrollPosition(position: Double): Unit = js.native
  /**
    * Specifies a custom editor for the search panel on the client side.
    * @param editor An ASPxClientEdit object representing a custom editor.
    */
  def SetSearchPanelCustomEditor(editor: ASPxClientEdit): Unit = js.native
  /**
    * Specifies the vertical scroll position for the tree list's content.
    * @param position An integer value specifying the vertical scroll position.
    */
  def SetVerticalScrollPosition(position: Double): Unit = js.native
  /**
    * Invokes the Customization Window and displays it over the specified HTML element.
    * @param htmlElement An object that specifies the HTML element relative to whose position the customization window is invoked.
    */
  def ShowCustomizationWindow(): Unit = js.native
  def ShowCustomizationWindow(htmlElement: js.Any): Unit = js.native
  /**
    * Displays the Filter Control.
    */
  def ShowFilterControl(): Unit = js.native
  def SortBy(columnIndex: String): Unit = js.native
  def SortBy(columnIndex: String, sortOrder: String): Unit = js.native
  def SortBy(columnIndex: String, sortOrder: String, reset: Boolean): Unit = js.native
  /**
    * Sorts data by the specified data column's values.
    * @param sortOrder A string value that specifies the column's sort order ('ASC', 'DESC' or 'NONE').
    * @param reset true to clear any previous sorting; otherwise, false.
    */
  def SortBy(columnIndex: Double): Unit = js.native
  def SortBy(columnIndex: Double, sortOrder: String): Unit = js.native
  def SortBy(columnIndex: Double, sortOrder: String, reset: Boolean): Unit = js.native
  def SortBy(columnIndex: ASPxClientTreeListColumn): Unit = js.native
  def SortBy(columnIndex: ASPxClientTreeListColumn, sortOrder: String): Unit = js.native
  def SortBy(columnIndex: ASPxClientTreeListColumn, sortOrder: String, reset: Boolean): Unit = js.native
  /**
    * Switches the ASPxTreeList to edit mode.
    * @param nodeKey A string value that identifies the node by its key value.
    */
  def StartEdit(nodeKey: String): Unit = js.native
  /**
    * Switches the ASPxTreeList to edit mode and allows new node values to be edited.
    * @param parentNodeKey A String value that identifies the parent node, which owns a new node.
    */
  def StartEditNewNode(): Unit = js.native
  def StartEditNewNode(parentNodeKey: String): Unit = js.native
  /**
    * Saves all the changes made and switches the ASPxTreeList to browse mode.
    */
  def UpdateEdit(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientTreeList")
@js.native
object ASPxClientTreeList extends js.Object {
  /**
    * Converts the specified object to the ASPxClientTreeList type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientTreeList = js.native
}

