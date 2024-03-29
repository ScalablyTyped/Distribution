package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichGetPolicyResponse extends StObject {
  
  var policies: js.Array[EnrichSummary]
}
object EnrichGetPolicyResponse {
  
  inline def apply(policies: js.Array[EnrichSummary]): EnrichGetPolicyResponse = {
    val __obj = js.Dynamic.literal(policies = policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichGetPolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrichGetPolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicies(value: js.Array[EnrichSummary]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesVarargs(value: EnrichSummary*): Self = StObject.set(x, "policies", js.Array(value*))
  }
}
