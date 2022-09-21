package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSetorgpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSetOrgPolicyRequest] = js.undefined
  
  /**
    * Resource name of the resource to attach the `Policy`.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSetorgpolicy {
  
  inline def apply(): ParamsResourceProjectsSetorgpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSetorgpolicy]
  }
  
  extension [Self <: ParamsResourceProjectsSetorgpolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaSetOrgPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
