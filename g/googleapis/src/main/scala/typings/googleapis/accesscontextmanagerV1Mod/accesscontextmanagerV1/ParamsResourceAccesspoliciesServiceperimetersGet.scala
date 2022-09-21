package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesServiceperimetersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the Service Perimeter. Format: `accessPolicies/{policy_id\}/servicePerimeters/{service_perimeters_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccesspoliciesServiceperimetersGet {
  
  inline def apply(): ParamsResourceAccesspoliciesServiceperimetersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesServiceperimetersGet]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesServiceperimetersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
