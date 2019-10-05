package typings.ejDotWebDotAll.ej.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the scroller model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Scroller.Model] = js.undefined
  /** returns the original event name and its event properties of the current event.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  /** returns the current data related to the event.
    */
  var scrollData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object WheelStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.Scroller.Model = null,
    originalEvent: js.Any = null,
    scrollData: js.Any = null,
    `type`: String = null
  ): WheelStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (scrollData != null) __obj.updateDynamic("scrollData")(scrollData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WheelStartEventArgs]
  }
}

