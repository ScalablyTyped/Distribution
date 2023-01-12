package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.animation.AnimationState
import typings.devextreme.mod.DevExpress.animation.AnimationType
import typings.devextreme.mod.DevExpress.common.Direction
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationConfig extends StObject {
  
  /**
    * A function called after animation is completed.
    */
  var complete: js.UndefOr[
    js.Function2[/* $element */ DxElement_[HTMLElement], /* config */ AnimationConfig, Unit]
  ] = js.undefined
  
  /**
    * A number specifying wait time before animation execution.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the animation direction for the &apos;slideIn&apos; and &apos;slideOut&apos; animation types.
    */
  var direction: js.UndefOr[Direction] = js.undefined
  
  /**
    * A number specifying the time in milliseconds spent on animation.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * A string specifying the easing function for animation.
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an initial animation state. Use the to property to specify the final state.
    */
  var from: js.UndefOr[AnimationState] = js.undefined
  
  /**
    * A number specifying the time period to wait before the animation of the next stagger item starts.
    */
  var staggerDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * A function called before animation is started.
    */
  var start: js.UndefOr[
    js.Function2[/* $element */ DxElement_[HTMLElement], /* config */ AnimationConfig, Unit]
  ] = js.undefined
  
  /**
    * Specifies a final animation state. Use the from property to specify an initial state.
    */
  var to: js.UndefOr[AnimationState] = js.undefined
  
  /**
    * A string value specifying the animation type.
    */
  var `type`: js.UndefOr[AnimationType] = js.undefined
}
object AnimationConfig {
  
  inline def apply(): AnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationConfig] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: (/* $element */ DxElement_[HTMLElement], /* config */ AnimationConfig) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFrom(value: AnimationState): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setStaggerDelay(value: Double): Self = StObject.set(x, "staggerDelay", value.asInstanceOf[js.Any])
    
    inline def setStaggerDelayUndefined: Self = StObject.set(x, "staggerDelay", js.undefined)
    
    inline def setStart(value: (/* $element */ DxElement_[HTMLElement], /* config */ AnimationConfig) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTo(value: AnimationState): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: AnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
