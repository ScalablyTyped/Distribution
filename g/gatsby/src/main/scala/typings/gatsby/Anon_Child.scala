package typings.gatsby

import typings.gatsby.gatsbyMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Child extends js.Object {
  var child: Node
  var parent: Node
}

object Anon_Child {
  @scala.inline
  def apply(child: Node, parent: Node): Anon_Child = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Child]
  }
}

