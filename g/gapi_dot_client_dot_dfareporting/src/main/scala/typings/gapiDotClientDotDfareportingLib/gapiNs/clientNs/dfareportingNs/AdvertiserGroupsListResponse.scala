package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsListResponse extends js.Object {
  /** Advertiser group collection. */
  var advertiserGroups: js.UndefOr[js.Array[AdvertiserGroup]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiserGroupsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object AdvertiserGroupsListResponse {
  @scala.inline
  def apply(
    advertiserGroups: js.Array[AdvertiserGroup] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): AdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertiserGroups != null) __obj.updateDynamic("advertiserGroups")(advertiserGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdvertiserGroupsListResponse]
  }
}

