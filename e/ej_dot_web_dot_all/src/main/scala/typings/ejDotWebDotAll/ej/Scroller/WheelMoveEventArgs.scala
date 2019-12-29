package typings.ejDotWebDotAll.ej.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelMoveEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the scroller model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the original event name and its event properties of the current event.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object WheelMoveEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, model: Model = null, originalEvent: js.Any = null): WheelMoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelMoveEventArgs]
  }
}

