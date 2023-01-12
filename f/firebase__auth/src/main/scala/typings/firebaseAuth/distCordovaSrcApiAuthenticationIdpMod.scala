package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcModelIdTokenMod.IdToken
import typings.firebaseAuth.distCordovaSrcModelIdTokenMod.IdTokenResponse
import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcApiAuthenticationIdpMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/api/authentication/idp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signInWithIdp(auth: Auth, request: SignInWithIdpRequest): js.Promise[SignInWithIdpResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithIdp")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignInWithIdpResponse]]
  
  trait SignInWithIdpRequest extends StObject {
    
    var autoCreate: js.UndefOr[Boolean] = js.undefined
    
    var idToken: js.UndefOr[IdToken] = js.undefined
    
    var pendingToken: js.UndefOr[String] = js.undefined
    
    var postBody: js.UndefOr[String] = js.undefined
    
    var requestUri: String
    
    var returnIdpCredential: js.UndefOr[Boolean] = js.undefined
    
    var returnSecureToken: Boolean
    
    var sessionId: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object SignInWithIdpRequest {
    
    inline def apply(requestUri: String, returnSecureToken: Boolean): SignInWithIdpRequest = {
      val __obj = js.Dynamic.literal(requestUri = requestUri.asInstanceOf[js.Any], returnSecureToken = returnSecureToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithIdpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignInWithIdpRequest] (val x: Self) extends AnyVal {
      
      inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
      
      inline def setIdToken(value: IdToken): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setPendingToken(value: String): Self = StObject.set(x, "pendingToken", value.asInstanceOf[js.Any])
      
      inline def setPendingTokenUndefined: Self = StObject.set(x, "pendingToken", js.undefined)
      
      inline def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
      
      inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
      
      inline def setRequestUri(value: String): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
      
      inline def setReturnIdpCredential(value: Boolean): Self = StObject.set(x, "returnIdpCredential", value.asInstanceOf[js.Any])
      
      inline def setReturnIdpCredentialUndefined: Self = StObject.set(x, "returnIdpCredential", js.undefined)
      
      inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAuth.distCordovaSrcApiAuthenticationMfaMod.PhoneOrOauthTokenResponse because Already inherited */ trait SignInWithIdpResponse
    extends StObject
       with IdTokenResponse {
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var oauthAccessToken: js.UndefOr[String] = js.undefined
    
    var oauthIdToken: js.UndefOr[String] = js.undefined
    
    var oauthTokenSecret: js.UndefOr[String] = js.undefined
    
    var pendingToken: js.UndefOr[String] = js.undefined
  }
  object SignInWithIdpResponse {
    
    inline def apply(localId: String): SignInWithIdpResponse = {
      val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInWithIdpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignInWithIdpResponse] (val x: Self) extends AnyVal {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOauthAccessToken(value: String): Self = StObject.set(x, "oauthAccessToken", value.asInstanceOf[js.Any])
      
      inline def setOauthAccessTokenUndefined: Self = StObject.set(x, "oauthAccessToken", js.undefined)
      
      inline def setOauthIdToken(value: String): Self = StObject.set(x, "oauthIdToken", value.asInstanceOf[js.Any])
      
      inline def setOauthIdTokenUndefined: Self = StObject.set(x, "oauthIdToken", js.undefined)
      
      inline def setOauthTokenSecret(value: String): Self = StObject.set(x, "oauthTokenSecret", value.asInstanceOf[js.Any])
      
      inline def setOauthTokenSecretUndefined: Self = StObject.set(x, "oauthTokenSecret", js.undefined)
      
      inline def setPendingToken(value: String): Self = StObject.set(x, "pendingToken", value.asInstanceOf[js.Any])
      
      inline def setPendingTokenUndefined: Self = StObject.set(x, "pendingToken", js.undefined)
    }
  }
}
