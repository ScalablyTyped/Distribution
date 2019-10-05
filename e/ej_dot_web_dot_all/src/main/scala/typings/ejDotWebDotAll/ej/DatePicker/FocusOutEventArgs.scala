package typings.ejDotWebDotAll.ej.DatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOutEventArgs extends js.Object {
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.DatePicker.Model] = js.undefined
  /** returns the previously selected date value.
    */
  var prevDate: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the currently selected date value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object FocusOutEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ej.DatePicker.Model = null,
    prevDate: String = null,
    `type`: String = null,
    value: String = null
  ): FocusOutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevDate != null) __obj.updateDynamic("prevDate")(prevDate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FocusOutEventArgs]
  }
}

