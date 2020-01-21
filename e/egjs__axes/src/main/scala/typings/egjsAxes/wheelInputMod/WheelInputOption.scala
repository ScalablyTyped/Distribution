package typings.egjsAxes.wheelInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelInputOption extends js.Object {
  var scale: js.UndefOr[Double] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
}

object WheelInputOption {
  @scala.inline
  def apply(scale: Int | Double = null, throttle: Int | Double = null): WheelInputOption = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelInputOption]
  }
}

