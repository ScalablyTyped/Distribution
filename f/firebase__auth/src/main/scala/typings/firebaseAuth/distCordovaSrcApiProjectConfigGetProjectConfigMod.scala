package typings.firebaseAuth

import typings.firebaseAuth.distCordovaSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcApiProjectConfigGetProjectConfigMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/api/project_config/get_project_config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProjectConfig(auth: Auth): js.Promise[GetProjectConfigResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectConfig")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetProjectConfigResponse]]
  inline def getProjectConfig(auth: Auth, request: GetProjectConfigRequest): js.Promise[GetProjectConfigResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getProjectConfig")(auth.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetProjectConfigResponse]]
  
  trait GetProjectConfigRequest extends StObject {
    
    var androidPackageName: js.UndefOr[String] = js.undefined
    
    var iosBundleId: js.UndefOr[String] = js.undefined
  }
  object GetProjectConfigRequest {
    
    inline def apply(): GetProjectConfigRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetProjectConfigRequest]
    }
    
    extension [Self <: GetProjectConfigRequest](x: Self) {
      
      inline def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
      
      inline def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
      
      inline def setIosBundleId(value: String): Self = StObject.set(x, "iosBundleId", value.asInstanceOf[js.Any])
      
      inline def setIosBundleIdUndefined: Self = StObject.set(x, "iosBundleId", js.undefined)
    }
  }
  
  trait GetProjectConfigResponse extends StObject {
    
    var authorizedDomains: js.Array[String]
  }
  object GetProjectConfigResponse {
    
    inline def apply(authorizedDomains: js.Array[String]): GetProjectConfigResponse = {
      val __obj = js.Dynamic.literal(authorizedDomains = authorizedDomains.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProjectConfigResponse]
    }
    
    extension [Self <: GetProjectConfigResponse](x: Self) {
      
      inline def setAuthorizedDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedDomains", value.asInstanceOf[js.Any])
      
      inline def setAuthorizedDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedDomains", js.Array(value*))
    }
  }
}
