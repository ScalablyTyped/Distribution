package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotIndexDetails extends StObject {
  
  var max_segments_per_shard: long
  
  var shard_count: integer
  
  var size: js.UndefOr[ByteSize] = js.undefined
  
  var size_in_bytes: long
}
object SnapshotIndexDetails {
  
  inline def apply(max_segments_per_shard: long, shard_count: integer, size_in_bytes: long): SnapshotIndexDetails = {
    val __obj = js.Dynamic.literal(max_segments_per_shard = max_segments_per_shard.asInstanceOf[js.Any], shard_count = shard_count.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotIndexDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapshotIndexDetails] (val x: Self) extends AnyVal {
    
    inline def setMax_segments_per_shard(value: long): Self = StObject.set(x, "max_segments_per_shard", value.asInstanceOf[js.Any])
    
    inline def setShard_count(value: integer): Self = StObject.set(x, "shard_count", value.asInstanceOf[js.Any])
    
    inline def setSize(value: ByteSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSize_in_bytes(value: long): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
  }
}
