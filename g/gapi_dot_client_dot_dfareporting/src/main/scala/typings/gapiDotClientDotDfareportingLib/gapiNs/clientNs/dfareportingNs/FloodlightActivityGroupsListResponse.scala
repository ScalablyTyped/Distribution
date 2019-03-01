package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsListResponse extends js.Object {
  /** Floodlight activity group collection. */
  var floodlightActivityGroups: js.UndefOr[js.Array[FloodlightActivityGroup]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivityGroupsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivityGroupsListResponse {
  @scala.inline
  def apply(
    floodlightActivityGroups: js.Array[FloodlightActivityGroup] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityGroups != null) __obj.updateDynamic("floodlightActivityGroups")(floodlightActivityGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[FloodlightActivityGroupsListResponse]
  }
}

