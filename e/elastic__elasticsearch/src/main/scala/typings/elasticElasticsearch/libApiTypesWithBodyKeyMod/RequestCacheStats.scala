package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCacheStats extends StObject {
  
  var evictions: long
  
  var hit_count: long
  
  var memory_size: js.UndefOr[String] = js.undefined
  
  var memory_size_in_bytes: long
  
  var miss_count: long
}
object RequestCacheStats {
  
  inline def apply(evictions: long, hit_count: long, memory_size_in_bytes: long, miss_count: long): RequestCacheStats = {
    val __obj = js.Dynamic.literal(evictions = evictions.asInstanceOf[js.Any], hit_count = hit_count.asInstanceOf[js.Any], memory_size_in_bytes = memory_size_in_bytes.asInstanceOf[js.Any], miss_count = miss_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCacheStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestCacheStats] (val x: Self) extends AnyVal {
    
    inline def setEvictions(value: long): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
    
    inline def setHit_count(value: long): Self = StObject.set(x, "hit_count", value.asInstanceOf[js.Any])
    
    inline def setMemory_size(value: String): Self = StObject.set(x, "memory_size", value.asInstanceOf[js.Any])
    
    inline def setMemory_sizeUndefined: Self = StObject.set(x, "memory_size", js.undefined)
    
    inline def setMemory_size_in_bytes(value: long): Self = StObject.set(x, "memory_size_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setMiss_count(value: long): Self = StObject.set(x, "miss_count", value.asInstanceOf[js.Any])
  }
}
