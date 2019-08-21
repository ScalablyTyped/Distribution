package typings.figma

import typings.figma.figmaStrings.BACKGROUND_BLUR
import typings.figma.figmaStrings.LAYER_BLUR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurEffect extends Effect {
  val radius: Double
  val `type`: LAYER_BLUR | BACKGROUND_BLUR
  val visible: Boolean
}

object BlurEffect {
  @scala.inline
  def apply(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): BlurEffect = {
    val __obj = js.Dynamic.literal(radius = radius, visible = visible)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEffect]
  }
}

