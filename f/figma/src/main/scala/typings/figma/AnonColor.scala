package typings.figma

import typings.figma.figmaStrings.SOLID_COLOR
import typings.figma.mod._Global_.OverlayBackground
import typings.figma.mod._Global_.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends OverlayBackground {
  val color: RGBA
  val `type`: SOLID_COLOR
}

object AnonColor {
  @scala.inline
  def apply(color: RGBA, `type`: SOLID_COLOR): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

