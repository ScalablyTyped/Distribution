package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Menu")
@js.native
class Menu_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Menu.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Menu.Model) = this()
  var defaults: typings.ejDotWebDotAll.ej.Menu.Model = js.native
  @JSName("model")
  var model_Menu_ : typings.ejDotWebDotAll.ej.Menu.Model = js.native
  /** Disables the Menu control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Specifies the Menu Item to be disabled by using the Menu Item Text.
    * @param {string} Specifies the Menu Item Text to be disabled.
    * @returns {void}
    */
  def disableItem(itemtext: String): Unit = js.native
  /** Specifies the Menu Item to be disabled by using the Menu Item Id.
    * @param {string|number} Specifies the Menu Item id to be disabled
    * @returns {void}
    */
  def disableItemByID(itemid: String): Unit = js.native
  def disableItemByID(itemid: Double): Unit = js.native
  /** Enables the Menu control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Specifies the Menu Item to be enabled by using the Menu Item Text.
    * @param {string} Specifies the Menu Item Text to be enabled.
    * @returns {void}
    */
  def enableItem(itemtext: String): Unit = js.native
  /** Specifies the Menu Item to be enabled by using the Menu Item Id.
    * @param {string|number} Specifies the Menu Item id to be enabled.
    * @returns {void}
    */
  def enableItemByID(itemid: String): Unit = js.native
  def enableItemByID(itemid: Double): Unit = js.native
  /** Hides the Context Menu control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Hides the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be hidden
    * @returns {void}
    */
  def hideItems(itemID: String): Unit = js.native
  def hideItems(itemID: js.Array[_]): Unit = js.native
  /** Insert the menu item as child of target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insert(item: js.Any, target: String): Unit = js.native
  def insert(item: js.Any, target: js.Any): Unit = js.native
  /** Insert the menu item after the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertAfter(item: js.Any, target: String): Unit = js.native
  def insertAfter(item: js.Any, target: js.Any): Unit = js.native
  /** Insert the menu item before the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertBefore(item: js.Any, target: String): Unit = js.native
  def insertBefore(item: js.Any, target: js.Any): Unit = js.native
  /** Remove Menu item.
    * @param {any|any[]} Selector of target node or Object of target node.
    * @returns {void}
    */
  def remove(target: js.Any): Unit = js.native
  def remove(target: js.Array[_]): Unit = js.native
  /** To show the Menu control.
    * @param {number} x co-ordinate position of context menu.
    * @param {number} y co-ordinate position of context menu.
    * @param {any} target element
    * @param {any} name of the event
    * @returns {void}
    */
  def show(locationX: Double, locationY: Double, targetElement: js.Any, event: js.Any): Unit = js.native
  /** Show the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be shown
    * @returns {void}
    */
  def showItems(itemID: String): Unit = js.native
  def showItems(itemID: js.Array[_]): Unit = js.native
}

