package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.common.charts.AnimationEaseMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeAnimation extends StObject {
  
  /**
    * Determines how long animation runs.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the animation easing mode.
    */
  var easing: js.UndefOr[AnimationEaseMode] = js.undefined
  
  /**
    * Indicates whether or not animation is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object BaseGaugeAnimation {
  
  inline def apply(): BaseGaugeAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseGaugeAnimation] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: AnimationEaseMode): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
