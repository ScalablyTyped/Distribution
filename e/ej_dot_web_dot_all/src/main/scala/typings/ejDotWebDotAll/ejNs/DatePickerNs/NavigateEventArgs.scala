package typings.ejDotWebDotAll.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateEventArgs extends js.Object {
  /** returns the current date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DatePickerNs.Model] = js.undefined
  /** returns the previous view state of calendar.
    */
  var navigateFrom: js.UndefOr[String] = js.undefined
  /** returns the current view state of calendar.
    */
  var navigateTo: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the current date value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object NavigateEventArgs {
  @scala.inline
  def apply(
    date: js.Any = null,
    model: typings.ejDotWebDotAll.ejNs.DatePickerNs.Model = null,
    navigateFrom: String = null,
    navigateTo: String = null,
    `type`: String = null,
    value: String = null
  ): NavigateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (model != null) __obj.updateDynamic("model")(model)
    if (navigateFrom != null) __obj.updateDynamic("navigateFrom")(navigateFrom)
    if (navigateTo != null) __obj.updateDynamic("navigateTo")(navigateTo)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NavigateEventArgs]
  }
}

