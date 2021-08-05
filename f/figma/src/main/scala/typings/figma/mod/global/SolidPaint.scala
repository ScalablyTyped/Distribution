package typings.figma.mod.global

import typings.figma.figmaStrings.SOLID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolidPaint
  extends StObject
     with Paint {
  
  val blendMode: js.UndefOr[BlendMode] = js.undefined
  
  val color: RGB
  
  val opacity: js.UndefOr[Double] = js.undefined
  
  val `type`: SOLID
  
  val visible: js.UndefOr[Boolean] = js.undefined
}
object SolidPaint {
  
  inline def apply(color: RGB): SolidPaint = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOLID")
    __obj.asInstanceOf[SolidPaint]
  }
  
  extension [Self <: SolidPaint](x: Self) {
    
    inline def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setColor(value: RGB): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setType(value: SOLID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
