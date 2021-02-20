package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxComboBox control.
  */
@js.native
trait ASPxClientComboBox extends ASPxClientDropDownEditBase {
  
  /**
    * Adds a new item to the end of the control's items collection. An integer value representing the position at which a new item was added.
    * @param text Specifies the item's text.
    * @param value An object that represents the item's associated value.
    * @param imageUrl A string value specifying the path to the image displayed by the item.
    */
  def AddItem(text: String): Double = js.native
  def AddItem(text: String, value: js.UndefOr[scala.Nothing], imageUrl: String): Double = js.native
  def AddItem(text: String, value: js.Any): Double = js.native
  def AddItem(text: String, value: js.Any, imageUrl: String): Double = js.native
  def AddItem(text: js.Array[String]): Double = js.native
  def AddItem(text: js.Array[String], value: js.UndefOr[scala.Nothing], imageUrl: String): Double = js.native
  def AddItem(text: js.Array[String], value: js.Any): Double = js.native
  def AddItem(text: js.Array[String], value: js.Any, imageUrl: String): Double = js.native
  
  /**
    * Sets the CSS class for a combo box item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param className A string value specifying the CSS class name.
    */
  def AddItemCssClass(index: Double, className: String): Unit = js.native
  
  /**
    * Sets the CSS class for a combo box item's text cell specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param className A string value specifying the CSS class name.
    */
  def AddItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientComboBox]] = js.native
  
  /**
    * Prevents the client combobox editor from being rendered until the ASPxClientComboBox.EndUpdate method is called.
    */
  def BeginUpdate(): Unit = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientComboBox.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientComboBox]] = js.native
  
  /**
    * Removes all items from the client combo box editor.
    */
  def ClearItems(): Unit = js.native
  
  /**
    * Enables you to highlight the filtered items.
    */
  var CustomHighlighting: ASPxClientEvent[ASPxClientListEditCustomHighlightingEventHandler[ASPxClientComboBox]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientComboBox]] = js.native
  
  /**
    * Re-enables editor render operations after a call to the ASPxClientComboBox.BeginUpdate method and forces an immediate re-rendering.
    */
  def EndUpdate(): Unit = js.native
  
  /**
    * Determines whether the drop-down content is loaded; if not - loads the content.
    * @param callbackFunction An object that is the JavaScript function that receives the callback data as a parameter. The function is performed after the combo box content is loaded.
    */
  def EnsureDropDownLoaded(callbackFunction: js.Any): Unit = js.native
  
  /**
    * Returns a combo box item by its text. A ASPxClientListEditItem object that represents the combo box item. null (Nothing in Visual Basic) if the item was not found.
    * @param text A string that specifies the item's text.
    */
  def FindItemByText(text: String): ASPxClientListEditItem = js.native
  
  /**
    * Returns a combo box item by its value. A ASPxClientListEditItem object that represents the combo box item. null (Nothing in Visual Basic) if the item was not found.
    * @param value An object that specifies the item's value.
    */
  def FindItemByValue(value: js.Any): ASPxClientListEditItem = js.native
  
  /**
    * Returns an item specified by its index within the combo box editor's item collection. An ASPxClientListEditItem object representing the collection item found.
    * @param index An integer value specifying the zero-based index of the item to search for.
    */
  def GetItem(index: Double): ASPxClientListEditItem = js.native
  
  /**
    * Gets the number of items contained in the editor's item collection.
    */
  def GetItemCount(): Double = js.native
  
  /**
    * Returns the index of the selected item within the combo box editor.
    */
  def GetSelectedIndex(): Double = js.native
  
  /**
    * Returns the combo box editor's selected item.
    */
  def GetSelectedItem(): ASPxClientListEditItem = js.native
  
  /**
    * Adds a new item to the control's items collection at the specified index.
    * @param index An integer value that represents the index position.
    * @param value An object that represents the item's associated value.
    * @param imageUrl A String value specifying the path to the image displayed by the item.
    */
  def InsertItem(index: Double, text: String): Unit = js.native
  def InsertItem(index: Double, text: String, value: js.UndefOr[scala.Nothing], imageUrl: String): Unit = js.native
  def InsertItem(index: Double, text: String, value: js.Any): Unit = js.native
  def InsertItem(index: Double, text: String, value: js.Any, imageUrl: String): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String]): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String], value: js.UndefOr[scala.Nothing], imageUrl: String): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String], value: js.Any): Unit = js.native
  def InsertItem(index: Double, text: js.Array[String], value: js.Any, imageUrl: String): Unit = js.native
  
  /**
    * Fires before the filtering is executed.
    */
  var ItemFiltering: ASPxClientEvent[ASPxClientListEditItemFilteringEventHandler[ASPxClientComboBox]] = js.native
  
  /**
    * Scrolls the editor's item list, so that the specified item becomes visible.
    * @param index An integer value that specifies the item's index within the editor's client item list.
    */
  def MakeItemVisible(index: Double): Unit = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxAutoCompleteBoxBase.Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxAutoCompleteBoxBase.Callback event.
    */
  def PerformCallback(parameter: String): Unit = js.native
  
  /**
    * Removes an item specified by its index from the client list editor.
    * @param index An integer value representing the index of the list item to be removed.
    */
  def RemoveItem(index: Double): Unit = js.native
  
  /**
    * Removes the CSS class from a combo box item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param className A string value specifying the CSS class name.
    */
  def RemoveItemCssClass(index: Double, className: String): Unit = js.native
  
  /**
    * Removes the CSS class from a combo box item's text cell specified by its index.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param className A string value specifying the CSS class name.
    */
  def RemoveItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  
  /**
    * Occurs on the client side after a different item in the list has been selected (focus has been moved from one item to another).
    */
  var SelectedIndexChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientComboBox]] = js.native
  
  /**
    * Adds a custom attribute to a combo box item.
    * @param index The item index.
    * @param attributeName The attribute name.
    * @param attributeValue The attribute value.
    */
  def SetItemAttribute(index: Double, attributeName: String, attributeValue: String): Unit = js.native
  
  /**
    * Defines the HTML content for the specified combo box item.
    * @param index An integer value specifying the zero-based index of the item.
    * @param html A string value that is the HTML code defining the content of the combo box item.
    */
  def SetItemHtml(index: Double, html: String): Unit = js.native
  
  /**
    * Adds a custom attribute to a combo box item's text cell.
    * @param itemIndex The item's index.
    * @param textCellIndex The text cell's index.
    * @param attributeName The attribute name.
    * @param attributeValue The attribute value.
    */
  def SetItemTextCellAttribute(itemIndex: Double, textCellIndex: Double, attributeName: String, attributeValue: String): Unit = js.native
  
  /**
    * Defines the HTML content for the specified combo box item's text cell.
    * @param itemIndex An integer value specifying the zero-based index of the item.
    * @param textCellIndex An integer value specifying the zero-based index of the item's text cell.
    * @param html A string value that is the HTML code defining the content of the combo box item.
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
    * Sets the tooltip text for the combo box editor's item specified by its index.
    * @param index An integer value specifying the zero-based index of the item.
    * @param tooltip A string value specifying the tooltip text.
    */
  def SetItemTooltip(index: Double, tooltip: String): Unit = js.native
  
  /**
    * Sets the combobox editor's selected item specified by its index.
    * @param index An integer value specifying the zero-based index of the item to select.
    */
  def SetSelectedIndex(index: Double): Unit = js.native
  
  /**
    * Sets the list editor's selected item.
    * @param item An ASPxClientListEditItem object that specifies the item to select.
    */
  def SetSelectedItem(item: ASPxClientListEditItem): Unit = js.native
  
  def SetText(text: String, applyFilter: Boolean): Unit = js.native
}
