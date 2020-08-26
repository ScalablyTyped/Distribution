package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoFileDetailsVideoStream extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.native
  var bitrateBps: js.UndefOr[String] = js.native
  var codec: js.UndefOr[String] = js.native
  var frameRateFps: js.UndefOr[Double] = js.native
  var heightPixels: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[String] = js.native
  var vendor: js.UndefOr[String] = js.native
  var widthPixels: js.UndefOr[Double] = js.native
}

object VideoFileDetailsVideoStream {
  @scala.inline
  def apply(): VideoFileDetailsVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFileDetailsVideoStream]
  }
  @scala.inline
  implicit class VideoFileDetailsVideoStreamOps[Self <: VideoFileDetailsVideoStream] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setBitrateBps(value: String): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrateBps: Self = this.set("bitrateBps", js.undefined)
    @scala.inline
    def setCodec(value: String): Self = this.set("codec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    @scala.inline
    def setFrameRateFps(value: Double): Self = this.set("frameRateFps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRateFps: Self = this.set("frameRateFps", js.undefined)
    @scala.inline
    def setHeightPixels(value: Double): Self = this.set("heightPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightPixels: Self = this.set("heightPixels", js.undefined)
    @scala.inline
    def setRotation(value: String): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
    @scala.inline
    def setWidthPixels(value: Double): Self = this.set("widthPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthPixels: Self = this.set("widthPixels", js.undefined)
  }
  
}

