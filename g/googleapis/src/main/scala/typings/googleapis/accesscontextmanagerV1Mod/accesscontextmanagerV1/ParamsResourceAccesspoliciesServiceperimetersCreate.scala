package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesServiceperimetersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the access policy which owns this Service Perimeter. Format: `accessPolicies/{policy_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaServicePerimeter] = js.undefined
}
object ParamsResourceAccesspoliciesServiceperimetersCreate {
  
  inline def apply(): ParamsResourceAccesspoliciesServiceperimetersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesServiceperimetersCreate]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesServiceperimetersCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaServicePerimeter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
