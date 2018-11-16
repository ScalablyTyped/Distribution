package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetableRemarketingListsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingListsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Targetable remarketing list collection. */
  var targetableRemarketingLists: js.UndefOr[js.Array[TargetableRemarketingList]] = js.undefined
}

