package typings.firebaseAuth

import typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcApiAuthenticationCreateAuthUriMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/api/authentication/create_auth_uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAuthUri(auth: Auth, request: CreateAuthUriRequest): js.Promise[CreateAuthUriResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuthUri")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CreateAuthUriResponse]]
  
  trait CreateAuthUriRequest extends StObject {
    
    var continueUri: String
    
    var identifier: String
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object CreateAuthUriRequest {
    
    inline def apply(continueUri: String, identifier: String): CreateAuthUriRequest = {
      val __obj = js.Dynamic.literal(continueUri = continueUri.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAuthUriRequest]
    }
    
    extension [Self <: CreateAuthUriRequest](x: Self) {
      
      inline def setContinueUri(value: String): Self = StObject.set(x, "continueUri", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait CreateAuthUriResponse extends StObject {
    
    var signinMethods: js.Array[String]
  }
  object CreateAuthUriResponse {
    
    inline def apply(signinMethods: js.Array[String]): CreateAuthUriResponse = {
      val __obj = js.Dynamic.literal(signinMethods = signinMethods.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAuthUriResponse]
    }
    
    extension [Self <: CreateAuthUriResponse](x: Self) {
      
      inline def setSigninMethods(value: js.Array[String]): Self = StObject.set(x, "signinMethods", value.asInstanceOf[js.Any])
      
      inline def setSigninMethodsVarargs(value: String*): Self = StObject.set(x, "signinMethods", js.Array(value*))
    }
  }
}
