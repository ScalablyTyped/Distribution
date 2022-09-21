package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersGeteffectiveorgpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetEffectiveOrgPolicyRequest] = js.undefined
  
  /**
    * The name of the resource to start computing the effective `Policy`.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersGeteffectiveorgpolicy {
  
  inline def apply(): ParamsResourceFoldersGeteffectiveorgpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersGeteffectiveorgpolicy]
  }
  
  extension [Self <: ParamsResourceFoldersGeteffectiveorgpolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaGetEffectiveOrgPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
