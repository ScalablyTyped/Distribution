package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkStats extends StObject {
  
  var avg_size: js.UndefOr[ByteSize] = js.undefined
  
  var avg_size_in_bytes: long
  
  var avg_time: js.UndefOr[Duration] = js.undefined
  
  var avg_time_in_millis: DurationValue[UnitMillis]
  
  var total_operations: long
  
  var total_size: js.UndefOr[ByteSize] = js.undefined
  
  var total_size_in_bytes: long
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object BulkStats {
  
  inline def apply(
    avg_size_in_bytes: long,
    avg_time_in_millis: DurationValue[UnitMillis],
    total_operations: long,
    total_size_in_bytes: long,
    total_time_in_millis: DurationValue[UnitMillis]
  ): BulkStats = {
    val __obj = js.Dynamic.literal(avg_size_in_bytes = avg_size_in_bytes.asInstanceOf[js.Any], avg_time_in_millis = avg_time_in_millis.asInstanceOf[js.Any], total_operations = total_operations.asInstanceOf[js.Any], total_size_in_bytes = total_size_in_bytes.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkStats] (val x: Self) extends AnyVal {
    
    inline def setAvg_size(value: ByteSize): Self = StObject.set(x, "avg_size", value.asInstanceOf[js.Any])
    
    inline def setAvg_sizeUndefined: Self = StObject.set(x, "avg_size", js.undefined)
    
    inline def setAvg_size_in_bytes(value: long): Self = StObject.set(x, "avg_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAvg_time(value: Duration): Self = StObject.set(x, "avg_time", value.asInstanceOf[js.Any])
    
    inline def setAvg_timeUndefined: Self = StObject.set(x, "avg_time", js.undefined)
    
    inline def setAvg_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "avg_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_operations(value: long): Self = StObject.set(x, "total_operations", value.asInstanceOf[js.Any])
    
    inline def setTotal_size(value: ByteSize): Self = StObject.set(x, "total_size", value.asInstanceOf[js.Any])
    
    inline def setTotal_sizeUndefined: Self = StObject.set(x, "total_size", js.undefined)
    
    inline def setTotal_size_in_bytes(value: long): Self = StObject.set(x, "total_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
