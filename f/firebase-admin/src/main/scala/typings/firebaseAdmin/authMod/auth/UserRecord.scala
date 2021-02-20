package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a user.
  */
@js.native
trait UserRecord extends StObject {
  
  /**
    * The user's custom claims object if available, typically used to define
    * user roles and propagated to an authenticated user's ID token.
    * This is set via
    * {@link auth.Auth.setCustomUserClaims `setCustomUserClaims()`}
    */
  var customClaims: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Whether or not the user is disabled: `true` for disabled; `false` for
    * enabled.
    */
  var disabled: Boolean = js.native
  
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The user's primary email, if set.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: Boolean = js.native
  
  /**
    * Additional metadata about the user.
    */
  var metadata: UserMetadata = js.native
  
  /**
    * The multi-factor related properties for the current user, if available.
    */
  var multiFactor: js.UndefOr[MultiFactorSettings] = js.native
  
  /**
    * The user's hashed password (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used
    * when uploading this user, as is typical when migrating from another Auth
    * system, this will be an empty string. If no password is set, this is
    * null. This is only available when the user is obtained from
    * {@link auth.Auth.listUsers `listUsers()`}.
    *
    */
  var passwordHash: js.UndefOr[String] = js.native
  
  /**
    * The user's password salt (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used to
    * upload this user, typical when migrating from another Auth system, this will
    * be an empty string. If no password is set, this is null. This is only
    * available when the user is obtained from
    * {@link auth.Auth.listUsers `listUsers()`}.
    *
    */
  var passwordSalt: js.UndefOr[String] = js.native
  
  /**
    * The user's primary phone number, if set.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[String] = js.native
  
  /**
    * An array of providers (for example, Google, Facebook) linked to the user.
    */
  var providerData: js.Array[UserInfo] = js.native
  
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenantId: js.UndefOr[String | Null] = js.native
  
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
  
  /**
    * The date the user's tokens are valid after, formatted as a UTC string.
    * This is updated every time the user's refresh token are revoked either
    * from the {@link auth.Auth.revokeRefreshTokens `revokeRefreshTokens()`}
    * API or from the Firebase Auth backend on big account changes (password
    * resets, password or email updates, etc).
    */
  var tokensValidAfterTime: js.UndefOr[String] = js.native
  
  /**
    * The user's `uid`.
    */
  var uid: String = js.native
}
object UserRecord {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    emailVerified: Boolean,
    metadata: UserMetadata,
    providerData: js.Array[UserInfo],
    toJSON: () => js.Object,
    uid: String
  ): UserRecord = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], providerData = providerData.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRecord]
  }
  
  @scala.inline
  implicit class UserRecordMutableBuilder[Self <: UserRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomClaims(value: StringDictionary[js.Any]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomClaimsUndefined: Self = StObject.set(x, "customClaims", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: UserMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactor(value: MultiFactorSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    @scala.inline
    def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    @scala.inline
    def setPasswordSalt(value: String): Self = StObject.set(x, "passwordSalt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordSaltUndefined: Self = StObject.set(x, "passwordSalt", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
    
    @scala.inline
    def setProviderData(value: js.Array[UserInfo]): Self = StObject.set(x, "providerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDataVarargs(value: UserInfo*): Self = StObject.set(x, "providerData", js.Array(value :_*))
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTokensValidAfterTime(value: String): Self = StObject.set(x, "tokensValidAfterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensValidAfterTimeUndefined: Self = StObject.set(x, "tokensValidAfterTime", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
