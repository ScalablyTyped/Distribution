package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentResponse extends StObject {
  
  /**
    * Resulting node.
    */
  var root: Node
}
object GetDocumentResponse {
  
  inline def apply(root: Node): GetDocumentResponse = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDocumentResponse] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
