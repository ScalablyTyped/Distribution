package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Toolbar")
@js.native
class Toolbar protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ToolbarNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ToolbarNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ToolbarNs.Model = js.native
  @JSName("model")
  var model_Toolbar: ejDotWebDotAllLib.ejNs.ToolbarNs.Model = js.native
  /** Deselect the specified Toolbar item.
    * @param {any} The element need to be deselected
    * @returns {void}
    */
  def deselectItem(element: js.Any): scala.Unit = js.native
  /** Deselect the Toolbar item based on specified id.
    * @param {string} The ID of the element need to be deselected
    * @returns {void}
    */
  def deselectItemByID(ID: java.lang.String): scala.Unit = js.native
  /** To disable all items in the Toolbar control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Disable the specified Toolbar item.
    * @param {any} The element need to be disabled
    * @returns {void}
    */
  def disableItem(element: js.Any): scala.Unit = js.native
  /** Disable the Toolbar item based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be disabled
    * @returns {void}
    */
  def disableItemByID(ID: java.lang.String): scala.Unit = js.native
  /** Enable the Toolbar if it is in disabled state.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Enable the Toolbar item based on specified item.
    * @param {any} The element need to be enabled
    * @returns {void}
    */
  def enableItem(element: js.Any): scala.Unit = js.native
  /** Enable the Toolbar item based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be enabled
    * @returns {void}
    */
  def enableItemByID(ID: java.lang.String): scala.Unit = js.native
  /** To hide the Toolbar
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** Remove the item from toolbar, based on specified item.
    * @param {any} The element need to be removed
    * @returns {void}
    */
  def removeItem(element: js.Any): scala.Unit = js.native
  /** Remove the item from toolbar, based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be removed
    * @returns {void}
    */
  def removeItemByID(ID: java.lang.String): scala.Unit = js.native
  /** Selects the item from toolbar, based on specified item.
    * @param {any} The element need to be selected
    * @returns {void}
    */
  def selectItem(element: js.Any): scala.Unit = js.native
  /** Selects the item from toolbar, based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be selected
    * @returns {void}
    */
  def selectItemByID(ID: java.lang.String): scala.Unit = js.native
  /** To show the Toolbar.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.Toolbar")
@js.native
object Toolbar extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Toolbar = js.native
}

