package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryStats extends StObject {
  
  var current_as_source: long
  
  var current_as_target: long
  
  var throttle_time: js.UndefOr[Duration] = js.undefined
  
  var throttle_time_in_millis: DurationValue[UnitMillis]
}
object RecoveryStats {
  
  inline def apply(
    current_as_source: long,
    current_as_target: long,
    throttle_time_in_millis: DurationValue[UnitMillis]
  ): RecoveryStats = {
    val __obj = js.Dynamic.literal(current_as_source = current_as_source.asInstanceOf[js.Any], current_as_target = current_as_target.asInstanceOf[js.Any], throttle_time_in_millis = throttle_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryStats]
  }
  
  extension [Self <: RecoveryStats](x: Self) {
    
    inline def setCurrent_as_source(value: long): Self = StObject.set(x, "current_as_source", value.asInstanceOf[js.Any])
    
    inline def setCurrent_as_target(value: long): Self = StObject.set(x, "current_as_target", value.asInstanceOf[js.Any])
    
    inline def setThrottle_time(value: Duration): Self = StObject.set(x, "throttle_time", value.asInstanceOf[js.Any])
    
    inline def setThrottle_timeUndefined: Self = StObject.set(x, "throttle_time", js.undefined)
    
    inline def setThrottle_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "throttle_time_in_millis", value.asInstanceOf[js.Any])
  }
}
