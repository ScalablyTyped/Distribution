package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /** User creation timestamp. */
  var createdAt: js.UndefOr[java.lang.String] = js.undefined
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user is authenticated by the developer. */
  var customAuth: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the user is disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the email has been verified. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** last login timestamp. */
  var lastLoginAt: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp when the password was last updated. */
  var passwordUpdatedAt: js.UndefOr[scala.Double] = js.undefined
  /** User's phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the user profile photo. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The IDP of the user. */
  var providerUserInfo: js.UndefOr[js.Array[gapiDotClientDotIdentitytoolkitLib.Anon_DisplayNameEmail]] = js.undefined
  /** The user's plain text password. */
  var rawPassword: js.UndefOr[java.lang.String] = js.undefined
  /** The user's password salt. */
  var salt: js.UndefOr[java.lang.String] = js.undefined
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the user's password. */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object UserInfo {
  @scala.inline
  def apply(
    createdAt: java.lang.String = null,
    customAttributes: java.lang.String = null,
    customAuth: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    lastLoginAt: java.lang.String = null,
    localId: java.lang.String = null,
    passwordHash: java.lang.String = null,
    passwordUpdatedAt: scala.Int | scala.Double = null,
    phoneNumber: java.lang.String = null,
    photoUrl: java.lang.String = null,
    providerUserInfo: js.Array[gapiDotClientDotIdentitytoolkitLib.Anon_DisplayNameEmail] = null,
    rawPassword: java.lang.String = null,
    salt: java.lang.String = null,
    screenName: java.lang.String = null,
    validSince: java.lang.String = null,
    version: scala.Int | scala.Double = null
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

