package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichStatsCacheStats extends StObject {
  
  var count: integer
  
  var evictions: integer
  
  var hits: integer
  
  var misses: integer
  
  var node_id: Id
}
object EnrichStatsCacheStats {
  
  inline def apply(count: integer, evictions: integer, hits: integer, misses: integer, node_id: Id): EnrichStatsCacheStats = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], evictions = evictions.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], misses = misses.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichStatsCacheStats]
  }
  
  extension [Self <: EnrichStatsCacheStats](x: Self) {
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setEvictions(value: integer): Self = StObject.set(x, "evictions", value.asInstanceOf[js.Any])
    
    inline def setHits(value: integer): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setMisses(value: integer): Self = StObject.set(x, "misses", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: Id): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
