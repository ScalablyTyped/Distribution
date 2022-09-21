package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1ListGroupPriorityOrderingRequest extends StObject {
  
  /**
    * Required. The namespace of the policy type for the request.
    */
  var policyNamespace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The key of the target for which we want to retrieve the group priority ordering. The target resource must point to an app.
    */
  var policyTargetKey: js.UndefOr[SchemaGoogleChromePolicyV1PolicyTargetKey] = js.undefined
}
object SchemaGoogleChromePolicyV1ListGroupPriorityOrderingRequest {
  
  inline def apply(): SchemaGoogleChromePolicyV1ListGroupPriorityOrderingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1ListGroupPriorityOrderingRequest]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1ListGroupPriorityOrderingRequest](x: Self) {
    
    inline def setPolicyNamespace(value: String): Self = StObject.set(x, "policyNamespace", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamespaceNull: Self = StObject.set(x, "policyNamespace", null)
    
    inline def setPolicyNamespaceUndefined: Self = StObject.set(x, "policyNamespace", js.undefined)
    
    inline def setPolicyTargetKey(value: SchemaGoogleChromePolicyV1PolicyTargetKey): Self = StObject.set(x, "policyTargetKey", value.asInstanceOf[js.Any])
    
    inline def setPolicyTargetKeyUndefined: Self = StObject.set(x, "policyTargetKey", js.undefined)
  }
}
