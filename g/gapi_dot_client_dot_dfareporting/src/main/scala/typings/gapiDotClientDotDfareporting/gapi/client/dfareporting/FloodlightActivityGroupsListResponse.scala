package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsListResponse extends js.Object {
  /** Floodlight activity group collection. */
  var floodlightActivityGroups: js.UndefOr[js.Array[FloodlightActivityGroup]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivityGroupsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object FloodlightActivityGroupsListResponse {
  @scala.inline
  def apply(
    floodlightActivityGroups: js.Array[FloodlightActivityGroup] = null,
    kind: String = null,
    nextPageToken: String = null
  ): FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityGroups != null) __obj.updateDynamic("floodlightActivityGroups")(floodlightActivityGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightActivityGroupsListResponse]
  }
}

