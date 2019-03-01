package typings
package ejDotWebDotAllLib.ejNs.TimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns true when the value changed by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the previously selected time value
    */
  var prevTime: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the modified time value
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    isInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    prevTime: java.lang.String = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevTime != null) __obj.updateDynamic("prevTime")(prevTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

