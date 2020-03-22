package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndAngle extends js.Object {
  var endAngle: js.UndefOr[Double] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
}

object AnonEndAngle {
  @scala.inline
  def apply(endAngle: Int | Double = null, startAngle: Int | Double = null): AnonEndAngle = {
    val __obj = js.Dynamic.literal()
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndAngle]
  }
}

