package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse extends StObject {
  
  /**
    * Output only. The group IDs, in priority ordering.
    */
  var groupIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The namespace of the policy type of the group IDs.
    */
  var policyNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The target resource for which the group priority ordering has been retrieved.
    */
  var policyTargetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
}
object SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse {
  
  inline def apply(): SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ListGroupPriorityOrderingResponse](x: Self) {
    
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
