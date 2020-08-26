package typings.domMediacaptureRecord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRecorderOptions extends js.Object {
  var audioBitrateMode: js.UndefOr[BitrateMode] = js.native
  var audioBitsPerSecond: js.UndefOr[Double] = js.native
  var bitsPerSecond: js.UndefOr[Double] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var videoBitsPerSecond: js.UndefOr[Double] = js.native
}

object MediaRecorderOptions {
  @scala.inline
  def apply(): MediaRecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaRecorderOptions]
  }
  @scala.inline
  implicit class MediaRecorderOptionsOps[Self <: MediaRecorderOptions] (val x: Self) extends AnyVal {
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
    def setAudioBitrateMode(value: BitrateMode): Self = this.set("audioBitrateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioBitrateMode: Self = this.set("audioBitrateMode", js.undefined)
    @scala.inline
    def setAudioBitsPerSecond(value: Double): Self = this.set("audioBitsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioBitsPerSecond: Self = this.set("audioBitsPerSecond", js.undefined)
    @scala.inline
    def setBitsPerSecond(value: Double): Self = this.set("bitsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitsPerSecond: Self = this.set("bitsPerSecond", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setVideoBitsPerSecond(value: Double): Self = this.set("videoBitsPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoBitsPerSecond: Self = this.set("videoBitsPerSecond", js.undefined)
  }
  
}

