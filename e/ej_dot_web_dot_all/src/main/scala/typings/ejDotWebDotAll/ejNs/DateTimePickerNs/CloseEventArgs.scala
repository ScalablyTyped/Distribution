package typings.ejDotWebDotAll.ejNs.DateTimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DateTimePickerNs.Model] = js.undefined
  /** returns the previously selected date time value
    */
  var prevDateTime: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the modified datetime value
    */
  var value: js.UndefOr[String] = js.undefined
}

object CloseEventArgs {
  @scala.inline
  def apply(
    model: typings.ejDotWebDotAll.ejNs.DateTimePickerNs.Model = null,
    prevDateTime: String = null,
    `type`: String = null,
    value: String = null
  ): CloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevDateTime != null) __obj.updateDynamic("prevDateTime")(prevDateTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CloseEventArgs]
  }
}

