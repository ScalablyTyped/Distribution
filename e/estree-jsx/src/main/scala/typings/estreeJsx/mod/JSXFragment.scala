package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXFragment
  extends BaseNode
     with _Node {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment] = js.native
  var closingFragment: JSXClosingFragment = js.native
  var openingFragment: JSXOpeningFragment = js.native
  @JSName("type")
  var type_JSXFragment: typings.estreeJsx.estreeJsxStrings.JSXFragment = js.native
}

object JSXFragment {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typings.estreeJsx.estreeJsxStrings.JSXFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment]
  }
  @scala.inline
  implicit class JSXFragmentOps[Self <: JSXFragment] (val x: Self) extends AnyVal {
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
    def setClosingFragment(value: JSXClosingFragment): Self = this.set("closingFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpeningFragment(value: JSXOpeningFragment): Self = this.set("openingFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXFragment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

