package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTransformAuthorization extends StObject {
  
  var api_key: js.UndefOr[MlApiKeyAuthorization] = js.undefined
  
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  
  var service_account: js.UndefOr[String] = js.undefined
}
object MlTransformAuthorization {
  
  inline def apply(): MlTransformAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlTransformAuthorization]
  }
  
  extension [Self <: MlTransformAuthorization](x: Self) {
    
    inline def setApi_key(value: MlApiKeyAuthorization): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setApi_keyUndefined: Self = StObject.set(x, "api_key", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setService_account(value: String): Self = StObject.set(x, "service_account", value.asInstanceOf[js.Any])
    
    inline def setService_accountUndefined: Self = StObject.set(x, "service_account", js.undefined)
  }
}
