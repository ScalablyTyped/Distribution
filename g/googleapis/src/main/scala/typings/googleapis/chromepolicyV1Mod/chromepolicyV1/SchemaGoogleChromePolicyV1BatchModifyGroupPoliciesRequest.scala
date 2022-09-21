package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1BatchModifyGroupPoliciesRequest extends StObject {
  
  /**
    * List of policies to modify as defined by the `requests`. All requests in the list must follow these restrictions: 1. All schemas in the list must have the same root namespace. 2. All `policyTargetKey.targetResource` values must point to a group resource. 3. All `policyTargetKey` values must have the same `app_id` key name in the `additionalTargetKeys`. 4. No two modification requests can reference the same `policySchema` + ` policyTargetKey` pair.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest]] = js.undefined
}
object SchemaGoogleChromePolicyV1BatchModifyGroupPoliciesRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1BatchModifyGroupPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1BatchModifyGroupPoliciesRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1BatchModifyGroupPoliciesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleChromePolicyV1ModifyGroupPolicyRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
