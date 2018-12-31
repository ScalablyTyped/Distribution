package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxListBox control.
  */
@js.native
trait ASPxClientListBox extends ASPxClientListEdit {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientListBox]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientListBox.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientListBox]] = js.native
  /**
    * Enables you to highlight the filtered items.
    */
  var CustomHighlighting: ASPxClientEvent[ASPxClientListEditCustomHighlightingEventHandler[ASPxClientListBox]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientListBox]] = js.native
  /**
    * Occurs on the client when the editor's item is double clicked.
    */
  var ItemDoubleClick: ASPxClientEvent[ASPxClientEventHandler[ASPxClientListBox]] = js.native
  /**
    * Fires before the filtering is executed.
    */
  var ItemFiltering: ASPxClientEvent[ASPxClientListEditItemFilteringEventHandler[ASPxClientListBox]] = js.native
  /**
    * Occurs on the client side when an end-user presses a key while the editor has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientListBox]] = js.native
  /**
    * Occurs on the client side when an end-user presses and releases a key while the editor has focus.
    */
  var KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientListBox]] = js.native
  /**
    * Occurs on the client side when an end-user releases a pressed key while the editor has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientListBox]] = js.native
  /**
    * Occurs on the client side after a different item in the list box has been selected (focus has been moved from one item to another).
    */
  @JSName("SelectedIndexChanged")
  var SelectedIndexChanged_ASPxClientListBox: ASPxClientEvent[ASPxClientListEditItemSelectedChangedEventHandler[ASPxClientListBox]] = js.native
  /**
    * Adds a new item to the editor, specifying the item's display text, and returns the index of the added item.
    * @param text A string value specifying the item's display text.
    */
  def AddItem(text: java.lang.String): scala.Double = js.native
  /**
    * Adds a new item to the editor, specifying the item's display text and associated value, and returns the index of the added item.
    * @param text A string value specifying the item's display text.
    * @param value An object specifying the value associated with the item.
    */
  def AddItem(text: java.lang.String, value: js.Object): scala.Double = js.native
  /**
    * Adds a new item to the editor, specifying the item's display text, associated value and displayed image, and returns the index of the added item.
    * @param text A string value specifying the item's display text.
    * @param value An object specifying the value associated with the item.
    * @param imageUrl A string value specifying the path to the image displayed by the item.
    */
  def AddItem(text: java.lang.String, value: js.Object, imageUrl: java.lang.String): scala.Double = js.native
  /**
    * Adds a new item to the end of the editor's items collection, specifying the item's display text, and returns the index of the added item.
    * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
    */
  def AddItem(texts: js.Array[java.lang.String]): scala.Double = js.native
  /**
    * Adds a new item to the end of the control's items collection.
    * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of corresponding columns within the editor's Columns collection.
    * @param value An object that represents the item's associated value.
    */
  def AddItem(texts: js.Array[java.lang.String], value: js.Object): scala.Double = js.native
  /**
    * Adds a new item to the end of the editor's items collection, specifying the item's display text, associated value and displayed image, and returns the index of the added item.
    * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
    * @param value An object that represents the item's associated value.
    * @param imageUrl A String value specifying the path to the image displayed by the item.
    */
  def AddItem(texts: js.Array[java.lang.String], value: js.Object, imageUrl: java.lang.String): scala.Double = js.native
  /**
    * Sets the CSS class for a list box item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param className A string value specifying the CSS class name.
    */
  def AddItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Sets the CSS class for a list box item's text cell specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param className A string value specifying the CSS class name.
    */
  def AddItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Prevents the client list box editor from being rendered until the EndUpdate method is called.
    */
  def BeginUpdate(): scala.Unit = js.native
  /**
    * Removes all items from the client list box editor.
    */
  def ClearItems(): scala.Unit = js.native
  /**
    * Re-enables editor render operations after a call to the BeginUpdate method, and forces an immediate re-rendering.
    */
  def EndUpdate(): scala.Unit = js.native
  /**
    * Returns a list box item by its text.
    * @param text A string that specifies the item's text.
    */
  def FindItemByText(text: java.lang.String): ASPxClientListEditItem = js.native
  /**
    * Returns a list box item by its value.
    * @param value An object that specifies the item's value.
    */
  def FindItemByValue(value: js.Object): ASPxClientListEditItem = js.native
  /**
    * Returns an item specified by its index within the list box editor's item collection.
    * @param index An integer value specifying the zero-based index of the item to search for.
    */
  def GetItem(index: scala.Double): ASPxClientListEditItem = js.native
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  def GetItemCount(): scala.Double = js.native
  /**
    * Returns an array of the list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[scala.Double] = js.native
  /**
    * Returns an array of the list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem] = js.native
  /**
    * Returns an array of the list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[js.Object] = js.native
  /**
    * Initializes the ASPxClientListBox client object when its parent container becomes visible dynamically, on the client side.
    */
  def InitOnContainerMadeVisible(): scala.Unit = js.native
  /**
    * Inserts a new item specified by its display text into the editor's item collection, at the position specified.
    * @param index An integer value representing the zero-based index of the position where the item should be inserted.
    * @param text A string value specifying the item's display text.
    */
  def InsertItem(index: scala.Double, text: java.lang.String): scala.Unit = js.native
  /**
    * Inserts a new item specified by its display text and associated value into the editor's item collection, at the position specified.
    * @param index An integer value representing the zero-based index of the position where the item should be inserted.
    * @param text A string value specifying the item's display text.
    * @param value An object specifying the value associated with the item.
    */
  def InsertItem(index: scala.Double, text: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
    * Inserts a new item specified by its display text, associated value and displayed image into the editor's item collection, at the position specified.
    * @param index An integer value representing the zero-based index of the position where the item should be inserted.
    * @param text A string value specifying the item's display text.
    * @param value An object specifying the value associated with the item.
    * @param imageUrl A string value specifying the path to the image displayed by the item.
    */
  def InsertItem(index: scala.Double, text: java.lang.String, value: js.Object, imageUrl: java.lang.String): scala.Unit = js.native
  /**
    * Adds a new item to the control's items collection at the specified index.
    * @param index An integer value that represents the index position.
    * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
    */
  def InsertItem(index: scala.Double, texts: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Adds a new item to the control's items collection at the specified index.
    * @param index An integer value that represents the index position.
    * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
    * @param value An object that represents the item's associated value.
    */
  def InsertItem(index: scala.Double, texts: js.Array[java.lang.String], value: js.Object): scala.Unit = js.native
  /**
    * Adds a new item to the control's items collection at the specified index.
    * @param index An integer value that represents the index position.
    * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
    * @param value An object that represents the item's associated value.
    * @param imageUrl A String value specifying the path to the image displayed by the item.
    */
  def InsertItem(
    index: scala.Double,
    texts: js.Array[java.lang.String],
    value: js.Object,
    imageUrl: java.lang.String
  ): scala.Unit = js.native
  /**
    * Scrolls the editor's item list, so that the specified item becomes visible.
    * @param index An integer value that specifies the item's index within the editor's client item list.
    */
  def MakeItemVisible(index: scala.Double): scala.Unit = js.native
  /**
    * Sends a callback to the server, and generates the server-side Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side Callback event.
    */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
    * Removes an item specified by its index from the client list editor.
    * @param index An integer value representing the index of the list item to be removed.
    */
  def RemoveItem(index: scala.Double): scala.Unit = js.native
  /**
    * Removes the CSS class from a list box item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param className A string value specifying the CSS class name.
    */
  def RemoveItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Removes the CSS class from a list box item's text cell specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param className A string value specifying the CSS class name.
    */
  def RemoveItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Selects all list box items.
    */
  def SelectAll(): scala.Unit = js.native
  /**
    * Selects the items with the specified indices within a list box.
    * @param indices An array of integer values that represent the items indices.
    */
  def SelectIndices(indices: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Selects the specified items within a list box.
    * @param items An array of ASPxClientListEditItem objects that represent the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit = js.native
  /**
    * Select the items with the specified values within a list box.
    * @param values An array of Object[] objects that represent the item's values.
    */
  def SelectValues(values: js.Array[js.Object]): scala.Unit = js.native
  /**
    * Defines the HTML content for the specified list box item.
    * @param index An integer value specifying the zero-based index of the item.
    * @param html A string value that is the HTML code defining the content of the list box item.
    */
  def SetItemHtml(index: scala.Double, html: java.lang.String): scala.Unit = js.native
  /**
    * Defines the HTML content for the specified list box item's text cell.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param html A string value that is the HTML code defining the content of the list box item.
    */
  def SetItemTextCellHtml(itemIndex: scala.Double, textCellIndex: scala.Double, html: java.lang.String): scala.Unit = js.native
  /**
    * Sets the tooltip text for the text cell of the editor's item specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param tooltip A string value specifying the tooltip text.
    */
  def SetItemTextCellTooltip(itemIndex: scala.Double, textCellIndex: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  /**
    * Sets the tooltip text for the list box editor's item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param tooltip A string value specifying the tooltip text.
    */
  def SetItemTooltip(index: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  /**
    * Unselects all list box items.
    */
  def UnselectAll(): scala.Unit = js.native
  /**
    * Unselects an array of the list box items with the specified indices.
    * @param indices An array of integer values that represent the indices.
    */
  def UnselectIndices(indices: js.Array[scala.Double]): scala.Unit = js.native
  /**
    * Unselects an array of the specified list box items.
    * @param items An array of ASPxClientListEditItem objects that represent the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): scala.Unit = js.native
  /**
    * Unselects an array of the list box items with the specified values.
    * @param values An array of Object[] objects that represent the values.
    */
  def UnselectValues(values: js.Array[js.Object]): scala.Unit = js.native
}

