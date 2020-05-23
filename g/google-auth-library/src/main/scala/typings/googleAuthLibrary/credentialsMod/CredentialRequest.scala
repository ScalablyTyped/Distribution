package typings.googleAuthLibrary.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialRequest extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var expires_in: js.UndefOr[Double] = js.undefined
  var id_token: js.UndefOr[String] = js.undefined
  var refresh_token: js.UndefOr[String] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object CredentialRequest {
  @scala.inline
  def apply(
    access_token: String = null,
    expires_in: js.UndefOr[Double] = js.undefined,
    id_token: String = null,
    refresh_token: String = null,
    token_type: String = null
  ): CredentialRequest = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (!js.isUndefined(expires_in)) __obj.updateDynamic("expires_in")(expires_in.get.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialRequest]
  }
}

