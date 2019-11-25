package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCryptoKeysRequest extends js.Object {
  var page_size: js.UndefOr[Double] = js.undefined
  var page_token: js.UndefOr[String] = js.undefined
  var parent: String
}

object ListCryptoKeysRequest {
  @scala.inline
  def apply(parent: String, page_size: Int | Double = null, page_token: String = null): ListCryptoKeysRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (page_token != null) __obj.updateDynamic("page_token")(page_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCryptoKeysRequest]
  }
}

