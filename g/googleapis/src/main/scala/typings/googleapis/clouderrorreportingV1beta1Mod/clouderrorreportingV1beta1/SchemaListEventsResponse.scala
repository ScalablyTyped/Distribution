package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a set of requested error events.
  */
@js.native
trait SchemaListEventsResponse extends js.Object {
  /**
    * The error events which match the given request.
    */
  var errorEvents: js.UndefOr[js.Array[SchemaErrorEvent]] = js.native
  /**
    * If non-empty, more results are available. Pass this token, along with the
    * same query parameters as the first request, to view the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The timestamp specifies the start time to which the request was
    * restricted.
    */
  var timeRangeBegin: js.UndefOr[String] = js.native
}

object SchemaListEventsResponse {
  @scala.inline
  def apply(
    errorEvents: js.Array[SchemaErrorEvent] = null,
    nextPageToken: String = null,
    timeRangeBegin: String = null
  ): SchemaListEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (errorEvents != null) __obj.updateDynamic("errorEvents")(errorEvents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (timeRangeBegin != null) __obj.updateDynamic("timeRangeBegin")(timeRangeBegin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListEventsResponse]
  }
}

