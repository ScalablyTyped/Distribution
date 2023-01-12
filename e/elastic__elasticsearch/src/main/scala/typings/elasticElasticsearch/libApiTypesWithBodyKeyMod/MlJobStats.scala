package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlJobStats extends StObject {
  
  var assignment_explanation: js.UndefOr[String] = js.undefined
  
  var data_counts: MlDataCounts
  
  var deleting: js.UndefOr[Boolean] = js.undefined
  
  var forecasts_stats: MlJobForecastStatistics
  
  var job_id: String
  
  var model_size_stats: MlModelSizeStats
  
  var node: js.UndefOr[MlDiscoveryNode] = js.undefined
  
  var open_time: js.UndefOr[DateTime] = js.undefined
  
  var state: MlJobState
  
  var timing_stats: MlJobTimingStats
}
object MlJobStats {
  
  inline def apply(
    data_counts: MlDataCounts,
    forecasts_stats: MlJobForecastStatistics,
    job_id: String,
    model_size_stats: MlModelSizeStats,
    state: MlJobState,
    timing_stats: MlJobTimingStats
  ): MlJobStats = {
    val __obj = js.Dynamic.literal(data_counts = data_counts.asInstanceOf[js.Any], forecasts_stats = forecasts_stats.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], model_size_stats = model_size_stats.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timing_stats = timing_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlJobStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlJobStats] (val x: Self) extends AnyVal {
    
    inline def setAssignment_explanation(value: String): Self = StObject.set(x, "assignment_explanation", value.asInstanceOf[js.Any])
    
    inline def setAssignment_explanationUndefined: Self = StObject.set(x, "assignment_explanation", js.undefined)
    
    inline def setData_counts(value: MlDataCounts): Self = StObject.set(x, "data_counts", value.asInstanceOf[js.Any])
    
    inline def setDeleting(value: Boolean): Self = StObject.set(x, "deleting", value.asInstanceOf[js.Any])
    
    inline def setDeletingUndefined: Self = StObject.set(x, "deleting", js.undefined)
    
    inline def setForecasts_stats(value: MlJobForecastStatistics): Self = StObject.set(x, "forecasts_stats", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setModel_size_stats(value: MlModelSizeStats): Self = StObject.set(x, "model_size_stats", value.asInstanceOf[js.Any])
    
    inline def setNode(value: MlDiscoveryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOpen_time(value: DateTime): Self = StObject.set(x, "open_time", value.asInstanceOf[js.Any])
    
    inline def setOpen_timeUndefined: Self = StObject.set(x, "open_time", js.undefined)
    
    inline def setState(value: MlJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTiming_stats(value: MlJobTimingStats): Self = StObject.set(x, "timing_stats", value.asInstanceOf[js.Any])
  }
}
