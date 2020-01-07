package typings.googleapis.buildSrcApisIamcredentialsV1Mod.iamcredentials_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GenerateIdentityBindingAccessTokenResponse extends js.Object {
  /**
    * The OAuth 2.0 access token.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * Token expiration time. The expiration time is always set.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object Schema$GenerateIdentityBindingAccessTokenResponse {
  @scala.inline
  def apply(accessToken: String = null, expireTime: String = null): Schema$GenerateIdentityBindingAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateIdentityBindingAccessTokenResponse]
  }
}

