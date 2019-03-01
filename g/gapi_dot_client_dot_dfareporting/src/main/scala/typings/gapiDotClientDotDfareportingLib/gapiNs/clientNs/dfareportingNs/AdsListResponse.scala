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

object AdsListResponse {
  @scala.inline
  def apply(ads: js.Array[Ad] = null, kind: java.lang.String = null, nextPageToken: java.lang.String = null): AdsListResponse = {
    val __obj = js.Dynamic.literal()
    if (ads != null) __obj.updateDynamic("ads")(ads)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdsListResponse]
  }
}

