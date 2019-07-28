package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import typings.gapiDotClientDotIdentitytoolkit.Anon_DisplayNameEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /** User creation timestamp. */
  var createdAt: js.UndefOr[String] = js.undefined
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[String] = js.undefined
  /** Whether the user is authenticated by the developer. */
  var customAuth: js.UndefOr[Boolean] = js.undefined
  /** Whether the user is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** Whether the email has been verified. */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /** last login timestamp. */
  var lastLoginAt: js.UndefOr[String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[String] = js.undefined
  /** The timestamp when the password was last updated. */
  var passwordUpdatedAt: js.UndefOr[Double] = js.undefined
  /** User's phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The URL of the user profile photo. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /** The IDP of the user. */
  var providerUserInfo: js.UndefOr[js.Array[Anon_DisplayNameEmail]] = js.undefined
  /** The user's plain text password. */
  var rawPassword: js.UndefOr[String] = js.undefined
  /** The user's password salt. */
  var salt: js.UndefOr[String] = js.undefined
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[String] = js.undefined
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[String] = js.undefined
  /** Version of the user's password. */
  var version: js.UndefOr[Double] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(
    createdAt: String = null,
    customAttributes: String = null,
    customAuth: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    lastLoginAt: String = null,
    localId: String = null,
    passwordHash: String = null,
    passwordUpdatedAt: Int | Double = null,
    phoneNumber: String = null,
    photoUrl: String = null,
    providerUserInfo: js.Array[Anon_DisplayNameEmail] = null,
    rawPassword: String = null,
    salt: String = null,
    screenName: String = null,
    validSince: String = null,
    version: Int | Double = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes)
    if (!js.isUndefined(customAuth)) __obj.updateDynamic("customAuth")(customAuth)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (lastLoginAt != null) __obj.updateDynamic("lastLoginAt")(lastLoginAt)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash)
    if (passwordUpdatedAt != null) __obj.updateDynamic("passwordUpdatedAt")(passwordUpdatedAt.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (providerUserInfo != null) __obj.updateDynamic("providerUserInfo")(providerUserInfo)
    if (rawPassword != null) __obj.updateDynamic("rawPassword")(rawPassword)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (validSince != null) __obj.updateDynamic("validSince")(validSince)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

