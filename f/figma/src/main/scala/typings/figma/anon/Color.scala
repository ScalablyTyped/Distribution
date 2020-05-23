package typings.figma.anon

import typings.figma.figmaStrings.SOLID_COLOR
import typings.figma.mod.global.OverlayBackground
import typings.figma.mod.global.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends OverlayBackground {
  val color: RGBA
  val `type`: SOLID_COLOR
}

object Color {
  @scala.inline
  def apply(color: RGBA, `type`: SOLID_COLOR): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

