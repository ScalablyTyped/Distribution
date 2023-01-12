package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslMatchBoolPrefixQuery
  extends StObject
     with QueryDslQueryBase {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var fuzziness: js.UndefOr[Fuzziness] = js.undefined
  
  var fuzzy_rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var fuzzy_transpositions: js.UndefOr[Boolean] = js.undefined
  
  var max_expansions: js.UndefOr[integer] = js.undefined
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var operator: js.UndefOr[QueryDslOperator] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var query: String
}
object QueryDslMatchBoolPrefixQuery {
  
  inline def apply(query: String): QueryDslMatchBoolPrefixQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslMatchBoolPrefixQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslMatchBoolPrefixQuery] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setFuzziness(value: Fuzziness): Self = StObject.set(x, "fuzziness", value.asInstanceOf[js.Any])
    
    inline def setFuzzinessUndefined: Self = StObject.set(x, "fuzziness", js.undefined)
    
    inline def setFuzzy_rewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "fuzzy_rewrite", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_rewriteUndefined: Self = StObject.set(x, "fuzzy_rewrite", js.undefined)
    
    inline def setFuzzy_transpositions(value: Boolean): Self = StObject.set(x, "fuzzy_transpositions", value.asInstanceOf[js.Any])
    
    inline def setFuzzy_transpositionsUndefined: Self = StObject.set(x, "fuzzy_transpositions", js.undefined)
    
    inline def setMax_expansions(value: integer): Self = StObject.set(x, "max_expansions", value.asInstanceOf[js.Any])
    
    inline def setMax_expansionsUndefined: Self = StObject.set(x, "max_expansions", js.undefined)
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setOperator(value: QueryDslOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
