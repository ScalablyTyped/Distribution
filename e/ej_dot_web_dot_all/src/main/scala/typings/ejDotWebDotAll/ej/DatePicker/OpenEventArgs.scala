package typings.ejDotWebDotAll.ej.DatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEventArgs extends js.Object {
  /** returns the current date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[Model] = js.undefined
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
    model: Model = null,
    prevDate: String = null,
    `type`: String = null,
    value: String = null
  ): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevDate != null) __obj.updateDynamic("prevDate")(prevDate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenEventArgs]
  }
}

