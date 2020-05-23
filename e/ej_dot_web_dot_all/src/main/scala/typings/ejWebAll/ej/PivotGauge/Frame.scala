package typings.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specifies the frame type of PivotGauge.
    * @Default {fullcircle}
    */
  var frameType: js.UndefOr[String] = js.undefined
  /** Specifies the end angle for the half circular frame.
    * @Default {360}
    */
  var halfCircleFrameEndAngle: js.UndefOr[Double] = js.undefined
  /** Specifies the start angle for the half circular frame.
    * @Default {180}
    */
  var halfCircleFrameStartAngle: js.UndefOr[Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    frameType: String = null,
    halfCircleFrameEndAngle: js.UndefOr[Double] = js.undefined,
    halfCircleFrameStartAngle: js.UndefOr[Double] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (frameType != null) __obj.updateDynamic("frameType")(frameType.asInstanceOf[js.Any])
    if (!js.isUndefined(halfCircleFrameEndAngle)) __obj.updateDynamic("halfCircleFrameEndAngle")(halfCircleFrameEndAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(halfCircleFrameStartAngle)) __obj.updateDynamic("halfCircleFrameStartAngle")(halfCircleFrameStartAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

