package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSearchStatusStatusResponseBase
  extends StObject
     with AsyncSearchAsyncSearchResponseBase {
  
  var _shards: ShardStatistics
  
  var completion_status: js.UndefOr[integer] = js.undefined
}
object AsyncSearchStatusStatusResponseBase {
  
  inline def apply(
    _shards: ShardStatistics,
    expiration_time_in_millis: EpochTime[UnitMillis],
    is_partial: Boolean,
    is_running: Boolean,
    start_time_in_millis: EpochTime[UnitMillis]
  ): AsyncSearchStatusStatusResponseBase = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], expiration_time_in_millis = expiration_time_in_millis.asInstanceOf[js.Any], is_partial = is_partial.asInstanceOf[js.Any], is_running = is_running.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchStatusStatusResponseBase]
  }
  
  extension [Self <: AsyncSearchStatusStatusResponseBase](x: Self) {
    
    inline def setCompletion_status(value: integer): Self = StObject.set(x, "completion_status", value.asInstanceOf[js.Any])
    
    inline def setCompletion_statusUndefined: Self = StObject.set(x, "completion_status", js.undefined)
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
