package typings.docxTemplates.typesMod

import typings.docxTemplates.anon.Dictkey
import typings.docxTemplates.docxTemplatesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode  :false,   _tag  :string,   _attrs  :{[key: string] : sax.sax.QualifiedAttribute | string,   Extension ? :string}} */
trait NonTextNode extends Node {
  var _attrs: Dictkey
  var _children: js.Array[Node]
  var _fTextNode: `false`
  var _ifName: js.UndefOr[String] = js.undefined
  var _parent: js.UndefOr[Node] = js.undefined
  var _tag: String
}

object NonTextNode {
  @scala.inline
  def apply(
    _attrs: Dictkey,
    _children: js.Array[Node],
    _fTextNode: `false`,
    _tag: String,
    _ifName: String = null,
    _parent: Node = null
  ): NonTextNode = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _tag = _tag.asInstanceOf[js.Any])
    if (_ifName != null) __obj.updateDynamic("_ifName")(_ifName.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonTextNode]
  }
}

