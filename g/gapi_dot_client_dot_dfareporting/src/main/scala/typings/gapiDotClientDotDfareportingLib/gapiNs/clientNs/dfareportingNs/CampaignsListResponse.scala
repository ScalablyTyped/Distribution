package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CampaignsListResponse extends js.Object {
  /** Campaign collection. */
  var campaigns: js.UndefOr[js.Array[Campaign]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaignsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

