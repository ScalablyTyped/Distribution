package typings.docxTemplates.typesMod

import typings.docxTemplates.docxTemplatesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined docx-templates.docx-templates/lib/types.BaseNode & {  _fTextNode  :true,   _text  :string} */
trait TextNode extends Node {
  var _children: js.Array[Node]
  var _fTextNode: `true`
  var _ifName: js.UndefOr[String] = js.undefined
  var _parent: js.UndefOr[Node] = js.undefined
  var _text: String
}

object TextNode {
  @scala.inline
  def apply(
    _children: js.Array[Node],
    _fTextNode: `true`,
    _text: String,
    _ifName: String = null,
    _parent: Node = null
  ): TextNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any])
    if (_ifName != null) __obj.updateDynamic("_ifName")(_ifName.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
}

