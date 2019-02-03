package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DateRangePicker")
@js.native
class DateRangePicker protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.DateRangePickerNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.DateRangePickerNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.DateRangePickerNs.Model = js.native
  @JSName("model")
  var model_DateRangePicker: ejDotWebDotAllLib.ejNs.DateRangePickerNs.Model = js.native
  /** Add the preset ranges to DateRangePicker popup.
    * @param {string} Display name
    * @param {any[]} StartDate and endDate of range.
    * @returns {void}
    */
  def addRanges(label: java.lang.String, range: js.Array[_]): scala.Unit = js.native
  /** Clears the all ranges selections in DateRangePicker popup
    * @returns {void}
    */
  def clearRanges(): scala.Unit = js.native
  /** Disables the DateRangePicker control.
    * @returns {void}
    */
  def disable(): scala.Unit = js.native
  /** Enable the DateRangePicker control, if it is in disabled state.
    * @returns {void}
    */
  def enable(): scala.Unit = js.native
  /** Returns the startDate and endDate values in the selected ranges in the DateRangePicker control.
    * @returns {any}
    */
  def getSelectedRange(): js.Any = js.native
  /** Close the DateRangePicker popup, if it is in opened state.
    * @returns {void}
    */
  def popupHide(): scala.Unit = js.native
  /** Opens the DateRangePicker popup.
    * @returns {void}
    */
  def popupShow(): scala.Unit = js.native
  /** set the preset ranges to DateRangePicker popup.
    * @returns {void}
    */
  def setRange(): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.DateRangePicker")
@js.native
object DateRangePicker extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.DateRangePicker = js.native
}

