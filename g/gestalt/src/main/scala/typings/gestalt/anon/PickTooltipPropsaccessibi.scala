package typings.gestalt.anon

import typings.gestalt.mod.FourDirections
import typings.gestalt.mod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<gestalt.gestalt.TooltipProps, 'accessibilityLabel' | 'inline' | 'idealDirection' | 'text' | 'zIndex'> */
trait PickTooltipPropsaccessibi extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var idealDirection: js.UndefOr[FourDirections] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var text: String
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object PickTooltipPropsaccessibi {
  
  inline def apply(text: String): PickTooltipPropsaccessibi = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTooltipPropsaccessibi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickTooltipPropsaccessibi] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setIdealDirection(value: FourDirections): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
