package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseNode extends js.Object {
  var _children: js.Array[Node]
  var _ifName: js.UndefOr[String] = js.undefined
  var _parent: js.UndefOr[Node] = js.undefined
}

object BaseNode {
  @scala.inline
  def apply(_children: js.Array[Node], _ifName: String = null, _parent: Node = null): BaseNode = {
    val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any])
    if (_ifName != null) __obj.updateDynamic("_ifName")(_ifName.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNode]
  }
}

