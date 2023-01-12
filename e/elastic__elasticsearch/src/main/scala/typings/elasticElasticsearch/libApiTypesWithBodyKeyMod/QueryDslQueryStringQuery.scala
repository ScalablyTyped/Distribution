package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslQueryStringQuery
  extends StObject
     with QueryDslQueryBase {
  
  var allow_leading_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var auto_generate_synonyms_phrase_query: js.UndefOr[Boolean] = js.undefined
  
  var default_field: js.UndefOr[Field] = js.undefined
  
  var default_operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var enable_position_increments: js.UndefOr[Boolean] = js.undefined
  
  var escape: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  var fuzziness: js.UndefOr[Fuzziness] = js.undefined
  
  var fuzzy_max_expansions: js.UndefOr[integer] = js.undefined
  
  var fuzzy_prefix_length: js.UndefOr[integer] = js.undefined
  
  var fuzzy_rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var fuzzy_transpositions: js.UndefOr[Boolean] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var max_determinized_states: js.UndefOr[integer] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var phrase_slop: js.UndefOr[double] = js.undefined
  
  var query: String
  
  var quote_analyzer: js.UndefOr[String] = js.undefined
  
  var quote_field_suffix: js.UndefOr[String] = js.undefined
  
  var rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var tie_breaker: js.UndefOr[double] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
  
  var `type`: js.UndefOr[QueryDslTextQueryType] = js.undefined
}
object QueryDslQueryStringQuery {
  
  inline def apply(query: String): QueryDslQueryStringQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslQueryStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslQueryStringQuery] (val x: Self) extends AnyVal {
    
    inline def setAllow_leading_wildcard(value: Boolean): Self = StObject.set(x, "allow_leading_wildcard", value.asInstanceOf[js.Any])
    
    inline def setAllow_leading_wildcardUndefined: Self = StObject.set(x, "allow_leading_wildcard", js.undefined)
    
    inline def setAnalyze_wildcard(value: Boolean): Self = StObject.set(x, "analyze_wildcard", value.asInstanceOf[js.Any])
    
    inline def setAnalyze_wildcardUndefined: Self = StObject.set(x, "analyze_wildcard", js.undefined)
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setAuto_generate_synonyms_phrase_query(value: Boolean): Self = StObject.set(x, "auto_generate_synonyms_phrase_query", value.asInstanceOf[js.Any])
    
    inline def setAuto_generate_synonyms_phrase_queryUndefined: Self = StObject.set(x, "auto_generate_synonyms_phrase_query", js.undefined)
    
    inline def setDefault_field(value: Field): Self = StObject.set(x, "default_field", value.asInstanceOf[js.Any])
    
    inline def setDefault_fieldUndefined: Self = StObject.set(x, "default_field", js.undefined)
    
    inline def setDefault_operator(value: QueryDslOperator): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    inline def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    inline def setEnable_position_increments(value: Boolean): Self = StObject.set(x, "enable_position_increments", value.asInstanceOf[js.Any])
    
    inline def setEnable_position_incrementsUndefined: Self = StObject.set(x, "enable_position_increments", js.undefined)
    
    inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFuzziness(value: Fuzziness): Self = StObject.set(x, "fuzziness", value.asInstanceOf[js.Any])
    
    inline def setFuzzinessUndefined: Self = StObject.set(x, "fuzziness", js.undefined)
    
    inline def setFuzzy_max_expansions(value: integer): Self = StObject.set(x, "fuzzy_max_expansions", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_max_expansionsUndefined: Self = StObject.set(x, "fuzzy_max_expansions", js.undefined)
    
    inline def setFuzzy_prefix_length(value: integer): Self = StObject.set(x, "fuzzy_prefix_length", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_prefix_lengthUndefined: Self = StObject.set(x, "fuzzy_prefix_length", js.undefined)
    
    inline def setFuzzy_rewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "fuzzy_rewrite", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_rewriteUndefined: Self = StObject.set(x, "fuzzy_rewrite", js.undefined)
    
    inline def setFuzzy_transpositions(value: Boolean): Self = StObject.set(x, "fuzzy_transpositions", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_transpositionsUndefined: Self = StObject.set(x, "fuzzy_transpositions", js.undefined)
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setMax_determinized_states(value: integer): Self = StObject.set(x, "max_determinized_states", value.asInstanceOf[js.Any])
    
    inline def setMax_determinized_statesUndefined: Self = StObject.set(x, "max_determinized_states", js.undefined)
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setPhrase_slop(value: double): Self = StObject.set(x, "phrase_slop", value.asInstanceOf[js.Any])
    
    inline def setPhrase_slopUndefined: Self = StObject.set(x, "phrase_slop", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQuote_analyzer(value: String): Self = StObject.set(x, "quote_analyzer", value.asInstanceOf[js.Any])
    
    inline def setQuote_analyzerUndefined: Self = StObject.set(x, "quote_analyzer", js.undefined)
    
    inline def setQuote_field_suffix(value: String): Self = StObject.set(x, "quote_field_suffix", value.asInstanceOf[js.Any])
    
    inline def setQuote_field_suffixUndefined: Self = StObject.set(x, "quote_field_suffix", js.undefined)
    
    inline def setRewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setTie_breaker(value: double): Self = StObject.set(x, "tie_breaker", value.asInstanceOf[js.Any])
    
    inline def setTie_breakerUndefined: Self = StObject.set(x, "tie_breaker", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
    
    inline def setType(value: QueryDslTextQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
