package typings
package domDashInputeventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEventInit
  extends stdLib.UIEventInit {
  var data: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var isComposing: js.UndefOr[scala.Boolean] = js.undefined
}

object InputEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    data: java.lang.String = null,
    detail: scala.Int | scala.Double = null,
    isComposing: js.UndefOr[scala.Boolean] = js.undefined,
    view: stdLib.Window = null
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

