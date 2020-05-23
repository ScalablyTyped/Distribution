package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeId extends js.Object {
  var nodeId: String
  var nodeType: String
}

object NodeId {
  @scala.inline
  def apply(nodeId: String, nodeType: String): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
}

