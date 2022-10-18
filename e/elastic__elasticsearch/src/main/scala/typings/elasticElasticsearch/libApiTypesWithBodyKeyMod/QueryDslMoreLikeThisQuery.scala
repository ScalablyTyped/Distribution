package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslMoreLikeThisQuery
  extends StObject
     with QueryDslQueryBase {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var boost_terms: js.UndefOr[double] = js.undefined
  
  var fail_on_unsupported_field: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  var include: js.UndefOr[Boolean] = js.undefined
  
  var like: QueryDslLike | js.Array[QueryDslLike]
  
  var max_doc_freq: js.UndefOr[integer] = js.undefined
  
  var max_query_terms: js.UndefOr[integer] = js.undefined
  
  var max_word_length: js.UndefOr[integer] = js.undefined
  
  var min_doc_freq: js.UndefOr[integer] = js.undefined
  
  var min_term_freq: js.UndefOr[integer] = js.undefined
  
  var min_word_length: js.UndefOr[integer] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var per_field_analyzer: js.UndefOr[Record[Field, String]] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var stop_words: js.UndefOr[AnalysisStopWords] = js.undefined
  
  var unlike: js.UndefOr[QueryDslLike | js.Array[QueryDslLike]] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
  
  var version_type: js.UndefOr[VersionType] = js.undefined
}
object QueryDslMoreLikeThisQuery {
  
  inline def apply(like: QueryDslLike | js.Array[QueryDslLike]): QueryDslMoreLikeThisQuery = {
    val __obj = js.Dynamic.literal(like = like.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslMoreLikeThisQuery]
  }
  
  extension [Self <: QueryDslMoreLikeThisQuery](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setBoost_terms(value: double): Self = StObject.set(x, "boost_terms", value.asInstanceOf[js.Any])
    
    inline def setBoost_termsUndefined: Self = StObject.set(x, "boost_terms", js.undefined)
    
    inline def setFail_on_unsupported_field(value: Boolean): Self = StObject.set(x, "fail_on_unsupported_field", value.asInstanceOf[js.Any])
    
    inline def setFail_on_unsupported_fieldUndefined: Self = StObject.set(x, "fail_on_unsupported_field", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setLike(value: QueryDslLike | js.Array[QueryDslLike]): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    inline def setLikeVarargs(value: QueryDslLike*): Self = StObject.set(x, "like", js.Array(value*))
    
    inline def setMax_doc_freq(value: integer): Self = StObject.set(x, "max_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setMax_doc_freqUndefined: Self = StObject.set(x, "max_doc_freq", js.undefined)
    
    inline def setMax_query_terms(value: integer): Self = StObject.set(x, "max_query_terms", value.asInstanceOf[js.Any])
    
    inline def setMax_query_termsUndefined: Self = StObject.set(x, "max_query_terms", js.undefined)
    
    inline def setMax_word_length(value: integer): Self = StObject.set(x, "max_word_length", value.asInstanceOf[js.Any])
    
    inline def setMax_word_lengthUndefined: Self = StObject.set(x, "max_word_length", js.undefined)
    
    inline def setMin_doc_freq(value: integer): Self = StObject.set(x, "min_doc_freq", value.asInstanceOf[js.Any])
    
    inline def setMin_doc_freqUndefined: Self = StObject.set(x, "min_doc_freq", js.undefined)
    
    inline def setMin_term_freq(value: integer): Self = StObject.set(x, "min_term_freq", value.asInstanceOf[js.Any])
    
    inline def setMin_term_freqUndefined: Self = StObject.set(x, "min_term_freq", js.undefined)
    
    inline def setMin_word_length(value: integer): Self = StObject.set(x, "min_word_length", value.asInstanceOf[js.Any])
    
    inline def setMin_word_lengthUndefined: Self = StObject.set(x, "min_word_length", js.undefined)
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setPer_field_analyzer(value: Record[Field, String]): Self = StObject.set(x, "per_field_analyzer", value.asInstanceOf[js.Any])
    
    inline def setPer_field_analyzerUndefined: Self = StObject.set(x, "per_field_analyzer", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setStop_words(value: AnalysisStopWords): Self = StObject.set(x, "stop_words", value.asInstanceOf[js.Any])
    
    inline def setStop_wordsUndefined: Self = StObject.set(x, "stop_words", js.undefined)
    
    inline def setStop_wordsVarargs(value: String*): Self = StObject.set(x, "stop_words", js.Array(value*))
    
    inline def setUnlike(value: QueryDslLike | js.Array[QueryDslLike]): Self = StObject.set(x, "unlike", value.asInstanceOf[js.Any])
    
    inline def setUnlikeUndefined: Self = StObject.set(x, "unlike", js.undefined)
    
    inline def setUnlikeVarargs(value: QueryDslLike*): Self = StObject.set(x, "unlike", js.Array(value*))
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersion_type(value: VersionType): Self = StObject.set(x, "version_type", value.asInstanceOf[js.Any])
    
    inline def setVersion_typeUndefined: Self = StObject.set(x, "version_type", js.undefined)
  }
}
