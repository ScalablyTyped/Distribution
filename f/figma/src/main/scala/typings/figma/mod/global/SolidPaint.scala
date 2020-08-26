package typings.figma.mod.global

import typings.figma.figmaStrings.SOLID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolidPaint extends Paint {
  val blendMode: js.UndefOr[BlendMode] = js.native
  val color: RGB = js.native
  val opacity: js.UndefOr[Double] = js.native
  val `type`: SOLID = js.native
  val visible: js.UndefOr[Boolean] = js.native
}

object SolidPaint {
  @scala.inline
  def apply(color: RGB, `type`: SOLID): SolidPaint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolidPaint]
  }
  @scala.inline
  implicit class SolidPaintOps[Self <: SolidPaint] (val x: Self) extends AnyVal {
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
    def setColor(value: RGB): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SOLID): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlendMode(value: BlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

