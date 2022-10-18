package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchMultiSearchItem[TDocument]
  - typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ErrorResponseBase
*/
trait MsearchResponseItem[TDocument] extends StObject
object MsearchResponseItem {
  
  inline def ErrorResponseBase(error: ErrorCause, status: integer): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ErrorResponseBase = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ErrorResponseBase]
  }
  
  inline def MsearchMultiSearchItem[TDocument](_shards: ShardStatistics, hits: SearchHitsMetadata[TDocument], timed_out: Boolean, took: long): typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchMultiSearchItem[TDocument] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchMultiSearchItem[TDocument]]
  }
}
