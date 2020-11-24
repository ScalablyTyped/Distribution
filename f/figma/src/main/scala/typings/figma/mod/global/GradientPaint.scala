package typings.figma.mod.global

import typings.figma.figmaStrings.GRADIENT_ANGULAR
import typings.figma.figmaStrings.GRADIENT_DIAMOND
import typings.figma.figmaStrings.GRADIENT_LINEAR
import typings.figma.figmaStrings.GRADIENT_RADIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradientPaint extends Paint {
  
  val blendMode: js.UndefOr[BlendMode] = js.native
  
  val gradientStops: js.Array[ColorStop] = js.native
  
  val gradientTransform: Transform = js.native
  
  val opacity: js.UndefOr[Double] = js.native
  
  val `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND = js.native
  
  val visible: js.UndefOr[Boolean] = js.native
}
object GradientPaint {
  
  @scala.inline
  def apply(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientPaint]
  }
  
  @scala.inline
  implicit class GradientPaintOps[Self <: GradientPaint] (val x: Self) extends AnyVal {
    
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
    def setGradientStopsVarargs(value: ColorStop*): Self = this.set("gradientStops", js.Array(value :_*))
    
    @scala.inline
    def setGradientStops(value: js.Array[ColorStop]): Self = this.set("gradientStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransform(value: Transform): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND): Self = this.set("type", value.asInstanceOf[js.Any])
    
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
