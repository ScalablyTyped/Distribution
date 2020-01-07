package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to verify the password.
  */
@js.native
trait Schema$IdentitytoolkitRelyingpartyVerifyPasswordRequest extends js.Object {
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The password inputed by the user.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The GITKit token for the non-trusted IDP, which is to be confirmed by the
    * user.
    */
  var pendingIdToken: js.UndefOr[String] = js.native
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
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

object Schema$IdentitytoolkitRelyingpartyVerifyPasswordRequest {
  @scala.inline
  def apply(
    captchaChallenge: String = null,
    captchaResponse: String = null,
    delegatedProjectNumber: String = null,
    email: String = null,
    idToken: String = null,
    instanceId: String = null,
    password: String = null,
    pendingIdToken: String = null,
    returnSecureToken: js.UndefOr[Boolean] = js.undefined,
    tenantId: String = null,
    tenantProjectNumber: String = null
  ): Schema$IdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge.asInstanceOf[js.Any])
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pendingIdToken != null) __obj.updateDynamic("pendingIdToken")(pendingIdToken.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (tenantProjectNumber != null) __obj.updateDynamic("tenantProjectNumber")(tenantProjectNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
}

