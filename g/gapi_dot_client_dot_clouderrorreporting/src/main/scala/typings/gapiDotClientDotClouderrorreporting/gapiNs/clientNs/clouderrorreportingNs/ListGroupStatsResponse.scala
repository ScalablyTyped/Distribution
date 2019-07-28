package typings.gapiDotClientDotClouderrorreporting.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupStatsResponse extends js.Object {
  /** The error group stats which match the given request. */
  var errorGroupStats: js.UndefOr[js.Array[ErrorGroupStats]] = js.undefined
  /**
    * If non-empty, more results are available.
    * Pass this token, along with the same query parameters as the first
    * request, to view the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * The timestamp specifies the start time to which the request was restricted.
    * The start time is set based on the requested time range. It may be adjusted
    * to a later time if a project has exceeded the storage quota and older data
    * has been deleted.
    */
  var timeRangeBegin: js.UndefOr[String] = js.undefined
}

object ListGroupStatsResponse {
  @scala.inline
  def apply(
    errorGroupStats: js.Array[ErrorGroupStats] = null,
    nextPageToken: String = null,
    timeRangeBegin: String = null
  ): ListGroupStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (errorGroupStats != null) __obj.updateDynamic("errorGroupStats")(errorGroupStats)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (timeRangeBegin != null) __obj.updateDynamic("timeRangeBegin")(timeRangeBegin)
    __obj.asInstanceOf[ListGroupStatsResponse]
  }
}

