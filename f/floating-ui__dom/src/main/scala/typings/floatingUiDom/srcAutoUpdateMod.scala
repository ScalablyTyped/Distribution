package typings.floatingUiDom

import typings.floatingUiDom.anon.PartialOptions
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
    options: PartialOptions
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoUpdate")(reference.asInstanceOf[js.Any], floating.asInstanceOf[js.Any], update.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  trait Options extends StObject {
    
    /**
      * Whether to update the position when an overflow ancestor is resized. This
      * uses the native `resize` event.
      * @default true
      */
    var ancestorResize: Boolean
    
    /**
      * Whether to update the position when an overflow ancestor is scrolled.
      * @default true
      */
    var ancestorScroll: Boolean
    
    /**
      * Whether to update on every animation frame if necessary. Optimized for
      * performance so updates are only called when necessary, but use sparingly.
      * @default false
      */
    var animationFrame: Boolean
    
    /**
      * Whether to update the position when either the reference or floating
      * elements resized. This uses a `ResizeObserver`.
      * @default true
      */
    var elementResize: Boolean
  }
  object Options {
    
    inline def apply(ancestorResize: Boolean, ancestorScroll: Boolean, animationFrame: Boolean, elementResize: Boolean): Options = {
      val __obj = js.Dynamic.literal(ancestorResize = ancestorResize.asInstanceOf[js.Any], ancestorScroll = ancestorScroll.asInstanceOf[js.Any], animationFrame = animationFrame.asInstanceOf[js.Any], elementResize = elementResize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAncestorResize(value: Boolean): Self = StObject.set(x, "ancestorResize", value.asInstanceOf[js.Any])
      
      inline def setAncestorScroll(value: Boolean): Self = StObject.set(x, "ancestorScroll", value.asInstanceOf[js.Any])
      
      inline def setAnimationFrame(value: Boolean): Self = StObject.set(x, "animationFrame", value.asInstanceOf[js.Any])
      
      inline def setElementResize(value: Boolean): Self = StObject.set(x, "elementResize", value.asInstanceOf[js.Any])
    }
  }
}
