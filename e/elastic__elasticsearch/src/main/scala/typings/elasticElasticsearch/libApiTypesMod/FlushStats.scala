package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushStats extends StObject {
  
  var periodic: long
  
  var total: long
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object FlushStats {
  
  inline def apply(periodic: long, total: long, total_time_in_millis: DurationValue[UnitMillis]): FlushStats = {
    val __obj = js.Dynamic.literal(periodic = periodic.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushStats]
  }
  
  extension [Self <: FlushStats](x: Self) {
    
    inline def setPeriodic(value: long): Self = StObject.set(x, "periodic", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
