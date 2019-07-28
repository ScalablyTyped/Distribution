package typings.ejDotWebDotAll.ejNs.TimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeChangeEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.TimePickerNs.Model] = js.undefined
  /** returns the previously selected time value
    */
  var prevTime: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the modified time value
    */
  var value: js.UndefOr[String] = js.undefined
}

object BeforeChangeEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ejNs.TimePickerNs.Model = null,
    prevTime: String = null,
    `type`: String = null,
    value: String = null
  ): BeforeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevTime != null) __obj.updateDynamic("prevTime")(prevTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BeforeChangeEventArgs]
  }
}

