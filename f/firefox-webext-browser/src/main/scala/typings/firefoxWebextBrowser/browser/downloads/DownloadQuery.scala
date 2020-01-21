package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters that combine to specify a predicate that can be used to select a set of downloads. Used for example
  * in search() and erase()
  */
trait DownloadQuery extends js.Object {
  /** Number of bytes received so far from the host, without considering file compression. */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  /** Indication of whether this download is thought to be safe or known to be suspicious. */
  var danger: js.UndefOr[DangerType] = js.undefined
  var endTime: js.UndefOr[String] = js.undefined
  /** Limits results to downloads that ended after the given ms since the epoch. */
  var endedAfter: js.UndefOr[DownloadTime] = js.undefined
  /** Limits results to downloads that ended before the given ms since the epoch. */
  var endedBefore: js.UndefOr[DownloadTime] = js.undefined
  /** Why a download was interrupted. */
  var error: js.UndefOr[InterruptReason] = js.undefined
  var exists: js.UndefOr[Boolean] = js.undefined
  /** Number of bytes in the whole file post-decompression, or -1 if unknown. */
  var fileSize: js.UndefOr[Double] = js.undefined
  /** Absolute local path. */
  var filename: js.UndefOr[String] = js.undefined
  /** Limits results to DownloadItems whose `filename` matches the given regular expression. */
  var filenameRegex: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  /**
    * Setting this integer limits the number of results. Otherwise, all matching DownloadItems will be returned.
    */
  var limit: js.UndefOr[Double] = js.undefined
  /** The file's MIME type. */
  var mime: js.UndefOr[String] = js.undefined
  /**
    * Setting elements of this array to DownloadItem properties in order to sort the search results. For example,
    * setting `orderBy='startTime'` sorts the DownloadItems by their start time in ascending order. To specify
    * descending order, prefix `orderBy` with a hyphen: '-startTime'.
    */
  var orderBy: js.UndefOr[js.Array[String]] = js.undefined
  /** True if the download has stopped reading data from the host, but kept the connection open. */
  var paused: js.UndefOr[Boolean] = js.undefined
  /**
    * This array of search terms limits results to DownloadItems whose `filename` or `url` contain all of the
    * search terms that do not begin with a dash '-' and none of the search terms that do begin with a dash.
    */
  var query: js.UndefOr[js.Array[String]] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
  /** Limits results to downloads that started after the given ms since the epoch. */
  var startedAfter: js.UndefOr[DownloadTime] = js.undefined
  /** Limits results to downloads that started before the given ms since the epoch. */
  var startedBefore: js.UndefOr[DownloadTime] = js.undefined
  /** Indicates whether the download is progressing, interrupted, or complete. */
  var state: js.UndefOr[State] = js.undefined
  /** Number of bytes in the whole file, without considering file compression, or -1 if unknown. */
  var totalBytes: js.UndefOr[Double] = js.undefined
  /** Limits results to downloads whose totalBytes is greater than the given integer. */
  var totalBytesGreater: js.UndefOr[Double] = js.undefined
  /** Limits results to downloads whose totalBytes is less than the given integer. */
  var totalBytesLess: js.UndefOr[Double] = js.undefined
  /** Absolute URL. */
  var url: js.UndefOr[String] = js.undefined
  /** Limits results to DownloadItems whose `url` matches the given regular expression. */
  var urlRegex: js.UndefOr[String] = js.undefined
}

object DownloadQuery {
  @scala.inline
  def apply(
    bytesReceived: Int | Double = null,
    danger: DangerType = null,
    endTime: String = null,
    endedAfter: DownloadTime = null,
    endedBefore: DownloadTime = null,
    error: InterruptReason = null,
    exists: js.UndefOr[Boolean] = js.undefined,
    fileSize: Int | Double = null,
    filename: String = null,
    filenameRegex: String = null,
    id: Int | Double = null,
    limit: Int | Double = null,
    mime: String = null,
    orderBy: js.Array[String] = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    query: js.Array[String] = null,
    startTime: String = null,
    startedAfter: DownloadTime = null,
    startedBefore: DownloadTime = null,
    state: State = null,
    totalBytes: Int | Double = null,
    totalBytesGreater: Int | Double = null,
    totalBytesLess: Int | Double = null,
    url: String = null,
    urlRegex: String = null
  ): DownloadQuery = {
    val __obj = js.Dynamic.literal()
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (danger != null) __obj.updateDynamic("danger")(danger.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (endedAfter != null) __obj.updateDynamic("endedAfter")(endedAfter.asInstanceOf[js.Any])
    if (endedBefore != null) __obj.updateDynamic("endedBefore")(endedBefore.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRegex != null) __obj.updateDynamic("filenameRegex")(filenameRegex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (startedAfter != null) __obj.updateDynamic("startedAfter")(startedAfter.asInstanceOf[js.Any])
    if (startedBefore != null) __obj.updateDynamic("startedBefore")(startedBefore.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes.asInstanceOf[js.Any])
    if (totalBytesGreater != null) __obj.updateDynamic("totalBytesGreater")(totalBytesGreater.asInstanceOf[js.Any])
    if (totalBytesLess != null) __obj.updateDynamic("totalBytesLess")(totalBytesLess.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlRegex != null) __obj.updateDynamic("urlRegex")(urlRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadQuery]
  }
}

