package typings
package firefoxDashWebextDashBrowserLib.browserNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadItem extends js.Object {
  var byExtensionId: js.UndefOr[java.lang.String] = js.undefined
  var byExtensionName: js.UndefOr[java.lang.String] = js.undefined
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: scala.Double
  var canResume: scala.Boolean
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: DangerType
  /** Number of milliseconds between the unix epoch and when this download ended. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Number indicating why a download was interrupted. */
  var error: js.UndefOr[InterruptReason] = js.undefined
  var estimatedEndTime: js.UndefOr[java.lang.String] = js.undefined
  var exists: scala.Boolean
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: scala.Double
  /** Absolute local path. */
  var filename: java.lang.String
  /** An identifier that is persistent across browser sessions. */
  var id: scala.Double
  /** False if this download is recorded in the history, true if it is not recorded. */
  var incognito: scala.Boolean
  /** The file's MIME type. */
  var mime: java.lang.String
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: scala.Boolean
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  /** Number of milliseconds between the unix epoch and when this download began. */
  var startTime: java.lang.String
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: State
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: scala.Double
  /** Absolute URL. */
  var url: java.lang.String
}

object DownloadItem {
  @scala.inline
  def apply(
    bytesReceived: scala.Double,
    canResume: scala.Boolean,
    danger: DangerType,
    exists: scala.Boolean,
    fileSize: scala.Double,
    filename: java.lang.String,
    id: scala.Double,
    incognito: scala.Boolean,
    mime: java.lang.String,
    paused: scala.Boolean,
    startTime: java.lang.String,
    state: State,
    totalBytes: scala.Double,
    url: java.lang.String,
    byExtensionId: java.lang.String = null,
    byExtensionName: java.lang.String = null,
    endTime: java.lang.String = null,
    error: InterruptReason = null,
    estimatedEndTime: java.lang.String = null,
    referrer: java.lang.String = null
  ): DownloadItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesReceived")(bytesReceived)
    __obj.updateDynamic("canResume")(canResume)
    __obj.updateDynamic("danger")(danger)
    __obj.updateDynamic("exists")(exists)
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("incognito")(incognito)
    __obj.updateDynamic("mime")(mime)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("totalBytes")(totalBytes)
    __obj.updateDynamic("url")(url)
    if (byExtensionId != null) __obj.updateDynamic("byExtensionId")(byExtensionId)
    if (byExtensionName != null) __obj.updateDynamic("byExtensionName")(byExtensionName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (estimatedEndTime != null) __obj.updateDynamic("estimatedEndTime")(estimatedEndTime)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    __obj.asInstanceOf[DownloadItem]
  }
}

