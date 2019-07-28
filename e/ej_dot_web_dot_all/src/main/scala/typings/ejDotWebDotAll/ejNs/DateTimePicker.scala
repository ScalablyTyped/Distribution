package typings.ejDotWebDotAll.ejNs

import typings.ejDotWebDotAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DateTimePicker")
@js.native
class DateTimePicker protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ejNs.DateTimePickerNs.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ejNs.DateTimePickerNs.Model) = this()
  var defaults: typings.ejDotWebDotAll.ejNs.DateTimePickerNs.Model = js.native
  @JSName("model")
  var model_DateTimePicker: typings.ejDotWebDotAll.ejNs.DateTimePickerNs.Model = js.native
  /** Disables the DateTimePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enables the DateTimePicker control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the current datetime value in the DateTimePicker.
    * @returns {string}
    */
  def getValue(): String = js.native
  /** Hides or closes the DateTimePicker popup.
    * @returns {void}
    */
  def hide(): Unit = js.native
  /** Updates the current system date value and time value to the DateTimePicker.
    * @returns {void}
    */
  def setCurrentDateTime(): Unit = js.native
  /** Shows or opens the DateTimePicker popup.
    * @returns {void}
    */
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("ej.DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var Locale: js.Any = js.native
  var fn: DateTimePicker = js.native
}

