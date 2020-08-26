package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoFileDetails extends js.Object {
  var audioStreams: js.UndefOr[js.Array[VideoFileDetailsAudioStream]] = js.native
  var bitrateBps: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var durationMs: js.UndefOr[String] = js.native
  var fileName: js.UndefOr[String] = js.native
  var fileSize: js.UndefOr[String] = js.native
  var fileType: js.UndefOr[String] = js.native
  var videoStreams: js.UndefOr[js.Array[VideoFileDetailsVideoStream]] = js.native
}

object VideoFileDetails {
  @scala.inline
  def apply(): VideoFileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFileDetails]
  }
  @scala.inline
  implicit class VideoFileDetailsOps[Self <: VideoFileDetails] (val x: Self) extends AnyVal {
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
    def setAudioStreamsVarargs(value: VideoFileDetailsAudioStream*): Self = this.set("audioStreams", js.Array(value :_*))
    @scala.inline
    def setAudioStreams(value: js.Array[VideoFileDetailsAudioStream]): Self = this.set("audioStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioStreams: Self = this.set("audioStreams", js.undefined)
    @scala.inline
    def setBitrateBps(value: String): Self = this.set("bitrateBps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrateBps: Self = this.set("bitrateBps", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setVideoStreamsVarargs(value: VideoFileDetailsVideoStream*): Self = this.set("videoStreams", js.Array(value :_*))
    @scala.inline
    def setVideoStreams(value: js.Array[VideoFileDetailsVideoStream]): Self = this.set("videoStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoStreams: Self = this.set("videoStreams", js.undefined)
  }
  
}

