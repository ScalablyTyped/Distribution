package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accordion_ extends Widget_ {
  
  /** AddItem method is used to add the panel in dynamically. It receives the following parameters
    * @param {string} specify the name of the header
    * @param {string} content of the new panel
    * @param {number} insertion place of the new panel
    * @param {boolean} Enable or disable the AJAX request to the added panel
    * @returns {void}
    */
  def addItem(header_name: String, content: String, index: Double, isAjaxReq: Boolean): Unit = js.native
  
  /** This method used to collapse the all the expanded items in accordion at a time.
    * @returns {void}
    */
  def collapseAll(): Unit = js.native
  
  /** This method used to Collapses the specified items in accordion at a time.
    * @returns {void}
    */
  def collapsePanel(): Unit = js.native
  
  var defaults: typings.ejWebAll.ej.Accordion.Model = js.native
  
  /** Disables the accordion widget includes all the headers and content panels.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disable the accordion widget item based on specified header index.
    * @param {any[]} index values to disable the panels
    * @returns {void}
    */
  def disableItems(index: js.Array[_]): Unit = js.native
  
  /** Enable the accordion widget includes all the headers and content panels.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enable the accordion widget item based on specified header index.
    * @param {any[]} index values to enable the panels
    * @returns {void}
    */
  def enableItems(index: js.Array[_]): Unit = js.native
  
  /** To expand all the accordion widget items.
    * @returns {void}
    */
  def expandAll(): Unit = js.native
  
  /** This method used to Expand the specified items in accordion at a time.
    * @returns {void}
    */
  def expandPanel(): Unit = js.native
  
  /** Returns the total number of panels in the control.
    * @returns {number}
    */
  def getItemsCount(): Double = js.native
  
  /** Hides the visible Accordion control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_Accordion_ : typings.ejWebAll.ej.Accordion.Model = js.native
  
  /** The refresh method is used to adjust the control size based on the parent element dimension.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** RemoveItem method is used to remove the specified index panel.It receives the parameter as number.
    * @param {number} specify the index value for remove the accordion panel.
    * @returns {void}
    */
  def removeItem(index: Double): Unit = js.native
  
  /** Shows the hidden Accordion control.
    * @returns {void}
    */
  def show(): Unit = js.native
}
