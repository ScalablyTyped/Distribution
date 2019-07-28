package typings.firebaseDashAdmin.adminNs.authNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user to import to Firebase Auth via the
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#importUsers `importUsers()`} method.
  */
trait UserImportRecord extends js.Object {
  /**
    * The user's custom claims object if available, typically used to define
    * user roles and propagated to an authenticated user's ID token.
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
    * The buffer of bytes representing the user’s hashed password.
    * When a user is to be imported with a password hash,
    * {@link admin.auth.UserImportOptions `UserImportOptions`} are required to be
    * specified to identify the hashing algorithm used to generate this hash.
    */
  var passwordHash: js.UndefOr[Buffer] = js.undefined
  /**
    * The buffer of bytes representing the user’s password salt.
    */
  var passwordSalt: js.UndefOr[Buffer] = js.undefined
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
  var providerData: js.UndefOr[js.Array[UserInfo]] = js.undefined
  /**
    * The user's `uid`.
    */
  var uid: String
}

object UserImportRecord {
  @scala.inline
  def apply(
    disabled: Boolean,
    emailVerified: Boolean,
    metadata: UserMetadata,
    uid: String,
    customClaims: js.Object = null,
    displayName: String = null,
    email: String = null,
    passwordHash: Buffer = null,
    passwordSalt: Buffer = null,
    phoneNumber: String = null,
    photoURL: String = null,
    providerData: js.Array[UserInfo] = null
  ): UserImportRecord = {
    val __obj = js.Dynamic.literal(disabled = disabled, emailVerified = emailVerified, metadata = metadata, uid = uid)
    if (customClaims != null) __obj.updateDynamic("customClaims")(customClaims)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash)
    if (passwordSalt != null) __obj.updateDynamic("passwordSalt")(passwordSalt)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    if (providerData != null) __obj.updateDynamic("providerData")(providerData)
    __obj.asInstanceOf[UserImportRecord]
  }
}

