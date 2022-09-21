package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest extends StObject {
  
  /**
    * List of policies to modify as defined by the `requests`. All requests in the list must follow these restrictions: 1. All schemas in the list must have the same root namespace. 2. All `policyTargetKey.targetResource` values must point to an org unit resource. 3. All `policyTargetKey` values must have the same key names in the ` additionalTargetKeys`. This also means if one of the targets has an empty `additionalTargetKeys` map, all of the targets must have an empty `additionalTargetKeys` map. 4. No two modification requests can reference the same `policySchema` + ` policyTargetKey` pair.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleChromePolicyV1ModifyOrgUnitPolicyRequest]] = js.undefined
}
object SchemaGoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleChromePolicyV1ModifyOrgUnitPolicyRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleChromePolicyV1ModifyOrgUnitPolicyRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
