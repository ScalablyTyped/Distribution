package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessTokenResponse extends js.Object {
  var res: js.UndefOr[GaxiosResponse[_] | Null] = js.undefined
  var token: js.UndefOr[String | Null] = js.undefined
}

object GetAccessTokenResponse {
  @scala.inline
  def apply(
    res: js.UndefOr[Null | GaxiosResponse[_]] = js.undefined,
    token: js.UndefOr[Null | String] = js.undefined
  ): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(res)) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
}

