package typings.firebaseAdmin.authMod.admin.auth

import org.scalablytyped.runtime.StringDictionary
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
  var customClaims: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Whether or not the user is disabled: `true` for disabled; `false` for
    * enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
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
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /**
    * Additional metadata about the user.
    */
  var metadata: js.UndefOr[UserMetadataRequest] = js.undefined
  /**
    * The user's multi-factor related properties.
    */
  var multiFactor: js.UndefOr[MultiFactorUpdateSettings] = js.undefined
  /**
    * The buffer of bytes representing the user's hashed password.
    * When a user is to be imported with a password hash,
    * {@link admin.auth.UserImportOptions `UserImportOptions`} are required to be
    * specified to identify the hashing algorithm used to generate this hash.
    */
  var passwordHash: js.UndefOr[Buffer] = js.undefined
  /**
    * The buffer of bytes representing the user's password salt.
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
  var providerData: js.UndefOr[js.Array[UserProviderRequest]] = js.undefined
  /**
    * The identifier of the tenant where user is to be imported to.
    * When not provided in an `admin.auth.Auth` context, the user is uploaded to
    * the default parent project.
    * When not provided in an `admin.auth.TenantAwareAuth` context, the user is uploaded
    * to the tenant corresponding to that `TenantAwareAuth` instance's tenant ID.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
  /**
    * The user's `uid`.
    */
  var uid: String
}

object UserImportRecord {
  @scala.inline
  def apply(
    uid: String,
    customClaims: StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    metadata: UserMetadataRequest = null,
    multiFactor: MultiFactorUpdateSettings = null,
    passwordHash: Buffer = null,
    passwordSalt: Buffer = null,
    phoneNumber: String = null,
    photoURL: String = null,
    providerData: js.Array[UserProviderRequest] = null,
    tenantId: js.UndefOr[Null | String] = js.undefined
  ): UserImportRecord = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    if (customClaims != null) __obj.updateDynamic("customClaims")(customClaims.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (multiFactor != null) __obj.updateDynamic("multiFactor")(multiFactor.asInstanceOf[js.Any])
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash.asInstanceOf[js.Any])
    if (passwordSalt != null) __obj.updateDynamic("passwordSalt")(passwordSalt.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    if (providerData != null) __obj.updateDynamic("providerData")(providerData.asInstanceOf[js.Any])
    if (!js.isUndefined(tenantId)) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportRecord]
  }
}

