package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Dictkey
import typings.docxTemplates.docxTemplatesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode :false,   _tag :string,   _attrs :{[key: string] : sax.sax.QualifiedAttribute | string,   Extension :string | undefined,   ContentType :string | undefined,   PartName :string | undefined}} */
@js.native
trait NonTextNode extends Node {
  var _attrs: Dictkey = js.native
  var _children: js.Array[Node] = js.native
  var _fTextNode: `false` = js.native
  var _ifName: js.UndefOr[String] = js.native
  var _parent: js.UndefOr[Node] = js.native
  var _tag: String = js.native
}

object NonTextNode {
  @scala.inline
  def apply(_attrs: Dictkey, _children: js.Array[Node], _fTextNode: `false`, _tag: String): NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _tag = _tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonTextNode]
  }
  @scala.inline
  implicit class NonTextNodeOps[Self <: NonTextNode] (val x: Self) extends AnyVal {
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
    def set_attrs(value: Dictkey): Self = this.set("_attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def set_childrenVarargs(value: Node*): Self = this.set("_children", js.Array(value :_*))
    @scala.inline
    def set_children(value: js.Array[Node]): Self = this.set("_children", value.asInstanceOf[js.Any])
    @scala.inline
    def set_fTextNode(value: `false`): Self = this.set("_fTextNode", value.asInstanceOf[js.Any])
    @scala.inline
    def set_tag(value: String): Self = this.set("_tag", value.asInstanceOf[js.Any])
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

