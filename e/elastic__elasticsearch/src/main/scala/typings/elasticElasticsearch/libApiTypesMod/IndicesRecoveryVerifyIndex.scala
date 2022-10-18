package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRecoveryVerifyIndex extends StObject {
  
  var check_index_time: js.UndefOr[Duration] = js.undefined
  
  var check_index_time_in_millis: DurationValue[UnitMillis]
  
  var total_time: js.UndefOr[Duration] = js.undefined
  
  var total_time_in_millis: DurationValue[UnitMillis]
}
object IndicesRecoveryVerifyIndex {
  
  inline def apply(
    check_index_time_in_millis: DurationValue[UnitMillis],
    total_time_in_millis: DurationValue[UnitMillis]
  ): IndicesRecoveryVerifyIndex = {
    val __obj = js.Dynamic.literal(check_index_time_in_millis = check_index_time_in_millis.asInstanceOf[js.Any], total_time_in_millis = total_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRecoveryVerifyIndex]
  }
  
  extension [Self <: IndicesRecoveryVerifyIndex](x: Self) {
    
    inline def setCheck_index_time(value: Duration): Self = StObject.set(x, "check_index_time", value.asInstanceOf[js.Any])
    
    inline def setCheck_index_timeUndefined: Self = StObject.set(x, "check_index_time", js.undefined)
    
    inline def setCheck_index_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "check_index_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setTotal_time(value: Duration): Self = StObject.set(x, "total_time", value.asInstanceOf[js.Any])
    
    inline def setTotal_timeUndefined: Self = StObject.set(x, "total_time", js.undefined)
    
    inline def setTotal_time_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_time_in_millis", value.asInstanceOf[js.Any])
  }
}
