package typings.googleCloudStorage.hmacKeyMod

import typings.googleCloudStorage.googleCloudStorageStrings.ACTIVE
import typings.googleCloudStorage.googleCloudStorageStrings.INACTIVE
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
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHmacKeyMetadata]
  }
}

