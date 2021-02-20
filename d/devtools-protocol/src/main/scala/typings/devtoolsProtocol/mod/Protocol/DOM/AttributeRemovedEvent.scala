package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeRemovedEvent extends StObject {
  
  /**
    * A ttribute name.
    */
  var name: String = js.native
  
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId = js.native
}
object AttributeRemovedEvent {
  
  @scala.inline
  def apply(name: String, nodeId: NodeId): AttributeRemovedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeRemovedEvent]
  }
  
  @scala.inline
  implicit class AttributeRemovedEventMutableBuilder[Self <: AttributeRemovedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
