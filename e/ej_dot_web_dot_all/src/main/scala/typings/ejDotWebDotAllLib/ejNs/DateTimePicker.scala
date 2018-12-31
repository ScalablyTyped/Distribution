package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DateTimePicker")
@js.native
class DateTimePicker protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.DateTimePickerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.DateTimePickerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.DateTimePickerNs.Model = js.native
  @JSName("model")
  var model_DateTimePicker: ejDotWebDotAllLib.ejNs.DateTimePickerNs.Model = js.native
  /** Disables the DateTimePicker control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enables the DateTimePicker control.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Returns the current datetime value in the DateTimePicker.
    * @returns {string}
    */
  def getValue(): java.lang.String = js.native
  /** Hides or closes the DateTimePicker popup.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** Updates the current system date value and time value to the DateTimePicker.
    * @returns {void}
    */
  def setCurrentDateTime(): scala.Unit = js.native
  /** Shows or opens the DateTimePicker popup.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.DateTimePicker")
@js.native
object DateTimePicker extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.DateTimePicker = js.native
}

