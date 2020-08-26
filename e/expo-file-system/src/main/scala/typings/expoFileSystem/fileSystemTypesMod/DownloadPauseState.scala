package typings.expoFileSystem.fileSystemTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadPauseState extends js.Object {
  var fileUri: String = js.native
  var options: DownloadOptions = js.native
  var resumeData: js.UndefOr[String] = js.native
  var url: String = js.native
}

object DownloadPauseState {
  @scala.inline
  def apply(fileUri: String, options: DownloadOptions, url: String): DownloadPauseState = {
    val __obj = js.Dynamic.literal(fileUri = fileUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPauseState]
  }
  @scala.inline
  implicit class DownloadPauseStateOps[Self <: DownloadPauseState] (val x: Self) extends AnyVal {
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
    def setFileUri(value: String): Self = this.set("fileUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: DownloadOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setResumeData(value: String): Self = this.set("resumeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResumeData: Self = this.set("resumeData", js.undefined)
  }
  
}

