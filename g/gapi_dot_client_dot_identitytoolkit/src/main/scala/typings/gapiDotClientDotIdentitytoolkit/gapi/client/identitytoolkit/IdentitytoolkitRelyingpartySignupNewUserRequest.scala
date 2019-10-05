package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySignupNewUserRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.undefined
  /** Whether to disable the user. Only can be used by service account. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** Mark the email as verified or not. Only can be used by service account. */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.undefined
  /** Privileged caller can create user with specified user id. */
  var localId: js.UndefOr[String] = js.undefined
  /** The new password of the user. */
  var password: js.UndefOr[String] = js.undefined
  /** Privileged caller can create user with specified phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySignupNewUserRequest {
  @scala.inline
  def apply(
    captchaChallenge: String = null,
    captchaResponse: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    idToken: String = null,
    instanceId: String = null,
    localId: String = null,
    password: String = null,
    phoneNumber: String = null,
    photoUrl: String = null
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

