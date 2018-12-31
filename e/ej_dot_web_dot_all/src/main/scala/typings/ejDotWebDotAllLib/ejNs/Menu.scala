package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Menu")
@js.native
class Menu protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.MenuNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.MenuNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.MenuNs.Model = js.native
  @JSName("model")
  var model_Menu: ejDotWebDotAllLib.ejNs.MenuNs.Model = js.native
  /** Disables the Menu control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Specifies the Menu Item to be disabled by using the Menu Item Text.
    * @param {string} Specifies the Menu Item Text to be disabled.
    * @returns {void}
    */
  def disableItem(itemtext: java.lang.String): scala.Unit = js.native
  /** Specifies the Menu Item to be disabled by using the Menu Item Id.
    * @param {string|number} Specifies the Menu Item id to be disabled
    * @returns {void}
    */
  def disableItemByID(itemid: java.lang.String): scala.Unit = js.native
  def disableItemByID(itemid: scala.Double): scala.Unit = js.native
  /** Enables the Menu control.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Specifies the Menu Item to be enabled by using the Menu Item Text.
    * @param {string} Specifies the Menu Item Text to be enabled.
    * @returns {void}
    */
  def enableItem(itemtext: java.lang.String): scala.Unit = js.native
  /** Specifies the Menu Item to be enabled by using the Menu Item Id.
    * @param {string|number} Specifies the Menu Item id to be enabled.
    * @returns {void}
    */
  def enableItemByID(itemid: java.lang.String): scala.Unit = js.native
  def enableItemByID(itemid: scala.Double): scala.Unit = js.native
  /** Hides the Context Menu control.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** Hides the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be hidden
    * @returns {void}
    */
  def hideItems(itemID: java.lang.String): scala.Unit = js.native
  def hideItems(itemID: js.Array[_]): scala.Unit = js.native
  /** Insert the menu item as child of target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insert(item: js.Any, target: java.lang.String): scala.Unit = js.native
  def insert(item: js.Any, target: js.Any): scala.Unit = js.native
  /** Insert the menu item after the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertAfter(item: js.Any, target: java.lang.String): scala.Unit = js.native
  def insertAfter(item: js.Any, target: js.Any): scala.Unit = js.native
  /** Insert the menu item before the target node.
    * @param {any} Information about Menu item.
    * @param {string|any} Selector of target node or Object of target node.
    * @returns {void}
    */
  def insertBefore(item: js.Any, target: java.lang.String): scala.Unit = js.native
  def insertBefore(item: js.Any, target: js.Any): scala.Unit = js.native
  /** Remove Menu item.
    * @param {any|any[]} Selector of target node or Object of target node.
    * @returns {void}
    */
  def remove(target: js.Any): scala.Unit = js.native
  def remove(target: js.Array[_]): scala.Unit = js.native
  /** To show the Menu control.
    * @param {number} x co-ordinate position of context menu.
    * @param {number} y co-ordinate position of context menu.
    * @param {any} target element
    * @param {any} name of the event
    * @returns {void}
    */
  def show(locationX: scala.Double, locationY: scala.Double, targetElement: js.Any, event: js.Any): scala.Unit = js.native
  /** Show the specific items in Menu control.
    * @param {string|any[]} ItemID of the Menu item to be shown
    * @returns {void}
    */
  def showItems(itemID: java.lang.String): scala.Unit = js.native
  def showItems(itemID: js.Array[_]): scala.Unit = js.native
}

@JSGlobal("ej.Menu")
@js.native
object Menu extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Menu = js.native
}

