package typings.googleCloudKms.mod.v1.KeyManagementServiceClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListKeyRingsRequest extends js.Object {
  var page_size: js.UndefOr[Double] = js.undefined
  var page_token: js.UndefOr[String] = js.undefined
  var parent: String
}

object ListKeyRingsRequest {
  @scala.inline
  def apply(parent: String, page_size: js.UndefOr[Double] = js.undefined, page_token: String = null): ListKeyRingsRequest = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    if (page_token != null) __obj.updateDynamic("page_token")(page_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKeyRingsRequest]
  }
}

