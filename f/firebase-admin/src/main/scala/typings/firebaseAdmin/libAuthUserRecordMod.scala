package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthUserRecordMod {
  
  /* note: abstract class */ @JSImport("firebase-admin/lib/auth/user-record", "MultiFactorInfo")
  @js.native
  open class MultiFactorInfo () extends StObject {
    
    /**
      * The optional display name of the enrolled second factor.
      */
    val displayName: js.UndefOr[String] = js.native
    
    /**
      * The optional date the second factor was enrolled, formatted as a UTC string.
      */
    val enrollmentTime: js.UndefOr[String] = js.native
    
    /**
      * The type identifier of the second factor. For SMS second factors, this is `phone`.
      */
    val factorId: String = js.native
    
    /**
      * Initializes the MultiFactorInfo object using the provided server response.
      *
      * @param response - The server side response.
      */
    /* private */ var initFromServerResponse: Any = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * The ID of the enrolled second factor. This ID is unique to the user.
      */
    val uid: String = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/user-record", "MultiFactorSettings")
  @js.native
  open class MultiFactorSettings () extends StObject {
    
    /**
      * List of second factors enrolled with the current user.
      * Currently only phone second factors are supported.
      */
    var enrolledFactors: js.Array[MultiFactorInfo] = js.native
    
    /**
      * Returns a JSON-serializable representation of this multi-factor object.
      *
      * @returns A JSON-serializable representation of this multi-factor object.
      */
    def toJSON(): js.Object = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/user-record", "PhoneMultiFactorInfo")
  @js.native
  open class PhoneMultiFactorInfo () extends MultiFactorInfo {
    
    /**
      * The phone number associated with a phone second factor.
      */
    val phoneNumber: String = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/user-record", "UserInfo")
  @js.native
  open class UserInfo () extends StObject {
    
    /**
      * The display name for the linked provider.
      */
    val displayName: String = js.native
    
    /**
      * The email for the linked provider.
      */
    val email: String = js.native
    
    /**
      * The phone number for the linked provider.
      */
    val phoneNumber: String = js.native
    
    /**
      * The photo URL for the linked provider.
      */
    val photoURL: String = js.native
    
    /**
      * The linked provider ID (for example, "google.com" for the Google provider).
      */
    val providerId: String = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * The user identifier for the linked provider.
      */
    val uid: String = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/user-record", "UserMetadata")
  @js.native
  open class UserMetadata () extends StObject {
    
    /**
      * The date the user was created, formatted as a UTC string.
      */
    val creationTime: String = js.native
    
    /**
      * The time at which the user was last active (ID token refreshed),
      * formatted as a UTC Date string (eg 'Sat, 03 Feb 2001 04:05:06 GMT').
      * Returns null if the user was never active.
      */
    val lastRefreshTime: js.UndefOr[String | Null] = js.native
    
    /**
      * The date the user last signed in, formatted as a UTC string.
      */
    val lastSignInTime: String = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/user-record", "UserRecord")
  @js.native
  open class UserRecord () extends StObject {
    
    /**
      * The user's custom claims object if available, typically used to define
      * user roles and propagated to an authenticated user's ID token.
      * This is set via {@link BaseAuth.setCustomUserClaims}
      */
    val customClaims: js.UndefOr[StringDictionary[Any]] = js.native
    
    /**
      * Whether or not the user is disabled: `true` for disabled; `false` for
      * enabled.
      */
    val disabled: Boolean = js.native
    
    /**
      * The user's display name.
      */
    val displayName: js.UndefOr[String] = js.native
    
    /**
      * The user's primary email, if set.
      */
    val email: js.UndefOr[String] = js.native
    
    /**
      * Whether or not the user's primary email is verified.
      */
    val emailVerified: Boolean = js.native
    
    /**
      * Additional metadata about the user.
      */
    val metadata: UserMetadata = js.native
    
    /**
      * The multi-factor related properties for the current user, if available.
      */
    val multiFactor: js.UndefOr[MultiFactorSettings] = js.native
    
    /**
      * The user's hashed password (base64-encoded), only if Firebase Auth hashing
      * algorithm (SCRYPT) is used. If a different hashing algorithm had been used
      * when uploading this user, as is typical when migrating from another Auth
      * system, this will be an empty string. If no password is set, this is
      * null. This is only available when the user is obtained from
      * {@link BaseAuth.listUsers}.
      */
    val passwordHash: js.UndefOr[String] = js.native
    
    /**
      * The user's password salt (base64-encoded), only if Firebase Auth hashing
      * algorithm (SCRYPT) is used. If a different hashing algorithm had been used to
      * upload this user, typical when migrating from another Auth system, this will
      * be an empty string. If no password is set, this is null. This is only
      * available when the user is obtained from {@link BaseAuth.listUsers}.
      */
    val passwordSalt: js.UndefOr[String] = js.native
    
    /**
      * The user's primary phone number, if set.
      */
    val phoneNumber: js.UndefOr[String] = js.native
    
    /**
      * The user's photo URL.
      */
    val photoURL: js.UndefOr[String] = js.native
    
    /**
      * An array of providers (for example, Google, Facebook) linked to the user.
      */
    val providerData: js.Array[UserInfo] = js.native
    
    /**
      * The ID of the tenant the user belongs to, if available.
      */
    val tenantId: js.UndefOr[String | Null] = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * The date the user's tokens are valid after, formatted as a UTC string.
      * This is updated every time the user's refresh token are revoked either
      * from the {@link BaseAuth.revokeRefreshTokens}
      * API or from the Firebase Auth backend on big account changes (password
      * resets, password or email updates, etc).
      */
    val tokensValidAfterTime: js.UndefOr[String] = js.native
    
    /**
      * The user's `uid`.
      */
    val uid: String = js.native
  }
  
  trait GetAccountInfoUserResponse
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var createdAt: js.UndefOr[String] = js.undefined
    
    var customAttributes: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var emailVerified: js.UndefOr[Boolean] = js.undefined
    
    var lastLoginAt: js.UndefOr[String] = js.undefined
    
    var lastRefreshAt: js.UndefOr[String] = js.undefined
    
    var localId: String
    
    var mfaInfo: js.UndefOr[js.Array[MultiFactorInfoResponse]] = js.undefined
    
    var passwordHash: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var photoUrl: js.UndefOr[String] = js.undefined
    
    var providerUserInfo: js.UndefOr[js.Array[ProviderUserInfoResponse]] = js.undefined
    
    var salt: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var validSince: js.UndefOr[String] = js.undefined
  }
  object GetAccountInfoUserResponse {
    
    inline def apply(localId: String): GetAccountInfoUserResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccountInfoUserResponse]
    }
    
    extension [Self <: GetAccountInfoUserResponse](x: Self) {
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setCustomAttributes(value: String): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
      
      inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
      
      inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
      
      inline def setLastLoginAt(value: String): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
      
      inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
      
      inline def setLastRefreshAt(value: String): Self = StObject.set(x, "lastRefreshAt", value.asInstanceOf[js.Any])
      
      inline def setLastRefreshAtUndefined: Self = StObject.set(x, "lastRefreshAt", js.undefined)
      
      inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
      
      inline def setMfaInfo(value: js.Array[MultiFactorInfoResponse]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
      
      inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
      
      inline def setMfaInfoVarargs(value: MultiFactorInfoResponse*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
      
      inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
      
      inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setProviderUserInfo(value: js.Array[ProviderUserInfoResponse]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
      
      inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
      
      inline def setProviderUserInfoVarargs(value: ProviderUserInfoResponse*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setValidSince(value: String): Self = StObject.set(x, "validSince", value.asInstanceOf[js.Any])
      
      inline def setValidSinceUndefined: Self = StObject.set(x, "validSince", js.undefined)
    }
  }
  
  trait MultiFactorInfoResponse
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var enrolledAt: js.UndefOr[String] = js.undefined
    
    var mfaEnrollmentId: String
    
    var phoneInfo: js.UndefOr[String] = js.undefined
  }
  object MultiFactorInfoResponse {
    
    inline def apply(mfaEnrollmentId: String): MultiFactorInfoResponse = {
      val __obj = js.Dynamic.literal(mfaEnrollmentId = mfaEnrollmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiFactorInfoResponse]
    }
    
    extension [Self <: MultiFactorInfoResponse](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnrolledAt(value: String): Self = StObject.set(x, "enrolledAt", value.asInstanceOf[js.Any])
      
      inline def setEnrolledAtUndefined: Self = StObject.set(x, "enrolledAt", js.undefined)
      
      inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
      
      inline def setPhoneInfo(value: String): Self = StObject.set(x, "phoneInfo", value.asInstanceOf[js.Any])
      
      inline def setPhoneInfoUndefined: Self = StObject.set(x, "phoneInfo", js.undefined)
    }
  }
  
  trait ProviderUserInfoResponse extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var federatedId: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var photoUrl: js.UndefOr[String] = js.undefined
    
    var providerId: String
    
    var rawId: String
  }
  object ProviderUserInfoResponse {
    
    inline def apply(providerId: String, rawId: String): ProviderUserInfoResponse = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], rawId = rawId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderUserInfoResponse]
    }
    
    extension [Self <: ProviderUserInfoResponse](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
      
      inline def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setRawId(value: String): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
    }
  }
}
