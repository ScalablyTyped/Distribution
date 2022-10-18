package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterAllocationExplainAllocationDecision extends StObject {
  
  var decider: String
  
  var decision: ClusterAllocationExplainAllocationExplainDecision
  
  var explanation: String
}
object ClusterAllocationExplainAllocationDecision {
  
  inline def apply(decider: String, decision: ClusterAllocationExplainAllocationExplainDecision, explanation: String): ClusterAllocationExplainAllocationDecision = {
    val __obj = js.Dynamic.literal(decider = decider.asInstanceOf[js.Any], decision = decision.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainAllocationDecision]
  }
  
  extension [Self <: ClusterAllocationExplainAllocationDecision](x: Self) {
    
    inline def setDecider(value: String): Self = StObject.set(x, "decider", value.asInstanceOf[js.Any])
    
    inline def setDecision(value: ClusterAllocationExplainAllocationExplainDecision): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
  }
}
