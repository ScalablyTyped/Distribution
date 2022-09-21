package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest extends StObject {
  
  /**
    * Required. The group IDs, in desired priority ordering.
    */
  var groupIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The namespace of the policy type for the request.
    */
  var policyNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The key of the target for which we want to update the group priority ordering. The target resource must point to an app.
    */
  var policyTargetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
}
object SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest](x: Self) {
    
    inline def setGroupIds(value: js.Array[String]): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsNull: Self = StObject.set(x, "groupIds", null)
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
    
    inline def setGroupIdsVarargs(value: String*): Self = StObject.set(x, "groupIds", js.Array(value*))
    
    inline def setPolicyNamespace(value: String): Self = StObject.set(x, "policyNamespace", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamespaceNull: Self = StObject.set(x, "policyNamespace", null)
    
    inline def setPolicyNamespaceUndefined: Self = StObject.set(x, "policyNamespace", js.undefined)
    
    inline def setPolicyTargetKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "policyTargetKey", value.asInstanceOf[js.Any])
    
    inline def setPolicyTargetKeyUndefined: Self = StObject.set(x, "policyTargetKey", js.undefined)
  }
}
