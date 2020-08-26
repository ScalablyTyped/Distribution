package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElement
  extends BaseNode
     with _Node {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment] = js.native
  var closingElement: JSXClosingElement | Null = js.native
  var openingElement: JSXOpeningElement = js.native
  @JSName("type")
  var type_JSXElement: typings.estreeJsx.estreeJsxStrings.JSXElement = js.native
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXElement
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
  @scala.inline
  implicit class JSXElementOps[Self <: JSXElement] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: (JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment)*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpeningElement(value: JSXOpeningElement): Self = this.set("openingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXElement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosingElement(value: JSXClosingElement): Self = this.set("closingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosingElementNull: Self = this.set("closingElement", null)
  }
  
}

