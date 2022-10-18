package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlStartDatafeedResponse extends StObject {
  
  var node: NodeIds
  
  var started: Boolean
}
object MlStartDatafeedResponse {
  
  inline def apply(node: NodeIds, started: Boolean): MlStartDatafeedResponse = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartDatafeedResponse]
  }
  
  extension [Self <: MlStartDatafeedResponse](x: Self) {
    
    inline def setNode(value: NodeIds): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: NodeId*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
