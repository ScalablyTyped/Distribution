package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotSnapshotShardFailure extends StObject {
  
  var index: IndexName
  
  var node_id: Id
  
  var reason: String
  
  var shard_id: Id
  
  var status: String
}
object SnapshotSnapshotShardFailure {
  
  inline def apply(index: IndexName, node_id: Id, reason: String, shard_id: Id, status: String): SnapshotSnapshotShardFailure = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], shard_id = shard_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSnapshotShardFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotSnapshotShardFailure] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setShard_id(value: Id): Self = StObject.set(x, "shard_id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
