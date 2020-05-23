package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeIdString extends js.Object {
  var nodeId: String
}

object NodeIdString {
  @scala.inline
  def apply(nodeId: String): NodeIdString = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIdString]
  }
}

