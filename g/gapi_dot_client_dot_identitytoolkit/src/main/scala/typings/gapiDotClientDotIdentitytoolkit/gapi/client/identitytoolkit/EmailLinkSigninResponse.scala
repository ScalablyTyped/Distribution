package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailLinkSigninResponse extends js.Object {
  /** The user's email. */
  var email: js.UndefOr[String] = js.undefined
  /** Expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  /** The STS id token to login the newly signed in user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** Whether the user is new. */
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  /** The fixed string "identitytoolkit#EmailLinkSigninResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The RP local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
  /** The refresh token for the signed in user. */
  var refreshToken: js.UndefOr[String] = js.undefined
}

object EmailLinkSigninResponse {
  @scala.inline
  def apply(
    email: String = null,
    expiresIn: String = null,
    idToken: String = null,
    isNewUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    localId: String = null,
    refreshToken: String = null
  ): EmailLinkSigninResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailLinkSigninResponse]
  }
}

