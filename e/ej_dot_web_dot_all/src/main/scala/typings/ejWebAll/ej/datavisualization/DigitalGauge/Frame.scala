package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  /** Specifies the URL of an image to be displayed as background of the Digital gauge.
    * @Default {null}
    */
  var backgroundImageUrl: js.UndefOr[String] = js.native
  /** Specifies the inner width for the frame, when the background image has been set for the Digital gauge..
    * @Default {6}
    */
  var innerWidth: js.UndefOr[Double] = js.native
  /** Specifies the outer width of the frame, when the background image has been set for the Digital gauge.
    * @Default {10}
    */
  var outerWidth: js.UndefOr[Double] = js.native
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
    def setInnerWidth(value: Double): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerWidth: Self = this.set("innerWidth", js.undefined)
    @scala.inline
    def setOuterWidth(value: Double): Self = this.set("outerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterWidth: Self = this.set("outerWidth", js.undefined)
  }
  
}

