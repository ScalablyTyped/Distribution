package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/magellan.html#js
trait MagellanOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.undefined
  
  var destination_threshold: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var fixed_top: js.UndefOr[Double] = js.undefined
  
  var offset_by_height: js.UndefOr[Boolean] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
  
  var throttle_delay: js.UndefOr[Double] = js.undefined
}
object MagellanOptions {
  
  inline def apply(): MagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagellanOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MagellanOptions] (val x: Self) extends AnyVal {
    
    inline def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    inline def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    inline def setDestination_threshold(value: Double): Self = StObject.set(x, "destination_threshold", value.asInstanceOf[js.Any])
    
    inline def setDestination_thresholdUndefined: Self = StObject.set(x, "destination_threshold", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFixed_top(value: Double): Self = StObject.set(x, "fixed_top", value.asInstanceOf[js.Any])
    
    inline def setFixed_topUndefined: Self = StObject.set(x, "fixed_top", js.undefined)
    
    inline def setOffset_by_height(value: Boolean): Self = StObject.set(x, "offset_by_height", value.asInstanceOf[js.Any])
    
    inline def setOffset_by_heightUndefined: Self = StObject.set(x, "offset_by_height", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setThrottle_delay(value: Double): Self = StObject.set(x, "throttle_delay", value.asInstanceOf[js.Any])
    
    inline def setThrottle_delayUndefined: Self = StObject.set(x, "throttle_delay", js.undefined)
  }
}
