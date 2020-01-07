package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advertiser List Response
  */
@js.native
trait Schema$AdvertisersListResponse extends js.Object {
  /**
    * Advertiser collection.
    */
  var advertisers: js.UndefOr[js.Array[Schema$Advertiser]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertisersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$AdvertisersListResponse {
  @scala.inline
  def apply(advertisers: js.Array[Schema$Advertiser] = null, kind: String = null, nextPageToken: String = null): Schema$AdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertisers != null) __obj.updateDynamic("advertisers")(advertisers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdvertisersListResponse]
  }
}

