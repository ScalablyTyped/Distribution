package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualElementAnimationOptions extends StObject {
  
  var custom: js.UndefOr[Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var transitionOverride: js.UndefOr[Transition1] = js.undefined
  
  var `type`: js.UndefOr[AnimationType] = js.undefined
}
object VisualElementAnimationOptions {
  
  inline def apply(): VisualElementAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualElementAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualElementAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setTransitionOverride(value: Transition1): Self = StObject.set(x, "transitionOverride", value.asInstanceOf[js.Any])
    
    inline def setTransitionOverrideUndefined: Self = StObject.set(x, "transitionOverride", js.undefined)
    
    inline def setType(value: AnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
