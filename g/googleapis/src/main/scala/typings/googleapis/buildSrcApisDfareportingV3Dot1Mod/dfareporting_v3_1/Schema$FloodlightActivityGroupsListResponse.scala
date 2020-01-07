package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Activity Group List Response
  */
@js.native
trait Schema$FloodlightActivityGroupsListResponse extends js.Object {
  /**
    * Floodlight activity group collection.
    */
  var floodlightActivityGroups: js.UndefOr[js.Array[Schema$FloodlightActivityGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivityGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$FloodlightActivityGroupsListResponse {
  @scala.inline
  def apply(
    floodlightActivityGroups: js.Array[Schema$FloodlightActivityGroup] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityGroups != null) __obj.updateDynamic("floodlightActivityGroups")(floodlightActivityGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloodlightActivityGroupsListResponse]
  }
}

