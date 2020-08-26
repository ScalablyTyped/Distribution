package typings.figma.mod.global

import typings.figma.figmaStrings.DROP_SHADOW
import typings.figma.figmaStrings.INNER_SHADOW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowEffect extends Effect {
  val blendMode: BlendMode = js.native
  val color: RGBA = js.native
  val offset: Vector = js.native
  val radius: Double = js.native
  val `type`: DROP_SHADOW | INNER_SHADOW = js.native
  val visible: Boolean = js.native
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
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowEffect]
  }
  @scala.inline
  implicit class ShadowEffectOps[Self <: ShadowEffect] (val x: Self) extends AnyVal {
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
    def setBlendMode(value: BlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: RGBA): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Vector): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DROP_SHADOW | INNER_SHADOW): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

