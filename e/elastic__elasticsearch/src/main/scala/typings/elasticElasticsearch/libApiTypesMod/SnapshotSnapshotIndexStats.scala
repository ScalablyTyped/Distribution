package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSnapshotIndexStats extends StObject {
  
  var shards: Record[String, SnapshotSnapshotShardsStatus]
  
  var shards_stats: SnapshotShardsStats
  
  var stats: SnapshotSnapshotStats
}
object SnapshotSnapshotIndexStats {
  
  inline def apply(
    shards: Record[String, SnapshotSnapshotShardsStatus],
    shards_stats: SnapshotShardsStats,
    stats: SnapshotSnapshotStats
  ): SnapshotSnapshotIndexStats = {
    val __obj = js.Dynamic.literal(shards = shards.asInstanceOf[js.Any], shards_stats = shards_stats.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSnapshotIndexStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotSnapshotIndexStats] (val x: Self) extends AnyVal {
    
    inline def setShards(value: Record[String, SnapshotSnapshotShardsStatus]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShards_stats(value: SnapshotShardsStats): Self = StObject.set(x, "shards_stats", value.asInstanceOf[js.Any])
    
    inline def setStats(value: SnapshotSnapshotStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
