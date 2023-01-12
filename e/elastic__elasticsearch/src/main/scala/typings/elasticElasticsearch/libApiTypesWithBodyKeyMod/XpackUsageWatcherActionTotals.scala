package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageWatcherActionTotals extends StObject {
  
  var total: Duration
  
  var total_time_in_ms: DurationValue[UnitMillis]
}
object XpackUsageWatcherActionTotals {
  
  inline def apply(total: Duration, total_time_in_ms: DurationValue[UnitMillis]): XpackUsageWatcherActionTotals = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], total_time_in_ms = total_time_in_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageWatcherActionTotals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageWatcherActionTotals] (val x: Self) extends AnyVal {
    
    inline def setTotal(value: Duration): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_time_in_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_ms", value.asInstanceOf[js.Any])
  }
}
