package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesListResponse extends js.Object {
  /** Floodlight activity collection. */
  var floodlightActivities: js.UndefOr[js.Array[FloodlightActivity]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivitiesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivitiesListResponse {
  @scala.inline
  def apply(
    floodlightActivities: js.Array[FloodlightActivity] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivities != null) __obj.updateDynamic("floodlightActivities")(floodlightActivities)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[FloodlightActivitiesListResponse]
  }
}

