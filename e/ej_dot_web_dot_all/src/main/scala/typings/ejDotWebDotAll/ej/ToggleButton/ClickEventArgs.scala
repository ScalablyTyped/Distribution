package typings.ejDotWebDotAll.ej.ToggleButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** return the toggle button checked state
    */
  var isChecked: js.UndefOr[Boolean] = js.undefined
  /** returns the toggle button model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.ToggleButton.Model] = js.undefined
  /** return the toggle button state
    */
  var status: js.UndefOr[Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.ToggleButton.Model = null,
    status: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClickEventArgs]
  }
}

