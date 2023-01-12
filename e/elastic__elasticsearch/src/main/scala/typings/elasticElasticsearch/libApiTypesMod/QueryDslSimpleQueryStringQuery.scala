package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSimpleQueryStringQuery
  extends StObject
     with QueryDslQueryBase {
  
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var auto_generate_synonyms_phrase_query: js.UndefOr[Boolean] = js.undefined
  
  var default_operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  var flags: js.UndefOr[QueryDslSimpleQueryStringFlags] = js.undefined
  
  var fuzzy_max_expansions: js.UndefOr[integer] = js.undefined
  
  var fuzzy_prefix_length: js.UndefOr[integer] = js.undefined
  
  var fuzzy_transpositions: js.UndefOr[Boolean] = js.undefined
  
  var lenient: js.UndefOr[Boolean] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var query: String
  
  var quote_field_suffix: js.UndefOr[String] = js.undefined
}
object QueryDslSimpleQueryStringQuery {
  
  inline def apply(query: String): QueryDslSimpleQueryStringQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSimpleQueryStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslSimpleQueryStringQuery] (val x: Self) extends AnyVal {
    
    inline def setAnalyze_wildcard(value: Boolean): Self = StObject.set(x, "analyze_wildcard", value.asInstanceOf[js.Any])
    
    inline def setAnalyze_wildcardUndefined: Self = StObject.set(x, "analyze_wildcard", js.undefined)
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setAuto_generate_synonyms_phrase_query(value: Boolean): Self = StObject.set(x, "auto_generate_synonyms_phrase_query", value.asInstanceOf[js.Any])
    
    inline def setAuto_generate_synonyms_phrase_queryUndefined: Self = StObject.set(x, "auto_generate_synonyms_phrase_query", js.undefined)
    
    inline def setDefault_operator(value: QueryDslOperator): Self = StObject.set(x, "default_operator", value.asInstanceOf[js.Any])
    
    inline def setDefault_operatorUndefined: Self = StObject.set(x, "default_operator", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFlags(value: QueryDslSimpleQueryStringFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFuzzy_max_expansions(value: integer): Self = StObject.set(x, "fuzzy_max_expansions", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_max_expansionsUndefined: Self = StObject.set(x, "fuzzy_max_expansions", js.undefined)
    
    inline def setFuzzy_prefix_length(value: integer): Self = StObject.set(x, "fuzzy_prefix_length", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_prefix_lengthUndefined: Self = StObject.set(x, "fuzzy_prefix_length", js.undefined)
    
    inline def setFuzzy_transpositions(value: Boolean): Self = StObject.set(x, "fuzzy_transpositions", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_transpositionsUndefined: Self = StObject.set(x, "fuzzy_transpositions", js.undefined)
    
    inline def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
    
    inline def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQuote_field_suffix(value: String): Self = StObject.set(x, "quote_field_suffix", value.asInstanceOf[js.Any])
    
    inline def setQuote_field_suffixUndefined: Self = StObject.set(x, "quote_field_suffix", js.undefined)
  }
}
