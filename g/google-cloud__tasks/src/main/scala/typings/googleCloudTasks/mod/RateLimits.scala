package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateLimits extends StObject {
  
  var maxBurstSize: Double
  
  var maxConcurrentDispatches: Double
  
  var maxDispatchesPerSecond: Double
}
object RateLimits {
  
  inline def apply(maxBurstSize: Double, maxConcurrentDispatches: Double, maxDispatchesPerSecond: Double): RateLimits = {
    val __obj = js.Dynamic.literal(maxBurstSize = maxBurstSize.asInstanceOf[js.Any], maxConcurrentDispatches = maxConcurrentDispatches.asInstanceOf[js.Any], maxDispatchesPerSecond = maxDispatchesPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimits]
  }
  
  extension [Self <: RateLimits](x: Self) {
    
    inline def setMaxBurstSize(value: Double): Self = StObject.set(x, "maxBurstSize", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentDispatches(value: Double): Self = StObject.set(x, "maxConcurrentDispatches", value.asInstanceOf[js.Any])
    
    inline def setMaxDispatchesPerSecond(value: Double): Self = StObject.set(x, "maxDispatchesPerSecond", value.asInstanceOf[js.Any])
  }
}
