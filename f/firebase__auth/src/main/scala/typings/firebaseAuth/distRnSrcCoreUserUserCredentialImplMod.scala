package typings.firebaseAuth

import typings.firebaseAuth.distRnSrcApiAuthenticationMfaMod.PhoneOrOauthTokenResponse
import typings.firebaseAuth.distRnSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.distRnSrcModelEnumsMod.OperationType
import typings.firebaseAuth.distRnSrcModelEnumsMod.ProviderId
import typings.firebaseAuth.distRnSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distRnSrcModelPublicTypesMod.User
import typings.firebaseAuth.distRnSrcModelUserMod.UserCredentialInternal
import typings.firebaseAuth.distRnSrcModelUserMod.UserInternal
import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcCoreUserUserCredentialImplMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAuth.distRnSrcCoreUserUserCredentialImplMod.UserCredentialParams because var conflicts: _tokenResponse, operationType, providerId, user. Inlined  */ @JSImport("@firebase/auth/dist/rn/src/core/user/user_credential_impl", "UserCredentialImpl")
  @js.native
  open class UserCredentialImpl protected ()
    extends StObject
       with UserCredentialInternal {
    def this(params: UserCredentialParams) = this()
    
    /**
      * The type of operation which was used to authenticate the user (such as sign-in or link).
      */
    /* CompleteClass */
    var operationType: link | reauthenticate | signIn = js.native
    @JSName("operationType")
    val operationType_UserCredentialImpl: OperationType = js.native
    
    /**
      * The provider which was used to authenticate the user.
      */
    /* CompleteClass */
    var providerId: String | Null = js.native
    @JSName("providerId")
    val providerId_UserCredentialImpl: ProviderId | String | Null = js.native
    
    /**
      * The user authenticated by this credential.
      */
    /* CompleteClass */
    var user: User = js.native
    /* CompleteClass */
    @JSName("user")
    var user_UserCredentialInternal: UserInternal = js.native
  }
  /* static members */
  object UserCredentialImpl {
    
    @JSImport("@firebase/auth/dist/rn/src/core/user/user_credential_impl", "UserCredentialImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _forOperation(user: UserInternal, operationType: OperationType, response: PhoneOrOauthTokenResponse): js.Promise[UserCredentialImpl] = (^.asInstanceOf[js.Dynamic].applyDynamic("_forOperation")(user.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialImpl]]
    
    inline def _fromIdTokenResponse(auth: AuthInternal, operationType: OperationType, idTokenResponse: IdTokenResponse): js.Promise[UserCredentialInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialInternal]]
    inline def _fromIdTokenResponse(
      auth: AuthInternal,
      operationType: OperationType,
      idTokenResponse: IdTokenResponse,
      isAnonymous: Boolean
    ): js.Promise[UserCredentialInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], operationType.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any], isAnonymous.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredentialInternal]]
  }
  
  trait UserCredentialParams extends StObject {
    
    val _tokenResponse: js.UndefOr[PhoneOrOauthTokenResponse] = js.undefined
    
    val operationType: OperationType
    
    val providerId: ProviderId | String | Null
    
    val user: UserInternal
  }
  object UserCredentialParams {
    
    inline def apply(operationType: OperationType, user: UserInternal): UserCredentialParams = {
      val __obj = js.Dynamic.literal(operationType = operationType.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], providerId = null)
      __obj.asInstanceOf[UserCredentialParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserCredentialParams] (val x: Self) extends AnyVal {
      
      inline def setOperationType(value: OperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
      
      inline def setProviderId(value: ProviderId | String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderIdNull: Self = StObject.set(x, "providerId", null)
      
      inline def setUser(value: UserInternal): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def set_tokenResponse(value: PhoneOrOauthTokenResponse): Self = StObject.set(x, "_tokenResponse", value.asInstanceOf[js.Any])
      
      inline def set_tokenResponseUndefined: Self = StObject.set(x, "_tokenResponse", js.undefined)
    }
  }
}
