package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelStyle extends js.Object {
  var color: String = js.native
  var fontName: String = js.native
  var fontSize: String = js.native
}

object LabelStyle {
  @scala.inline
  def apply(color: String, fontName: String, fontSize: String): LabelStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStyle]
  }
  @scala.inline
  implicit class LabelStyleOps[Self <: LabelStyle] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
  }
  
}

