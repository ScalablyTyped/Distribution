package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimePicker_ extends Widget_ {
  var defaults: typings.ejWebAll.ej.DateTimePicker.Model = js.native
  @JSName("model")
  var model_DateTimePicker_ : typings.ejWebAll.ej.DateTimePicker.Model = js.native
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

