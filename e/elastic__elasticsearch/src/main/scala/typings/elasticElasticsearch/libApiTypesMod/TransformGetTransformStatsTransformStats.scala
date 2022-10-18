package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformGetTransformStatsTransformStats extends StObject {
  
  var checkpointing: TransformGetTransformStatsCheckpointing
  
  var id: Id
  
  var node: js.UndefOr[NodeAttributes] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var state: String
  
  var stats: TransformGetTransformStatsTransformIndexerStats
}
object TransformGetTransformStatsTransformStats {
  
  inline def apply(
    checkpointing: TransformGetTransformStatsCheckpointing,
    id: Id,
    state: String,
    stats: TransformGetTransformStatsTransformIndexerStats
  ): TransformGetTransformStatsTransformStats = {
    val __obj = js.Dynamic.literal(checkpointing = checkpointing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformGetTransformStatsTransformStats]
  }
  
  extension [Self <: TransformGetTransformStatsTransformStats](x: Self) {
    
    inline def setCheckpointing(value: TransformGetTransformStatsCheckpointing): Self = StObject.set(x, "checkpointing", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode(value: NodeAttributes): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStats(value: TransformGetTransformStatsTransformIndexerStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
