package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimits extends StObject {
  
  var maxBurstSize: Double = js.native
  
  var maxConcurrentDispatches: Double = js.native
  
  var maxDispatchesPerSecond: Double = js.native
}
object RateLimits {
  
  @scala.inline
  def apply(maxBurstSize: Double, maxConcurrentDispatches: Double, maxDispatchesPerSecond: Double): RateLimits = {
    val __obj = js.Dynamic.literal(maxBurstSize = maxBurstSize.asInstanceOf[js.Any], maxConcurrentDispatches = maxConcurrentDispatches.asInstanceOf[js.Any], maxDispatchesPerSecond = maxDispatchesPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimits]
  }
  
  @scala.inline
  implicit class RateLimitsMutableBuilder[Self <: RateLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxBurstSize(value: Double): Self = StObject.set(x, "maxBurstSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentDispatches(value: Double): Self = StObject.set(x, "maxConcurrentDispatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDispatchesPerSecond(value: Double): Self = StObject.set(x, "maxDispatchesPerSecond", value.asInstanceOf[js.Any])
  }
}
