package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Accordion")
@js.native
class Accordion protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.AccordionNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.AccordionNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.AccordionNs.Model = js.native
  @JSName("model")
  var model_Accordion: ejDotWebDotAllLib.ejNs.AccordionNs.Model = js.native
  /** AddItem method is used to add the panel in dynamically. It receives the following parameters
    * @param {string} specify the name of the header
    * @param {string} content of the new panel
    * @param {number} insertion place of the new panel
    * @param {boolean} Enable or disable the AJAX request to the added panel
    * @returns {void}
    */
  def addItem(
    header_name: java.lang.String,
    content: java.lang.String,
    index: scala.Double,
    isAjaxReq: scala.Boolean
  ): scala.Unit = js.native
  /** This method used to collapse the all the expanded items in accordion at a time.
    * @returns {void}
    */
  def collapseAll(): scala.Unit = js.native
  /** This method used to Collapses the specified items in accordion at a time.
    * @returns {void}
    */
  def collapsePanel(): scala.Unit = js.native
  /** Disables the accordion widget includes all the headers and content panels.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Disable the accordion widget item based on specified header index.
    * @param {any[]} index values to disable the panels
    * @returns {void}
    */
  def disableItems(index: js.Array[_]): scala.Unit = js.native
  /** Enable the accordion widget includes all the headers and content panels.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Enable the accordion widget item based on specified header index.
    * @param {any[]} index values to enable the panels
    * @returns {void}
    */
  def enableItems(index: js.Array[_]): scala.Unit = js.native
  /** To expand all the accordion widget items.
    * @returns {void}
    */
  def expandAll(): scala.Unit = js.native
  /** This method used to Expand the specified items in accordion at a time.
    * @returns {void}
    */
  def expandPanel(): scala.Unit = js.native
  /** Returns the total number of panels in the control.
    * @returns {number}
    */
  def getItemsCount(): scala.Double = js.native
  /** Hides the visible Accordion control.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** The refresh method is used to adjust the control size based on the parent element dimension.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** RemoveItem method is used to remove the specified index panel.It receives the parameter as number.
    * @param {number} specify the index value for remove the accordion panel.
    * @returns {void}
    */
  def removeItem(index: scala.Double): scala.Unit = js.native
  /** Shows the hidden Accordion control.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.Accordion")
@js.native
object Accordion extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Accordion = js.native
}

