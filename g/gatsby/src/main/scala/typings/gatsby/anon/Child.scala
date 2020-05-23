package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Child extends js.Object {
  var child: typings.gatsby.mod.Node
  var parent: typings.gatsby.mod.Node
}

object Child {
  @scala.inline
  def apply(child: typings.gatsby.mod.Node, parent: typings.gatsby.mod.Node): Child = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Child]
  }
}

