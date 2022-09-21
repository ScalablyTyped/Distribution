package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsListorgpolicies
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaListOrgPoliciesRequest] = js.undefined
  
  /**
    * Name of the resource to list Policies for.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsListorgpolicies {
  
  inline def apply(): ParamsResourceProjectsListorgpolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsListorgpolicies]
  }
  
  extension [Self <: ParamsResourceProjectsListorgpolicies](x: Self) {
    
    inline def setRequestBody(value: SchemaListOrgPoliciesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
