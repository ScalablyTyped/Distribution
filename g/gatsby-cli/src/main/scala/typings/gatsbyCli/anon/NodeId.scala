package typings.gatsbyCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeId extends StObject {
  
  var nodeId: Any
  
  var pluginName: Any
}
object NodeId {
  
  inline def apply(nodeId: Any, pluginName: Any): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  extension [Self <: NodeId](x: Self) {
    
    inline def setNodeId(value: Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setPluginName(value: Any): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
  }
}
