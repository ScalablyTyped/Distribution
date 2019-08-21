package typings.figma

import typings.figma.figmaStrings.DROP_SHADOW
import typings.figma.figmaStrings.INNER_SHADOW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowEffect extends Effect {
  val blendMode: BlendMode
  val color: RGBA
  val offset: Vector
  val radius: Double
  val `type`: DROP_SHADOW | INNER_SHADOW
  val visible: Boolean
}

object ShadowEffect {
  @scala.inline
  def apply(
    blendMode: BlendMode,
    color: RGBA,
    offset: Vector,
    radius: Double,
    `type`: DROP_SHADOW | INNER_SHADOW,
    visible: Boolean
  ): ShadowEffect = {
    val __obj = js.Dynamic.literal(blendMode = blendMode, color = color, offset = offset, radius = radius, visible = visible)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowEffect]
  }
}

