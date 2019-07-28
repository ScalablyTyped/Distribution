package typings.ejDotWebDotAll.ejNs.ScrollerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelStopEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the scroller model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.ScrollerNs.Model] = js.undefined
  /** returns the original event name and its event properties of the current event.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object WheelStopEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ejNs.ScrollerNs.Model = null,
    originalEvent: js.Any = null,
    `type`: String = null
  ): WheelStopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WheelStopEventArgs]
  }
}

