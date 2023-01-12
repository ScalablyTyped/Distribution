package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchableSnapshotsCacheStatsShared extends StObject {
  
  var bytes_read_in_bytes: ByteSize
  
  var bytes_written_in_bytes: ByteSize
  
  var evictions: long
  
  var num_regions: integer
  
  var reads: long
  
  var region_size_in_bytes: ByteSize
  
  var size_in_bytes: ByteSize
  
  var writes: long
}
object SearchableSnapshotsCacheStatsShared {
  
  inline def apply(
    bytes_read_in_bytes: ByteSize,
    bytes_written_in_bytes: ByteSize,
    evictions: long,
    num_regions: integer,
    reads: long,
    region_size_in_bytes: ByteSize,
    size_in_bytes: ByteSize,
    writes: long
  ): SearchableSnapshotsCacheStatsShared = {
    val __obj = js.Dynamic.literal(bytes_read_in_bytes = bytes_read_in_bytes.asInstanceOf[js.Any], bytes_written_in_bytes = bytes_written_in_bytes.asInstanceOf[js.Any], evictions = evictions.asInstanceOf[js.Any], num_regions = num_regions.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any], region_size_in_bytes = region_size_in_bytes.asInstanceOf[js.Any], size_in_bytes = size_in_bytes.asInstanceOf[js.Any], writes = writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchableSnapshotsCacheStatsShared]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchableSnapshotsCacheStatsShared] (val x: Self) extends AnyVal {
    
    inline def setBytes_read_in_bytes(value: ByteSize): Self = StObject.set(x, "bytes_read_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setBytes_written_in_bytes(value: ByteSize): Self = StObject.set(x, "bytes_written_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setEvictions(value: long): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
    
    inline def setNum_regions(value: integer): Self = StObject.set(x, "num_regions", value.asInstanceOf[js.Any])
    
    inline def setReads(value: long): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    
    inline def setRegion_size_in_bytes(value: ByteSize): Self = StObject.set(x, "region_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setSize_in_bytes(value: ByteSize): Self = StObject.set(x, "size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setWrites(value: long): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
  }
}
