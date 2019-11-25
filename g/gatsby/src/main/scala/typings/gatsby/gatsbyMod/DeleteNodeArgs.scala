package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNodeArgs extends js.Object {
  var node: Node
}

object DeleteNodeArgs {
  @scala.inline
  def apply(node: Node): DeleteNodeArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNodeArgs]
  }
}

