package typings.googleAuthLibrary.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var access_token: js.UndefOr[String | Null] = js.undefined
  var expiry_date: js.UndefOr[Double | Null] = js.undefined
  var id_token: js.UndefOr[String | Null] = js.undefined
  var refresh_token: js.UndefOr[String | Null] = js.undefined
  var token_type: js.UndefOr[String | Null] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    access_token: js.UndefOr[Null | String] = js.undefined,
    expiry_date: js.UndefOr[Null | Double] = js.undefined,
    id_token: js.UndefOr[Null | String] = js.undefined,
    refresh_token: js.UndefOr[Null | String] = js.undefined,
    token_type: js.UndefOr[Null | String] = js.undefined
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(access_token)) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (!js.isUndefined(expiry_date)) __obj.updateDynamic("expiry_date")(expiry_date.asInstanceOf[js.Any])
    if (!js.isUndefined(id_token)) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh_token)) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (!js.isUndefined(token_type)) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

