package typings.ejDotWebDotAll.ej.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOpenEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the TimePicker model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.TimePicker.Model] = js.undefined
  /** returns the previously selected time value
    */
  var prevTime: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the time value
    */
  var value: js.UndefOr[String] = js.undefined
}

object BeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.TimePicker.Model = null,
    prevTime: String = null,
    `type`: String = null,
    value: String = null
  ): BeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (prevTime != null) __obj.updateDynamic("prevTime")(prevTime)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BeforeOpenEventArgs]
  }
}

