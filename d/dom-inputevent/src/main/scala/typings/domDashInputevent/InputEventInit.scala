package typings.domDashInputevent

import typings.std.UIEventInit
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEventInit extends UIEventInit {
  var data: js.UndefOr[String | Null] = js.undefined
  var isComposing: js.UndefOr[Boolean] = js.undefined
}

object InputEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    data: String = null,
    detail: Int | Double = null,
    isComposing: js.UndefOr[Boolean] = js.undefined,
    view: Window = null
  ): InputEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (data != null) __obj.updateDynamic("data")(data)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(isComposing)) __obj.updateDynamic("isComposing")(isComposing)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[InputEventInit]
  }
}

