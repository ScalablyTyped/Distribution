package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/magellan.html#js
@js.native
trait MagellanOptions extends StObject {
  
  var active_class: js.UndefOr[String] = js.native
  
  var destination_threshold: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var fixed_top: js.UndefOr[Double] = js.native
  
  var offset_by_height: js.UndefOr[Boolean] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var throttle_delay: js.UndefOr[Double] = js.native
}
object MagellanOptions {
  
  @scala.inline
  def apply(): MagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagellanOptions]
  }
  
  @scala.inline
  implicit class MagellanOptionsMutableBuilder[Self <: MagellanOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_class(value: String): Self = StObject.set(x, "active_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_classUndefined: Self = StObject.set(x, "active_class", js.undefined)
    
    @scala.inline
    def setDestination_threshold(value: Double): Self = StObject.set(x, "destination_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_thresholdUndefined: Self = StObject.set(x, "destination_threshold", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setFixed_top(value: Double): Self = StObject.set(x, "fixed_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixed_topUndefined: Self = StObject.set(x, "fixed_top", js.undefined)
    
    @scala.inline
    def setOffset_by_height(value: Boolean): Self = StObject.set(x, "offset_by_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset_by_heightUndefined: Self = StObject.set(x, "offset_by_height", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setThrottle_delay(value: Double): Self = StObject.set(x, "throttle_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottle_delayUndefined: Self = StObject.set(x, "throttle_delay", js.undefined)
  }
}
