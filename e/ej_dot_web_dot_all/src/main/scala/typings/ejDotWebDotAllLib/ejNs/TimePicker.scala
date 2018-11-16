package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TimePicker")
@js.native
class TimePicker protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.TimePickerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.TimePickerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.TimePickerNs.Model = js.native
  @JSName("model")
  var model_TimePicker: ejDotWebDotAllLib.ejNs.TimePickerNs.Model = js.native
  /** Allows you to disable the TimePicker.
           * @returns {void}
           */
  def disable(): scala.Unit = js.native
  /** Allows you to enable the TimePicker.
           * @returns {void}
           */
  def enable(): scala.Unit = js.native
  /** It returns the current time value.
           * @returns {string}
           */
  def getValue(): java.lang.String = js.native
  /** This method will hide the TimePicker control popup.
           * @returns {void}
           */
  def hide(): scala.Unit = js.native
  /** Updates the current system time in TimePicker.
           * @returns {void}
           */
  def setCurrentTime(): scala.Unit = js.native
  /** This method will show the TimePicker control popup.
           * @returns {void}
           */
  def show(): scala.Unit = js.native
}

@JSGlobal("ej.TimePicker")
@js.native
object TimePicker extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.TimePicker = js.native
}

