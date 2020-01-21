package typings.ejWebAll.ej.DatePicker

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
    model: Model = null,
    navigateFrom: String = null,
    navigateTo: String = null,
    `type`: String = null,
    value: String = null
  ): NavigateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (navigateFrom != null) __obj.updateDynamic("navigateFrom")(navigateFrom.asInstanceOf[js.Any])
    if (navigateTo != null) __obj.updateDynamic("navigateTo")(navigateTo.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateEventArgs]
  }
}

