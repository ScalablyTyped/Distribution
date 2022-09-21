package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsGetorgpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetOrgPolicyRequest] = js.undefined
  
  /**
    * Name of the resource the `Policy` is set on.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsGetorgpolicy {
  
  inline def apply(): ParamsResourceOrganizationsGetorgpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsGetorgpolicy]
  }
  
  extension [Self <: ParamsResourceOrganizationsGetorgpolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaGetOrgPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
