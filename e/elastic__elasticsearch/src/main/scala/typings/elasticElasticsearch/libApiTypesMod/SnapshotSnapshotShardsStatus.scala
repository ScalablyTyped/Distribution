package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSnapshotShardsStatus extends StObject {
  
  var stage: SnapshotShardsStatsStage
  
  var stats: SnapshotShardsStatsSummary
}
object SnapshotSnapshotShardsStatus {
  
  inline def apply(stage: SnapshotShardsStatsStage, stats: SnapshotShardsStatsSummary): SnapshotSnapshotShardsStatus = {
    val __obj = js.Dynamic.literal(stage = stage.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSnapshotShardsStatus]
  }
  
  extension [Self <: SnapshotSnapshotShardsStatus](x: Self) {
    
    inline def setStage(value: SnapshotShardsStatsStage): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStats(value: SnapshotShardsStatsSummary): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
