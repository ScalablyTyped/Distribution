package typings.dom4

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://dom.spec.whatwg.org/#childnode
  */
@js.native
trait ChildNode extends js.Object {
  /**
    * Inserts `nodes` just after this node, while replacing strings with equivalent `Text` nodes.
    */
  def after(nodes: (Node | String)*): Unit = js.native
  /**
    * Inserts `nodes` just before this node, while replacing strings with equivalent `Text` nodes.
    */
  def before(nodes: (Node | String)*): Unit = js.native
  /**
    * Removes this node.
    */
  def remove(): Unit = js.native
  /**
    * Replaces this node with `nodes`, while replacing strings in nodes with equivalent Text nodes.
    */
  def replaceWith(nodes: (Node | String)*): Unit = js.native
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
  @scala.inline
  implicit class ChildNodeOps[Self <: ChildNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfter(value: /* repeated */ Node | String => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = this.set("replaceWith", js.Any.fromFunction1(value))
  }
  
}

