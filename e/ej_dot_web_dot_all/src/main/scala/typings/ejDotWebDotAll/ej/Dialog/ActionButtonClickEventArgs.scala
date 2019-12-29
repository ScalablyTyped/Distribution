package typings.ejDotWebDotAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonClickEventArgs extends js.Object {
  /** Name of the event target attribute.
    */
  var buttonID: js.UndefOr[String] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Name of the event current target title.
    */
  var currentTarget: js.UndefOr[String] = js.undefined
  /** Name of the event.
    */
  var event: js.UndefOr[String] = js.undefined
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionButtonClickEventArgs {
  @scala.inline
  def apply(
    buttonID: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentTarget: String = null,
    event: String = null,
    model: Model = null,
    `type`: String = null
  ): ActionButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (buttonID != null) __obj.updateDynamic("buttonID")(buttonID.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonClickEventArgs]
  }
}

