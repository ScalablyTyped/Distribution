package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDownload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of a
    * download should be sent to the backend.
    */
  var completeNotification: js.UndefOr[Boolean] = js.native
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the download service if one is used for download.
    */
  var downloadService: js.UndefOr[String] = js.native
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[String] = js.native
  /** Whether download is enabled. */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional maximum acceptable size for direct download.
    * The size is specified in bytes.
    */
  var maxDirectDownloadSize: js.UndefOr[String] = js.native
  /**
    * A boolean that determines if direct download from ESF should be used for
    * download of this media.
    */
  var useDirectDownload: js.UndefOr[Boolean] = js.native
}

object MediaDownload {
  @scala.inline
  def apply(): MediaDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaDownload]
  }
  @scala.inline
  implicit class MediaDownloadOps[Self <: MediaDownload] (val x: Self) extends AnyVal {
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
    def setCompleteNotification(value: Boolean): Self = this.set("completeNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteNotification: Self = this.set("completeNotification", js.undefined)
    @scala.inline
    def setDownloadService(value: String): Self = this.set("downloadService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadService: Self = this.set("downloadService", js.undefined)
    @scala.inline
    def setDropzone(value: String): Self = this.set("dropzone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropzone: Self = this.set("dropzone", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMaxDirectDownloadSize(value: String): Self = this.set("maxDirectDownloadSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDirectDownloadSize: Self = this.set("maxDirectDownloadSize", js.undefined)
    @scala.inline
    def setUseDirectDownload(value: Boolean): Self = this.set("useDirectDownload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDirectDownload: Self = this.set("useDirectDownload", js.undefined)
  }
  
}

