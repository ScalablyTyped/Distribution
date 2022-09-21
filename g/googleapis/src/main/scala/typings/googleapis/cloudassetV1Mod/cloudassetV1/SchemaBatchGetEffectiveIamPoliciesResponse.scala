package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchGetEffectiveIamPoliciesResponse extends StObject {
  
  /**
    * The effective policies for a batch of resources. Note that the results order is the same as the order of BatchGetEffectiveIamPoliciesRequest.names. When a resource does not have any effective IAM policies, its corresponding policy_result will contain empty EffectiveIamPolicy.policies.
    */
  var policyResults: js.UndefOr[js.Array[SchemaEffectiveIamPolicy]] = js.undefined
}
object SchemaBatchGetEffectiveIamPoliciesResponse {
  
  inline def apply(): SchemaBatchGetEffectiveIamPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetEffectiveIamPoliciesResponse]
  }
  
  extension [Self <: SchemaBatchGetEffectiveIamPoliciesResponse](x: Self) {
    
    inline def setPolicyResults(value: js.Array[SchemaEffectiveIamPolicy]): Self = StObject.set(x, "policyResults", value.asInstanceOf[js.Any])
    
    inline def setPolicyResultsUndefined: Self = StObject.set(x, "policyResults", js.undefined)
    
    inline def setPolicyResultsVarargs(value: SchemaEffectiveIamPolicy*): Self = StObject.set(x, "policyResults", js.Array(value*))
  }
}
