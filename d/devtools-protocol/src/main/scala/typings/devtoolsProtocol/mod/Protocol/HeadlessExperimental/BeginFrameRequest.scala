package typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginFrameRequest extends js.Object {
  /**
    * Timestamp of this BeginFrame in Renderer TimeTicks (milliseconds of uptime). If not set,
    * the current time will be used.
    */
  var frameTimeTicks: js.UndefOr[Double] = js.native
  /**
    * The interval between BeginFrames that is reported to the compositor, in milliseconds.
    * Defaults to a 60 frames/second interval, i.e. about 16.666 milliseconds.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Whether updates should not be committed and drawn onto the display. False by default. If
    * true, only side effects of the BeginFrame will be run, such as layout and animations, but
    * any visual updates may not be visible on the display or in screenshots.
    */
  var noDisplayUpdates: js.UndefOr[Boolean] = js.native
  /**
    * If set, a screenshot of the frame will be captured and returned in the response. Otherwise,
    * no screenshot will be captured. Note that capturing a screenshot can fail, for example,
    * during renderer initialization. In such a case, no screenshot data will be returned.
    */
  var screenshot: js.UndefOr[ScreenshotParams] = js.native
}

object BeginFrameRequest {
  @scala.inline
  def apply(): BeginFrameRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginFrameRequest]
  }
  @scala.inline
  implicit class BeginFrameRequestOps[Self <: BeginFrameRequest] (val x: Self) extends AnyVal {
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
    def setFrameTimeTicks(value: Double): Self = this.set("frameTimeTicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameTimeTicks: Self = this.set("frameTimeTicks", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setNoDisplayUpdates(value: Boolean): Self = this.set("noDisplayUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDisplayUpdates: Self = this.set("noDisplayUpdates", js.undefined)
    @scala.inline
    def setScreenshot(value: ScreenshotParams): Self = this.set("screenshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshot: Self = this.set("screenshot", js.undefined)
  }
  
}

