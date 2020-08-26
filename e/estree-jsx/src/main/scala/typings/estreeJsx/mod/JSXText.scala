package typings.estreeJsx.mod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXText
  extends BaseNode
     with _Node {
  var raw: String = js.native
  @JSName("type")
  var type_JSXText: typings.estreeJsx.estreeJsxStrings.JSXText = js.native
  var value: String = js.native
}

object JSXText {
  @scala.inline
  def apply(raw: String, `type`: typings.estreeJsx.estreeJsxStrings.JSXText, value: String): JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXText]
  }
  @scala.inline
  implicit class JSXTextOps[Self <: JSXText] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estreeJsx.estreeJsxStrings.JSXText): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

