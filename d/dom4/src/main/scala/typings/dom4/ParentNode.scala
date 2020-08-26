package typings.dom4

import typings.std.HTMLCollection
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentNode extends js.Object {
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection = js.native
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (Node | String)*): Unit = js.native
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (Node | String)*): Unit = js.native
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
  @scala.inline
  implicit class ParentNodeOps[Self <: ParentNode] (val x: Self) extends AnyVal {
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
    def setAppend(value: /* repeated */ Node | String => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = this.set("prepend", js.Any.fromFunction1(value))
  }
  
}

