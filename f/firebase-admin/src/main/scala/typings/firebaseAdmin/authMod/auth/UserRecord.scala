package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a user.
  */
trait UserRecord extends StObject {
  
  /**
    * The user's custom claims object if available, typically used to define
    * user roles and propagated to an authenticated user's ID token.
    * This is set via
    * {@link auth.Auth.setCustomUserClaims `setCustomUserClaims()`}
    */
  var customClaims: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
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
    * The multi-factor related properties for the current user, if available.
    */
  var multiFactor: js.UndefOr[MultiFactorSettings] = js.undefined
  
  /**
    * The user's hashed password (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used
    * when uploading this user, as is typical when migrating from another Auth
    * system, this will be an empty string. If no password is set, this is
    * null. This is only available when the user is obtained from
    * {@link auth.Auth.listUsers `listUsers()`}.
    *
    */
  var passwordHash: js.UndefOr[String] = js.undefined
  
  /**
    * The user's password salt (base64-encoded), only if Firebase Auth hashing
    * algorithm (SCRYPT) is used. If a different hashing algorithm had been used to
    * upload this user, typical when migrating from another Auth system, this will
    * be an empty string. If no password is set, this is null. This is only
    * available when the user is obtained from
    * {@link auth.Auth.listUsers `listUsers()`}.
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
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
  
  /**
    * The date the user's tokens are valid after, formatted as a UTC string.
    * This is updated every time the user's refresh token are revoked either
    * from the {@link auth.Auth.revokeRefreshTokens `revokeRefreshTokens()`}
    * API or from the Firebase Auth backend on big account changes (password
    * resets, password or email updates, etc).
    */
  var tokensValidAfterTime: js.UndefOr[String] = js.undefined
  
  /**
    * The user's `uid`.
    */
  var uid: String
}
object UserRecord {
  
  inline def apply(
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
  
  extension [Self <: UserRecord](x: Self) {
    
    inline def setCustomClaims(value: StringDictionary[js.Any]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
    
    inline def setCustomClaimsUndefined: Self = StObject.set(x, "customClaims", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: UserMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMultiFactor(value: MultiFactorSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    inline def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    inline def setPasswordSalt(value: String): Self = StObject.set(x, "passwordSalt", value.asInstanceOf[js.Any])
    
    inline def setPasswordSaltUndefined: Self = StObject.set(x, "passwordSalt", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
    
    inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
    
    inline def setProviderData(value: js.Array[UserInfo]): Self = StObject.set(x, "providerData", value.asInstanceOf[js.Any])
    
    inline def setProviderDataVarargs(value: UserInfo*): Self = StObject.set(x, "providerData", js.Array(value :_*))
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setTokensValidAfterTime(value: String): Self = StObject.set(x, "tokensValidAfterTime", value.asInstanceOf[js.Any])
    
    inline def setTokensValidAfterTimeUndefined: Self = StObject.set(x, "tokensValidAfterTime", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
