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

