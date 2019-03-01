package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySignupNewUserRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[java.lang.String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to disable the user. Only can be used by service account. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Mark the email as verified or not. Only can be used by service account. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** Privileged caller can create user with specified user id. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The new password of the user. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Privileged caller can create user with specified phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartySignupNewUserRequest {
  @scala.inline
  def apply(
    captchaChallenge: java.lang.String = null,
    captchaResponse: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    idToken: java.lang.String = null,
    instanceId: java.lang.String = null,
    localId: java.lang.String = null,
    password: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    photoUrl: java.lang.String = null
  ): IdentitytoolkitRelyingpartySignupNewUserRequest = {
    val __obj = js.Dynamic.literal()
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge)
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySignupNewUserRequest]
  }
}

