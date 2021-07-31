package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAttributesAsTextRequest extends StObject {
  
  /**
    * Attribute name to replace with new attributes derived from text in case text parsed
    * successfully.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the element to set attributes for.
    */
  var nodeId: NodeId
  
  /**
    * Text with a number of attributes. Will parse this text using HTML parser.
    */
  var text: String
}
object SetAttributesAsTextRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, text: String): SetAttributesAsTextRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttributesAsTextRequest]
  }
  
  @scala.inline
  implicit class SetAttributesAsTextRequestMutableBuilder[Self <: SetAttributesAsTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
