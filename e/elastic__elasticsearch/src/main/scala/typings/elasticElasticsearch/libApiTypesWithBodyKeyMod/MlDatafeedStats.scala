package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDatafeedStats extends StObject {
  
  var assignment_explanation: js.UndefOr[String] = js.undefined
  
  var datafeed_id: Id
  
  var node: js.UndefOr[MlDiscoveryNode] = js.undefined
  
  var running_state: js.UndefOr[MlDatafeedRunningState] = js.undefined
  
  var state: MlDatafeedState
  
  var timing_stats: MlDatafeedTimingStats
}
object MlDatafeedStats {
  
  inline def apply(datafeed_id: Id, state: MlDatafeedState, timing_stats: MlDatafeedTimingStats): MlDatafeedStats = {
    val __obj = js.Dynamic.literal(datafeed_id = datafeed_id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timing_stats = timing_stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDatafeedStats]
  }
  
  extension [Self <: MlDatafeedStats](x: Self) {
    
    inline def setAssignment_explanation(value: String): Self = StObject.set(x, "assignment_explanation", value.asInstanceOf[js.Any])
    
    inline def setAssignment_explanationUndefined: Self = StObject.set(x, "assignment_explanation", js.undefined)
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setNode(value: MlDiscoveryNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setRunning_state(value: MlDatafeedRunningState): Self = StObject.set(x, "running_state", value.asInstanceOf[js.Any])
    
    inline def setRunning_stateUndefined: Self = StObject.set(x, "running_state", js.undefined)
    
    inline def setState(value: MlDatafeedState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTiming_stats(value: MlDatafeedTimingStats): Self = StObject.set(x, "timing_stats", value.asInstanceOf[js.Any])
  }
}
