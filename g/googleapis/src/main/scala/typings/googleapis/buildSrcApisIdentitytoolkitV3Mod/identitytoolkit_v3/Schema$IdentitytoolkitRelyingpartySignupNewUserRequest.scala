package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to signup new user, create anonymous user or anonymous user reauth.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartySignupNewUserRequest extends js.Object {
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  /**
    * Whether to disable the user. Only can be used by service account.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Mark the email as verified or not. Only can be used by service account.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Privileged caller can create user with specified user id.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * The new password of the user.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Privileged caller can create user with specified phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the
    * correct IDP parameters, Firebear needs to know which Tenant to retrieve
    * IDP configs from.
    */
  var tenantId: js.UndefOr[String] = js.native
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}

object Schema$IdentitytoolkitRelyingpartySignupNewUserRequest {
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
    photoUrl: String = null,
    tenantId: String = null,
    tenantProjectNumber: String = null
  ): Schema$IdentitytoolkitRelyingpartySignupNewUserRequest = {
    val __obj = js.Dynamic.literal()
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge.asInstanceOf[js.Any])
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (tenantProjectNumber != null) __obj.updateDynamic("tenantProjectNumber")(tenantProjectNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartySignupNewUserRequest]
  }
}

