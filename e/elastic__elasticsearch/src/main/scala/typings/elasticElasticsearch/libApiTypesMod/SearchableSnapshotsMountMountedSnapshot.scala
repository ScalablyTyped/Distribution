package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsMountMountedSnapshot extends StObject {
  
  var indices: Indices
  
  var shards: ShardStatistics
  
  var snapshot: Name
}
object SearchableSnapshotsMountMountedSnapshot {
  
  inline def apply(indices: Indices, shards: ShardStatistics, snapshot: Name): SearchableSnapshotsMountMountedSnapshot = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsMountMountedSnapshot]
  }
  
  extension [Self <: SearchableSnapshotsMountMountedSnapshot](x: Self) {
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setShards(value: ShardStatistics): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: Name): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
