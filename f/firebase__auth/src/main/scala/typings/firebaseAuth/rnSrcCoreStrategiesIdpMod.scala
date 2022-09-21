package typings.firebaseAuth

import typings.firebaseAuth.rnSrcModelAuthMod.AuthInternal
import typings.firebaseAuth.rnSrcModelUserMod.UserCredentialInternal
import typings.firebaseAuth.rnSrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rnSrcCoreStrategiesIdpMod {
  
  @JSImport("@firebase/auth/dist/rn/src/core/strategies/idp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def link(params: IdpTaskParams): js.Promise[UserCredentialInternal] = ^.asInstanceOf[js.Dynamic].applyDynamic("_link")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredentialInternal]]
  
  inline def reauth(params: IdpTaskParams): js.Promise[UserCredentialInternal] = ^.asInstanceOf[js.Dynamic].applyDynamic("_reauth")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredentialInternal]]
  
  inline def signIn(params: IdpTaskParams): js.Promise[UserCredentialInternal] = ^.asInstanceOf[js.Dynamic].applyDynamic("_signIn")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UserCredentialInternal]]
  
  type IdpTask = js.Function1[/* params */ IdpTaskParams, js.Promise[UserCredentialInternal]]
  
  trait IdpTaskParams extends StObject {
    
    var auth: AuthInternal
    
    var bypassAuthState: js.UndefOr[Boolean] = js.undefined
    
    var pendingToken: js.UndefOr[String] = js.undefined
    
    var postBody: js.UndefOr[String] = js.undefined
    
    var requestUri: String
    
    var sessionId: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[UserInternal] = js.undefined
  }
  object IdpTaskParams {
    
    inline def apply(auth: AuthInternal, requestUri: String): IdpTaskParams = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], requestUri = requestUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdpTaskParams]
    }
    
    extension [Self <: IdpTaskParams](x: Self) {
      
      inline def setAuth(value: AuthInternal): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setBypassAuthState(value: Boolean): Self = StObject.set(x, "bypassAuthState", value.asInstanceOf[js.Any])
      
      inline def setBypassAuthStateUndefined: Self = StObject.set(x, "bypassAuthState", js.undefined)
      
      inline def setPendingToken(value: String): Self = StObject.set(x, "pendingToken", value.asInstanceOf[js.Any])
      
      inline def setPendingTokenUndefined: Self = StObject.set(x, "pendingToken", js.undefined)
      
      inline def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
      
      inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
      
      inline def setRequestUri(value: String): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setUser(value: UserInternal): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
