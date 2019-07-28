package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Content
import typings.gatsby.Anon_Owner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends NodeInput {
  @JSName("children")
  var children_Node: js.Array[String]
  @JSName("internal")
  var internal_Node: Anon_Content with Anon_Owner
  @JSName("parent")
  var parent_Node: String
}

object Node {
  @scala.inline
  def apply(children: js.Array[String], id: String, internal: Anon_Content with Anon_Owner, parent: String): Node = {
    val __obj = js.Dynamic.literal(children = children, id = id, internal = internal, parent = parent)
  
    __obj.asInstanceOf[Node]
  }
}

