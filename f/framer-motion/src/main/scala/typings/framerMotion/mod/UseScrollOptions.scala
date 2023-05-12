package typings.framerMotion.mod

import typings.framerMotion.framerMotionStrings.x
import typings.framerMotion.framerMotionStrings.y
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<framer-motion.framer-motion.ScrollOptions, 'container' | 'target'> */
trait UseScrollOptions extends StObject {
  
  var axis: js.UndefOr[x | y] = js.undefined
  
  var container: js.UndefOr[typings.react.mod.RefObject[HTMLElement]] = js.undefined
  
  var layoutEffect: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[ScrollOffset] = js.undefined
  
  var smooth: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[typings.react.mod.RefObject[HTMLElement]] = js.undefined
}
object UseScrollOptions {
  
  inline def apply(): UseScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseScrollOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseScrollOptions] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: typings.framerMotion.framerMotionStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setContainer(value: typings.react.mod.RefObject[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setLayoutEffect(value: Boolean): Self = StObject.set(x, "layoutEffect", value.asInstanceOf[js.Any])
    
    inline def setLayoutEffectUndefined: Self = StObject.set(x, "layoutEffect", js.undefined)
    
    inline def setOffset(value: ScrollOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: (Edge | Intersection | ProgressIntersection)*): Self = StObject.set(x, "offset", js.Array(value*))
    
    inline def setSmooth(value: Double): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setTarget(value: typings.react.mod.RefObject[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
