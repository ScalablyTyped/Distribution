package typings.figma.mod.global

import typings.figma.figmaStrings.BACKGROUND_BLUR
import typings.figma.figmaStrings.DROP_SHADOW
import typings.figma.figmaStrings.INNER_SHADOW
import typings.figma.figmaStrings.LAYER_BLUR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod.global.ShadowEffect
  - typings.figma.mod.global.BlurEffect
*/
trait Effect extends js.Object

object Effect {
  @scala.inline
  def ShadowEffect(
    blendMode: BlendMode,
    color: RGBA,
    offset: Vector,
    radius: Double,
    `type`: DROP_SHADOW | INNER_SHADOW,
    visible: Boolean
  ): Effect = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  @scala.inline
  def BlurEffect(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): Effect = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
}

