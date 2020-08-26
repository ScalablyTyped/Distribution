package typings.gaugejs.mod

import typings.gaugejs.anon.FontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRendererElement extends js.Object {
  var innerHTML: String = js.native
  var style: FontSize = js.native
}

object TextRendererElement {
  @scala.inline
  def apply(innerHTML: String, style: FontSize): TextRendererElement = {
    val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRendererElement]
  }
  @scala.inline
  implicit class TextRendererElementOps[Self <: TextRendererElement] (val x: Self) extends AnyVal {
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
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: FontSize): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

