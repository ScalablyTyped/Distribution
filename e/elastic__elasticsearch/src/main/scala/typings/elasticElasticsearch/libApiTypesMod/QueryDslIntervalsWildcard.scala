package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsWildcard extends StObject {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var pattern: String
  
  var use_field: js.UndefOr[Field] = js.undefined
}
object QueryDslIntervalsWildcard {
  
  inline def apply(pattern: String): QueryDslIntervalsWildcard = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslIntervalsWildcard]
  }
  
  extension [Self <: QueryDslIntervalsWildcard](x: Self) {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setUse_field(value: Field): Self = StObject.set(x, "use_field", value.asInstanceOf[js.Any])
    
    inline def setUse_fieldUndefined: Self = StObject.set(x, "use_field", js.undefined)
  }
}
