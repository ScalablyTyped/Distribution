package typings.atEgjsAxes.inputTypePanInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanInputOption extends js.Object {
  var inputType: js.UndefOr[js.Array[String]] = js.undefined
  var scale: js.UndefOr[js.Array[Double]] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var thresholdAngle: js.UndefOr[Double] = js.undefined
}

object PanInputOption {
  @scala.inline
  def apply(
    inputType: js.Array[String] = null,
    scale: js.Array[Double] = null,
    threshold: Int | Double = null,
    thresholdAngle: Int | Double = null
  ): PanInputOption = {
    val __obj = js.Dynamic.literal()
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (thresholdAngle != null) __obj.updateDynamic("thresholdAngle")(thresholdAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanInputOption]
  }
}

