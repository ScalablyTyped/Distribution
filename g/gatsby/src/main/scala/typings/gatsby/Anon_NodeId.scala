package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeId extends js.Object {
  var nodeId: String
  var nodeType: String
}

object Anon_NodeId {
  @scala.inline
  def apply(nodeId: String, nodeType: String): Anon_NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NodeId]
  }
}

