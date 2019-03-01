package typings
package atEgjsAxesLib.inputTypePanInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanInputOption extends js.Object {
  var inputType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scale: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var thresholdAngle: js.UndefOr[scala.Double] = js.undefined
}

object PanInputOption {
  @scala.inline
  def apply(
    inputType: js.Array[java.lang.String] = null,
    scale: js.Array[scala.Double] = null,
    threshold: scala.Int | scala.Double = null,
    thresholdAngle: scala.Int | scala.Double = null
  ): PanInputOption = {
    val __obj = js.Dynamic.literal()
    if (inputType != null) __obj.updateDynamic("inputType")(inputType)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (thresholdAngle != null) __obj.updateDynamic("thresholdAngle")(thresholdAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanInputOption]
  }
}

