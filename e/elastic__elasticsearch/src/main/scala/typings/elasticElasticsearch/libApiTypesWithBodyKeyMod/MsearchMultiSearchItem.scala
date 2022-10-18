package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsearchMultiSearchItem[TDocument]
  extends StObject
     with SearchResponseBody[TDocument, Record[AggregateName, AggregationsAggregate]]
     with MsearchResponseItem[TDocument] {
  
  var status: js.UndefOr[integer] = js.undefined
}
object MsearchMultiSearchItem {
  
  inline def apply[TDocument](_shards: ShardStatistics, hits: SearchHitsMetadata[TDocument], timed_out: Boolean, took: long): MsearchMultiSearchItem[TDocument] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsearchMultiSearchItem[TDocument]]
  }
  
  extension [Self <: MsearchMultiSearchItem[?], TDocument](x: Self & MsearchMultiSearchItem[TDocument]) {
    
    inline def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
