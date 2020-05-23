package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndValue extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var endValue: js.UndefOr[Double] = js.undefined
  var startValue: js.UndefOr[Double] = js.undefined
}

object EndValue {
  @scala.inline
  def apply(
    color: String = null,
    endValue: js.UndefOr[Double] = js.undefined,
    startValue: js.UndefOr[Double] = js.undefined
  ): EndValue = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndValue]
  }
}

