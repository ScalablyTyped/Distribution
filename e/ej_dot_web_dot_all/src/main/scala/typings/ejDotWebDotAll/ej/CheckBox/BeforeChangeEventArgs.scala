package typings.ejDotWebDotAll.ej.CheckBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the event model values
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the status whether the element is checked or not.
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** returns the CheckBox model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.CheckBox.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.CheckBox.Model = null,
    `type`: String = null
  ): BeforeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeChangeEventArgs]
  }
}

