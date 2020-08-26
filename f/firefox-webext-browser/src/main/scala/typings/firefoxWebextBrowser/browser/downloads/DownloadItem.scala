package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadItem extends js.Object {
  var byExtensionId: js.UndefOr[String] = js.native
  var byExtensionName: js.UndefOr[String] = js.native
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: Double = js.native
  var canResume: Boolean = js.native
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: DangerType = js.native
  /** Number of milliseconds between the unix epoch and when this download ended. */
  var endTime: js.UndefOr[String] = js.native
  /** Number indicating why a download was interrupted. */
  var error: js.UndefOr[InterruptReason] = js.native
  var estimatedEndTime: js.UndefOr[String] = js.native
  var exists: Boolean = js.native
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: Double = js.native
  /** Absolute local path. */
  var filename: String = js.native
  /** An identifier that is persistent across browser sessions. */
  var id: Double = js.native
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: Boolean = js.native
  /** The file's MIME type. */
  var mime: js.UndefOr[String] = js.native
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: Boolean = js.native
  var referrer: js.UndefOr[String] = js.native
  /** Number of milliseconds between the unix epoch and when this download began. */
  var startTime: String = js.native
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: State = js.native
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: Double = js.native
  /** Absolute URL. */
  var url: String = js.native
}

object DownloadItem {
  @scala.inline
  def apply(
    bytesReceived: Double,
    canResume: Boolean,
    danger: DangerType,
    exists: Boolean,
    fileSize: Double,
    filename: String,
    id: Double,
    incognito: Boolean,
    paused: Boolean,
    startTime: String,
    state: State,
    totalBytes: Double,
    url: String
  ): DownloadItem = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadItem]
  }
  @scala.inline
  implicit class DownloadItemOps[Self <: DownloadItem] (val x: Self) extends AnyVal {
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
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanResume(value: Boolean): Self = this.set("canResume", value.asInstanceOf[js.Any])
    @scala.inline
    def setDanger(value: DangerType): Self = this.set("danger", value.asInstanceOf[js.Any])
    @scala.inline
    def setExists(value: Boolean): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setByExtensionId(value: String): Self = this.set("byExtensionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByExtensionId: Self = this.set("byExtensionId", js.undefined)
    @scala.inline
    def setByExtensionName(value: String): Self = this.set("byExtensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByExtensionName: Self = this.set("byExtensionName", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setError(value: InterruptReason): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setEstimatedEndTime(value: String): Self = this.set("estimatedEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedEndTime: Self = this.set("estimatedEndTime", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
  }
  
}

