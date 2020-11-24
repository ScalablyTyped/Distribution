package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownList_ extends Widget_ {
  
  /** Adding a single item or an array of items into the DropDownList allows you to specify all the field attributes such as value, template, image URL, and HTML attributes for those
    * items.Grouping and sorting will not be supported when we add items through this method.
    * @param {any|any[]}  this parameter should have field attributes with respect to mapped field attributes and it's corresponding values to fields
    * @returns {void}
    */
  def addItem(data: js.Any): Unit = js.native
  def addItem(data: js.Array[_]): Unit = js.native
  
  /** This method is used to select all the items in the DropDownList.
    * @returns {void}
    */
  def checkAll(): Unit = js.native
  
  /** Clears the text in the DropDownList textbox.
    * @returns {void}
    */
  def clearText(): Unit = js.native
  
  var defaults: typings.ejWebAll.ej.DropDownList.Model = js.native
  
  /** This property is used to disable the DropDownList widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** This property disables the set of items in the DropDownList.
    * @param {string|number|any[]}  disable the given index list items
    * @returns {void}
    */
  def disableItemsByIndices(index: String): Unit = js.native
  def disableItemsByIndices(index: js.Array[_]): Unit = js.native
  def disableItemsByIndices(index: Double): Unit = js.native
  
  /** This property enables the DropDownList control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enables an Item or set of Items that are disabled in the DropDownList
    * @param {string|number|any[]}  enable the given index list items if it's disabled
    * @returns {void}
    */
  def enableItemsByIndices(index: String): Unit = js.native
  def enableItemsByIndices(index: js.Array[_]): Unit = js.native
  def enableItemsByIndices(index: Double): Unit = js.native
  
  /** This method retrieves the items using given value.
    * @param {string|number|any}  Return the whole object of data based on given value
    * @returns {any[]}
    */
  def getItemDataByValue(value: String): js.Array[_] = js.native
  def getItemDataByValue(value: js.Any): js.Array[_] = js.native
  def getItemDataByValue(value: Double): js.Array[_] = js.native
  
  /** This method is used to retrieve the items that are bound with the DropDownList.
    * @returns {any}
    */
  def getListData(): js.Any = js.native
  
  /** This method is used to get the selected items in the DropDownList.
    * @returns {any[]}
    */
  def getSelectedItem(): js.Array[_] = js.native
  
  /** This method is used to retrieve the items value that are selected in the DropDownList.
    * @returns {string}
    */
  def getSelectedValue(): String = js.native
  
  /** This method hides the suggestion popup in the DropDownList.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  
  @JSName("model")
  var model_DropDownList_ : typings.ejWebAll.ej.DropDownList.Model = js.native
  
  /** This method is used to select an item in the DropDownList by using the given text value.
    * @param {string|number|any[]}  select the list items relates to given text
    * @returns {void}
    */
  def selectItemByText(index: String): Unit = js.native
  def selectItemByText(index: js.Array[_]): Unit = js.native
  def selectItemByText(index: Double): Unit = js.native
  
  /** This method is used to select an item in the DropDownList by using the given value.
    * @param {string|number|any[]}  select the list items relates to given values
    * @returns {void}
    */
  def selectItemByValue(index: String): Unit = js.native
  def selectItemByValue(index: js.Array[_]): Unit = js.native
  def selectItemByValue(index: Double): Unit = js.native
  
  /** This method is used to select the list of items in the DropDownList through the Index of the items.
    * @param {string|number|any[]}  select the given index list items
    * @returns {void}
    */
  def selectItemsByIndices(index: String): Unit = js.native
  def selectItemsByIndices(index: js.Array[_]): Unit = js.native
  def selectItemsByIndices(index: Double): Unit = js.native
  
  /** This method shows the DropDownList control with the suggestion popup.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
  
  /** This method is used to unselect all the items in the DropDownList.
    * @returns {void}
    */
  def unCheckAll(): Unit = js.native
  
  /** This method is used to unselect an item in the DropDownList by using the given text value.
    * @param {string|number|any[]}  unselect the list items relates to given text
    * @returns {void}
    */
  def unselectItemByText(index: String): Unit = js.native
  def unselectItemByText(index: js.Array[_]): Unit = js.native
  def unselectItemByText(index: Double): Unit = js.native
  
  /** This method is used to unselect an item in the DropDownList by using the given value.
    * @param {string|number|any[]}  unselect the list items relates to given values
    * @returns {void}
    */
  def unselectItemByValue(index: String): Unit = js.native
  def unselectItemByValue(index: js.Array[_]): Unit = js.native
  def unselectItemByValue(index: Double): Unit = js.native
  
  /** This method is used to unselect the list of items in the DropDownList through Index of the items.
    * @param {string|number|any[]}  unselect the given index list items
    * @returns {void}
    */
  def unselectItemsByIndices(index: String): Unit = js.native
  def unselectItemsByIndices(index: js.Array[_]): Unit = js.native
  def unselectItemsByIndices(index: Double): Unit = js.native
}
