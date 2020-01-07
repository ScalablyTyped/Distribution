package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity List Response
  */
@js.native
trait Schema$FloodlightActivitiesListResponse extends js.Object {
  /**
    * Floodlight activity collection.
    */
  var floodlightActivities: js.UndefOr[js.Array[Schema$FloodlightActivity]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$FloodlightActivitiesListResponse {
  @scala.inline
  def apply(
    floodlightActivities: js.Array[Schema$FloodlightActivity] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivities != null) __obj.updateDynamic("floodlightActivities")(floodlightActivities.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloodlightActivitiesListResponse]
  }
}

