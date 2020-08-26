package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typings.devtoolsProtocol.devtoolsProtocolStrings.png
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureScreenshotRequest extends js.Object {
  /**
    * Capture the screenshot of a given region only.
    */
  var clip: js.UndefOr[Viewport] = js.native
  /**
    * Image compression format (defaults to png). (CaptureScreenshotRequestFormat enum)
    */
  var format: js.UndefOr[jpeg | png] = js.native
  /**
    * Capture the screenshot from the surface, rather than the view. Defaults to true.
    */
  var fromSurface: js.UndefOr[Boolean] = js.native
  /**
    * Compression quality from range [0..100] (jpeg only).
    */
  var quality: js.UndefOr[integer] = js.native
}

object CaptureScreenshotRequest {
  @scala.inline
  def apply(): CaptureScreenshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureScreenshotRequest]
  }
  @scala.inline
  implicit class CaptureScreenshotRequestOps[Self <: CaptureScreenshotRequest] (val x: Self) extends AnyVal {
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
    def setClip(value: Viewport): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def setFormat(value: jpeg | png): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFromSurface(value: Boolean): Self = this.set("fromSurface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromSurface: Self = this.set("fromSurface", js.undefined)
    @scala.inline
    def setQuality(value: integer): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

