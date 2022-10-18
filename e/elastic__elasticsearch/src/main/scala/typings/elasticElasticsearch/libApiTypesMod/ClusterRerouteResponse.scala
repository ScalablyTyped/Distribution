package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterRerouteResponse extends StObject {
  
  var acknowledged: Boolean
  
  var explanations: js.UndefOr[js.Array[ClusterRerouteRerouteExplanation]] = js.undefined
  
  var state: Any
}
object ClusterRerouteResponse {
  
  inline def apply(acknowledged: Boolean, state: Any): ClusterRerouteResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteResponse]
  }
  
  extension [Self <: ClusterRerouteResponse](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setExplanations(value: js.Array[ClusterRerouteRerouteExplanation]): Self = StObject.set(x, "explanations", value.asInstanceOf[js.Any])
    
    inline def setExplanationsUndefined: Self = StObject.set(x, "explanations", js.undefined)
    
    inline def setExplanationsVarargs(value: ClusterRerouteRerouteExplanation*): Self = StObject.set(x, "explanations", js.Array(value*))
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
