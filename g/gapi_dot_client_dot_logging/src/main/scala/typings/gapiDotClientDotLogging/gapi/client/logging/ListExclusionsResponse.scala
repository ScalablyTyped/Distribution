package typings.gapiDotClientDotLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExclusionsResponse extends js.Object {
  /** A list of exclusions. */
  var exclusions: js.UndefOr[js.Array[LogExclusion]] = js.undefined
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again
    * using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListExclusionsResponse {
  @scala.inline
  def apply(exclusions: js.Array[LogExclusion] = null, nextPageToken: String = null): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal()
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListExclusionsResponse]
  }
}

