package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetEffectiveOrgPolicyRequest extends StObject {
  
  /**
    * The name of the `Constraint` to compute the effective `Policy`.
    */
  var constraint: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetEffectiveOrgPolicyRequest {
  
  inline def apply(): SchemaGetEffectiveOrgPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetEffectiveOrgPolicyRequest]
  }
  
  extension [Self <: SchemaGetEffectiveOrgPolicyRequest](x: Self) {
    
    inline def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintNull: Self = StObject.set(x, "constraint", null)
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
  }
}
