package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeId extends js.Object {
  var nodeId: String
  var nodeType: String
}

object AnonNodeId {
  @scala.inline
  def apply(nodeId: String, nodeType: String): AnonNodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeId]
  }
}

