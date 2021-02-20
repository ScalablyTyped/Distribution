package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetEffectivePropertyValueForNodeRequest extends StObject {
  
  /**
    * The element id for which to set property.
    */
  var nodeId: NodeId = js.native
  
  var propertyName: String = js.native
  
  var value: String = js.native
}
object SetEffectivePropertyValueForNodeRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, propertyName: String, value: String): SetEffectivePropertyValueForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffectivePropertyValueForNodeRequest]
  }
  
  @scala.inline
  implicit class SetEffectivePropertyValueForNodeRequestMutableBuilder[Self <: SetEffectivePropertyValueForNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
