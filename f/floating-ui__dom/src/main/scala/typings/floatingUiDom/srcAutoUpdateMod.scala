package typings.floatingUiDom

import typings.floatingUiDom.srcTypesMod.FloatingElement
import typings.floatingUiDom.srcTypesMod.ReferenceElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAutoUpdateMod {
  
  @JSImport("@floating-ui/dom/src/autoUpdate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoUpdate(reference: ReferenceElement, floating: FloatingElement, update: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def autoUpdate(
    reference: ReferenceElement,
    floating: FloatingElement,
    update: js.Function0[Unit],
    options: Options
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  /* Inlined std.Partial<{  ancestorScroll :boolean,   ancestorResize :boolean,   elementResize :boolean,   layoutShift :boolean,   animationFrame :boolean}> */
  trait Options extends StObject {
    
    var ancestorResize: js.UndefOr[Boolean] = js.undefined
    
    var ancestorScroll: js.UndefOr[Boolean] = js.undefined
    
    var animationFrame: js.UndefOr[Boolean] = js.undefined
    
    var elementResize: js.UndefOr[Boolean] = js.undefined
    
    var layoutShift: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAncestorResize(value: Boolean): Self = StObject.set(x, "ancestorResize", value.asInstanceOf[js.Any])
      
      inline def setAncestorResizeUndefined: Self = StObject.set(x, "ancestorResize", js.undefined)
      
      inline def setAncestorScroll(value: Boolean): Self = StObject.set(x, "ancestorScroll", value.asInstanceOf[js.Any])
      
      inline def setAncestorScrollUndefined: Self = StObject.set(x, "ancestorScroll", js.undefined)
      
      inline def setAnimationFrame(value: Boolean): Self = StObject.set(x, "animationFrame", value.asInstanceOf[js.Any])
      
      inline def setAnimationFrameUndefined: Self = StObject.set(x, "animationFrame", js.undefined)
      
      inline def setElementResize(value: Boolean): Self = StObject.set(x, "elementResize", value.asInstanceOf[js.Any])
      
      inline def setElementResizeUndefined: Self = StObject.set(x, "elementResize", js.undefined)
      
      inline def setLayoutShift(value: Boolean): Self = StObject.set(x, "layoutShift", value.asInstanceOf[js.Any])
      
      inline def setLayoutShiftUndefined: Self = StObject.set(x, "layoutShift", js.undefined)
    }
  }
}
