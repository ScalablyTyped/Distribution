package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.common.charts.AnimationEaseMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /**
    * Specifies how long the animation runs in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the easing function of the animation.
    */
  var easing: js.UndefOr[AnimationEaseMode] = js.undefined
  
  /**
    * Enables the animation in the UI component.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how many series points the UI component should have before the animation will be disabled.
    */
  var maxPointCountSupported: js.UndefOr[Double] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: AnimationEaseMode): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaxPointCountSupported(value: Double): Self = StObject.set(x, "maxPointCountSupported", value.asInstanceOf[js.Any])
    
    inline def setMaxPointCountSupportedUndefined: Self = StObject.set(x, "maxPointCountSupported", js.undefined)
  }
}
