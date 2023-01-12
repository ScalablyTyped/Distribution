package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcApiAccountManagementMfaMod.MfaEnrollment
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcApiAccountManagementAccountMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/api/account_management/account", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteAccount(auth: Auth, request: DeleteAccountRequest): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteAccount")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def deleteLinkedAccounts(auth: Auth, request: DeleteLinkedAccountsRequest): js.Promise[DeleteLinkedAccountsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteLinkedAccounts")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteLinkedAccountsResponse]]
  
  inline def getAccountInfo(auth: Auth, request: GetAccountInfoRequest): js.Promise[GetAccountInfoResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccountInfo")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAccountInfoResponse]]
  
  trait APIUserInfo extends StObject {
    
    var createdAt: js.UndefOr[Double] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var emailVerified: js.UndefOr[Boolean] = js.undefined
    
    var lastLoginAt: js.UndefOr[Double] = js.undefined
    
    var localId: js.UndefOr[String] = js.undefined
    
    var mfaInfo: js.UndefOr[js.Array[MfaEnrollment]] = js.undefined
    
    var passwordHash: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var photoUrl: js.UndefOr[String] = js.undefined
    
    var providerUserInfo: js.UndefOr[js.Array[ProviderUserInfo]] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object APIUserInfo {
    
    inline def apply(): APIUserInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIUserInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APIUserInfo] (val x: Self) extends AnyVal {
      
      inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
      
      inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
      
      inline def setLastLoginAt(value: Double): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
      
      inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
      
      inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
      
      inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
      
      inline def setMfaInfo(value: js.Array[MfaEnrollment]): Self = StObject.set(x, "mfaInfo", value.asInstanceOf[js.Any])
      
      inline def setMfaInfoUndefined: Self = StObject.set(x, "mfaInfo", js.undefined)
      
      inline def setMfaInfoVarargs(value: MfaEnrollment*): Self = StObject.set(x, "mfaInfo", js.Array(value*))
      
      inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
      
      inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setProviderUserInfo(value: js.Array[ProviderUserInfo]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
      
      inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
      
      inline def setProviderUserInfoVarargs(value: ProviderUserInfo*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait DeleteAccountRequest extends StObject {
    
    var idToken: String
  }
  object DeleteAccountRequest {
    
    inline def apply(idToken: String): DeleteAccountRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteAccountRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteAccountRequest] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteLinkedAccountsRequest extends StObject {
    
    var deleteProvider: js.Array[String]
    
    var idToken: String
  }
  object DeleteLinkedAccountsRequest {
    
    inline def apply(deleteProvider: js.Array[String], idToken: String): DeleteLinkedAccountsRequest = {
      val __obj = js.Dynamic.literal(deleteProvider = deleteProvider.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteLinkedAccountsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteLinkedAccountsRequest] (val x: Self) extends AnyVal {
      
      inline def setDeleteProvider(value: js.Array[String]): Self = StObject.set(x, "deleteProvider", value.asInstanceOf[js.Any])
      
      inline def setDeleteProviderVarargs(value: String*): Self = StObject.set(x, "deleteProvider", js.Array(value*))
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteLinkedAccountsResponse extends StObject {
    
    var providerUserInfo: js.Array[ProviderUserInfo]
  }
  object DeleteLinkedAccountsResponse {
    
    inline def apply(providerUserInfo: js.Array[ProviderUserInfo]): DeleteLinkedAccountsResponse = {
      val __obj = js.Dynamic.literal(providerUserInfo = providerUserInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteLinkedAccountsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteLinkedAccountsResponse] (val x: Self) extends AnyVal {
      
      inline def setProviderUserInfo(value: js.Array[ProviderUserInfo]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
      
      inline def setProviderUserInfoVarargs(value: ProviderUserInfo*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
    }
  }
  
  trait GetAccountInfoRequest extends StObject {
    
    var idToken: String
  }
  object GetAccountInfoRequest {
    
    inline def apply(idToken: String): GetAccountInfoRequest = {
      val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccountInfoRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAccountInfoRequest] (val x: Self) extends AnyVal {
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetAccountInfoResponse extends StObject {
    
    var users: js.Array[APIUserInfo]
  }
  object GetAccountInfoResponse {
    
    inline def apply(users: js.Array[APIUserInfo]): GetAccountInfoResponse = {
      val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccountInfoResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetAccountInfoResponse] (val x: Self) extends AnyVal {
      
      inline def setUsers(value: js.Array[APIUserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: APIUserInfo*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait ProviderUserInfo extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var photoUrl: js.UndefOr[String] = js.undefined
    
    var providerId: String
    
    var rawId: js.UndefOr[String] = js.undefined
  }
  object ProviderUserInfo {
    
    inline def apply(providerId: String): ProviderUserInfo = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderUserInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProviderUserInfo] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
      
      inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setRawId(value: String): Self = StObject.set(x, "rawId", value.asInstanceOf[js.Any])
      
      inline def setRawIdUndefined: Self = StObject.set(x, "rawId", js.undefined)
    }
  }
}
