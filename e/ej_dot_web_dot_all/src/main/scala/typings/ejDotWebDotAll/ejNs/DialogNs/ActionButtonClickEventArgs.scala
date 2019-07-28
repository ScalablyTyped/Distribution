package typings.ejDotWebDotAll.ejNs.DialogNs

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DialogNs.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ejNs.DialogNs.Model = null,
    `type`: String = null
  ): ActionButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (buttonID != null) __obj.updateDynamic("buttonID")(buttonID)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionButtonClickEventArgs]
  }
}

