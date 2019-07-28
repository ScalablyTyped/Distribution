package typings.ejDotWebDotAll.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEventArgs extends js.Object {
  /** returns the current date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DatePickerNs.Model] = js.undefined
  /** returns the previously selected value.
    */
  var prevDate: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the current date value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object OpenEventArgs {
  @scala.inline
  def apply(
    date: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.DatePickerNs.Model = null,
    prevDate: String = null,
    `type`: String = null,
    value: String = null
  ): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevDate != null) __obj.updateDynamic("prevDate")(prevDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OpenEventArgs]
  }
}

