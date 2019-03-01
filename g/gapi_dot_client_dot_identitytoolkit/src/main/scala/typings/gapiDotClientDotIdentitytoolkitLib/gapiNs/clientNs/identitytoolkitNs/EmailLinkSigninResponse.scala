package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailLinkSigninResponse extends js.Object {
  /** The user's email. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The STS id token to login the newly signed in user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user is new. */
  var isNewUser: js.UndefOr[scala.Boolean] = js.undefined
  /** The fixed string "identitytoolkit#EmailLinkSigninResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The RP local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The refresh token for the signed in user. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

object EmailLinkSigninResponse {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    expiresIn: java.lang.String = null,
    idToken: java.lang.String = null,
    isNewUser: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    localId: java.lang.String = null,
    refreshToken: java.lang.String = null
  ): EmailLinkSigninResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[EmailLinkSigninResponse]
  }
}

