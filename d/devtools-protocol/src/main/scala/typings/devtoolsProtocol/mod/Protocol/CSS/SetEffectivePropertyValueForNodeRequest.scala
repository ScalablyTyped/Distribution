package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEffectivePropertyValueForNodeRequest extends StObject {
  
  /**
    * The element id for which to set property.
    */
  var nodeId: NodeId
  
  var propertyName: String
  
  var value: String
}
object SetEffectivePropertyValueForNodeRequest {
  
  inline def apply(nodeId: NodeId, propertyName: String, value: String): SetEffectivePropertyValueForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffectivePropertyValueForNodeRequest]
  }
  
  extension [Self <: SetEffectivePropertyValueForNodeRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
