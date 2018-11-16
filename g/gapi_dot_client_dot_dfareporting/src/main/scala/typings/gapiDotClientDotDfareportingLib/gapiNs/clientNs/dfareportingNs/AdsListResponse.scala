package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdsListResponse extends js.Object {
  /** Ad collection. */
  var ads: js.UndefOr[js.Array[Ad]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#adsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

