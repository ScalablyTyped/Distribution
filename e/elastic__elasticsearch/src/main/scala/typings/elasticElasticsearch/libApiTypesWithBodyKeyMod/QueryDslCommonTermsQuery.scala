package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslCommonTermsQuery
  extends StObject
     with QueryDslQueryBase {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var cutoff_frequency: js.UndefOr[double] = js.undefined
  
  var high_freq_operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var low_freq_operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var query: String
}
object QueryDslCommonTermsQuery {
  
  inline def apply(query: String): QueryDslCommonTermsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslCommonTermsQuery]
  }
  
  extension [Self <: QueryDslCommonTermsQuery](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setCutoff_frequency(value: double): Self = StObject.set(x, "cutoff_frequency", value.asInstanceOf[js.Any])
    
    inline def setCutoff_frequencyUndefined: Self = StObject.set(x, "cutoff_frequency", js.undefined)
    
    inline def setHigh_freq_operator(value: QueryDslOperator): Self = StObject.set(x, "high_freq_operator", value.asInstanceOf[js.Any])
    
    inline def setHigh_freq_operatorUndefined: Self = StObject.set(x, "high_freq_operator", js.undefined)
    
    inline def setLow_freq_operator(value: QueryDslOperator): Self = StObject.set(x, "low_freq_operator", value.asInstanceOf[js.Any])
    
    inline def setLow_freq_operatorUndefined: Self = StObject.set(x, "low_freq_operator", js.undefined)
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
