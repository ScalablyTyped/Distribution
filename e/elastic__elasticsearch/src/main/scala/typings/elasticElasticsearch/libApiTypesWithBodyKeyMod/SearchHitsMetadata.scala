package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHitsMetadata[T] extends StObject {
  
  var hits: js.Array[SearchHit[T]]
  
  var max_score: js.UndefOr[double | Null] = js.undefined
  
  var total: js.UndefOr[SearchTotalHits | long] = js.undefined
}
object SearchHitsMetadata {
  
  inline def apply[T](hits: js.Array[SearchHit[T]]): SearchHitsMetadata[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchHitsMetadata[T]]
  }
  
  extension [Self <: SearchHitsMetadata[?], T](x: Self & SearchHitsMetadata[T]) {
    
    inline def setHits(value: js.Array[SearchHit[T]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: SearchHit[T]*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setMax_score(value: double): Self = StObject.set(x, "max_score", value.asInstanceOf[js.Any])
    
    inline def setMax_scoreNull: Self = StObject.set(x, "max_score", null)
    
    inline def setMax_scoreUndefined: Self = StObject.set(x, "max_score", js.undefined)
    
    inline def setTotal(value: SearchTotalHits | long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
