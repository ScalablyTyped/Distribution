package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsListavailableorgpolicyconstraints
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaListAvailableOrgPolicyConstraintsRequest] = js.undefined
  
  /**
    * Name of the resource to list `Constraints` for.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsListavailableorgpolicyconstraints {
  
  inline def apply(): ParamsResourceProjectsListavailableorgpolicyconstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsListavailableorgpolicyconstraints]
  }
  
  extension [Self <: ParamsResourceProjectsListavailableorgpolicyconstraints](x: Self) {
    
    inline def setRequestBody(value: SchemaListAvailableOrgPolicyConstraintsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
