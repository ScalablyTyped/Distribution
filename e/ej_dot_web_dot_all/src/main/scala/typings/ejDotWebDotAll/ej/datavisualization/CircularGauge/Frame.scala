package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

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
    halfCircleFrameEndAngle: Int | Double = null,
    halfCircleFrameStartAngle: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl)
    if (frameType != null) __obj.updateDynamic("frameType")(frameType.asInstanceOf[js.Any])
    if (halfCircleFrameEndAngle != null) __obj.updateDynamic("halfCircleFrameEndAngle")(halfCircleFrameEndAngle.asInstanceOf[js.Any])
    if (halfCircleFrameStartAngle != null) __obj.updateDynamic("halfCircleFrameStartAngle")(halfCircleFrameStartAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

