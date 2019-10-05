package typings.ejDotWebDotAll.ej.DateRangePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** returns the endDate of the DateRangePicker popup.
    */
  var endDate: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.DateRangePicker.Model] = js.undefined
  /** returns the startDate of DateRangePicker.
    */
  var startDate: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the DateRangePicker input value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    endDate: js.Any = null,
    model: typings.ejDotWebDotAll.ej.DateRangePicker.Model = null,
    startDate: js.Any = null,
    `type`: String = null,
    value: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (model != null) __obj.updateDynamic("model")(model)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

