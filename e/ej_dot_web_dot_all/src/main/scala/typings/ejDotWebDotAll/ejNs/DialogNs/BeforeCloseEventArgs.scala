package typings.ejDotWebDotAll.ejNs.DialogNs

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
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.DialogNs.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ejNs.DialogNs.Model = null,
    `type`: String = null
  ): BeforeCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (event != null) __obj.updateDynamic("event")(event)
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeCloseEventArgs]
  }
}

