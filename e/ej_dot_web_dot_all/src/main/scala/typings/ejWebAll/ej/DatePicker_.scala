package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DatePicker")
@js.native
class DatePicker_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.DatePicker.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.DatePicker.Model) = this()
  var defaults: typings.ejWebAll.ej.DatePicker.Model = js.native
  @JSName("model")
  var model_DatePicker_ : typings.ejWebAll.ej.DatePicker.Model = js.native
  /** Disables the DatePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enable the DatePicker control, if it is in disabled state.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the current date value in the DatePicker control.
    * @returns {string}
    */
  def getValue(): String = js.native
  /** Close the DatePicker popup, if it is in opened state.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** sets the date value for the DatePicker.
    * @returns {string}
    */
  def setValue(): String = js.native
  /** Opens the DatePicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}

