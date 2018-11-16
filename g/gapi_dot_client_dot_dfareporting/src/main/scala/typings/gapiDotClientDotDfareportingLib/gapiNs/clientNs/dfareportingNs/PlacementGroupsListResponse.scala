package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlacementGroupsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#placementGroupsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Placement group collection. */
  var placementGroups: js.UndefOr[js.Array[PlacementGroup]] = js.undefined
}

