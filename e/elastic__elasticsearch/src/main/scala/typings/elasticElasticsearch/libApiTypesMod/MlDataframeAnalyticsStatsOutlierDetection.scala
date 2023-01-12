package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsStatsOutlierDetection extends StObject {
  
  var parameters: MlOutlierDetectionParameters
  
  var timestamp: EpochTime[UnitMillis]
  
  var timing_stats: MlTimingStats
}
object MlDataframeAnalyticsStatsOutlierDetection {
  
  inline def apply(
    parameters: MlOutlierDetectionParameters,
    timestamp: EpochTime[UnitMillis],
    timing_stats: MlTimingStats
  ): MlDataframeAnalyticsStatsOutlierDetection = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timing_stats = timing_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsStatsOutlierDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalyticsStatsOutlierDetection] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: MlOutlierDetectionParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTiming_stats(value: MlTimingStats): Self = StObject.set(x, "timing_stats", value.asInstanceOf[js.Any])
  }
}
