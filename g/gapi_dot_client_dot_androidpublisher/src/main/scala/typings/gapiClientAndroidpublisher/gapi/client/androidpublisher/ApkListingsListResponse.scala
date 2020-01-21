package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApkListingsListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidpublisher#apkListingsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  var listings: js.UndefOr[js.Array[ApkListing]] = js.undefined
}

object ApkListingsListResponse {
  @scala.inline
  def apply(kind: String = null, listings: js.Array[ApkListing] = null): ApkListingsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (listings != null) __obj.updateDynamic("listings")(listings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApkListingsListResponse]
  }
}

