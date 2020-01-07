package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of requested error group stats.
  */
@js.native
trait Schema$ListGroupStatsResponse extends js.Object {
  /**
    * The error group stats which match the given request.
    */
  var errorGroupStats: js.UndefOr[js.Array[Schema$ErrorGroupStats]] = js.native
  /**
    * If non-empty, more results are available. Pass this token, along with the
    * same query parameters as the first request, to view the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The timestamp specifies the start time to which the request was
    * restricted. The start time is set based on the requested time range. It
    * may be adjusted to a later time if a project has exceeded the storage
    * quota and older data has been deleted.
    */
  var timeRangeBegin: js.UndefOr[String] = js.native
}

object Schema$ListGroupStatsResponse {
  @scala.inline
  def apply(
    errorGroupStats: js.Array[Schema$ErrorGroupStats] = null,
    nextPageToken: String = null,
    timeRangeBegin: String = null
  ): Schema$ListGroupStatsResponse = {
    val __obj = js.Dynamic.literal()
    if (errorGroupStats != null) __obj.updateDynamic("errorGroupStats")(errorGroupStats.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (timeRangeBegin != null) __obj.updateDynamic("timeRangeBegin")(timeRangeBegin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListGroupStatsResponse]
  }
}

