package typings.estreeJsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXClosingElement
  extends JSXBoundaryElement
     with _Node {
  @JSName("type")
  var type_JSXClosingElement: typings.estreeJsx.estreeJsxStrings.JSXClosingElement = js.native
}

object JSXClosingElement {
  @scala.inline
  def apply(
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXClosingElement
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingElement]
  }
  @scala.inline
  implicit class JSXClosingElementOps[Self <: JSXClosingElement] (val x: Self) extends AnyVal {
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
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingElement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

