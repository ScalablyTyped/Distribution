package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesServiceperimetersReplaceall
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the access policy which owns these Service Perimeters. Format: `accessPolicies/{policy_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReplaceServicePerimetersRequest] = js.undefined
}
object ParamsResourceAccesspoliciesServiceperimetersReplaceall {
  
  inline def apply(): ParamsResourceAccesspoliciesServiceperimetersReplaceall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesServiceperimetersReplaceall]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesServiceperimetersReplaceall](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaReplaceServicePerimetersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
