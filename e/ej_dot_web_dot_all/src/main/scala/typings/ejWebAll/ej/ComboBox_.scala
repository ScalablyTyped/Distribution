package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ComboBox")
@js.native
class ComboBox_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.ComboBox.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.ComboBox.Model) = this()
  var defaults: typings.ejWebAll.ej.ComboBox.Model = js.native
  @JSName("model")
  var model_ComboBox_ : typings.ejWebAll.ej.ComboBox.Model = js.native
  /** Adds a new item to the popup list. By default, new item appends to the list as the last item, but you can insert based on the index parameter.
    * @returns {void}
    */
  def addItem(): Unit = js.native
  /** Sets the focus to the component for interaction.
    * @returns {void}
    */
  def focusIn(): Unit = js.native
  /** Moves the focus from the component if the component is already focused.
    * @returns {void}
    */
  def focusOut(): Unit = js.native
  /** Gets the data object that matches the given value.
    * @returns {any}
    */
  def getDataByValue(): js.Any = js.native
  /** Gets all the list items bound on this component.
    * @returns {Element[]}
    */
  def getItems(): js.Array[Element] = js.native
  /** Hides the popup if it is in open state.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  /** Opens the popup that displays the list of items.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
}

