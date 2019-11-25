package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessTokenResponse extends js.Object {
  var res: js.UndefOr[GaxiosResponse[_] | Null] = js.undefined
  var token: js.UndefOr[String | Null] = js.undefined
}

object GetAccessTokenResponse {
  @scala.inline
  def apply(res: GaxiosResponse[_] = null, token: String = null): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
}

