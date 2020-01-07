package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advertiser Group List Response
  */
@js.native
trait Schema$AdvertiserGroupsListResponse extends js.Object {
  /**
    * Advertiser group collection.
    */
  var advertiserGroups: js.UndefOr[js.Array[Schema$AdvertiserGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AdvertiserGroupsListResponse {
  @scala.inline
  def apply(
    advertiserGroups: js.Array[Schema$AdvertiserGroup] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$AdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertiserGroups != null) __obj.updateDynamic("advertiserGroups")(advertiserGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdvertiserGroupsListResponse]
  }
}

