package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteRerouteDecision extends StObject {
  
  var decider: String
  
  var decision: String
  
  var explanation: String
}
object ClusterRerouteRerouteDecision {
  
  inline def apply(decider: String, decision: String, explanation: String): ClusterRerouteRerouteDecision = {
    val __obj = js.Dynamic.literal(decider = decider.asInstanceOf[js.Any], decision = decision.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteRerouteDecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRerouteRerouteDecision] (val x: Self) extends AnyVal {
    
    inline def setDecider(value: String): Self = StObject.set(x, "decider", value.asInstanceOf[js.Any])
    
    inline def setDecision(value: String): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
  }
}
