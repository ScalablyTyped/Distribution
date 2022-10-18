package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotStatus extends StObject {
  
  var include_global_state: Boolean
  
  var indices: Record[String, SnapshotSnapshotIndexStats]
  
  var repository: String
  
  var shards_stats: SnapshotShardsStats
  
  var snapshot: String
  
  var state: String
  
  var stats: SnapshotSnapshotStats
  
  var uuid: Uuid
}
object SnapshotStatus {
  
  inline def apply(
    include_global_state: Boolean,
    indices: Record[String, SnapshotSnapshotIndexStats],
    repository: String,
    shards_stats: SnapshotShardsStats,
    snapshot: String,
    state: String,
    stats: SnapshotSnapshotStats,
    uuid: Uuid
  ): SnapshotStatus = {
    val __obj = js.Dynamic.literal(include_global_state = include_global_state.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], shards_stats = shards_stats.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotStatus]
  }
  
  extension [Self <: SnapshotStatus](x: Self) {
    
    inline def setInclude_global_state(value: Boolean): Self = StObject.set(x, "include_global_state", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Record[String, SnapshotSnapshotIndexStats]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setShards_stats(value: SnapshotShardsStats): Self = StObject.set(x, "shards_stats", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStats(value: SnapshotSnapshotStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: Uuid): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
