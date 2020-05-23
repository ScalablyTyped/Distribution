package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyCustomTokenResponse extends js.Object {
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** True if it's a new user sign-in, false if it's a returning user. */
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  /** The fixed string "identitytoolkit#VerifyCustomTokenResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.undefined
}

object VerifyCustomTokenResponse {
  @scala.inline
  def apply(
    expiresIn: String = null,
    idToken: String = null,
    isNewUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    refreshToken: String = null
  ): VerifyCustomTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyCustomTokenResponse]
  }
}

