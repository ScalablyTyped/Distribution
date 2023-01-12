package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsTopHitsAggregate
  extends StObject
     with AggregationsAggregateBase
     with _AggregationsAggregate {
  
  var hits: SearchHitsMetadata[Any]
}
object AggregationsTopHitsAggregate {
  
  inline def apply(hits: SearchHitsMetadata[Any]): AggregationsTopHitsAggregate = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsTopHitsAggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsTopHitsAggregate] (val x: Self) extends AnyVal {
    
    inline def setHits(value: SearchHitsMetadata[Any]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
  }
}
