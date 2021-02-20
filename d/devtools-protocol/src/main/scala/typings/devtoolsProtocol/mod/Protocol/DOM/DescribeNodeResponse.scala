package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNodeResponse extends StObject {
  
  /**
    * Node description.
    */
  var node: Node = js.native
}
object DescribeNodeResponse {
  
  @scala.inline
  def apply(node: Node): DescribeNodeResponse = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeResponse]
  }
  
  @scala.inline
  implicit class DescribeNodeResponseMutableBuilder[Self <: DescribeNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
