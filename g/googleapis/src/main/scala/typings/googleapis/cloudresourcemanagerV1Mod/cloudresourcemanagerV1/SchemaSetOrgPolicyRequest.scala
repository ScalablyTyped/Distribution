package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetOrgPolicyRequest extends StObject {
  
  /**
    * `Policy` to set on the resource.
    */
  var policy: js.UndefOr[SchemaOrgPolicy] = js.undefined
}
object SchemaSetOrgPolicyRequest {
  
  inline def apply(): SchemaSetOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOrgPolicyRequest]
  }
  
  extension [Self <: SchemaSetOrgPolicyRequest](x: Self) {
    
    inline def setPolicy(value: SchemaOrgPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
