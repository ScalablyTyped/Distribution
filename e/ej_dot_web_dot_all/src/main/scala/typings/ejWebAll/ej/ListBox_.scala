package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBox_ extends Widget_ {
  
  def addItem(listItem: String, index: Double): Unit = js.native
  /** Adds a given list items in the ListBox widget at a specified index. It accepts two parameters.
    * @param {any|string} This can be a list item object (for JSON binding) or a string (for UL and LI rendering). Also we can the specify this as an array of list item object or an
    * array of strings to add multiple items.
    * @param {number} The index value to add the given items at the specified index. If index is not specified, the given items will be added at the end of the list.
    * @returns {void}
    */
  def addItem(listItem: js.Any, index: Double): Unit = js.native
  
  /** Checks all the list items in the ListBox widget. It is dependent on showCheckbox property.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  
  /** Checks a list item by using its index. It is dependent on showCheckbox property.
    * @param {number} Index of the listbox item to be checked. If index is not specified, the given items will be added at the end of the list.
    * @returns {void}
    */
  def checkItemByIndex(index: Double): Unit = js.native
  
  /** Checks multiple list items by using its index values. It is dependent on showCheckbox property.
    * @param {number[]} Index/Indices of the listbox items to be checked. If index is not specified, the given items will be added at the end of the list.
    * @returns {void}
    */
  def checkItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  var defaults: typings.ejWebAll.ej.ListBox.Model = js.native
  
  /** Disables the ListBox widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disables a list item by passing the item text as parameter.
    * @param {string} Text of the listbox item to be disabled.
    * @returns {void}
    */
  def disableItem(text: String): Unit = js.native
  
  /** Disables a list Item using its index value.
    * @param {number} Index of the listbox item to be disabled.
    * @returns {void}
    */
  def disableItemByIndex(index: Double): Unit = js.native
  
  def disableItemsByIndices(Indices: String): Unit = js.native
  /** Disables set of list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be disabled.
    * @returns {void}
    */
  def disableItemsByIndices(Indices: js.Array[Double]): Unit = js.native
  
  /** Enables the ListBox widget when it is disabled.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enables a list Item using its item text value.
    * @param {string} Text of the listbox item to be enabled.
    * @returns {void}
    */
  def enableItem(text: String): Unit = js.native
  
  /** Enables a list item using its index value.
    * @param {number} Index of the listbox item to be enabled.
    * @returns {void}
    */
  def enableItemByIndex(index: Double): Unit = js.native
  
  def enableItemsByIndices(indices: String): Unit = js.native
  /** Enables a set of list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be enabled.
    * @returns {void}
    */
  def enableItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  /** Returns the list of checked items in the ListBox widget. It is dependent on showCheckbox property.
    * @returns {any}
    */
  def getCheckedItems(): js.Any = js.native
  
  /** Returns an itemâ€™s index based on the given text.
    * @param {string} The list item text (label)
    * @returns {number}
    */
  def getIndexByText(text: String): Double = js.native
  
  /** Returns an itemâ€™s index based on the value given.
    * @param {string} The list itemâ€™s value
    * @returns {number}
    */
  def getIndexByValue(indices: String): Double = js.native
  
  /** Returns a list itemâ€™s object using its index.
    * @returns {any}
    */
  def getItemByIndex(): js.Any = js.native
  
  /** Returns a list itemâ€™s object based on the text given.
    * @param {string} The list item text.
    * @returns {any}
    */
  def getItemByText(text: String): js.Any = js.native
  
  /** Returns the list of selected items in the ListBox widget.
    * @returns {any}
    */
  def getSelectedItems(): js.Any = js.native
  
  /** Returns an itemâ€™s text (label) based on the index given.
    * @returns {string}
    */
  def getTextByIndex(): String = js.native
  
  /** Hides the listbox.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** Hides all the listbox items in the listbox.
    * @returns {void}
    */
  def hideAllItems(): Unit = js.native
  
  /** Hides all the checked items in the listbox.
    * @returns {void}
    */
  def hideCheckedItems(): Unit = js.native
  
  /** Hides a list item using its index value.
    * @param {number} Index of the listbox item to be hidden.
    * @returns {void}
    */
  def hideItemByIndex(index: Double): Unit = js.native
  
  /** Hide a list item using its value.
    * @param {string} Value of the listbox item to be hidden.
    * @returns {void}
    */
  def hideItemByValue(value: String): Unit = js.native
  
  def hideItemsByIndices(indices: String): Unit = js.native
  /** Hides a set of list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be hidden.
    * @returns {void}
    */
  def hideItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  /** Hides the list item using its values.
    * @param {any[]} Values of the listbox items to be hidden.
    * @returns {void}
    */
  def hideItemsByValues(values: js.Array[_]): Unit = js.native
  
  /** Merges the given data with the existing data items in the listbox.
    * @param {any[]} Data to merge in listbox.
    * @returns {void}
    */
  def mergeData(data: js.Array[_]): Unit = js.native
  
  @JSName("model")
  var model_ListBox_ : typings.ejWebAll.ej.ListBox.Model = js.native
  
  /** Selects the next item based on the current selection.
    * @returns {void}
    */
  def moveDown(): Unit = js.native
  
  /** Selects the previous item based on the current selection.
    * @returns {void}
    */
  def moveUp(): Unit = js.native
  
  /** Refreshes the ListBox widget.
    * @param {boolean} Refreshes both the datasource and the dimensions of the ListBox widget when the parameter is passed as true, otherwise only the ListBox dimensions will be
    * refreshed.
    * @returns {void}
    */
  def refresh(refreshData: Boolean): Unit = js.native
  
  /** Removes all the list items from listbox.
    * @returns {void}
    */
  def removeAll(): Unit = js.native
  
  /** Removes a list item by using its index value.
    * @param {number} Index of the listbox item to be removed.
    * @returns {void}
    */
  def removeItemByIndex(index: Double): Unit = js.native
  
  /** Removes a list item by using its text.
    * @param {string} Text of the listbox item to be removed.
    * @returns {void}
    */
  def removeItemByText(text: String): Unit = js.native
  
  /** Removes the selected list items from the listbox.
    * @returns {void}
    */
  def removeSelectedItems(): Unit = js.native
  
  /**
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  
  /** Selects list item using its index value.
    * @param {number} Index of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemByIndex(index: Double): Unit = js.native
  
  /** Selects the list item using its text value.
    * @param {string} Text of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemByText(text: String): Unit = js.native
  
  /** Selects list item using its value property.
    * @param {string} Value of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemByValue(value: String): Unit = js.native
  
  def selectItemsByIndices(Indices: js.Array[Double]): Unit = js.native
  /** Selects a set of list items through its index values.
    * @param {number|number[]} Index/Indices of the listbox item to be selected.
    * @returns {void}
    */
  def selectItemsByIndices(Indices: Double): Unit = js.native
  
  /**
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** Shows all the listbox items in the listbox.
    * @returns {void}
    */
  def showAllItems(): Unit = js.native
  
  /** Shows a hidden list item using its index value.
    * @param {number} Index of the listbox item to be shown.
    * @returns {void}
    */
  def showItemByIndex(index: Double): Unit = js.native
  
  def showItemByIndices(indices: String): Unit = js.native
  /** Shows a set of hidden list Items using its index values.
    * @param {number[]|string} Indices of the listbox items to be shown.
    * @returns {void}
    */
  def showItemByIndices(indices: js.Array[Double]): Unit = js.native
  
  /** Shows a hidden list item using its value.
    * @param {string} Value of the listbox item to be shown.
    * @returns {void}
    */
  def showItemByValue(value: String): Unit = js.native
  
  /** Shows the hidden list items using its values.
    * @param {any[]} Values of the listbox items to be shown.
    * @returns {void}
    */
  def showItemsByValues(values: js.Array[_]): Unit = js.native
  
  /** Unchecks all the checked list items in the ListBox widget. To use this method showCheckbox property to be set as true.
    * @returns {void}
    */
  def uncheckAll(): Unit = js.native
  
  /** Unchecks a checked list item using its index value. To use this method showCheckbox property to be set as true.
    * @param {number} Index of the listbox item to be unchecked.
    * @returns {void}
    */
  def uncheckItemByIndex(index: Double): Unit = js.native
  
  def uncheckItemsByIndices(indices: String): Unit = js.native
  /** Unchecks the set of checked list items using its index values. To use this method showCheckbox property must be set to true.
    * @param {number[]|string} Indices of the listbox item to be unchecked.
    * @returns {void}
    */
  def uncheckItemsByIndices(indices: js.Array[Double]): Unit = js.native
  
  /**
    * @returns {void}
    */
  def unselectAll(): Unit = js.native
  
  /** Unselects a selected list item using its index value
    * @param {number} Index of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemByIndex(index: Double): Unit = js.native
  
  /** Unselects a selected list item using its text value.
    * @param {string} Text of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemByText(text: String): Unit = js.native
  
  /** Unselects a selected list item using its value.
    * @param {string} Value of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemByValue(value: String): Unit = js.native
  
  def unselectItemsByIndices(indices: String): Unit = js.native
  /** Unselects a set of list items using its index values.
    * @param {number[]|string} Indices of the listbox item to be unselected.
    * @returns {void}
    */
  def unselectItemsByIndices(indices: js.Array[Double]): Unit = js.native
}
