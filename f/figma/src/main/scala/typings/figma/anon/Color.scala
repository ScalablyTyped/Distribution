package typings.figma.anon

import typings.figma.figmaStrings.SOLID_COLOR
import typings.figma.mod.global.OverlayBackground
import typings.figma.mod.global.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends OverlayBackground {
  val color: RGBA = js.native
  val `type`: SOLID_COLOR = js.native
}

object Color {
  @scala.inline
  def apply(color: RGBA, `type`: SOLID_COLOR): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setColor(value: RGBA): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SOLID_COLOR): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

