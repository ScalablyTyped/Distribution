package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Periods extends StObject {
  
  var periods: Double
  
  var throttled_periods: Double
  
  var throttled_time: Double
}
object Periods {
  
  inline def apply(periods: Double, throttled_periods: Double, throttled_time: Double): Periods = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any], throttled_periods = throttled_periods.asInstanceOf[js.Any], throttled_time = throttled_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Periods]
  }
  
  extension [Self <: Periods](x: Self) {
    
    inline def setPeriods(value: Double): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setThrottled_periods(value: Double): Self = StObject.set(x, "throttled_periods", value.asInstanceOf[js.Any])
    
    inline def setThrottled_time(value: Double): Self = StObject.set(x, "throttled_time", value.asInstanceOf[js.Any])
  }
}
