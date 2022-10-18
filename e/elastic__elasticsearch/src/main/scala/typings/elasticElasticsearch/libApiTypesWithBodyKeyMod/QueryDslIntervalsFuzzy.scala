package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsFuzzy extends StObject {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var fuzziness: js.UndefOr[Fuzziness] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var term: String
  
  var transpositions: js.UndefOr[Boolean] = js.undefined
  
  var use_field: js.UndefOr[Field] = js.undefined
}
object QueryDslIntervalsFuzzy {
  
  inline def apply(term: String): QueryDslIntervalsFuzzy = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslIntervalsFuzzy]
  }
  
  extension [Self <: QueryDslIntervalsFuzzy](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setFuzziness(value: Fuzziness): Self = StObject.set(x, "fuzziness", value.asInstanceOf[js.Any])
    
    inline def setFuzzinessUndefined: Self = StObject.set(x, "fuzziness", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTranspositions(value: Boolean): Self = StObject.set(x, "transpositions", value.asInstanceOf[js.Any])
    
    inline def setTranspositionsUndefined: Self = StObject.set(x, "transpositions", js.undefined)
    
    inline def setUse_field(value: Field): Self = StObject.set(x, "use_field", value.asInstanceOf[js.Any])
    
    inline def setUse_fieldUndefined: Self = StObject.set(x, "use_field", js.undefined)
  }
}
