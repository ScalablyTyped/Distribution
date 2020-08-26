package typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginFrameResponse extends js.Object {
  /**
    * Whether the BeginFrame resulted in damage and, thus, a new frame was committed to the
    * display. Reported for diagnostic uses, may be removed in the future.
    */
  var hasDamage: Boolean = js.native
  /**
    * Base64-encoded image data of the screenshot, if one was requested and successfully taken.
    */
  var screenshotData: js.UndefOr[String] = js.native
}

object BeginFrameResponse {
  @scala.inline
  def apply(hasDamage: Boolean): BeginFrameResponse = {
    val __obj = js.Dynamic.literal(hasDamage = hasDamage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginFrameResponse]
  }
  @scala.inline
  implicit class BeginFrameResponseOps[Self <: BeginFrameResponse] (val x: Self) extends AnyVal {
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
    def setHasDamage(value: Boolean): Self = this.set("hasDamage", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenshotData(value: String): Self = this.set("screenshotData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenshotData: Self = this.set("screenshotData", js.undefined)
  }
  
}

