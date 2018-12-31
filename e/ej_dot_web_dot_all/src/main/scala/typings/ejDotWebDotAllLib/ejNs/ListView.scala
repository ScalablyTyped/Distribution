package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ListView")
@js.native
class ListView protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ListViewNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ListViewNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ListViewNs.Model = js.native
  @JSName("model")
  var model_ListView: ejDotWebDotAllLib.ejNs.ListViewNs.Model = js.native
  /** To add item in the given index. If you have enabled grouping in ListView then you need to pass the corresponding group list title to add item in it. Depending on the data bound to
    * ListView, we need to pass either an HTML element or JSON objects in this method.
    * @param {string|any} To pass the list item as element/ JSON object
    * @param {number} Specifies the index where item to be added
    * @param {string} optionalThis is an optional parameter. You must pass the group list title here if grouping is enabled in the ListView
    * @returns {void}
    */
  def addItem(item: java.lang.String, index: scala.Double, groupid: java.lang.String): scala.Unit = js.native
  def addItem(item: js.Any, index: scala.Double, groupid: java.lang.String): scala.Unit = js.native
  /** To check all the items.
    * @returns {void}
    */
  def checkAllItem(): scala.Unit = js.native
  /** To check item in the given index.
    * @param {number} Specifies the index of the item to be checked
    * @returns {void}
    */
  def checkItem(index: scala.Double): scala.Unit = js.native
  /** To clear all the list item in the control before updating with new datasource.
    * @returns {void}
    */
  def clear(): scala.Unit = js.native
  /** To make the item in the given index to be default state.
    * @param {number} Specifies the index to make the item to be in default state.
    * @returns {void}
    */
  def deActive(index: scala.Double): scala.Unit = js.native
  /** To disable item in the given index.
    * @param {number} Specifies the index value to be disabled.
    * @returns {void}
    */
  def disableItem(index: scala.Double): scala.Unit = js.native
  /** To enable item in the given index.
    * @param {number} Specifies the index value to be enabled.
    * @returns {void}
    */
  def enableItem(index: scala.Double): scala.Unit = js.native
  /** To get the active item.
    * @returns {HTMLElement}
    */
  def getActiveItem(): stdLib.HTMLElement = js.native
  /** To get the text of the active item.
    * @returns {string}
    */
  def getActiveItemText(): java.lang.String = js.native
  /** To get all the checked items.
    * @returns {any[]}
    */
  def getCheckedItems(): js.Array[_] = js.native
  /** To get the text of all the checked items.
    * @returns {any[]}
    */
  def getCheckedItemsText(): js.Array[_] = js.native
  /** To get the text of the item in the given index.
    * @param {string|number} Specifies the index value to get the text value.
    * @returns {string}
    */
  def getItemText(index: java.lang.String): java.lang.String = js.native
  def getItemText(index: scala.Double): java.lang.String = js.native
  /** To get the total item count.
    * @returns {number}
    */
  def getItemsCount(): scala.Double = js.native
  /** To check whether the item in the given index has child item.
    * @param {number} Specifies the index value to check the item has child or not.
    * @returns {boolean}
    */
  def hasChild(index: scala.Double): scala.Boolean = js.native
  /** To hide the list.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** To hide item in the given index.
    * @param {number} Specifies the index value to hide the item.
    * @returns {void}
    */
  def hideItem(index: scala.Double): scala.Unit = js.native
  /** To check whether item in the given index is checked.
    * @returns {boolean}
    */
  def isChecked(): scala.Boolean = js.native
  /** To load the AJAX content while selecting the item.
    * @param {string} Specifies the item to load the AJAX content.
    * @returns {void}
    */
  def loadAjaxContent(item: java.lang.String): scala.Unit = js.native
  /** To remove the check mark either for specific item in the given index or for all items.
    * @param {number} Specifies the index value to remove the checkbox.
    * @returns {void}
    */
  def removeCheckMark(index: scala.Double): scala.Unit = js.native
  /** To remove item in the given index.
    * @param {number} Specifies the index value to remove the item.
    * @returns {void}
    */
  def removeItem(index: scala.Double): scala.Unit = js.native
  /** To select item in the given index.
    * @param {number} Specifies the index value to select the item.
    * @returns {void}
    */
  def selectItem(index: scala.Double): scala.Unit = js.native
  /** To make the item in the given index to be active state.
    * @param {number} Specifies the index value to make the item in active state.
    * @returns {void}
    */
  def setActive(index: scala.Double): scala.Unit = js.native
  /** To show the list.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
  /** To show item in the given index.
    * @param {number} Specifies the index value to show the hidden item.
    * @returns {void}
    */
  def showItem(index: scala.Double): scala.Unit = js.native
  /** To uncheck all the items.
    * @returns {void}
    */
  def unCheckAllItem(): scala.Unit = js.native
  /** To uncheck item in the given index.
    * @param {number} Specifies the index value to uncheck the item.
    * @returns {void}
    */
  def unCheckItem(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("ej.ListView")
@js.native
object ListView extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.ListView = js.native
}

