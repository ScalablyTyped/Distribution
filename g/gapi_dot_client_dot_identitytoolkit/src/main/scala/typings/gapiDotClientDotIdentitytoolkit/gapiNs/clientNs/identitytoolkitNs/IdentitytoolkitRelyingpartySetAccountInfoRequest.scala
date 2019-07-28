package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

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
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge)
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes)
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (deleteAttribute != null) __obj.updateDynamic("deleteAttribute")(deleteAttribute)
    if (deleteProvider != null) __obj.updateDynamic("deleteProvider")(deleteProvider)
    if (!js.isUndefined(disableUser)) __obj.updateDynamic("disableUser")(disableUser)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (lastLoginAt != null) __obj.updateDynamic("lastLoginAt")(lastLoginAt)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken)
    if (!js.isUndefined(upgradeToFederatedLogin)) __obj.updateDynamic("upgradeToFederatedLogin")(upgradeToFederatedLogin)
    if (validSince != null) __obj.updateDynamic("validSince")(validSince)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetAccountInfoRequest]
  }
}

