package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalytics extends StObject {
  
  var analysis_stats: js.UndefOr[MlDataframeAnalyticsStatsContainer] = js.undefined
  
  var assignment_explanation: js.UndefOr[String] = js.undefined
  
  var data_counts: MlDataframeAnalyticsStatsDataCounts
  
  var id: Id
  
  var memory_usage: MlDataframeAnalyticsStatsMemoryUsage
  
  var node: js.UndefOr[NodeAttributes] = js.undefined
  
  var progress: js.Array[MlDataframeAnalyticsStatsProgress]
  
  var state: MlDataframeState
}
object MlDataframeAnalytics {
  
  inline def apply(
    data_counts: MlDataframeAnalyticsStatsDataCounts,
    id: Id,
    memory_usage: MlDataframeAnalyticsStatsMemoryUsage,
    progress: js.Array[MlDataframeAnalyticsStatsProgress],
    state: MlDataframeState
  ): MlDataframeAnalytics = {
    val __obj = js.Dynamic.literal(data_counts = data_counts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memory_usage = memory_usage.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalytics] (val x: Self) extends AnyVal {
    
    inline def setAnalysis_stats(value: MlDataframeAnalyticsStatsContainer): Self = StObject.set(x, "analysis_stats", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_statsUndefined: Self = StObject.set(x, "analysis_stats", js.undefined)
    
    inline def setAssignment_explanation(value: String): Self = StObject.set(x, "assignment_explanation", value.asInstanceOf[js.Any])
    
    inline def setAssignment_explanationUndefined: Self = StObject.set(x, "assignment_explanation", js.undefined)
    
    inline def setData_counts(value: MlDataframeAnalyticsStatsDataCounts): Self = StObject.set(x, "data_counts", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMemory_usage(value: MlDataframeAnalyticsStatsMemoryUsage): Self = StObject.set(x, "memory_usage", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeAttributes): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setProgress(value: js.Array[MlDataframeAnalyticsStatsProgress]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressVarargs(value: MlDataframeAnalyticsStatsProgress*): Self = StObject.set(x, "progress", js.Array(value*))
    
    inline def setState(value: MlDataframeState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
