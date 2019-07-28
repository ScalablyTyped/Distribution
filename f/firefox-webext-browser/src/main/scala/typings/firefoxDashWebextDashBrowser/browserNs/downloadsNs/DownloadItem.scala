package typings.firefoxDashWebextDashBrowser.browserNs.downloadsNs

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
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived, canResume = canResume, danger = danger, exists = exists, fileSize = fileSize, filename = filename, id = id, incognito = incognito, paused = paused, startTime = startTime, state = state, totalBytes = totalBytes, url = url)
    if (byExtensionId != null) __obj.updateDynamic("byExtensionId")(byExtensionId)
    if (byExtensionName != null) __obj.updateDynamic("byExtensionName")(byExtensionName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (estimatedEndTime != null) __obj.updateDynamic("estimatedEndTime")(estimatedEndTime)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    __obj.asInstanceOf[DownloadItem]
  }
}

