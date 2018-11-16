package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DropDownList")
@js.native
class DropDownList protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.DropDownListNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.DropDownListNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.DropDownListNs.Model = js.native
  @JSName("model")
  var model_DropDownList: ejDotWebDotAllLib.ejNs.DropDownListNs.Model = js.native
  /** Adding a single item or an array of items into the DropDownList allows you to specify all the field attributes such as value, template, image URL, and HTML attributes for those
           * items.Grouping and sorting will not be supported when we add items through this method.
           * @param {any|any[]}  this parameter should have field attributes with respect to mapped field attributes and it's corresponding values to fields
           * @returns {void}
           */
  def addItem(data: js.Any): scala.Unit = js.native
  /** Adding a single item or an array of items into the DropDownList allows you to specify all the field attributes such as value, template, image URL, and HTML attributes for those
           * items.Grouping and sorting will not be supported when we add items through this method.
           * @param {any|any[]}  this parameter should have field attributes with respect to mapped field attributes and it's corresponding values to fields
           * @returns {void}
           */
  def addItem(data: js.Array[_]): scala.Unit = js.native
  /** This method is used to select all the items in the DropDownList.
           * @returns {void}
           */
  def checkAll(): scala.Unit = js.native
  /** Clears the text in the DropDownList textbox.
           * @returns {void}
           */
  def clearText(): scala.Unit = js.native
  /** This property is used to disable the DropDownList widget.
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** This property disables the set of items in the DropDownList.
           * @param {string|number|any[]}  disable the given index list items
           * @returns {void}
           */
  def disableItemsByIndices(index: java.lang.String): scala.Unit = js.native
  /** This property disables the set of items in the DropDownList.
           * @param {string|number|any[]}  disable the given index list items
           * @returns {void}
           */
  def disableItemsByIndices(index: js.Array[_]): scala.Unit = js.native
  /** This property disables the set of items in the DropDownList.
           * @param {string|number|any[]}  disable the given index list items
           * @returns {void}
           */
  def disableItemsByIndices(index: scala.Double): scala.Unit = js.native
  /** This property enables the DropDownList control.
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** Enables an Item or set of Items that are disabled in the DropDownList
           * @param {string|number|any[]}  enable the given index list items if it's disabled
           * @returns {void}
           */
  def enableItemsByIndices(index: java.lang.String): scala.Unit = js.native
  /** Enables an Item or set of Items that are disabled in the DropDownList
           * @param {string|number|any[]}  enable the given index list items if it's disabled
           * @returns {void}
           */
  def enableItemsByIndices(index: js.Array[_]): scala.Unit = js.native
  /** Enables an Item or set of Items that are disabled in the DropDownList
           * @param {string|number|any[]}  enable the given index list items if it's disabled
           * @returns {void}
           */
  def enableItemsByIndices(index: scala.Double): scala.Unit = js.native
  /** This method retrieves the items using given value.
           * @param {string|number|any}  Return the whole object of data based on given value
           * @returns {any[]}
           */
  def getItemDataByValue(value: java.lang.String): js.Array[_] = js.native
  /** This method retrieves the items using given value.
           * @param {string|number|any}  Return the whole object of data based on given value
           * @returns {any[]}
           */
  def getItemDataByValue(value: js.Any): js.Array[_] = js.native
  /** This method retrieves the items using given value.
           * @param {string|number|any}  Return the whole object of data based on given value
           * @returns {any[]}
           */
  def getItemDataByValue(value: scala.Double): js.Array[_] = js.native
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
  def getSelectedValue(): java.lang.String = js.native
  /** This method hides the suggestion popup in the DropDownList.
           * @returns {void}
           */
  def hidePopup(): scala.Unit = js.native
  /** This method is used to select an item in the DropDownList by using the given text value.
           * @param {string|number|any[]}  select the list items relates to given text
           * @returns {void}
           */
  def selectItemByText(index: java.lang.String): scala.Unit = js.native
  /** This method is used to select an item in the DropDownList by using the given text value.
           * @param {string|number|any[]}  select the list items relates to given text
           * @returns {void}
           */
  def selectItemByText(index: js.Array[_]): scala.Unit = js.native
  /** This method is used to select an item in the DropDownList by using the given text value.
           * @param {string|number|any[]}  select the list items relates to given text
           * @returns {void}
           */
  def selectItemByText(index: scala.Double): scala.Unit = js.native
  /** This method is used to select an item in the DropDownList by using the given value.
           * @param {string|number|any[]}  select the list items relates to given values
           * @returns {void}
           */
  def selectItemByValue(index: java.lang.String): scala.Unit = js.native
  /** This method is used to select an item in the DropDownList by using the given value.
           * @param {string|number|any[]}  select the list items relates to given values
           * @returns {void}
           */
  def selectItemByValue(index: js.Array[_]): scala.Unit = js.native
  /** This method is used to select an item in the DropDownList by using the given value.
           * @param {string|number|any[]}  select the list items relates to given values
           * @returns {void}
           */
  def selectItemByValue(index: scala.Double): scala.Unit = js.native
  /** This method is used to select the list of items in the DropDownList through the Index of the items.
           * @param {string|number|any[]}  select the given index list items
           * @returns {void}
           */
  def selectItemsByIndices(index: java.lang.String): scala.Unit = js.native
  /** This method is used to select the list of items in the DropDownList through the Index of the items.
           * @param {string|number|any[]}  select the given index list items
           * @returns {void}
           */
  def selectItemsByIndices(index: js.Array[_]): scala.Unit = js.native
  /** This method is used to select the list of items in the DropDownList through the Index of the items.
           * @param {string|number|any[]}  select the given index list items
           * @returns {void}
           */
  def selectItemsByIndices(index: scala.Double): scala.Unit = js.native
  /** This method shows the DropDownList control with the suggestion popup.
           * @returns {void}
           */
  def showPopup(): scala.Unit = js.native
  /** This method is used to unselect all the items in the DropDownList.
           * @returns {void}
           */
  def unCheckAll(): scala.Unit = js.native
  /** This method is used to unselect an item in the DropDownList by using the given text value.
           * @param {string|number|any[]}  unselect the list items relates to given text
           * @returns {void}
           */
  def unselectItemByText(index: java.lang.String): scala.Unit = js.native
  /** This method is used to unselect an item in the DropDownList by using the given text value.
           * @param {string|number|any[]}  unselect the list items relates to given text
           * @returns {void}
           */
  def unselectItemByText(index: js.Array[_]): scala.Unit = js.native
  /** This method is used to unselect an item in the DropDownList by using the given text value.
           * @param {string|number|any[]}  unselect the list items relates to given text
           * @returns {void}
           */
  def unselectItemByText(index: scala.Double): scala.Unit = js.native
  /** This method is used to unselect an item in the DropDownList by using the given value.
           * @param {string|number|any[]}  unselect the list items relates to given values
           * @returns {void}
           */
  def unselectItemByValue(index: java.lang.String): scala.Unit = js.native
  /** This method is used to unselect an item in the DropDownList by using the given value.
           * @param {string|number|any[]}  unselect the list items relates to given values
           * @returns {void}
           */
  def unselectItemByValue(index: js.Array[_]): scala.Unit = js.native
  /** This method is used to unselect an item in the DropDownList by using the given value.
           * @param {string|number|any[]}  unselect the list items relates to given values
           * @returns {void}
           */
  def unselectItemByValue(index: scala.Double): scala.Unit = js.native
  /** This method is used to unselect the list of items in the DropDownList through Index of the items.
           * @param {string|number|any[]}  unselect the given index list items
           * @returns {void}
           */
  def unselectItemsByIndices(index: java.lang.String): scala.Unit = js.native
  /** This method is used to unselect the list of items in the DropDownList through Index of the items.
           * @param {string|number|any[]}  unselect the given index list items
           * @returns {void}
           */
  def unselectItemsByIndices(index: js.Array[_]): scala.Unit = js.native
  /** This method is used to unselect the list of items in the DropDownList through Index of the items.
           * @param {string|number|any[]}  unselect the given index list items
           * @returns {void}
           */
  def unselectItemsByIndices(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.DropDownList")
@js.native
object DropDownList extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.DropDownList = js.native
}

