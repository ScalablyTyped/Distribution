package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseNode extends js.Object {
  var _children: js.Array[Node] = js.native
  var _ifName: js.UndefOr[String] = js.native
  var _parent: js.UndefOr[Node] = js.native
}

object BaseNode {
  @scala.inline
  def apply(_children: js.Array[Node]): BaseNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
  @scala.inline
  implicit class BaseNodeOps[Self <: BaseNode] (val x: Self) extends AnyVal {
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
    def set_childrenVarargs(value: Node*): Self = this.set("_children", js.Array(value :_*))
    @scala.inline
    def set_children(value: js.Array[Node]): Self = this.set("_children", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ifName(value: String): Self = this.set("_ifName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_ifName: Self = this.set("_ifName", js.undefined)
    @scala.inline
    def set_parent(value: Node): Self = this.set("_parent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_parent: Self = this.set("_parent", js.undefined)
  }
  
}

