package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DatePicker")
@js.native
class DatePicker protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.DatePickerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.DatePickerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.DatePickerNs.Model = js.native
  @JSName("model")
  var model_DatePicker: ejDotWebDotAllLib.ejNs.DatePickerNs.Model = js.native
  /** Disables the DatePicker control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enable the DatePicker control, if it is in disabled state.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Returns the current date value in the DatePicker control.
    * @returns {string}
    */
  def getValue(): java.lang.String = js.native
  /** Close the DatePicker popup, if it is in opened state.
    * @returns {void}
    */
  def hide(): scala.Unit = js.native
  /** sets the date value for the DatePicker.
    * @returns {string}
    */
  def setValue(): java.lang.String = js.native
  /** Opens the DatePicker popup.
    * @returns {void}
    */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.DatePicker")
@js.native
object DatePicker extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.DatePicker = js.native
}

