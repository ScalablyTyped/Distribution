package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyCustomTokenResponse extends js.Object {
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** True if it's a new user sign-in, false if it's a returning user. */
  var isNewUser: js.UndefOr[scala.Boolean] = js.undefined
  /** The fixed string "identitytoolkit#VerifyCustomTokenResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

object VerifyCustomTokenResponse {
  @scala.inline
  def apply(
    expiresIn: java.lang.String = null,
    idToken: java.lang.String = null,
    isNewUser: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    refreshToken: java.lang.String = null
  ): VerifyCustomTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[VerifyCustomTokenResponse]
  }
}

