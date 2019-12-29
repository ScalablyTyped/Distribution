package typings.ejDotWebDotAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCloseEventArgs extends js.Object {
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Current event object.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns true when the dialog activated by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeCloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    `type`: String = null
  ): BeforeCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCloseEventArgs]
  }
}

