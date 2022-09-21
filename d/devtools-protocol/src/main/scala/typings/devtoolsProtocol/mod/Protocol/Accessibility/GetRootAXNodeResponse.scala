package typings.devtoolsProtocol.mod.Protocol.Accessibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootAXNodeResponse extends StObject {
  
  var node: AXNode
}
object GetRootAXNodeResponse {
  
  inline def apply(node: AXNode): GetRootAXNodeResponse = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRootAXNodeResponse]
  }
  
  extension [Self <: GetRootAXNodeResponse](x: Self) {
    
    inline def setNode(value: AXNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
