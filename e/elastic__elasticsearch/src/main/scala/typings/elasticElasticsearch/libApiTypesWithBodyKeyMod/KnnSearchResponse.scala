package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnnSearchResponse[TDocument] extends StObject {
  
  var _shards: ShardStatistics
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var hits: SearchHitsMetadata[TDocument]
  
  var max_score: js.UndefOr[double] = js.undefined
  
  var timed_out: Boolean
  
  var took: long
}
object KnnSearchResponse {
  
  inline def apply[TDocument](_shards: ShardStatistics, hits: SearchHitsMetadata[TDocument], timed_out: Boolean, took: long): KnnSearchResponse[TDocument] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnnSearchResponse[TDocument]]
  }
  
  extension [Self <: KnnSearchResponse[?], TDocument](x: Self & KnnSearchResponse[TDocument]) {
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHits(value: SearchHitsMetadata[TDocument]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setMax_score(value: double): Self = StObject.set(x, "max_score", value.asInstanceOf[js.Any])
    
    inline def setMax_scoreUndefined: Self = StObject.set(x, "max_score", js.undefined)
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setTook(value: long): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
    
    inline def set_shards(value: ShardStatistics): Self = StObject.set(x, "_shards", value.asInstanceOf[js.Any])
  }
}
