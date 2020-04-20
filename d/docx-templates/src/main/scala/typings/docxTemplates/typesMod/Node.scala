package typings.docxTemplates.typesMod

import typings.docxTemplates.AnonDictkey
import typings.docxTemplates.docxTemplatesBooleans.`false`
import typings.docxTemplates.docxTemplatesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.docxTemplates.typesMod.TextNode
  - typings.docxTemplates.typesMod.NonTextNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  def TextNode(
    _children: js.Array[Node],
    _fTextNode: `true`,
    _text: String,
    _ifName: String = null,
    _parent: Node = null
  ): Node = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any])
    if (_ifName != null) __obj.updateDynamic("_ifName")(_ifName.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  def NonTextNode(
    _attrs: AnonDictkey,
    _children: js.Array[Node],
    _fTextNode: `false`,
    _tag: String,
    _ifName: String = null,
    _parent: Node = null
  ): Node = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _fTextNode = _fTextNode.asInstanceOf[js.Any], _tag = _tag.asInstanceOf[js.Any])
    if (_ifName != null) __obj.updateDynamic("_ifName")(_ifName.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

