package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndValue extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var endValue: js.UndefOr[Double] = js.undefined
  var startValue: js.UndefOr[Double] = js.undefined
}

object AnonEndValue {
  @scala.inline
  def apply(color: String = null, endValue: Int | Double = null, startValue: Int | Double = null): AnonEndValue = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndValue]
  }
}

