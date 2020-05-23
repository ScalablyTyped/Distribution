package typings.domInputevent

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
    data: js.UndefOr[Null | String] = js.undefined,
    detail: js.UndefOr[Double] = js.undefined,
    isComposing: js.UndefOr[Boolean] = js.undefined,
    view: js.UndefOr[Null | Window] = js.undefined
  ): InputEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isComposing)) __obj.updateDynamic("isComposing")(isComposing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(view)) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEventInit]
  }
}

