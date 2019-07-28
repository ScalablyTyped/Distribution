package typings.ejDotWebDotAll.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DatePickerNs.Model] = js.undefined
  /** returns the previously selected value.
    */
  var prevDate: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the DatePicker input value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ejNs.DatePickerNs.Model = null,
    prevDate: String = null,
    `type`: String = null,
    value: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevDate != null) __obj.updateDynamic("prevDate")(prevDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

