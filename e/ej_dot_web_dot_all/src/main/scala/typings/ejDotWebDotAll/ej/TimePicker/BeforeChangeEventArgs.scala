package typings.ejDotWebDotAll.ej.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeChangeEventArgs extends js.Object {
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.undefined
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
  def apply(model: Model = null, prevTime: String = null, `type`: String = null, value: String = null): BeforeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevTime != null) __obj.updateDynamic("prevTime")(prevTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeChangeEventArgs]
  }
}

