package typings.ejDotWebDotAll.ej.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** returns true when the value changed by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TimePicker.Model] = js.undefined
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

object ChangeEventArgs {
  @scala.inline
  def apply(
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.TimePicker.Model = null,
    prevTime: String = null,
    `type`: String = null,
    value: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevTime != null) __obj.updateDynamic("prevTime")(prevTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

