package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertisersListResponse extends js.Object {
  var advertisers: js.UndefOr[js.Array[Advertiser]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AdvertisersListResponse {
  @scala.inline
  def apply(advertisers: js.Array[Advertiser] = null, kind: String = null, nextPageToken: String = null): AdvertisersListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertisers != null) __obj.updateDynamic("advertisers")(advertisers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdvertisersListResponse]
  }
}

