package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends NodeInput {
  @JSName("children")
  var children_Node: js.Array[java.lang.String]
  @JSName("internal")
  var internal_Node: gatsbyLib.Anon_Content with gatsbyLib.Anon_Owner
  @JSName("parent")
  var parent_Node: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    children: js.Array[java.lang.String],
    id: java.lang.String,
    internal: gatsbyLib.Anon_Content with gatsbyLib.Anon_Owner,
    parent: java.lang.String
  ): Node = {
    val __obj = js.Dynamic.literal(children = children, id = id, internal = internal, parent = parent)
  
    __obj.asInstanceOf[Node]
  }
}

