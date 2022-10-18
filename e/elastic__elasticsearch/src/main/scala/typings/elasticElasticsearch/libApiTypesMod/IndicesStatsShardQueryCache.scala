package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesStatsShardQueryCache extends StObject {
  
  var cache_count: long
  
  var cache_size: long
  
  var evictions: long
  
  var hit_count: long
  
  var memory_size_in_bytes: long
  
  var miss_count: long
  
  var total_count: long
}
object IndicesStatsShardQueryCache {
  
  inline def apply(
    cache_count: long,
    cache_size: long,
    evictions: long,
    hit_count: long,
    memory_size_in_bytes: long,
    miss_count: long,
    total_count: long
  ): IndicesStatsShardQueryCache = {
    val __obj = js.Dynamic.literal(cache_count = cache_count.asInstanceOf[js.Any], cache_size = cache_size.asInstanceOf[js.Any], evictions = evictions.asInstanceOf[js.Any], hit_count = hit_count.asInstanceOf[js.Any], memory_size_in_bytes = memory_size_in_bytes.asInstanceOf[js.Any], miss_count = miss_count.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesStatsShardQueryCache]
  }
  
  extension [Self <: IndicesStatsShardQueryCache](x: Self) {
    
    inline def setCache_count(value: long): Self = StObject.set(x, "cache_count", value.asInstanceOf[js.Any])
    
    inline def setCache_size(value: long): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    inline def setEvictions(value: long): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
    
    inline def setHit_count(value: long): Self = StObject.set(x, "hit_count", value.asInstanceOf[js.Any])
    
    inline def setMemory_size_in_bytes(value: long): Self = StObject.set(x, "memory_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMiss_count(value: long): Self = StObject.set(x, "miss_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_count(value: long): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
