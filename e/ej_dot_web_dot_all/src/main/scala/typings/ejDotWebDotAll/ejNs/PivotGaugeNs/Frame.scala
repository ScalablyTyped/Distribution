package typings.ejDotWebDotAll.ejNs.PivotGaugeNs

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
    halfCircleFrameEndAngle: Int | Double = null,
    halfCircleFrameStartAngle: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (frameType != null) __obj.updateDynamic("frameType")(frameType)
    if (halfCircleFrameEndAngle != null) __obj.updateDynamic("halfCircleFrameEndAngle")(halfCircleFrameEndAngle.asInstanceOf[js.Any])
    if (halfCircleFrameStartAngle != null) __obj.updateDynamic("halfCircleFrameStartAngle")(halfCircleFrameStartAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

