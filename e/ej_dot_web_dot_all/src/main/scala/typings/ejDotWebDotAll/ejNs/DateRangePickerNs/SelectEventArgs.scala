package typings.ejDotWebDotAll.ejNs.DateRangePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventArgs extends js.Object {
  /** returns the current date value.
    */
  var endDate: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DateRangePickerNs.Model] = js.undefined
  /** returns the selected date object.
    */
  var startDate: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SelectEventArgs {
  @scala.inline
  def apply(
    endDate: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.DateRangePickerNs.Model = null,
    startDate: js.Any = null,
    `type`: String = null
  ): SelectEventArgs = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (model != null) __obj.updateDynamic("model")(model)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SelectEventArgs]
  }
}

