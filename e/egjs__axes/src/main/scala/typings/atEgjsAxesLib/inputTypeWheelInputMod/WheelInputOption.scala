package typings
package atEgjsAxesLib.inputTypeWheelInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelInputOption extends js.Object {
  var scale: js.UndefOr[scala.Double] = js.undefined
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

object WheelInputOption {
  @scala.inline
  def apply(scale: scala.Int | scala.Double = null, throttle: scala.Int | scala.Double = null): WheelInputOption = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelInputOption]
  }
}

