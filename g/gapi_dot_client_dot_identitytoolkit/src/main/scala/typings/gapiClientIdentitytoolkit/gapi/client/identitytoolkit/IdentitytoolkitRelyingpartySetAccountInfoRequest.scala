package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySetAccountInfoRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[String] = js.undefined
  /** The timestamp when the account is created. */
  var createdAt: js.UndefOr[String] = js.undefined
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[String] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  /** The attributes users request to delete. */
  var deleteAttribute: js.UndefOr[js.Array[String]] = js.undefined
  /** The IDPs the user request to delete. */
  var deleteProvider: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether to disable the user. */
  var disableUser: js.UndefOr[Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** Mark the email as verified or not. */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.undefined
  /** Last login timestamp. */
  var lastLoginAt: js.UndefOr[String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
  /** The out-of-band code of the change email request. */
  var oobCode: js.UndefOr[String] = js.undefined
  /** The new password of the user. */
  var password: js.UndefOr[String] = js.undefined
  /** Privileged caller can update user with specified phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /** The associated IDPs of the user. */
  var provider: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.undefined
  /** Mark the user to upgrade to federated login. */
  var upgradeToFederatedLogin: js.UndefOr[Boolean] = js.undefined
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartySetAccountInfoRequest {
  @scala.inline
  def apply(
    captchaChallenge: String = null,
    captchaResponse: String = null,
    createdAt: String = null,
    customAttributes: String = null,
    delegatedProjectNumber: String = null,
    deleteAttribute: js.Array[String] = null,
    deleteProvider: js.Array[String] = null,
    disableUser: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    idToken: String = null,
    instanceId: String = null,
    lastLoginAt: String = null,
    localId: String = null,
    oobCode: String = null,
    password: String = null,
    phoneNumber: String = null,
    photoUrl: String = null,
    provider: js.Array[String] = null,
    returnSecureToken: js.UndefOr[Boolean] = js.undefined,
    upgradeToFederatedLogin: js.UndefOr[Boolean] = js.undefined,
    validSince: String = null
  ): IdentitytoolkitRelyingpartySetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge.asInstanceOf[js.Any])
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (deleteAttribute != null) __obj.updateDynamic("deleteAttribute")(deleteAttribute.asInstanceOf[js.Any])
    if (deleteProvider != null) __obj.updateDynamic("deleteProvider")(deleteProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(disableUser)) __obj.updateDynamic("disableUser")(disableUser.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.get.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (lastLoginAt != null) __obj.updateDynamic("lastLoginAt")(lastLoginAt.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upgradeToFederatedLogin)) __obj.updateDynamic("upgradeToFederatedLogin")(upgradeToFederatedLogin.get.asInstanceOf[js.Any])
    if (validSince != null) __obj.updateDynamic("validSince")(validSince.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetAccountInfoRequest]
  }
}

