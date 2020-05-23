package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePicker_ extends Widget_ {
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

