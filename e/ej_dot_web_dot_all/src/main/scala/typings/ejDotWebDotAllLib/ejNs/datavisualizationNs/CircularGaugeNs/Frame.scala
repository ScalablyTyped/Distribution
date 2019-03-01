package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  /** Specify the URL of the frame background image for circular gauge
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the frameType of circular gauge. See
    * @Default {FullCircle}
    */
  var frameType: js.UndefOr[FrameType | java.lang.String] = js.undefined
  /** Specifies the end angle for the half circular frame.
    * @Default {360}
    */
  var halfCircleFrameEndAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the start angle for the half circular frame.
    * @Default {180}
    */
  var halfCircleFrameStartAngle: js.UndefOr[scala.Double] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    backgroundImageUrl: java.lang.String = null,
    frameType: FrameType | java.lang.String = null,
    halfCircleFrameEndAngle: scala.Int | scala.Double = null,
    halfCircleFrameStartAngle: scala.Int | scala.Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageUrl != null) __obj.updateDynamic("backgroundImageUrl")(backgroundImageUrl)
    if (frameType != null) __obj.updateDynamic("frameType")(frameType.asInstanceOf[js.Any])
    if (halfCircleFrameEndAngle != null) __obj.updateDynamic("halfCircleFrameEndAngle")(halfCircleFrameEndAngle.asInstanceOf[js.Any])
    if (halfCircleFrameStartAngle != null) __obj.updateDynamic("halfCircleFrameStartAngle")(halfCircleFrameStartAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

