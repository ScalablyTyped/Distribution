package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateEventArgs extends js.Object {
  /** returns the current date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the previous view state of calendar.
    */
  var navigateFrom: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current view state of calendar.
    */
  var navigateTo: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the current date value.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object NavigateEventArgs {
  @scala.inline
  def apply(
    date: js.Any = null,
    model: Model = null,
    navigateFrom: java.lang.String = null,
    navigateTo: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
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

