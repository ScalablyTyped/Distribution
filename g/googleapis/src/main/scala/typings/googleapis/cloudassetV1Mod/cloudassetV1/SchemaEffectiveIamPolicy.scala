package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEffectiveIamPolicy extends StObject {
  
  /**
    * The [full_resource_name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) for which the policies are computed. This is one of the BatchGetEffectiveIamPoliciesRequest.names the caller provides in the request.
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The effective policies for the full_resource_name. These policies include the policy set on the full_resource_name and those set on its parents and ancestors up to the BatchGetEffectiveIamPoliciesRequest.scope. Note that these policies are not filtered according to the resource type of the full_resource_name. These policies are hierarchically ordered by PolicyInfo.attached_resource starting from full_resource_name itself to its parents and ancestors, such that policies[i]'s PolicyInfo.attached_resource is the child of policies[i+1]'s PolicyInfo.attached_resource, if policies[i+1] exists.
    */
  var policies: js.UndefOr[js.Array[SchemaPolicyInfo]] = js.undefined
}
object SchemaEffectiveIamPolicy {
  
  inline def apply(): SchemaEffectiveIamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEffectiveIamPolicy]
  }
  
  extension [Self <: SchemaEffectiveIamPolicy](x: Self) {
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    inline def setPolicies(value: js.Array[SchemaPolicyInfo]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPoliciesVarargs(value: SchemaPolicyInfo*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
