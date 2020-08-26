package typings.docxTemplates.typesMod

import typings.docxTemplates.docxTemplatesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode :true,   _text :string} */
@js.native
trait TextNode extends Node {
  var _children: js.Array[Node] = js.native
  var _fTextNode: `true` = js.native
  var _ifName: js.UndefOr[String] = js.native
  var _parent: js.UndefOr[Node] = js.native
  var _text: String = js.native
}

object TextNode {
  @scala.inline
  def apply(_children: js.Array[Node], _fTextNode: `true`, _text: String): TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  @scala.inline
  implicit class TextNodeOps[Self <: TextNode] (val x: Self) extends AnyVal {
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
    def set_fTextNode(value: `true`): Self = this.set("_fTextNode", value.asInstanceOf[js.Any])
    @scala.inline
    def set_text(value: String): Self = this.set("_text", value.asInstanceOf[js.Any])
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

