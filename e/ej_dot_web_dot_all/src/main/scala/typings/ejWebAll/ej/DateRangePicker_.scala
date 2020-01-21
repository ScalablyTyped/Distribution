package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DateRangePicker")
@js.native
class DateRangePicker_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.DateRangePicker.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.DateRangePicker.Model) = this()
  var defaults: typings.ejWebAll.ej.DateRangePicker.Model = js.native
  @JSName("model")
  var model_DateRangePicker_ : typings.ejWebAll.ej.DateRangePicker.Model = js.native
  /** Add the preset ranges to DateRangePicker popup.
    * @param {string} Display name
    * @param {any[]} StartDate and endDate of range.
    * @returns {void}
    */
  def addRanges(label: String, range: js.Array[_]): Unit = js.native
  /** Clears the all ranges selections in DateRangePicker popup
    * @returns {void}
    */
  def clearRanges(): Unit = js.native
  /** Disables the DateRangePicker control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  /** Enable the DateRangePicker control, if it is in disabled state.
    * @returns {void}
    */
  def enable(): Unit = js.native
  /** Returns the startDate and endDate values in the selected ranges in the DateRangePicker control.
    * @returns {any}
    */
  def getSelectedRange(): js.Any = js.native
  /** Close the DateRangePicker popup, if it is in opened state.
    * @returns {void}
    */
  def popupHide(): Unit = js.native
  /** Opens the DateRangePicker popup.
    * @returns {void}
    */
  def popupShow(): Unit = js.native
  /** set the preset ranges to DateRangePicker popup.
    * @returns {void}
    */
  def setRange(): Unit = js.native
}

