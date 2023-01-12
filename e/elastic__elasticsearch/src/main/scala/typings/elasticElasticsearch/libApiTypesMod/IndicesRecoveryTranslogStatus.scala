package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryTranslogStatus extends StObject {
  
  var percent: Percentage
  
  var recovered: long
  
  var total: long
  
  var total_on_start: long
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object IndicesRecoveryTranslogStatus {
  
  inline def apply(
    percent: Percentage,
    recovered: long,
    total: long,
    total_on_start: long,
    total_time_in_millis: DurationValue[UnitMillis]
  ): IndicesRecoveryTranslogStatus = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], recovered = recovered.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_on_start = total_on_start.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryTranslogStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesRecoveryTranslogStatus] (val x: Self) extends AnyVal {
    
    inline def setPercent(value: Percentage): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setRecovered(value: long): Self = StObject.set(x, "recovered", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_on_start(value: long): Self = StObject.set(x, "total_on_start", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
