package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteRerouteExplanation extends StObject {
  
  var command: String
  
  var decisions: js.Array[ClusterRerouteRerouteDecision]
  
  var parameters: ClusterRerouteRerouteParameters
}
object ClusterRerouteRerouteExplanation {
  
  inline def apply(
    command: String,
    decisions: js.Array[ClusterRerouteRerouteDecision],
    parameters: ClusterRerouteRerouteParameters
  ): ClusterRerouteRerouteExplanation = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], decisions = decisions.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteRerouteExplanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterRerouteRerouteExplanation] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDecisions(value: js.Array[ClusterRerouteRerouteDecision]): Self = StObject.set(x, "decisions", value.asInstanceOf[js.Any])
    
    inline def setDecisionsVarargs(value: ClusterRerouteRerouteDecision*): Self = StObject.set(x, "decisions", js.Array(value*))
    
    inline def setParameters(value: ClusterRerouteRerouteParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
