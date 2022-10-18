package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupRollupSearchResponse[TDocument, TAggregations] extends StObject {
  
  var _shards: ShardStatistics
  
  var aggregations: js.UndefOr[TAggregations] = js.undefined
  
  var hits: SearchHitsMetadata[TDocument]
  
  var terminated_early: js.UndefOr[Boolean] = js.undefined
  
  var timed_out: Boolean
  
  var took: long
}
object RollupRollupSearchResponse {
  
  inline def apply[TDocument, TAggregations](_shards: ShardStatistics, hits: SearchHitsMetadata[TDocument], timed_out: Boolean, took: long): RollupRollupSearchResponse[TDocument, TAggregations] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupRollupSearchResponse[TDocument, TAggregations]]
  }
  
  extension [Self <: RollupRollupSearchResponse[?, ?], TDocument, TAggregations](x: Self & (RollupRollupSearchResponse[TDocument, TAggregations])) {
    
    inline def setAggregations(value: TAggregations): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setHits(value: SearchHitsMetadata[TDocument]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setTerminated_early(value: Boolean): Self = StObject.set(x, "terminated_early", value.asInstanceOf[js.Any])
    
    inline def setTerminated_earlyUndefined: Self = StObject.set(x, "terminated_early", js.undefined)
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
