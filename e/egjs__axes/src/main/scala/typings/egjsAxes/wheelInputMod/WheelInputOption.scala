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
  def apply(scale: js.UndefOr[Double] = js.undefined, throttle: js.UndefOr[Double] = js.undefined): WheelInputOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelInputOption]
  }
}

