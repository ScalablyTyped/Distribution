package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisersListResponse extends js.Object {
  /** Advertiser collection. */
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertisersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AdvertisersListResponse {
  @scala.inline
  def apply(advertisers: js.Array[Advertiser] = null, kind: String = null, nextPageToken: String = null): AdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertisers != null) __obj.updateDynamic("advertisers")(advertisers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertisersListResponse]
  }
}

