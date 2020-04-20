package typings.gatsby

import typings.gatsby.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChild extends js.Object {
  var child: Node
  var parent: Node
}

object AnonChild {
  @scala.inline
  def apply(child: Node, parent: Node): AnonChild = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChild]
  }
}

