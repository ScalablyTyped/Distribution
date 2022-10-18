package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRestoreSnapshotRestore extends StObject {
  
  var indices: js.Array[IndexName]
  
  var shards: ShardStatistics
  
  var snapshot: String
}
object SnapshotRestoreSnapshotRestore {
  
  inline def apply(indices: js.Array[IndexName], shards: ShardStatistics, snapshot: String): SnapshotRestoreSnapshotRestore = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRestoreSnapshotRestore]
  }
  
  extension [Self <: SnapshotRestoreSnapshotRestore](x: Self) {
    
    inline def setIndices(value: js.Array[IndexName]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setShards(value: ShardStatistics): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
