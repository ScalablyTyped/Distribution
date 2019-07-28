package typings.dom4

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://dom.spec.whatwg.org/#childnode
  */
trait ChildNode extends js.Object {
  /**
    * Inserts `nodes` just after this node, while replacing strings with equivalent `Text` nodes.
    */
  def after(nodes: (Node | String)*): Unit
  /**
    * Inserts `nodes` just before this node, while replacing strings with equivalent `Text` nodes.
    */
  def before(nodes: (Node | String)*): Unit
  /**
    * Removes this node.
    */
  def remove(): Unit
  /**
    * Replaces this node with `nodes`, while replacing strings in nodes with equivalent Text nodes.
    */
  def replaceWith(nodes: (Node | String)*): Unit
}

object ChildNode {
  @scala.inline
  def apply(
    after: /* repeated */ Node | String => Unit,
    before: /* repeated */ Node | String => Unit,
    remove: () => Unit,
    replaceWith: /* repeated */ Node | String => Unit
  ): ChildNode = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), before = js.Any.fromFunction1(before), remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith))
  
    __obj.asInstanceOf[ChildNode]
  }
}

