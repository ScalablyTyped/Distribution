package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInnerHitsResult extends StObject {
  
  var hits: SearchHitsMetadata[Any]
}
object SearchInnerHitsResult {
  
  inline def apply(hits: SearchHitsMetadata[Any]): SearchInnerHitsResult = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInnerHitsResult]
  }
  
  extension [Self <: SearchInnerHitsResult](x: Self) {
    
    inline def setHits(value: SearchHitsMetadata[Any]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
  }
}
