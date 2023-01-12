package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCacheStats extends StObject {
  
  var cache_count: integer
  
  var cache_size: integer
  
  var evictions: integer
  
  var hit_count: integer
  
  var memory_size: js.UndefOr[ByteSize] = js.undefined
  
  var memory_size_in_bytes: integer
  
  var miss_count: integer
  
  var total_count: integer
}
object QueryCacheStats {
  
  inline def apply(
    cache_count: integer,
    cache_size: integer,
    evictions: integer,
    hit_count: integer,
    memory_size_in_bytes: integer,
    miss_count: integer,
    total_count: integer
  ): QueryCacheStats = {
    val __obj = js.Dynamic.literal(cache_count = cache_count.asInstanceOf[js.Any], cache_size = cache_size.asInstanceOf[js.Any], evictions = evictions.asInstanceOf[js.Any], hit_count = hit_count.asInstanceOf[js.Any], memory_size_in_bytes = memory_size_in_bytes.asInstanceOf[js.Any], miss_count = miss_count.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCacheStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryCacheStats] (val x: Self) extends AnyVal {
    
    inline def setCache_count(value: integer): Self = StObject.set(x, "cache_count", value.asInstanceOf[js.Any])
    
    inline def setCache_size(value: integer): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    inline def setEvictions(value: integer): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
    
    inline def setHit_count(value: integer): Self = StObject.set(x, "hit_count", value.asInstanceOf[js.Any])
    
    inline def setMemory_size(value: ByteSize): Self = StObject.set(x, "memory_size", value.asInstanceOf[js.Any])
    
    inline def setMemory_sizeUndefined: Self = StObject.set(x, "memory_size", js.undefined)
    
    inline def setMemory_size_in_bytes(value: integer): Self = StObject.set(x, "memory_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMiss_count(value: integer): Self = StObject.set(x, "miss_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_count(value: integer): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
