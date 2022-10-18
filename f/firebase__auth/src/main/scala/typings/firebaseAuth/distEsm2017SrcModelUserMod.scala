package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcApiAccountManagementAccountMod.APIUserInfo
import typings.firebaseAuth.distEsm2017SrcApiAuthenticationMfaMod.FinalizeMfaResponse
import typings.firebaseAuth.distEsm2017SrcCoreUserTokenManagerMod.StsTokenManager
import typings.firebaseAuth.distEsm2017SrcCoreUserUserMetadataMod.UserMetadata
import typings.firebaseAuth.distEsm2017SrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distEsm2017SrcModelIdTokenMod.TaggedWithTokenResponse
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.User
import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.UserCredential
import typings.firebaseAuth.firebaseAuthStrings.firebase
import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import typings.firebaseUtil.mod.NextFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcModelUserMod {
  
  /* Inlined {-readonly [ K in keyof @firebase/auth.@firebase/auth/dist/esm2017/src/model/public_types.UserInfo ]: @firebase/auth.@firebase/auth/dist/esm2017/src/model/public_types.UserInfo[K]} */
  trait MutableUserInfo extends StObject {
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var email: js.UndefOr[String | Null] = js.undefined
    
    var phoneNumber: js.UndefOr[String | Null] = js.undefined
    
    var photoURL: js.UndefOr[String | Null] = js.undefined
    
    var providerId: String
    
    var uid: String
  }
  object MutableUserInfo {
    
    inline def apply(providerId: String, uid: String): MutableUserInfo = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutableUserInfo]
    }
    
    extension [Self <: MutableUserInfo](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserCredentialInternal
    extends StObject
       with UserCredential
       with TaggedWithTokenResponse {
    
    @JSName("user")
    var user_UserCredentialInternal: UserInternal
  }
  object UserCredentialInternal {
    
    inline def apply(operationType: link | reauthenticate | signIn, user: UserInternal): UserCredentialInternal = {
      val __obj = js.Dynamic.literal(operationType = operationType.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], providerId = null)
      __obj.asInstanceOf[UserCredentialInternal]
    }
    
    extension [Self <: UserCredentialInternal](x: Self) {
      
      inline def setUser(value: UserInternal): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserInternal
    extends StObject
       with User {
    
    def _assign(user: UserInternal): Unit = js.native
    
    def _clone(auth: AuthInternal): UserInternal = js.native
    
    def _notifyReloadListener(value: APIUserInfo): Unit = js.native
    @JSName("_notifyReloadListener")
    var _notifyReloadListener_Original: NextFn[APIUserInfo] = js.native
    
    def _onReload(cb: NextFn[APIUserInfo]): Unit = js.native
    
    var _redirectEventId: js.UndefOr[String] = js.native
    
    def _startProactiveRefresh(): Unit = js.native
    
    def _stopProactiveRefresh(): Unit = js.native
    
    def _updateTokensIfNecessary(response: FinalizeMfaResponse): js.Promise[Unit] = js.native
    def _updateTokensIfNecessary(response: FinalizeMfaResponse, reload: Boolean): js.Promise[Unit] = js.native
    def _updateTokensIfNecessary(response: IdTokenResponse): js.Promise[Unit] = js.native
    def _updateTokensIfNecessary(response: IdTokenResponse, reload: Boolean): js.Promise[Unit] = js.native
    
    var auth: AuthInternal = js.native
    
    @JSName("metadata")
    var metadata_UserInternal: UserMetadata = js.native
    
    @JSName("providerData")
    var providerData_UserInternal: js.Array[MutableUserInfo] = js.native
    
    @JSName("providerId")
    var providerId_UserInternal: firebase = js.native
    
    var stsTokenManager: StsTokenManager = js.native
  }
  
  trait UserParameters extends StObject {
    
    var auth: AuthInternal
    
    var createdAt: js.UndefOr[String | Null] = js.undefined
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var email: js.UndefOr[String | Null] = js.undefined
    
    var emailVerified: js.UndefOr[Boolean | Null] = js.undefined
    
    var isAnonymous: js.UndefOr[Boolean | Null] = js.undefined
    
    var lastLoginAt: js.UndefOr[String | Null] = js.undefined
    
    var phoneNumber: js.UndefOr[String | Null] = js.undefined
    
    var photoURL: js.UndefOr[String | Null] = js.undefined
    
    var providerData: js.UndefOr[js.Array[MutableUserInfo] | Null] = js.undefined
    
    var stsTokenManager: StsTokenManager
    
    var tenantId: js.UndefOr[String | Null] = js.undefined
    
    var uid: String
  }
  object UserParameters {
    
    inline def apply(auth: AuthInternal, stsTokenManager: StsTokenManager, uid: String): UserParameters = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], stsTokenManager = stsTokenManager.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserParameters]
    }
    
    extension [Self <: UserParameters](x: Self) {
      
      inline def setAuth(value: AuthInternal): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtNull: Self = StObject.set(x, "createdAt", null)
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
      
      inline def setEmailVerifiedNull: Self = StObject.set(x, "emailVerified", null)
      
      inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
      
      inline def setIsAnonymous(value: Boolean): Self = StObject.set(x, "isAnonymous", value.asInstanceOf[js.Any])
      
      inline def setIsAnonymousNull: Self = StObject.set(x, "isAnonymous", null)
      
      inline def setIsAnonymousUndefined: Self = StObject.set(x, "isAnonymous", js.undefined)
      
      inline def setLastLoginAt(value: String): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
      
      inline def setLastLoginAtNull: Self = StObject.set(x, "lastLoginAt", null)
      
      inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setPhotoURL(value: String): Self = StObject.set(x, "photoURL", value.asInstanceOf[js.Any])
      
      inline def setPhotoURLNull: Self = StObject.set(x, "photoURL", null)
      
      inline def setPhotoURLUndefined: Self = StObject.set(x, "photoURL", js.undefined)
      
      inline def setProviderData(value: js.Array[MutableUserInfo]): Self = StObject.set(x, "providerData", value.asInstanceOf[js.Any])
      
      inline def setProviderDataNull: Self = StObject.set(x, "providerData", null)
      
      inline def setProviderDataUndefined: Self = StObject.set(x, "providerData", js.undefined)
      
      inline def setProviderDataVarargs(value: MutableUserInfo*): Self = StObject.set(x, "providerData", js.Array(value*))
      
      inline def setStsTokenManager(value: StsTokenManager): Self = StObject.set(x, "stsTokenManager", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
