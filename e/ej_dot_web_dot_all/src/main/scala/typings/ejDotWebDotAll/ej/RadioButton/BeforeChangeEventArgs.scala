package typings.ejDotWebDotAll.ej.RadioButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns true if element is checked, otherwise returns false
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** returns true if change event triggered by interaction, otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** returns the RadioButton model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.RadioButton.Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.RadioButton.Model = null,
    `type`: String = null
  ): BeforeChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeChangeEventArgs]
  }
}

