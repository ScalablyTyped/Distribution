package typings.dom4

import typings.std.HTMLCollection
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentNode extends js.Object {
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (Node | String)*): Unit
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (Node | String)*): Unit
}

object ParentNode {
  @scala.inline
  def apply(
    append: /* repeated */ Node | String => Unit,
    children: HTMLCollection,
    prepend: /* repeated */ Node | String => Unit
  ): ParentNode = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), children = children.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend))
  
    __obj.asInstanceOf[ParentNode]
  }
}

