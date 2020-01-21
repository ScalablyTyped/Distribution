package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxListBox control.
  */
@JSGlobal("ASPxClientListBox")
@js.native
class ASPxClientListBox () extends ASPxClientListEdit {
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
    * Adds a new item to the editor, specifying the item's display text, associated value and displayed image, and returns the index of the added item. An integer value that represents the added item's index.
    * @param text A string value specifying the item's display text.
    * @param value An object specifying the value associated with the item.
    * @param imageUrl A string value specifying the path to the image displayed by the item.
    */
  def AddItem(text: String): Double = js.native
  def AddItem(text: String, value: js.Any): Double = js.native
  def AddItem(text: String, value: js.Any, imageUrl: String): Double = js.native
  def AddItem(text: js.Array[String]): Double = js.native
  def AddItem(text: js.Array[String], value: js.Any): Double = js.native
  def AddItem(text: js.Array[String], value: js.Any, imageUrl: String): Double = js.native
  /**
    * Sets the CSS class for a list box item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param className A string value specifying the CSS class name.
    */
  def AddItemCssClass(index: Double, className: String): Unit = js.native
  /**
    * Sets the CSS class for a list box item's text cell specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param className A string value specifying the CSS class name.
    */
  def AddItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  /**
    * Prevents the client list box editor from being rendered until the ASPxClientListBox.EndUpdate method is called.
    */
  def BeginUpdate(): Unit = js.native
  /**
    * Removes all items from the client list box editor.
    */
  def ClearItems(): Unit = js.native
  /**
    * Re-enables editor render operations after a call to the ASPxClientListBox.BeginUpdate method, and forces an immediate re-rendering.
    */
  def EndUpdate(): Unit = js.native
  /**
    * Returns a list box item by its text. A ASPxClientListEditItem object that represents the list box item. null (Nothing in Visual Basic) if the item was not found.
    * @param text A string that specifies the item's text.
    */
  def FindItemByText(text: String): ASPxClientListEditItem = js.native
  /**
    * Returns a list box item by its value. A ASPxClientListEditItem object that represents the list box item. null (Nothing in Visual Basic) if the item was not found.
    * @param value An object that specifies the item's value.
    */
  def FindItemByValue(value: js.Any): ASPxClientListEditItem = js.native
  /**
    * Returns an item specified by its index within the list box editor's item collection. An ASPxClientListEditItem object representing the collection item found.
    * @param index An integer value specifying the zero-based index of the item to search for.
    */
  def GetItem(index: Double): ASPxClientListEditItem = js.native
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  def GetItemCount(): Double = js.native
  /**
    * Returns an array of the list editor's selected items indices.
    */
  def GetSelectedIndices(): js.Array[Double] = js.native
  /**
    * Returns an array of the list editor's selected items.
    */
  def GetSelectedItems(): js.Array[ASPxClientListEditItem] = js.native
  /**
    * Returns an array of the list editor's selected items values.
    */
  def GetSelectedValues(): js.Array[_] = js.native
  /** @deprecated Use the AdjustControl method instead. */
  /**
    * Initializes the ASPxClientListBox client object when its parent container becomes visible dynamically, on the client side.
    */
  def InitOnContainerMadeVisible(): Unit = js.native
  /**
    * Adds a new item to the control's items collection at the specified index.
    * @param index An integer value that represents the index position.
    * @param value An object that represents the item's associated value.
    * @param imageUrl A String value specifying the path to the image displayed by the item.
    */
  def InsertItem(index: Double, text: String): Unit = js.native
  def InsertItem(index: Double, text: String, value: js.Any): Unit = js.native
  def InsertItem(index: Double, text: String, value: js.Any, imageUrl: String): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String]): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String], value: js.Any): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String], value: js.Any, imageUrl: String): Unit = js.native
  /**
    * Scrolls the editor's item list, so that the specified item becomes visible.
    * @param index An integer value that specifies the item's index within the editor's client item list.
    */
  def MakeItemVisible(index: Double): Unit = js.native
  /**
    * Sends a callback to the server, and generates the server-side ASPxListBox.Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxListBox.Callback event.
    */
  def PerformCallback(parameter: String): Unit = js.native
  /**
    * Removes an item specified by its index from the client list editor.
    * @param index An integer value representing the index of the list item to be removed.
    */
  def RemoveItem(index: Double): Unit = js.native
  /**
    * Removes the CSS class from a list box item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param className A string value specifying the CSS class name.
    */
  def RemoveItemCssClass(index: Double, className: String): Unit = js.native
  /**
    * Removes the CSS class from a list box item's text cell specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param className A string value specifying the CSS class name.
    */
  def RemoveItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  /**
    * Selects all list box items.
    */
  def SelectAll(): Unit = js.native
  /**
    * Selects the items with the specified indices within a list box.
    * @param indices An array of integer values that represent the items indices.
    */
  def SelectIndices(indices: js.Array[Double]): Unit = js.native
  /**
    * Selects the specified items within a list box.
    * @param items An array of ASPxClientListEditItem objects that represent the items.
    */
  def SelectItems(items: js.Array[ASPxClientListEditItem]): Unit = js.native
  /**
    * Select the items with the specified values within a list box.
    * @param values An array of Object[] objects that represent the item's values.
    */
  def SelectValues(values: js.Array[_]): Unit = js.native
  def SetItemAttribute(index: Double, attributeName: String, attributeValue: String): Unit = js.native
  /**
    * Defines the HTML content for the specified list box item.
    * @param index An integer value specifying the zero-based index of the item.
    * @param html A string value that is the HTML code defining the content of the list box item.
    */
  def SetItemHtml(index: Double, html: String): Unit = js.native
  def SetItemTextCellAttribute(itemIndex: Double, textCellIndex: Double, attributeName: String, attributeValue: String): Unit = js.native
  /**
    * Defines the HTML content for the specified list box item's text cell.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param html A string value that is the HTML code defining the content of the list box item.
    */
  def SetItemTextCellHtml(itemIndex: Double, textCellIndex: Double, html: String): Unit = js.native
  /**
    * Sets the tooltip text for the text cell of the editor's item specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param tooltip A string value specifying the tooltip text.
    */
  def SetItemTextCellTooltip(itemIndex: Double, textCellIndex: Double, tooltip: String): Unit = js.native
  /**
    * Sets the tooltip text for the list box editor's item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param tooltip A string value specifying the tooltip text.
    */
  def SetItemTooltip(index: Double, tooltip: String): Unit = js.native
  /**
    * Unselects all list box items.
    */
  def UnselectAll(): Unit = js.native
  /**
    * Unselects an array of the list box items with the specified indices.
    * @param indices An array of integer values that represent the indices.
    */
  def UnselectIndices(indices: js.Array[Double]): Unit = js.native
  /**
    * Unselects an array of the specified list box items.
    * @param items An array of ASPxClientListEditItem objects that represent the items.
    */
  def UnselectItems(items: js.Array[ASPxClientListEditItem]): Unit = js.native
  /**
    * Unselects an array of the list box items with the specified values.
    * @param values An array of Object[] objects that represent the values.
    */
  def UnselectValues(values: js.Array[_]): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientListBox")
@js.native
object ASPxClientListBox extends js.Object {
  /**
    * Converts the specified object to the ASPxClientListBox type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientListBox = js.native
}

