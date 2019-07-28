package typings.ejDotWebDotAll.ejNs.DateRangePickerNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventArgs extends js.Object {
  /** returns the current date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker popup.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** returns the DateRangePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DateRangePickerNs.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CloseEventArgs {
  @scala.inline
  def apply(
    date: js.Any = null,
    element: HTMLElement = null,
    model: typings.ejDotWebDotAll.ejNs.DateRangePickerNs.Model = null,
    `type`: String = null
  ): CloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CloseEventArgs]
  }
}

