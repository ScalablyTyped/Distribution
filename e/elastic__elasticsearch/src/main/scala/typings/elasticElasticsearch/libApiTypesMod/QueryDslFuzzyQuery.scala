package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslFuzzyQuery
  extends StObject
     with QueryDslQueryBase {
  
  var fuzziness: js.UndefOr[Fuzziness] = js.undefined
  
  var max_expansions: js.UndefOr[integer] = js.undefined
  
  var prefix_length: js.UndefOr[integer] = js.undefined
  
  var rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var transpositions: js.UndefOr[Boolean] = js.undefined
  
  var value: String | double | Boolean
}
object QueryDslFuzzyQuery {
  
  inline def apply(value: String | double | Boolean): QueryDslFuzzyQuery = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslFuzzyQuery]
  }
  
  extension [Self <: QueryDslFuzzyQuery](x: Self) {
    
    inline def setFuzziness(value: Fuzziness): Self = StObject.set(x, "fuzziness", value.asInstanceOf[js.Any])
    
    inline def setFuzzinessUndefined: Self = StObject.set(x, "fuzziness", js.undefined)
    
    inline def setMax_expansions(value: integer): Self = StObject.set(x, "max_expansions", value.asInstanceOf[js.Any])
    
    inline def setMax_expansionsUndefined: Self = StObject.set(x, "max_expansions", js.undefined)
    
    inline def setPrefix_length(value: integer): Self = StObject.set(x, "prefix_length", value.asInstanceOf[js.Any])
    
    inline def setPrefix_lengthUndefined: Self = StObject.set(x, "prefix_length", js.undefined)
    
    inline def setRewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setTranspositions(value: Boolean): Self = StObject.set(x, "transpositions", value.asInstanceOf[js.Any])
    
    inline def setTranspositionsUndefined: Self = StObject.set(x, "transpositions", js.undefined)
    
    inline def setValue(value: String | double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
