package typings.gaugejs.mod

import typings.gaugejs.anon.FontSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRendererElement extends js.Object {
  var innerHTML: String
  var style: FontSize
}

object TextRendererElement {
  @scala.inline
  def apply(innerHTML: String, style: FontSize): TextRendererElement = {
    val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRendererElement]
  }
}

