package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeResponse extends StObject {
  
  /**
    * Node description.
    */
  var node: Node
}
object DescribeNodeResponse {
  
  inline def apply(node: Node): DescribeNodeResponse = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNodeResponse] (val x: Self) extends AnyVal {
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
