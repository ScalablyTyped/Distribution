package typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod

import typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.ACTIVE
import typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.INACTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetHmacKeyMetadata extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[ACTIVE | INACTIVE] = js.undefined
}

object SetHmacKeyMetadata {
  @scala.inline
  def apply(etag: String = null, state: ACTIVE | INACTIVE = null): SetHmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHmacKeyMetadata]
  }
}

