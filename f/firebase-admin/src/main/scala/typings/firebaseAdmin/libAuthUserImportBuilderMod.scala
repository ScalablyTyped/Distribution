package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.Algorithm
import typings.firebaseAdmin.anon.DisplayName
import typings.firebaseAdmin.anon.Index
import typings.firebaseAdmin.libAppCoreMod.FirebaseArrayIndexError
import typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorUpdateSettings
import typings.firebaseAdmin.libAuthAuthConfigMod.UpdateMultiFactorInfoRequest
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthUserImportBuilderMod {
  
  @JSImport("firebase-admin/lib/auth/user-import-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/auth/user-import-builder", "UserImportBuilder")
  @js.native
  open class UserImportBuilder protected () extends StObject {
    /**
      * @param {UserImportRecord[]} users The list of user records to import.
      * @param {UserImportOptions=} options The import options which includes hashing
      *     algorithm details.
      * @param {ValidatorFunction=} userRequestValidator The user request validator function.
      * @constructor
      */
    def this(users: js.Array[UserImportRecord]) = this()
    def this(users: js.Array[UserImportRecord], options: UserImportOptions) = this()
    def this(users: js.Array[UserImportRecord], options: Unit, userRequestValidator: ValidatorFunction) = this()
    def this(
      users: js.Array[UserImportRecord],
      options: UserImportOptions,
      userRequestValidator: ValidatorFunction
    ) = this()
    
    /**
      * Returns the corresponding constructed uploadAccount request.
      * @returns {UploadAccountRequest} The constructed uploadAccount request.
      */
    def buildRequest(): UploadAccountRequest = js.native
    
    /**
      * Populates the UserImportResult using the client side detected errors and the server
      * side returned errors.
      * @returns {UserImportResult} The user import result based on the returned failed
      *     uploadAccount response.
      */
    def buildResponse(failedUploads: js.Array[Index]): UserImportResult = js.native
    
    /* private */ var indexMap: Any = js.native
    
    /**
      * Validates and returns the hashing options of the uploadAccount request.
      * Throws an error whenever an invalid or missing options is detected.
      * @param {UserImportOptions} options The UserImportOptions.
      * @param {boolean} requiresHashOptions Whether to require hash options.
      * @returns {UploadAccountOptions} The populated UploadAccount options.
      */
    /* private */ var populateOptions: Any = js.native
    
    /**
      * Validates and returns the users list of the uploadAccount request.
      * Whenever a user with an error is detected, the error is cached and will later be
      * merged into the user import result. This allows the processing of valid users without
      * failing early on the first error detected.
      * @param {UserImportRecord[]} users The UserImportRecords to convert to UnploadAccountUser
      *     objects.
      * @param {ValidatorFunction=} userValidator The user validator function.
      * @returns {UploadAccountUser[]} The populated uploadAccount users.
      */
    /* private */ var populateUsers: Any = js.native
    
    /* private */ var requiresHashOptions: Any = js.native
    
    /* private */ var userImportResultErrors: Any = js.native
    
    /* private */ var validatedOptions: Any = js.native
    
    /* private */ var validatedUsers: Any = js.native
  }
  
  inline def convertMultiFactorInfoToServerFormat(multiFactorInfo: UpdateMultiFactorInfoRequest): AuthFactorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMultiFactorInfoToServerFormat")(multiFactorInfo.asInstanceOf[js.Any]).asInstanceOf[AuthFactorInfo]
  
  trait AuthFactorInfo
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var enrolledAt: js.UndefOr[String] = js.undefined
    
    var mfaEnrollmentId: js.UndefOr[String] = js.undefined
    
    var phoneInfo: js.UndefOr[String] = js.undefined
  }
  object AuthFactorInfo {
    
    inline def apply(): AuthFactorInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthFactorInfo]
    }
    
    extension [Self <: AuthFactorInfo](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnrolledAt(value: String): Self = StObject.set(x, "enrolledAt", value.asInstanceOf[js.Any])
      
      inline def setEnrolledAtUndefined: Self = StObject.set(x, "enrolledAt", js.undefined)
      
      inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
      
      inline def setMfaEnrollmentIdUndefined: Self = StObject.set(x, "mfaEnrollmentId", js.undefined)
      
      inline def setPhoneInfo(value: String): Self = StObject.set(x, "phoneInfo", value.asInstanceOf[js.Any])
      
      inline def setPhoneInfoUndefined: Self = StObject.set(x, "phoneInfo", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.firebaseAdminStrings.SCRYPT
    - typings.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT
    - typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512
    - typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256
    - typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1
    - typings.firebaseAdmin.firebaseAdminStrings.HMAC_MD5
    - typings.firebaseAdmin.firebaseAdminStrings.MD5
    - typings.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1
    - typings.firebaseAdmin.firebaseAdminStrings.BCRYPT
    - typings.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256
    - typings.firebaseAdmin.firebaseAdminStrings.SHA512
    - typings.firebaseAdmin.firebaseAdminStrings.SHA256
    - typings.firebaseAdmin.firebaseAdminStrings.SHA1
  */
  trait HashAlgorithmType extends StObject
  object HashAlgorithmType {
    
    inline def BCRYPT: typings.firebaseAdmin.firebaseAdminStrings.BCRYPT = "BCRYPT".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.BCRYPT]
    
    inline def HMAC_MD5: typings.firebaseAdmin.firebaseAdminStrings.HMAC_MD5 = "HMAC_MD5".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.HMAC_MD5]
    
    inline def HMAC_SHA1: typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1 = "HMAC_SHA1".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA1]
    
    inline def HMAC_SHA256: typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256 = "HMAC_SHA256".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA256]
    
    inline def HMAC_SHA512: typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512 = "HMAC_SHA512".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.HMAC_SHA512]
    
    inline def MD5: typings.firebaseAdmin.firebaseAdminStrings.MD5 = "MD5".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.MD5]
    
    inline def PBKDF2_SHA256: typings.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256 = "PBKDF2_SHA256".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.PBKDF2_SHA256]
    
    inline def PBKDF_SHA1: typings.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1 = "PBKDF_SHA1".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.PBKDF_SHA1]
    
    inline def SCRYPT: typings.firebaseAdmin.firebaseAdminStrings.SCRYPT = "SCRYPT".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.SCRYPT]
    
    inline def SHA1: typings.firebaseAdmin.firebaseAdminStrings.SHA1 = "SHA1".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.SHA1]
    
    inline def SHA256: typings.firebaseAdmin.firebaseAdminStrings.SHA256 = "SHA256".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.SHA256]
    
    inline def SHA512: typings.firebaseAdmin.firebaseAdminStrings.SHA512 = "SHA512".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.SHA512]
    
    inline def STANDARD_SCRYPT: typings.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT = "STANDARD_SCRYPT".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.STANDARD_SCRYPT]
  }
  
  trait UploadAccountOptions extends StObject {
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var cpuMemCost: js.UndefOr[Double] = js.undefined
    
    var dkLen: js.UndefOr[Double] = js.undefined
    
    var hashAlgorithm: js.UndefOr[String] = js.undefined
    
    var memoryCost: js.UndefOr[Double] = js.undefined
    
    var parallelization: js.UndefOr[Double] = js.undefined
    
    var rounds: js.UndefOr[Double] = js.undefined
    
    var saltSeparator: js.UndefOr[String] = js.undefined
    
    var signerKey: js.UndefOr[String] = js.undefined
  }
  object UploadAccountOptions {
    
    inline def apply(): UploadAccountOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadAccountOptions]
    }
    
    extension [Self <: UploadAccountOptions](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCpuMemCost(value: Double): Self = StObject.set(x, "cpuMemCost", value.asInstanceOf[js.Any])
      
      inline def setCpuMemCostUndefined: Self = StObject.set(x, "cpuMemCost", js.undefined)
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "dkLen", value.asInstanceOf[js.Any])
      
      inline def setDkLenUndefined: Self = StObject.set(x, "dkLen", js.undefined)
      
      inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
      
      inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
      
      inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
      
      inline def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
      
      inline def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
      
      inline def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
      
      inline def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
      
      inline def setSaltSeparator(value: String): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
      
      inline def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
      
      inline def setSignerKey(value: String): Self = StObject.set(x, "signerKey", value.asInstanceOf[js.Any])
      
      inline def setSignerKeyUndefined: Self = StObject.set(x, "signerKey", js.undefined)
    }
  }
  
  trait UploadAccountRequest
    extends StObject
       with UploadAccountOptions {
    
    var users: js.UndefOr[js.Array[UploadAccountUser]] = js.undefined
  }
  object UploadAccountRequest {
    
    inline def apply(): UploadAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadAccountRequest]
    }
    
    extension [Self <: UploadAccountRequest](x: Self) {
      
      inline def setUsers(value: js.Array[UploadAccountUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsersVarargs(value: UploadAccountUser*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  /** UploadAccount endpoint request user interface. */
  trait UploadAccountUser extends StObject {
    
    var createdAt: js.UndefOr[Double] = js.undefined
    
    var customAttributes: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var emailVerified: js.UndefOr[Boolean] = js.undefined
    
    var lastLoginAt: js.UndefOr[Double] = js.undefined
    
    var localId: String
    
    var mfaInfo: js.UndefOr[js.Array[AuthFactorInfo]] = js.undefined
    
    var passwordHash: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var photoUrl: js.UndefOr[String] = js.undefined
    
    var providerUserInfo: js.UndefOr[js.Array[DisplayName]] = js.undefined
    
    var salt: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object UploadAccountUser {
    
    inline def apply(localId: String): UploadAccountUser = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadAccountUser]
    }
    
    extension [Self <: UploadAccountUser](x: Self) {
      
      inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
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
      
      inline def setLastLoginAt(value: Double): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
      
      inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
      
      inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
      
      inline def setMfaInfo(value: js.Array[AuthFactorInfo]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
      
      inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
      
      inline def setMfaInfoVarargs(value: AuthFactorInfo*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
      
      inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
      
      inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setProviderUserInfo(value: js.Array[DisplayName]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
      
      inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
      
      inline def setProviderUserInfoVarargs(value: DisplayName*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait UserImportOptions extends StObject {
    
    /**
      * The password hashing information.
      */
    var hash: Algorithm
  }
  object UserImportOptions {
    
    inline def apply(hash: Algorithm): UserImportOptions = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserImportOptions]
    }
    
    extension [Self <: UserImportOptions](x: Self) {
      
      inline def setHash(value: Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserImportRecord extends StObject {
    
    /**
      * The user's custom claims object if available, typically used to define
      * user roles and propagated to an authenticated user's ID token.
      */
    var customClaims: js.UndefOr[StringDictionary[Any]] = js.undefined
    
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
      * {@link UserImportOptions} are required to be
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
    
    inline def apply(uid: String): UserImportRecord = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserImportRecord]
    }
    
    extension [Self <: UserImportRecord](x: Self) {
      
      inline def setCustomClaims(value: StringDictionary[Any]): Self = StObject.set(x, "customClaims", value.asInstanceOf[js.Any])
      
      inline def setCustomClaimsUndefined: Self = StObject.set(x, "customClaims", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
      
      inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
      
      inline def setMetadata(value: UserMetadataRequest): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMultiFactor(value: MultiFactorUpdateSettings): Self = StObject.set(x, "multiFactor", value.asInstanceOf[js.Any])
      
      inline def setMultiFactorUndefined: Self = StObject.set(x, "multiFactor", js.undefined)
      
      inline def setPasswordHash(value: Buffer): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
      
      inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
      
      inline def setPasswordSalt(value: Buffer): Self = StObject.set(x, "passwordSalt", value.asInstanceOf[js.Any])
      
      inline def setPasswordSaltUndefined: Self = StObject.set(x, "passwordSalt", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
      
      inline def setProviderData(value: js.Array[UserProviderRequest]): Self = StObject.set(x, "providerData", value.asInstanceOf[js.Any])
      
      inline def setProviderDataUndefined: Self = StObject.set(x, "providerData", js.undefined)
      
      inline def setProviderDataVarargs(value: UserProviderRequest*): Self = StObject.set(x, "providerData", js.Array(value*))
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserImportResult extends StObject {
    
    /**
      * An array of errors corresponding to the provided users to import. The
      * length of this array is equal to [`failureCount`](#failureCount).
      */
    var errors: js.Array[FirebaseArrayIndexError]
    
    /**
      * The number of user records that failed to import to Firebase Auth.
      */
    var failureCount: Double
    
    /**
      * The number of user records that successfully imported to Firebase Auth.
      */
    var successCount: Double
  }
  object UserImportResult {
    
    inline def apply(errors: js.Array[FirebaseArrayIndexError], failureCount: Double, successCount: Double): UserImportResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], successCount = successCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserImportResult]
    }
    
    extension [Self <: UserImportResult](x: Self) {
      
      inline def setErrors(value: js.Array[FirebaseArrayIndexError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: FirebaseArrayIndexError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
      
      inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserMetadataRequest extends StObject {
    
    /**
      * The date the user was created, formatted as a UTC string.
      */
    var creationTime: js.UndefOr[String] = js.undefined
    
    /**
      * The date the user last signed in, formatted as a UTC string.
      */
    var lastSignInTime: js.UndefOr[String] = js.undefined
  }
  object UserMetadataRequest {
    
    inline def apply(): UserMetadataRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserMetadataRequest]
    }
    
    extension [Self <: UserMetadataRequest](x: Self) {
      
      inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
      
      inline def setLastSignInTime(value: String): Self = StObject.set(x, "lastSignInTime", value.asInstanceOf[js.Any])
      
      inline def setLastSignInTimeUndefined: Self = StObject.set(x, "lastSignInTime", js.undefined)
    }
  }
  
  trait UserProviderRequest extends StObject {
    
    /**
      * The display name for the linked provider.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * The email for the linked provider.
      */
    var email: js.UndefOr[String] = js.undefined
    
    /**
      * The phone number for the linked provider.
      */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    /**
      * The photo URL for the linked provider.
      */
    var photoURL: js.UndefOr[String] = js.undefined
    
    /**
      * The linked provider ID (for example, "google.com" for the Google provider).
      */
    var providerId: String
    
    /**
      * The user identifier for the linked provider.
      */
    var uid: String
  }
  object UserProviderRequest {
    
    inline def apply(providerId: String, uid: String): UserProviderRequest = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProviderRequest]
    }
    
    extension [Self <: UserProviderRequest](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidatorFunction = js.Function1[/* data */ UploadAccountUser, Unit]
}
