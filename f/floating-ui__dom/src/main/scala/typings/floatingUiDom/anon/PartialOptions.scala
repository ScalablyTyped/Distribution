package typings.floatingUiDom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@floating-ui/dom.@floating-ui/dom/src/autoUpdate.Options> */
trait PartialOptions extends StObject {
  
  var ancestorResize: js.UndefOr[Boolean] = js.undefined
  
  var ancestorScroll: js.UndefOr[Boolean] = js.undefined
  
  var animationFrame: js.UndefOr[Boolean] = js.undefined
  
  var elementResize: js.UndefOr[Boolean] = js.undefined
}
object PartialOptions {
  
  inline def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    inline def setAncestorResize(value: Boolean): Self = StObject.set(x, "ancestorResize", value.asInstanceOf[js.Any])
    
    inline def setAncestorResizeUndefined: Self = StObject.set(x, "ancestorResize", js.undefined)
    
    inline def setAncestorScroll(value: Boolean): Self = StObject.set(x, "ancestorScroll", value.asInstanceOf[js.Any])
    
    inline def setAncestorScrollUndefined: Self = StObject.set(x, "ancestorScroll", js.undefined)
    
    inline def setAnimationFrame(value: Boolean): Self = StObject.set(x, "animationFrame", value.asInstanceOf[js.Any])
    
    inline def setAnimationFrameUndefined: Self = StObject.set(x, "animationFrame", js.undefined)
    
    inline def setElementResize(value: Boolean): Self = StObject.set(x, "elementResize", value.asInstanceOf[js.Any])
    
    inline def setElementResizeUndefined: Self = StObject.set(x, "elementResize", js.undefined)
  }
}
