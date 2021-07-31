package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a user to import to Firebase Auth via the
  * {@link auth.Auth.importUsers `importUsers()`} method.
  */
trait UserImportRecord extends StObject {
  
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
    * {@link auth.UserImportOptions `UserImportOptions`} are required to be
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
  var tenantId: js.UndefOr[String] = js.undefined
  
  /**
    * The user's `uid`.
    */
  var uid: String
}
object UserImportRecord {
  
  @scala.inline
  def apply(uid: String): UserImportRecord = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportRecord]
  }
  
  @scala.inline
  implicit class UserImportRecordMutableBuilder[Self <: UserImportRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomClaims(value: StringDictionary[js.Any]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomClaimsUndefined: Self = StObject.set(x, "customClaims", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
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
    def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    @scala.inline
    def setMetadata(value: UserMetadataRequest): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMultiFactor(value: MultiFactorUpdateSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
    
    @scala.inline
    def setPasswordHash(value: Buffer): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    @scala.inline
    def setPasswordSalt(value: Buffer): Self = StObject.set(x, "passwordSalt", value.asInstanceOf[js.Any])
    
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
    def setProviderData(value: js.Array[UserProviderRequest]): Self = StObject.set(x, "providerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDataUndefined: Self = StObject.set(x, "providerData", js.undefined)
    
    @scala.inline
    def setProviderDataVarargs(value: UserProviderRequest*): Self = StObject.set(x, "providerData", js.Array(value :_*))
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
