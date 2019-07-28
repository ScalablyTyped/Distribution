package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.RadialMenu")
@js.native
class RadialMenu protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.RadialMenuNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.RadialMenuNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.RadialMenuNs.Model = js.native
  @JSName("model")
  var model_RadialMenu: typings.ejDotWebDotAll.ejNs.RadialMenuNs.Model = js.native
  /** To disable menu item using item text
    * @param {string} item of the Radialmenu item to disable.
    * @returns {void}
    */
  def disableItem(item: String): Unit = js.native
  /** To disable menu item using index
    * @param {number} Index of the Radialmenu to be disabled.
    * @returns {void}
    */
  def disableItemByIndex(itemIndex: Double): Unit = js.native
  /** To disable menu items using item texts
    * @param {any[]} items of the Radialmenu item to disable.
    * @returns {void}
    */
  def disableItems(items: js.Array[_]): Unit = js.native
  /** To disable menu items using indices
    * @param {any[]} items of the Radialmenu to disable.
    * @returns {void}
    */
  def disableItemsByIndices(itemIndices: js.Array[_]): Unit = js.native
  /** To enable menu item using item text
    * @param {string} item of the Radialmenu item to enable.
    * @returns {void}
    */
  def enableItem(item: String): Unit = js.native
  /** To enable menu item using index
    * @param {number} Index of the Radialmenu to be enabled.
    * @returns {void}
    */
  def enableItemByIndex(itemIndex: Double): Unit = js.native
  /** To enable menu items using item texts
    * @param {any[]} items of the Radialmenu item to enable.
    * @returns {void}
    */
  def enableItems(items: js.Array[_]): Unit = js.native
  /** To enable menu items using indices
    * @param {any[]} Index of the Radialmenu to be enabled.
    * @returns {void}
    */
  def enableItemsByIndices(itemIndices: js.Array[_]): Unit = js.native
  /** To hide the radialmenu
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** To hide menu item badge
    * @param {number} Index of the Radialmenu item to hide the badge.
    * @returns {void}
    */
  def hideBadge(index: Double): Unit = js.native
  /** To hide the radialmenu items
    * @returns {void}
    */
  def hideMenu(): Unit = js.native
  /** To Show the radial menu
    * @returns {void}
    */
  def show(): Unit = js.native
  /** To show menu item badge
    * @param {number} Index of the Radialmenu item to be shown badge.
    * @returns {void}
    */
  def showBadge(index: Double): Unit = js.native
  /** To show menu items
    * @returns {void}
    */
  def showMenu(): Unit = js.native
  /** To update menu item badge value
    * @param {number} The index value to add the given items at the specified index. If index is not specified, the given value will not be updated.
    * @param {number} The Value to be updated in the badge. It will be updated based on the given index
    * @returns {void}
    */
  def updateBadgeValue(index: Double, value: Double): Unit = js.native
}

/* static members */
@JSGlobal("ej.RadialMenu")
@js.native
object RadialMenu extends js.Object {
  var Locale: js.Any = js.native
  var fn: RadialMenu = js.native
}

