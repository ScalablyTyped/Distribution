package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var node: typings.gatsby.mod.Node
}

object Node {
  @scala.inline
  def apply(node: typings.gatsby.mod.Node): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

