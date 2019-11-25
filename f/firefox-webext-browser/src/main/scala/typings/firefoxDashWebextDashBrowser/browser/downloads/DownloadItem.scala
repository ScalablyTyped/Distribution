package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadItem extends js.Object {
  var byExtensionId: js.UndefOr[String] = js.undefined
  var byExtensionName: js.UndefOr[String] = js.undefined
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: Double
  var canResume: Boolean
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: DangerType
  /** Number of milliseconds between the unix epoch and when this download ended. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Number indicating why a download was interrupted. */
  var error: js.UndefOr[InterruptReason] = js.undefined
  var estimatedEndTime: js.UndefOr[String] = js.undefined
  var exists: Boolean
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: Double
  /** Absolute local path. */
  var filename: String
  /** An identifier that is persistent across browser sessions. */
  var id: Double
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: Boolean
  /** The file's MIME type. */
  var mime: js.UndefOr[String] = js.undefined
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: Boolean
  var referrer: js.UndefOr[String] = js.undefined
  /** Number of milliseconds between the unix epoch and when this download began. */
  var startTime: String
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: State
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: Double
  /** Absolute URL. */
  var url: String
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
    url: String,
    byExtensionId: String = null,
    byExtensionName: String = null,
    endTime: String = null,
    error: InterruptReason = null,
    estimatedEndTime: String = null,
    mime: String = null,
    referrer: String = null
  ): DownloadItem = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], canResume = canResume.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (byExtensionId != null) __obj.updateDynamic("byExtensionId")(byExtensionId.asInstanceOf[js.Any])
    if (byExtensionName != null) __obj.updateDynamic("byExtensionName")(byExtensionName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (estimatedEndTime != null) __obj.updateDynamic("estimatedEndTime")(estimatedEndTime.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadItem]
  }
}

