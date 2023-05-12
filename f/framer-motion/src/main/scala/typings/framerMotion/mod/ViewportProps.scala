package typings.framerMotion.mod

import typings.std.IntersectionObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportProps extends StObject {
  
  var onViewportEnter: js.UndefOr[ViewportEventHandler] = js.undefined
  
  var onViewportLeave: js.UndefOr[ViewportEventHandler] = js.undefined
  
  var viewport: js.UndefOr[ViewportOptions] = js.undefined
  
  var whileInView: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
}
object ViewportProps {
  
  inline def apply(): ViewportProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewportProps] (val x: Self) extends AnyVal {
    
    inline def setOnViewportEnter(value: /* entry */ IntersectionObserverEntry | Null => Unit): Self = StObject.set(x, "onViewportEnter", js.Any.fromFunction1(value))
    
    inline def setOnViewportEnterUndefined: Self = StObject.set(x, "onViewportEnter", js.undefined)
    
    inline def setOnViewportLeave(value: /* entry */ IntersectionObserverEntry | Null => Unit): Self = StObject.set(x, "onViewportLeave", js.Any.fromFunction1(value))
    
    inline def setOnViewportLeaveUndefined: Self = StObject.set(x, "onViewportLeave", js.undefined)
    
    inline def setViewport(value: ViewportOptions): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    inline def setWhileInView(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "whileInView", value.asInstanceOf[js.Any])
    
    inline def setWhileInViewUndefined: Self = StObject.set(x, "whileInView", js.undefined)
    
    inline def setWhileInViewVarargs(value: String*): Self = StObject.set(x, "whileInView", js.Array(value*))
  }
}
