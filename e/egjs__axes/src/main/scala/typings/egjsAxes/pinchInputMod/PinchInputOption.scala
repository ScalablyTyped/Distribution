package typings.egjsAxes.pinchInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchInputOption extends js.Object {
  var scale: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PinchInputOption {
  @scala.inline
  def apply(scale: js.UndefOr[Double] = js.undefined, threshold: js.UndefOr[Double] = js.undefined): PinchInputOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchInputOption]
  }
}

