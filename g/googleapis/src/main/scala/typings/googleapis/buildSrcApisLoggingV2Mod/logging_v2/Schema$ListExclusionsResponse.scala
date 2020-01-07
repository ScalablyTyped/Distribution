package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListExclusions.
  */
@js.native
trait Schema$ListExclusionsResponse extends js.Object {
  /**
    * A list of exclusions.
    */
  var exclusions: js.UndefOr[js.Array[Schema$LogExclusion]] = js.native
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListExclusionsResponse {
  @scala.inline
  def apply(exclusions: js.Array[Schema$LogExclusion] = null, nextPageToken: String = null): Schema$ListExclusionsResponse = {
    val __obj = js.Dynamic.literal()
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListExclusionsResponse]
  }
}

