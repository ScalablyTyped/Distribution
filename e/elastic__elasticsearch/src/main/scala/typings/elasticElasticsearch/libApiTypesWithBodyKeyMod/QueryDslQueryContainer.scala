package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslQueryContainer
  extends StObject
     with _SecurityIndicesPrivilegesQuery {
  
  var bool: js.UndefOr[QueryDslBoolQuery] = js.undefined
  
  var boosting: js.UndefOr[QueryDslBoostingQuery] = js.undefined
  
  var combined_fields: js.UndefOr[QueryDslCombinedFieldsQuery] = js.undefined
  
  var common: js.UndefOr[Partial[Record[Field, QueryDslCommonTermsQuery | String]]] = js.undefined
  
  var constant_score: js.UndefOr[QueryDslConstantScoreQuery] = js.undefined
  
  var dis_max: js.UndefOr[QueryDslDisMaxQuery] = js.undefined
  
  var distance_feature: js.UndefOr[QueryDslDistanceFeatureQuery] = js.undefined
  
  var exists: js.UndefOr[QueryDslExistsQuery] = js.undefined
  
  var field_masking_span: js.UndefOr[QueryDslSpanFieldMaskingQuery] = js.undefined
  
  var function_score: js.UndefOr[QueryDslFunctionScoreQuery] = js.undefined
  
  var fuzzy: js.UndefOr[Partial[Record[Field, QueryDslFuzzyQuery | String | double | Boolean]]] = js.undefined
  
  var geo_bounding_box: js.UndefOr[QueryDslGeoBoundingBoxQuery] = js.undefined
  
  var geo_distance: js.UndefOr[QueryDslGeoDistanceQuery] = js.undefined
  
  var geo_polygon: js.UndefOr[QueryDslGeoPolygonQuery] = js.undefined
  
  var geo_shape: js.UndefOr[QueryDslGeoShapeQuery] = js.undefined
  
  var has_child: js.UndefOr[QueryDslHasChildQuery] = js.undefined
  
  var has_parent: js.UndefOr[QueryDslHasParentQuery] = js.undefined
  
  var ids: js.UndefOr[QueryDslIdsQuery] = js.undefined
  
  var intervals: js.UndefOr[Partial[Record[Field, QueryDslIntervalsQuery]]] = js.undefined
  
  var `match`: js.UndefOr[Partial[Record[Field, QueryDslMatchQuery | String | float | Boolean]]] = js.undefined
  
  var match_all: js.UndefOr[QueryDslMatchAllQuery] = js.undefined
  
  var match_bool_prefix: js.UndefOr[Partial[Record[Field, QueryDslMatchBoolPrefixQuery | String]]] = js.undefined
  
  var match_none: js.UndefOr[QueryDslMatchNoneQuery] = js.undefined
  
  var match_phrase: js.UndefOr[Partial[Record[Field, QueryDslMatchPhraseQuery | String]]] = js.undefined
  
  var match_phrase_prefix: js.UndefOr[Partial[Record[Field, QueryDslMatchPhrasePrefixQuery | String]]] = js.undefined
  
  var more_like_this: js.UndefOr[QueryDslMoreLikeThisQuery] = js.undefined
  
  var multi_match: js.UndefOr[QueryDslMultiMatchQuery] = js.undefined
  
  var nested: js.UndefOr[QueryDslNestedQuery] = js.undefined
  
  var parent_id: js.UndefOr[QueryDslParentIdQuery] = js.undefined
  
  var percolate: js.UndefOr[QueryDslPercolateQuery] = js.undefined
  
  var pinned: js.UndefOr[QueryDslPinnedQuery] = js.undefined
  
  var prefix: js.UndefOr[Partial[Record[Field, QueryDslPrefixQuery | String]]] = js.undefined
  
  var query_string: js.UndefOr[QueryDslQueryStringQuery] = js.undefined
  
  var range: js.UndefOr[Partial[Record[Field, QueryDslRangeQuery]]] = js.undefined
  
  var rank_feature: js.UndefOr[QueryDslRankFeatureQuery] = js.undefined
  
  var regexp: js.UndefOr[Partial[Record[Field, QueryDslRegexpQuery | String]]] = js.undefined
  
  var script: js.UndefOr[QueryDslScriptQuery] = js.undefined
  
  var script_score: js.UndefOr[QueryDslScriptScoreQuery] = js.undefined
  
  var shape: js.UndefOr[QueryDslShapeQuery] = js.undefined
  
  var simple_query_string: js.UndefOr[QueryDslSimpleQueryStringQuery] = js.undefined
  
  var span_containing: js.UndefOr[QueryDslSpanContainingQuery] = js.undefined
  
  var span_first: js.UndefOr[QueryDslSpanFirstQuery] = js.undefined
  
  var span_multi: js.UndefOr[QueryDslSpanMultiTermQuery] = js.undefined
  
  var span_near: js.UndefOr[QueryDslSpanNearQuery] = js.undefined
  
  var span_not: js.UndefOr[QueryDslSpanNotQuery] = js.undefined
  
  var span_or: js.UndefOr[QueryDslSpanOrQuery] = js.undefined
  
  var span_term: js.UndefOr[Partial[Record[Field, QueryDslSpanTermQuery | String]]] = js.undefined
  
  var span_within: js.UndefOr[QueryDslSpanWithinQuery] = js.undefined
  
  var term: js.UndefOr[Partial[Record[Field, QueryDslTermQuery | FieldValue]]] = js.undefined
  
  var terms: js.UndefOr[QueryDslTermsQuery] = js.undefined
  
  var terms_set: js.UndefOr[Partial[Record[Field, QueryDslTermsSetQuery]]] = js.undefined
  
  var `type`: js.UndefOr[QueryDslTypeQuery] = js.undefined
  
  var wildcard: js.UndefOr[Partial[Record[Field, QueryDslWildcardQuery | String]]] = js.undefined
  
  var wrapper: js.UndefOr[QueryDslWrapperQuery] = js.undefined
}
object QueryDslQueryContainer {
  
  inline def apply(): QueryDslQueryContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslQueryContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslQueryContainer] (val x: Self) extends AnyVal {
    
    inline def setBool(value: QueryDslBoolQuery): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setBoolUndefined: Self = StObject.set(x, "bool", js.undefined)
    
    inline def setBoosting(value: QueryDslBoostingQuery): Self = StObject.set(x, "boosting", value.asInstanceOf[js.Any])
    
    inline def setBoostingUndefined: Self = StObject.set(x, "boosting", js.undefined)
    
    inline def setCombined_fields(value: QueryDslCombinedFieldsQuery): Self = StObject.set(x, "combined_fields", value.asInstanceOf[js.Any])
    
    inline def setCombined_fieldsUndefined: Self = StObject.set(x, "combined_fields", js.undefined)
    
    inline def setCommon(value: Partial[Record[Field, QueryDslCommonTermsQuery | String]]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setConstant_score(value: QueryDslConstantScoreQuery): Self = StObject.set(x, "constant_score", value.asInstanceOf[js.Any])
    
    inline def setConstant_scoreUndefined: Self = StObject.set(x, "constant_score", js.undefined)
    
    inline def setDis_max(value: QueryDslDisMaxQuery): Self = StObject.set(x, "dis_max", value.asInstanceOf[js.Any])
    
    inline def setDis_maxUndefined: Self = StObject.set(x, "dis_max", js.undefined)
    
    inline def setDistance_feature(value: QueryDslDistanceFeatureQuery): Self = StObject.set(x, "distance_feature", value.asInstanceOf[js.Any])
    
    inline def setDistance_featureUndefined: Self = StObject.set(x, "distance_feature", js.undefined)
    
    inline def setExists(value: QueryDslExistsQuery): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "exists", js.undefined)
    
    inline def setField_masking_span(value: QueryDslSpanFieldMaskingQuery): Self = StObject.set(x, "field_masking_span", value.asInstanceOf[js.Any])
    
    inline def setField_masking_spanUndefined: Self = StObject.set(x, "field_masking_span", js.undefined)
    
    inline def setFunction_score(value: QueryDslFunctionScoreQuery): Self = StObject.set(x, "function_score", value.asInstanceOf[js.Any])
    
    inline def setFunction_scoreUndefined: Self = StObject.set(x, "function_score", js.undefined)
    
    inline def setFuzzy(value: Partial[Record[Field, QueryDslFuzzyQuery | String | double | Boolean]]): Self = StObject.set(x, "fuzzy", value.asInstanceOf[js.Any])
    
    inline def setFuzzyUndefined: Self = StObject.set(x, "fuzzy", js.undefined)
    
    inline def setGeo_bounding_box(value: QueryDslGeoBoundingBoxQuery): Self = StObject.set(x, "geo_bounding_box", value.asInstanceOf[js.Any])
    
    inline def setGeo_bounding_boxUndefined: Self = StObject.set(x, "geo_bounding_box", js.undefined)
    
    inline def setGeo_distance(value: QueryDslGeoDistanceQuery): Self = StObject.set(x, "geo_distance", value.asInstanceOf[js.Any])
    
    inline def setGeo_distanceUndefined: Self = StObject.set(x, "geo_distance", js.undefined)
    
    inline def setGeo_polygon(value: QueryDslGeoPolygonQuery): Self = StObject.set(x, "geo_polygon", value.asInstanceOf[js.Any])
    
    inline def setGeo_polygonUndefined: Self = StObject.set(x, "geo_polygon", js.undefined)
    
    inline def setGeo_shape(value: QueryDslGeoShapeQuery): Self = StObject.set(x, "geo_shape", value.asInstanceOf[js.Any])
    
    inline def setGeo_shapeUndefined: Self = StObject.set(x, "geo_shape", js.undefined)
    
    inline def setHas_child(value: QueryDslHasChildQuery): Self = StObject.set(x, "has_child", value.asInstanceOf[js.Any])
    
    inline def setHas_childUndefined: Self = StObject.set(x, "has_child", js.undefined)
    
    inline def setHas_parent(value: QueryDslHasParentQuery): Self = StObject.set(x, "has_parent", value.asInstanceOf[js.Any])
    
    inline def setHas_parentUndefined: Self = StObject.set(x, "has_parent", js.undefined)
    
    inline def setIds(value: QueryDslIdsQuery): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIntervals(value: Partial[Record[Field, QueryDslIntervalsQuery]]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setIntervalsUndefined: Self = StObject.set(x, "intervals", js.undefined)
    
    inline def setMatch(value: Partial[Record[Field, QueryDslMatchQuery | String | float | Boolean]]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMatch_all(value: QueryDslMatchAllQuery): Self = StObject.set(x, "match_all", value.asInstanceOf[js.Any])
    
    inline def setMatch_allUndefined: Self = StObject.set(x, "match_all", js.undefined)
    
    inline def setMatch_bool_prefix(value: Partial[Record[Field, QueryDslMatchBoolPrefixQuery | String]]): Self = StObject.set(x, "match_bool_prefix", value.asInstanceOf[js.Any])
    
    inline def setMatch_bool_prefixUndefined: Self = StObject.set(x, "match_bool_prefix", js.undefined)
    
    inline def setMatch_none(value: QueryDslMatchNoneQuery): Self = StObject.set(x, "match_none", value.asInstanceOf[js.Any])
    
    inline def setMatch_noneUndefined: Self = StObject.set(x, "match_none", js.undefined)
    
    inline def setMatch_phrase(value: Partial[Record[Field, QueryDslMatchPhraseQuery | String]]): Self = StObject.set(x, "match_phrase", value.asInstanceOf[js.Any])
    
    inline def setMatch_phraseUndefined: Self = StObject.set(x, "match_phrase", js.undefined)
    
    inline def setMatch_phrase_prefix(value: Partial[Record[Field, QueryDslMatchPhrasePrefixQuery | String]]): Self = StObject.set(x, "match_phrase_prefix", value.asInstanceOf[js.Any])
    
    inline def setMatch_phrase_prefixUndefined: Self = StObject.set(x, "match_phrase_prefix", js.undefined)
    
    inline def setMore_like_this(value: QueryDslMoreLikeThisQuery): Self = StObject.set(x, "more_like_this", value.asInstanceOf[js.Any])
    
    inline def setMore_like_thisUndefined: Self = StObject.set(x, "more_like_this", js.undefined)
    
    inline def setMulti_match(value: QueryDslMultiMatchQuery): Self = StObject.set(x, "multi_match", value.asInstanceOf[js.Any])
    
    inline def setMulti_matchUndefined: Self = StObject.set(x, "multi_match", js.undefined)
    
    inline def setNested(value: QueryDslNestedQuery): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setParent_id(value: QueryDslParentIdQuery): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setParent_idUndefined: Self = StObject.set(x, "parent_id", js.undefined)
    
    inline def setPercolate(value: QueryDslPercolateQuery): Self = StObject.set(x, "percolate", value.asInstanceOf[js.Any])
    
    inline def setPercolateUndefined: Self = StObject.set(x, "percolate", js.undefined)
    
    inline def setPinned(value: QueryDslPinnedQuery): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setPrefix(value: Partial[Record[Field, QueryDslPrefixQuery | String]]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setQuery_string(value: QueryDslQueryStringQuery): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
    
    inline def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
    
    inline def setRange(value: Partial[Record[Field, QueryDslRangeQuery]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRank_feature(value: QueryDslRankFeatureQuery): Self = StObject.set(x, "rank_feature", value.asInstanceOf[js.Any])
    
    inline def setRank_featureUndefined: Self = StObject.set(x, "rank_feature", js.undefined)
    
    inline def setRegexp(value: Partial[Record[Field, QueryDslRegexpQuery | String]]): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setScript(value: QueryDslScriptQuery): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setScript_score(value: QueryDslScriptScoreQuery): Self = StObject.set(x, "script_score", value.asInstanceOf[js.Any])
    
    inline def setScript_scoreUndefined: Self = StObject.set(x, "script_score", js.undefined)
    
    inline def setShape(value: QueryDslShapeQuery): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSimple_query_string(value: QueryDslSimpleQueryStringQuery): Self = StObject.set(x, "simple_query_string", value.asInstanceOf[js.Any])
    
    inline def setSimple_query_stringUndefined: Self = StObject.set(x, "simple_query_string", js.undefined)
    
    inline def setSpan_containing(value: QueryDslSpanContainingQuery): Self = StObject.set(x, "span_containing", value.asInstanceOf[js.Any])
    
    inline def setSpan_containingUndefined: Self = StObject.set(x, "span_containing", js.undefined)
    
    inline def setSpan_first(value: QueryDslSpanFirstQuery): Self = StObject.set(x, "span_first", value.asInstanceOf[js.Any])
    
    inline def setSpan_firstUndefined: Self = StObject.set(x, "span_first", js.undefined)
    
    inline def setSpan_multi(value: QueryDslSpanMultiTermQuery): Self = StObject.set(x, "span_multi", value.asInstanceOf[js.Any])
    
    inline def setSpan_multiUndefined: Self = StObject.set(x, "span_multi", js.undefined)
    
    inline def setSpan_near(value: QueryDslSpanNearQuery): Self = StObject.set(x, "span_near", value.asInstanceOf[js.Any])
    
    inline def setSpan_nearUndefined: Self = StObject.set(x, "span_near", js.undefined)
    
    inline def setSpan_not(value: QueryDslSpanNotQuery): Self = StObject.set(x, "span_not", value.asInstanceOf[js.Any])
    
    inline def setSpan_notUndefined: Self = StObject.set(x, "span_not", js.undefined)
    
    inline def setSpan_or(value: QueryDslSpanOrQuery): Self = StObject.set(x, "span_or", value.asInstanceOf[js.Any])
    
    inline def setSpan_orUndefined: Self = StObject.set(x, "span_or", js.undefined)
    
    inline def setSpan_term(value: Partial[Record[Field, QueryDslSpanTermQuery | String]]): Self = StObject.set(x, "span_term", value.asInstanceOf[js.Any])
    
    inline def setSpan_termUndefined: Self = StObject.set(x, "span_term", js.undefined)
    
    inline def setSpan_within(value: QueryDslSpanWithinQuery): Self = StObject.set(x, "span_within", value.asInstanceOf[js.Any])
    
    inline def setSpan_withinUndefined: Self = StObject.set(x, "span_within", js.undefined)
    
    inline def setTerm(value: Partial[Record[Field, QueryDslTermQuery | FieldValue]]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setTerms(value: QueryDslTermsQuery): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTerms_set(value: Partial[Record[Field, QueryDslTermsSetQuery]]): Self = StObject.set(x, "terms_set", value.asInstanceOf[js.Any])
    
    inline def setTerms_setUndefined: Self = StObject.set(x, "terms_set", js.undefined)
    
    inline def setType(value: QueryDslTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWildcard(value: Partial[Record[Field, QueryDslWildcardQuery | String]]): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
    
    inline def setWrapper(value: QueryDslWrapperQuery): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
