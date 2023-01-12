package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslMatchPhraseQuery
  extends StObject
     with QueryDslQueryBase {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var query: String
  
  var slop: js.UndefOr[integer] = js.undefined
  
  var zero_terms_query: js.UndefOr[QueryDslZeroTermsQuery] = js.undefined
}
object QueryDslMatchPhraseQuery {
  
  inline def apply(query: String): QueryDslMatchPhraseQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslMatchPhraseQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslMatchPhraseQuery] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSlop(value: integer): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
    
    inline def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
    
    inline def setZero_terms_query(value: QueryDslZeroTermsQuery): Self = StObject.set(x, "zero_terms_query", value.asInstanceOf[js.Any])
    
    inline def setZero_terms_queryUndefined: Self = StObject.set(x, "zero_terms_query", js.undefined)
  }
}
