package typings.figma

import typings.figma.figmaMod._Global_.OverlayBackground
import typings.figma.figmaMod._Global_.RGBA
import typings.figma.figmaStrings.SOLID_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends OverlayBackground {
  val color: RGBA
  val `type`: SOLID_COLOR
}

object Anon_Color {
  @scala.inline
  def apply(color: RGBA, `type`: SOLID_COLOR): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

