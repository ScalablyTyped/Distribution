package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHit[TDocument] extends StObject {
  
  var _explanation: js.UndefOr[ExplainExplanation] = js.undefined
  
  var _id: Id
  
  var _ignored: js.UndefOr[js.Array[String]] = js.undefined
  
  var _index: IndexName
  
  var _nested: js.UndefOr[SearchNestedIdentity] = js.undefined
  
  var _node: js.UndefOr[String] = js.undefined
  
  var _primary_term: js.UndefOr[long] = js.undefined
  
  var _routing: js.UndefOr[String] = js.undefined
  
  var _score: js.UndefOr[double | Null] = js.undefined
  
  var _seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var _shard: js.UndefOr[String] = js.undefined
  
  var _source: js.UndefOr[TDocument] = js.undefined
  
  var _version: js.UndefOr[VersionNumber] = js.undefined
  
  var fields: js.UndefOr[Record[String, Any]] = js.undefined
  
  var highlight: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  var ignored_field_values: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  var inner_hits: js.UndefOr[Record[String, SearchInnerHitsResult]] = js.undefined
  
  var matched_queries: js.UndefOr[js.Array[String]] = js.undefined
  
  var sort: js.UndefOr[SortResults] = js.undefined
}
object SearchHit {
  
  inline def apply[TDocument](_id: Id, _index: IndexName): SearchHit[TDocument] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchHit[TDocument]]
  }
  
  extension [Self <: SearchHit[?], TDocument](x: Self & SearchHit[TDocument]) {
    
    inline def setFields(value: Record[String, Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHighlight(value: Record[String, js.Array[String]]): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setIgnored_field_values(value: Record[String, js.Array[String]]): Self = StObject.set(x, "ignored_field_values", value.asInstanceOf[js.Any])
    
    inline def setIgnored_field_valuesUndefined: Self = StObject.set(x, "ignored_field_values", js.undefined)
    
    inline def setInner_hits(value: Record[String, SearchInnerHitsResult]): Self = StObject.set(x, "inner_hits", value.asInstanceOf[js.Any])
    
    inline def setInner_hitsUndefined: Self = StObject.set(x, "inner_hits", js.undefined)
    
    inline def setMatched_queries(value: js.Array[String]): Self = StObject.set(x, "matched_queries", value.asInstanceOf[js.Any])
    
    inline def setMatched_queriesUndefined: Self = StObject.set(x, "matched_queries", js.undefined)
    
    inline def setMatched_queriesVarargs(value: String*): Self = StObject.set(x, "matched_queries", js.Array(value*))
    
    inline def setSort(value: SortResults): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: (long | double | String | Null)*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def set_explanation(value: ExplainExplanation): Self = StObject.set(x, "_explanation", value.asInstanceOf[js.Any])
    
    inline def set_explanationUndefined: Self = StObject.set(x, "_explanation", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_ignored(value: js.Array[String]): Self = StObject.set(x, "_ignored", value.asInstanceOf[js.Any])
    
    inline def set_ignoredUndefined: Self = StObject.set(x, "_ignored", js.undefined)
    
    inline def set_ignoredVarargs(value: String*): Self = StObject.set(x, "_ignored", js.Array(value*))
    
    inline def set_index(value: IndexName): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
    
    inline def set_nested(value: SearchNestedIdentity): Self = StObject.set(x, "_nested", value.asInstanceOf[js.Any])
    
    inline def set_nestedUndefined: Self = StObject.set(x, "_nested", js.undefined)
    
    inline def set_node(value: String): Self = StObject.set(x, "_node", value.asInstanceOf[js.Any])
    
    inline def set_nodeUndefined: Self = StObject.set(x, "_node", js.undefined)
    
    inline def set_primary_term(value: long): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_primary_termUndefined: Self = StObject.set(x, "_primary_term", js.undefined)
    
    inline def set_routing(value: String): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_score(value: double): Self = StObject.set(x, "_score", value.asInstanceOf[js.Any])
    
    inline def set_scoreNull: Self = StObject.set(x, "_score", null)
    
    inline def set_scoreUndefined: Self = StObject.set(x, "_score", js.undefined)
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_seq_noUndefined: Self = StObject.set(x, "_seq_no", js.undefined)
    
    inline def set_shard(value: String): Self = StObject.set(x, "_shard", value.asInstanceOf[js.Any])
    
    inline def set_shardUndefined: Self = StObject.set(x, "_shard", js.undefined)
    
    inline def set_source(value: TDocument): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
