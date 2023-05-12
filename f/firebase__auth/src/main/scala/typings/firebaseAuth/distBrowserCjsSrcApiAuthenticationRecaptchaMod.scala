package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcApiMod.RecaptchaClientType
import typings.firebaseAuth.distBrowserCjsSrcApiMod.RecaptchaVersion
import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcApiAuthenticationRecaptchaMod {
  
  @JSImport("@firebase/auth/dist/browser-cjs/src/api/authentication/recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRecaptchaConfig(auth: Auth, request: GetRecaptchaConfigRequest): js.Promise[GetRecaptchaConfigResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRecaptchaConfig")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRecaptchaConfigResponse]]
  
  inline def getRecaptchaParams(auth: Auth): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecaptchaParams")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait GetRecaptchaConfigRequest extends StObject {
    
    var clientType: js.UndefOr[RecaptchaClientType] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[RecaptchaVersion] = js.undefined
  }
  object GetRecaptchaConfigRequest {
    
    inline def apply(): GetRecaptchaConfigRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecaptchaConfigRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRecaptchaConfigRequest] (val x: Self) extends AnyVal {
      
      inline def setClientType(value: RecaptchaClientType): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
      
      inline def setClientTypeUndefined: Self = StObject.set(x, "clientType", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setVersion(value: RecaptchaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetRecaptchaConfigResponse extends StObject {
    
    var recaptchaEnforcementState: js.Array[RecaptchaEnforcementState]
    
    var recaptchaKey: String
  }
  object GetRecaptchaConfigResponse {
    
    inline def apply(recaptchaEnforcementState: js.Array[RecaptchaEnforcementState], recaptchaKey: String): GetRecaptchaConfigResponse = {
      val __obj = js.Dynamic.literal(recaptchaEnforcementState = recaptchaEnforcementState.asInstanceOf[js.Any], recaptchaKey = recaptchaKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRecaptchaConfigResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetRecaptchaConfigResponse] (val x: Self) extends AnyVal {
      
      inline def setRecaptchaEnforcementState(value: js.Array[RecaptchaEnforcementState]): Self = StObject.set(x, "recaptchaEnforcementState", value.asInstanceOf[js.Any])
      
      inline def setRecaptchaEnforcementStateVarargs(value: RecaptchaEnforcementState*): Self = StObject.set(x, "recaptchaEnforcementState", js.Array(value*))
      
      inline def setRecaptchaKey(value: String): Self = StObject.set(x, "recaptchaKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecaptchaEnforcementState extends StObject {
    
    var enforcementState: String
    
    var provider: String
  }
  object RecaptchaEnforcementState {
    
    inline def apply(enforcementState: String, provider: String): RecaptchaEnforcementState = {
      val __obj = js.Dynamic.literal(enforcementState = enforcementState.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecaptchaEnforcementState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecaptchaEnforcementState] (val x: Self) extends AnyVal {
      
      inline def setEnforcementState(value: String): Self = StObject.set(x, "enforcementState", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
