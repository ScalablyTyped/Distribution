package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest extends StObject {
  
  /**
    * Required. The key of the target for which we want to modify a policy. The target resource must point to a Group.
    */
  var policyTargetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
  
  /**
    * The new value for the policy.
    */
  var policyValue: js.UndefOr[SchemaGoogleChromePolicyV1PolicyValue] = js.undefined
  
  /**
    * Required. Policy fields to update. Only fields in this mask will be updated; other fields in `policy_value` will be ignored (even if they have values). If a field is in this list it must have a value in 'policy_value'.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest](x: Self) {
    
    inline def setPolicyTargetKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "policyTargetKey", value.asInstanceOf[js.Any])
    
    inline def setPolicyTargetKeyUndefined: Self = StObject.set(x, "policyTargetKey", js.undefined)
    
    inline def setPolicyValue(value: SchemaGoogleChromePolicyV1PolicyValue): Self = StObject.set(x, "policyValue", value.asInstanceOf[js.Any])
    
    inline def setPolicyValueUndefined: Self = StObject.set(x, "policyValue", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
