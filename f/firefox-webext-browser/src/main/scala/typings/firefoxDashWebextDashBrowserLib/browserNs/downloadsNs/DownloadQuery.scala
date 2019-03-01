package typings
package firefoxDashWebextDashBrowserLib.browserNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters that combine to specify a predicate that can be used to select a set of downloads. Used for example
  * in search() and erase()
  */
trait DownloadQuery extends js.Object {
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: js.UndefOr[scala.Double] = js.undefined
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: js.UndefOr[DangerType] = js.undefined
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Limits results to downloads that ended after the given ms since the epoch. */
  var endedAfter: js.UndefOr[DownloadTime] = js.undefined
  /** Limits results to downloads that ended before the given ms since the epoch. */
  var endedBefore: js.UndefOr[DownloadTime] = js.undefined
  /** Why a download was interrupted. */
  var error: js.UndefOr[InterruptReason] = js.undefined
  var exists: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: js.UndefOr[scala.Double] = js.undefined
  /** Absolute local path. */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Limits results to DownloadItems whose `filename` matches the given regular expression. */
  var filenameRegex: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  /**
    * Setting this integer limits the number of results. Otherwise, all matching DownloadItems will be returned.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /** The file's MIME type. */
  var mime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Setting elements of this array to DownloadItem properties in order to sort the search results. For example,
    * setting `orderBy='startTime'` sorts the DownloadItems by their start time in ascending order. To specify
    * descending order, prefix `orderBy` with a hyphen: '-startTime'.
    */
  var orderBy: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This array of search terms limits results to DownloadItems whose `filename` or `url` contain all of the
    * search terms that do not begin with a dash '-' and none of the search terms that do begin with a dash.
    */
  var query: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Limits results to downloads that started after the given ms since the epoch. */
  var startedAfter: js.UndefOr[DownloadTime] = js.undefined
  /** Limits results to downloads that started before the given ms since the epoch. */
  var startedBefore: js.UndefOr[DownloadTime] = js.undefined
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: js.UndefOr[State] = js.undefined
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: js.UndefOr[scala.Double] = js.undefined
  /** Limits results to downloads whose totalBytes is greater than the given integer. */
  var totalBytesGreater: js.UndefOr[scala.Double] = js.undefined
  /** Limits results to downloads whose totalBytes is less than the given integer. */
  var totalBytesLess: js.UndefOr[scala.Double] = js.undefined
  /** Absolute URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Limits results to DownloadItems whose `url` matches the given regular expression. */
  var urlRegex: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadQuery {
  @scala.inline
  def apply(
    bytesReceived: scala.Int | scala.Double = null,
    danger: DangerType = null,
    endTime: java.lang.String = null,
    endedAfter: DownloadTime = null,
    endedBefore: DownloadTime = null,
    error: InterruptReason = null,
    exists: js.UndefOr[scala.Boolean] = js.undefined,
    fileSize: scala.Int | scala.Double = null,
    filename: java.lang.String = null,
    filenameRegex: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    mime: java.lang.String = null,
    orderBy: js.Array[java.lang.String] = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    query: js.Array[java.lang.String] = null,
    startTime: java.lang.String = null,
    startedAfter: DownloadTime = null,
    startedBefore: DownloadTime = null,
    state: State = null,
    totalBytes: scala.Int | scala.Double = null,
    totalBytesGreater: scala.Int | scala.Double = null,
    totalBytesLess: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    urlRegex: java.lang.String = null
  ): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (danger != null) __obj.updateDynamic("danger")(danger)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (endedAfter != null) __obj.updateDynamic("endedAfter")(endedAfter.asInstanceOf[js.Any])
    if (endedBefore != null) __obj.updateDynamic("endedBefore")(endedBefore.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filenameRegex != null) __obj.updateDynamic("filenameRegex")(filenameRegex)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (query != null) __obj.updateDynamic("query")(query)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (startedAfter != null) __obj.updateDynamic("startedAfter")(startedAfter.asInstanceOf[js.Any])
    if (startedBefore != null) __obj.updateDynamic("startedBefore")(startedBefore.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes.asInstanceOf[js.Any])
    if (totalBytesGreater != null) __obj.updateDynamic("totalBytesGreater")(totalBytesGreater.asInstanceOf[js.Any])
    if (totalBytesLess != null) __obj.updateDynamic("totalBytesLess")(totalBytesLess.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (urlRegex != null) __obj.updateDynamic("urlRegex")(urlRegex)
    __obj.asInstanceOf[DownloadQuery]
  }
}

