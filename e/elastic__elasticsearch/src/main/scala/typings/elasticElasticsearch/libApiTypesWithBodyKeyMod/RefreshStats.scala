package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshStats extends StObject {
  
  var external_total: long
  
  var external_total_time_in_millis: DurationValue[UnitMillis]
  
  var listeners: long
  
  var total: long
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object RefreshStats {
  
  inline def apply(
    external_total: long,
    external_total_time_in_millis: DurationValue[UnitMillis],
    listeners: long,
    total: long,
    total_time_in_millis: DurationValue[UnitMillis]
  ): RefreshStats = {
    val __obj = js.Dynamic.literal(external_total = external_total.asInstanceOf[js.Any], external_total_time_in_millis = external_total_time_in_millis.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshStats] (val x: Self) extends AnyVal {
    
    inline def setExternal_total(value: long): Self = StObject.set(x, "external_total", value.asInstanceOf[js.Any])
    
    inline def setExternal_total_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "external_total_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setListeners(value: long): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
