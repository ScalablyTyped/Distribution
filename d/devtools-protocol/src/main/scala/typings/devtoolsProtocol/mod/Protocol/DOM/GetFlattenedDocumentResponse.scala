package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFlattenedDocumentResponse extends StObject {
  
  /**
    * Resulting node.
    */
  var nodes: js.Array[Node]
}
object GetFlattenedDocumentResponse {
  
  @scala.inline
  def apply(nodes: js.Array[Node]): GetFlattenedDocumentResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlattenedDocumentResponse]
  }
  
  @scala.inline
  implicit class GetFlattenedDocumentResponseMutableBuilder[Self <: GetFlattenedDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
