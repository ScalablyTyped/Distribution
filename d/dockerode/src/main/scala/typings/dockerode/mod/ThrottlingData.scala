package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottlingData extends StObject {
  
  var periods: Double
  
  var throttled_periods: Double
  
  var throttled_time: Double
}
object ThrottlingData {
  
  inline def apply(periods: Double, throttled_periods: Double, throttled_time: Double): ThrottlingData = {
    val __obj = js.Dynamic.literal(periods = periods.asInstanceOf[js.Any], throttled_periods = throttled_periods.asInstanceOf[js.Any], throttled_time = throttled_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottlingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThrottlingData] (val x: Self) extends AnyVal {
    
    inline def setPeriods(value: Double): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    inline def setThrottled_periods(value: Double): Self = StObject.set(x, "throttled_periods", value.asInstanceOf[js.Any])
    
    inline def setThrottled_time(value: Double): Self = StObject.set(x, "throttled_time", value.asInstanceOf[js.Any])
  }
}
