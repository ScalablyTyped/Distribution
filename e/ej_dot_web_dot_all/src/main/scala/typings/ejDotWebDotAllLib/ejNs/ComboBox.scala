package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ComboBox")
@js.native
class ComboBox protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.ComboBoxNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.ComboBoxNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.ComboBoxNs.Model = js.native
  @JSName("model")
  var model_ComboBox: ejDotWebDotAllLib.ejNs.ComboBoxNs.Model = js.native
  /** Adds a new item to the popup list. By default, new item appends to the list as the last item, but you can insert based on the index parameter.
    * @returns {void}
    */
  def addItem(): scala.Unit = js.native
  /** Sets the focus to the component for interaction.
    * @returns {void}
    */
  def focusIn(): scala.Unit = js.native
  /** Moves the focus from the component if the component is already focused.
    * @returns {void}
    */
  def focusOut(): scala.Unit = js.native
  /** Gets the data object that matches the given value.
    * @returns {any}
    */
  def getDataByValue(): js.Any = js.native
  /** Gets all the list items bound on this component.
    * @returns {Element[]}
    */
  def getItems(): js.Array[stdLib.Element] = js.native
  /** Hides the popup if it is in open state.
    * @returns {void}
    */
  def hidePopup(): scala.Unit = js.native
  /** Opens the popup that displays the list of items.
    * @returns {void}
    */
  def showPopup(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.ComboBox")
@js.native
object ComboBox extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.ComboBox = js.native
}

