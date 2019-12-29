package typings.ejDotWebDotAll.ej.DateTimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** returns true if change event triggered by interaction, otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the current value is valid or not
    */
  var isValidState: js.UndefOr[Boolean] = js.undefined
  /** returns the TimePicker model
    */
  var model: js.UndefOr[Model] = js.undefined
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

object ChangeEventArgs {
  @scala.inline
  def apply(
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    isValidState: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    prevDateTime: String = null,
    `type`: String = null,
    value: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(isValidState)) __obj.updateDynamic("isValidState")(isValidState.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (prevDateTime != null) __obj.updateDynamic("prevDateTime")(prevDateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

