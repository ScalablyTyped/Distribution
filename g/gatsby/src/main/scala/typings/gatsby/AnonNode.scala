package typings.gatsby

import typings.gatsby.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNode extends js.Object {
  var node: Node
}

object AnonNode {
  @scala.inline
  def apply(node: Node): AnonNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNode]
  }
}

