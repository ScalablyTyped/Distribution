package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toolbar_ extends Widget_ {
  
  var defaults: typings.ejWebAll.ej.Toolbar.Model = js.native
  
  /** Deselect the specified Toolbar item.
    * @param {any} The element need to be deselected
    * @returns {void}
    */
  def deselectItem(element: js.Any): Unit = js.native
  
  /** Deselect the Toolbar item based on specified id.
    * @param {string} The ID of the element need to be deselected
    * @returns {void}
    */
  def deselectItemByID(ID: String): Unit = js.native
  
  /** To disable all items in the Toolbar control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disable the specified Toolbar item.
    * @param {any} The element need to be disabled
    * @returns {void}
    */
  def disableItem(element: js.Any): Unit = js.native
  
  /** Disable the Toolbar item based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be disabled
    * @returns {void}
    */
  def disableItemByID(ID: String): Unit = js.native
  
  /** Enable the Toolbar if it is in disabled state.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enable the Toolbar item based on specified item.
    * @param {any} The element need to be enabled
    * @returns {void}
    */
  def enableItem(element: js.Any): Unit = js.native
  
  /** Enable the Toolbar item based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be enabled
    * @returns {void}
    */
  def enableItemByID(ID: String): Unit = js.native
  
  /** To hide the Toolbar
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_Toolbar_ : typings.ejWebAll.ej.Toolbar.Model = js.native
  
  /** Remove the item from toolbar, based on specified item.
    * @param {any} The element need to be removed
    * @returns {void}
    */
  def removeItem(element: js.Any): Unit = js.native
  
  /** Remove the item from toolbar, based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be removed
    * @returns {void}
    */
  def removeItemByID(ID: String): Unit = js.native
  
  /** Selects the item from toolbar, based on specified item.
    * @param {any} The element need to be selected
    * @returns {void}
    */
  def selectItem(element: js.Any): Unit = js.native
  
  /** Selects the item from toolbar, based on specified item id in the Toolbar.
    * @param {string} The ID of the element need to be selected
    * @returns {void}
    */
  def selectItemByID(ID: String): Unit = js.native
  
  /** To show the Toolbar.
    * @returns {void}
    */
  def show(): Unit = js.native
}
