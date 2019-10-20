package typings.firebaseDashAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user.
  */
trait UserRecord extends js.Object {
  /**
    * The user's custom claims object if available, typically used to define
    * user roles and propagated to an authenticated user's ID token.
    * This is set via
    * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#setCustomUserClaims `setCustomUserClaims()`}
    */
  var customClaims: js.UndefOr[js.Object] = js.undefined
  /**
    * Whether or not the user is disabled: `true` for disabled; `false` for
    * enabled.
    */
  var disabled: Boolean
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The user's primary email, if set.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: Boolean
  /**
    * Additional metadata about the user.
    */
  var metadata: UserMetadata
  /**
    * The user's hashed password (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used
    * when uploading this user, as is typical when migrating from another Auth
    * system, this will be an empty string. If no password is set, this is
    * null. This is only available when the user is obtained from
    * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listUsers `listUsers()`}.
    *
    */
  var passwordHash: js.UndefOr[String] = js.undefined
  /**
    * The user's password salt (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used to
    * upload this user, typical when migrating from another Auth system, this will
    * be an empty string. If no password is set, this is null. This is only
    * available when the user is obtained from
    * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listUsers `listUsers()`}.
    *
    */
  var passwordSalt: js.UndefOr[String] = js.undefined
  /**
    * The user's primary phone number, if set.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[String] = js.undefined
  /**
    * An array of providers (for example, Google, Facebook) linked to the user.
    */
  var providerData: js.Array[UserInfo]
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
  /**
    * The date the user's tokens are valid after, formatted as a UTC string.
    * This is updated every time the user's refresh token are revoked either
    * from the {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#revokeRefreshTokens `revokeRefreshTokens()`}
    * API or from the Firebase Auth backend on big account changes (password
    * resets, password or email updates, etc).
    */
  var tokensValidAfterTime: js.UndefOr[String] = js.undefined
  /**
    * The user's `uid`.
    */
  var uid: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object UserRecord {
  @scala.inline
  def apply(
    disabled: Boolean,
    emailVerified: Boolean,
    metadata: UserMetadata,
    providerData: js.Array[UserInfo],
    toJSON: () => js.Object,
    uid: String,
    customClaims: js.Object = null,
    displayName: String = null,
    email: String = null,
    passwordHash: String = null,
    passwordSalt: String = null,
    phoneNumber: String = null,
    photoURL: String = null,
    tenantId: String = null,
    tokensValidAfterTime: String = null
  ): UserRecord = {
    val __obj = js.Dynamic.literal(disabled = disabled, emailVerified = emailVerified, metadata = metadata, providerData = providerData, toJSON = js.Any.fromFunction0(toJSON), uid = uid)
    if (customClaims != null) __obj.updateDynamic("customClaims")(customClaims)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash)
    if (passwordSalt != null) __obj.updateDynamic("passwordSalt")(passwordSalt)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    if (tokensValidAfterTime != null) __obj.updateDynamic("tokensValidAfterTime")(tokensValidAfterTime)
    __obj.asInstanceOf[UserRecord]
  }
}

