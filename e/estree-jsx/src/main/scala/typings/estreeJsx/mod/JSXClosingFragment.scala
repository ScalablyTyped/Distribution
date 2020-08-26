package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXClosingFragment
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_JSXClosingFragment: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment = js.native
}

object JSXClosingFragment {
  @scala.inline
  def apply(`type`: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingFragment]
  }
  @scala.inline
  implicit class JSXClosingFragmentOps[Self <: JSXClosingFragment] (val x: Self) extends AnyVal {
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
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXClosingFragment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

