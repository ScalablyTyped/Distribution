package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specify the URL of the frame background image for circular gauge
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.undefined
  /** Specifies the frameType of circular gauge. See
    * @Default {FullCircle}
    */
  var frameType: js.UndefOr[FrameType | String] = js.undefined
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
    backgroundImageUrl: String = null,
    frameType: FrameType | String = null,
    halfCircleFrameEndAngle: js.UndefOr[Double] = js.undefined,
    halfCircleFrameStartAngle: js.UndefOr[Double] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl.asInstanceOf[js.Any])
    if (frameType != null) __obj.updateDynamic("frameType")(frameType.asInstanceOf[js.Any])
    if (!js.isUndefined(halfCircleFrameEndAngle)) __obj.updateDynamic("halfCircleFrameEndAngle")(halfCircleFrameEndAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(halfCircleFrameStartAngle)) __obj.updateDynamic("halfCircleFrameStartAngle")(halfCircleFrameStartAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

