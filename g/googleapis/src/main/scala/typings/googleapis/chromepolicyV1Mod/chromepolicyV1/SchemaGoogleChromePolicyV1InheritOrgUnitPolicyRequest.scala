package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1InheritOrgUnitPolicyRequest extends StObject {
  
  /**
    * The fully qualified name of the policy schema that is being inherited.
    */
  var policySchema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The key of the target for which we want to modify a policy. The target resource must point to an Org Unit.
    */
  var policyTargetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
}
object SchemaGoogleChromePolicyV1InheritOrgUnitPolicyRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1InheritOrgUnitPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1InheritOrgUnitPolicyRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1InheritOrgUnitPolicyRequest](x: Self) {
    
    inline def setPolicySchema(value: String): Self = StObject.set(x, "policySchema", value.asInstanceOf[js.Any])
    
    inline def setPolicySchemaNull: Self = StObject.set(x, "policySchema", null)
    
    inline def setPolicySchemaUndefined: Self = StObject.set(x, "policySchema", js.undefined)
    
    inline def setPolicyTargetKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "policyTargetKey", value.asInstanceOf[js.Any])
    
    inline def setPolicyTargetKeyUndefined: Self = StObject.set(x, "policyTargetKey", js.undefined)
  }
}
