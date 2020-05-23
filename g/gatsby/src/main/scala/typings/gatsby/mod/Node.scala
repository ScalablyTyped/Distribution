package typings.gatsby.mod

import typings.gatsby.anon.Content
import typings.gatsby.anon.Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends NodeInput {
  @JSName("children")
  var children_Node: js.Array[String]
  @JSName("internal")
  var internal_Node: Content with Owner
  @JSName("parent")
  var parent_Node: String
}

object Node {
  @scala.inline
  def apply(children: js.Array[String], id: String, internal: Content with Owner, parent: String): Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

