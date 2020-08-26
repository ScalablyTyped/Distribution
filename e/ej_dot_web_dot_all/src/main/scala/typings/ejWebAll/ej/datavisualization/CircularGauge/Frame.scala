package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  /** Specify the URL of the frame background image for circular gauge
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.native
  /** Specifies the frameType of circular gauge. See
    * @Default {FullCircle}
    */
  var frameType: js.UndefOr[FrameType | String] = js.native
  /** Specifies the end angle for the half circular frame.
    * @Default {360}
    */
  var halfCircleFrameEndAngle: js.UndefOr[Double] = js.native
  /** Specifies the start angle for the half circular frame.
    * @Default {180}
    */
  var halfCircleFrameStartAngle: js.UndefOr[Double] = js.native
}

object Frame {
  @scala.inline
  def apply(): Frame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundImageUrl(value: String): Self = this.set("backgroundImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImageUrl: Self = this.set("backgroundImageUrl", js.undefined)
    @scala.inline
    def setFrameType(value: FrameType | String): Self = this.set("frameType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameType: Self = this.set("frameType", js.undefined)
    @scala.inline
    def setHalfCircleFrameEndAngle(value: Double): Self = this.set("halfCircleFrameEndAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfCircleFrameEndAngle: Self = this.set("halfCircleFrameEndAngle", js.undefined)
    @scala.inline
    def setHalfCircleFrameStartAngle(value: Double): Self = this.set("halfCircleFrameStartAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfCircleFrameStartAngle: Self = this.set("halfCircleFrameStartAngle", js.undefined)
  }
  
}

