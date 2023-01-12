package typings.figma.mod.global

import typings.figma.figmaStrings.GRADIENT_ANGULAR
import typings.figma.figmaStrings.GRADIENT_DIAMOND
import typings.figma.figmaStrings.GRADIENT_LINEAR
import typings.figma.figmaStrings.GRADIENT_RADIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientPaint
  extends StObject
     with Paint {
  
  val blendMode: js.UndefOr[BlendMode] = js.undefined
  
  val gradientStops: js.Array[ColorStop]
  
  val gradientTransform: Transform
  
  val opacity: js.UndefOr[Double] = js.undefined
  
  val `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  
  val visible: js.UndefOr[Boolean] = js.undefined
}
object GradientPaint {
  
  inline def apply(
    gradientStops: js.Array[ColorStop],
    gradientTransform: Transform,
    `type`: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND
  ): GradientPaint = {
    val __obj = js.Dynamic.literal(gradientStops = gradientStops.asInstanceOf[js.Any], gradientTransform = gradientTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientPaint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientPaint] (val x: Self) extends AnyVal {
    
    inline def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setGradientStops(value: js.Array[ColorStop]): Self = StObject.set(x, "gradientStops", value.asInstanceOf[js.Any])
    
    inline def setGradientStopsVarargs(value: ColorStop*): Self = StObject.set(x, "gradientStops", js.Array(value*))
    
    inline def setGradientTransform(value: Transform): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: GRADIENT_LINEAR | GRADIENT_RADIAL | GRADIENT_ANGULAR | GRADIENT_DIAMOND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
