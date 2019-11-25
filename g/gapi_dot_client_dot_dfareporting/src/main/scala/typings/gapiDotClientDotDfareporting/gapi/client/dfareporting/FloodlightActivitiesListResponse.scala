package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesListResponse extends js.Object {
  /** Floodlight activity collection. */
  var floodlightActivities: js.UndefOr[js.Array[FloodlightActivity]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivitiesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object FloodlightActivitiesListResponse {
  @scala.inline
  def apply(
    floodlightActivities: js.Array[FloodlightActivity] = null,
    kind: String = null,
    nextPageToken: String = null
  ): FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivities != null) __obj.updateDynamic("floodlightActivities")(floodlightActivities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivitiesListResponse]
  }
}

