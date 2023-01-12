package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var emit_stacktraces: js.UndefOr[Boolean] = js.undefined
  
  var metric: js.UndefOr[WatcherStatsWatcherMetric | js.Array[WatcherStatsWatcherMetric]] = js.undefined
}
object WatcherStatsRequest {
  
  inline def apply(): WatcherStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setEmit_stacktraces(value: Boolean): Self = StObject.set(x, "emit_stacktraces", value.asInstanceOf[js.Any])
    
    inline def setEmit_stacktracesUndefined: Self = StObject.set(x, "emit_stacktraces", js.undefined)
    
    inline def setMetric(value: WatcherStatsWatcherMetric | js.Array[WatcherStatsWatcherMetric]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: WatcherStatsWatcherMetric*): Self = StObject.set(x, "metric", js.Array(value*))
  }
}
