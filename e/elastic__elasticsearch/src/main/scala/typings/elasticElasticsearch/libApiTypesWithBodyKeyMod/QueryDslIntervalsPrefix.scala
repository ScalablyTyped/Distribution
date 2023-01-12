package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslIntervalsPrefix extends StObject {
  
  var analyzer: js.UndefOr[String] = js.undefined
  
  var prefix: String
  
  var use_field: js.UndefOr[Field] = js.undefined
}
object QueryDslIntervalsPrefix {
  
  inline def apply(prefix: String): QueryDslIntervalsPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslIntervalsPrefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslIntervalsPrefix] (val x: Self) extends AnyVal {
    
    inline def setAnalyzer(value: String): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
    
    inline def setAnalyzerUndefined: Self = StObject.set(x, "analyzer", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setUse_field(value: Field): Self = StObject.set(x, "use_field", value.asInstanceOf[js.Any])
    
    inline def setUse_fieldUndefined: Self = StObject.set(x, "use_field", js.undefined)
  }
}
