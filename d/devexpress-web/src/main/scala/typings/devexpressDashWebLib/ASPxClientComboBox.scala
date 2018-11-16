package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represent the client-side equivalent of the ASPxComboBox control.
 */
@js.native
trait ASPxClientComboBox extends ASPxClientDropDownEditBase {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientComboBox]] = js.native
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientComboBox.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientComboBox]] = js.native
  /**
       * Occurs on the client side after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientComboBox]] = js.native
  /**
       * Occurs on the client side after a different item in the list has been selected (focus has been moved from one item to another).
       */
  var SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientComboBox]] = js.native
  /**
       * Adds a new item to the editor specifying the item's display text and returns the index of the added item.
       * @param text A string value specifying the item's display text.
       */
  def AddItem(text: java.lang.String): scala.Double = js.native
  /**
       * Adds a new item to the editor specifying the item's display text and associated value, and returns the index of the added item.
       * @param text A string value specifying the item's display text.
       * @param value An object specifying the value associated with the item.
       */
  def AddItem(text: java.lang.String, value: js.Object): scala.Double = js.native
  /**
       * Adds a new item to the editor specifying the item's display text, associated value and displayed image, and returns the index of the added item.
       * @param text A string value specifying the item's display text.
       * @param value An object specifying the value associated with the item.
       * @param imageUrl A string value specifying the path to the image displayed by the item.
       */
  def AddItem(text: java.lang.String, value: js.Object, imageUrl: java.lang.String): scala.Double = js.native
  /**
       * Adds a new item to the editor, specifying the item's display text, and returns the index of the added item.
       * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
       */
  def AddItem(texts: js.Array[java.lang.String]): scala.Double = js.native
  /**
       * Adds a new item to the end of the control's items collection.
       * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
       * @param value An object that represents the item's associated value.
       */
  def AddItem(texts: js.Array[java.lang.String], value: js.Object): scala.Double = js.native
  /**
       * Adds a new item to the end of the control's items collection.
       * @param texts An array of strings that specifies the item's display text. Array element positions relate to the positions of the corresponding columns within the editor's Columns collection.
       * @param value An object that represents the item's associated value.
       * @param imageUrl A string value specifying the path to the image displayed by the item.
       */
  def AddItem(texts: js.Array[java.lang.String], value: js.Object, imageUrl: java.lang.String): scala.Double = js.native
  /**
       * Sets the CSS class for a combo box item specified by its index.
       * @param index An integer value specifying the zero-based index of the item.
       * @param className A string value specifying the CSS class name.
       */
  def AddItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
       * Sets the CSS class for a combo box item's text cell specified by its index.
       * @param itemIndex An integer value specifying the zero-based index of the item.
       * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
       * @param className A string value specifying the CSS class name.
       */
  def AddItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
       * Prevents the client combobox editor from being rendered until the EndUpdate method is called.
       */
  def BeginUpdate(): scala.Unit = js.native
  /**
       * Removes all items from the client combo box editor.
       */
  def ClearItems(): scala.Unit = js.native
  /**
       * Re-enables editor render operations after a call to the BeginUpdate method and forces an immediate re-rendering.
       */
  def EndUpdate(): scala.Unit = js.native
  /**
       * Determines whether the drop-down content is loaded; if not - loads the content.
       * @param callbackFunction An object that is the JavaScript function that receives the callback data as a parameter. The function is performed after the combo box content is loaded.
       */
  def EnsureDropDownLoaded(callbackFunction: js.Object): scala.Unit = js.native
  /**
       * Returns a combo box item by its text.
       * @param text A string that specifies the item's text.
       */
  def FindItemByText(text: java.lang.String): ASPxClientListEditItem = js.native
  /**
       * Returns a combo box item by its value.
       * @param value An object that specifies the item's value.
       */
  def FindItemByValue(value: js.Object): ASPxClientListEditItem = js.native
  /**
       * Returns an item specified by its index within the combo box editor's item collection.
       * @param index An integer value specifying the zero-based index of the item to search for.
       */
  def GetItem(index: scala.Double): ASPxClientListEditItem = js.native
  /**
       * Gets the number of items contained in the editor's item collection.
       */
  def GetItemCount(): scala.Double = js.native
  /**
       * Returns the index of the selected item within the combo box editor.
       */
  def GetSelectedIndex(): scala.Double = js.native
  /**
       * Returns the combo box editor's selected item.
       */
  def GetSelectedItem(): ASPxClientListEditItem = js.native
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
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side Callback event.
       */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
       * Removes an item specified by its index from the client list editor.
       * @param index An integer value representing the index of the list item to be removed.
       */
  def RemoveItem(index: scala.Double): scala.Unit = js.native
  /**
       * Removes the CSS class from a combo box item specified by its index.
       * @param index An integer value specifying the zero-based index of the item.
       * @param className A string value specifying the CSS class name.
       */
  def RemoveItemCssClass(index: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
       * Removes the CSS class from a combo box item's text cell specified by its index.
       * @param itemIndex An integer value specifying the zero-based index of the item.
       * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
       * @param className A string value specifying the CSS class name.
       */
  def RemoveItemTextCellCssClass(itemIndex: scala.Double, textCellIndex: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
       * Defines the HTML content for the specified combo box item.
       * @param index An integer value specifying the zero-based index of the item.
       * @param html A string value that is the HTML code defining the content of the combo box item.
       */
  def SetItemHtml(index: scala.Double, html: java.lang.String): scala.Unit = js.native
  /**
       * Defines the HTML content for the specified combo box item's text cell.
       * @param itemIndex An integer value specifying the zero-based index of the item.
       * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
       * @param html A string value that is the HTML code defining the content of the combo box item.
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
       * Sets the tooltip text for the combo box editor's item specified by its index.
       * @param index An integer value specifying the zero-based index of the item.
       * @param tooltip A string value specifying the tooltip text.
       */
  def SetItemTooltip(index: scala.Double, tooltip: java.lang.String): scala.Unit = js.native
  /**
       * Sets the combobox editor's selected item specified by its index.
       * @param index An integer value specifying the zero-based index of the item to select.
       */
  def SetSelectedIndex(index: scala.Double): scala.Unit = js.native
  /**
       * Sets the list editor's selected item.
       * @param item An ASPxClientListEditItem object that specifies the item to select.
       */
  def SetSelectedItem(item: ASPxClientListEditItem): scala.Unit = js.native
}

