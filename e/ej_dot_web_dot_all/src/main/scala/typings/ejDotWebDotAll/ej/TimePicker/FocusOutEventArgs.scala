package typings.ejDotWebDotAll.ej.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOutEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TimePicker.Model] = js.undefined
  /** returns the previously selected time value
    */
  var prevTime: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the current time value
    */
  var value: js.UndefOr[String] = js.undefined
}

object FocusOutEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ej.TimePicker.Model = null,
    prevTime: String = null,
    `type`: String = null,
    value: String = null
  ): FocusOutEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevTime != null) __obj.updateDynamic("prevTime")(prevTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FocusOutEventArgs]
  }
}

