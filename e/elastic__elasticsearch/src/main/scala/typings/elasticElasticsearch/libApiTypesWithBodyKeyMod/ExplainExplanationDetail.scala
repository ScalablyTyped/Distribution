package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainExplanationDetail extends StObject {
  
  var description: String
  
  var details: js.UndefOr[js.Array[ExplainExplanationDetail]] = js.undefined
  
  var value: float
}
object ExplainExplanationDetail {
  
  inline def apply(description: String, value: float): ExplainExplanationDetail = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainExplanationDetail]
  }
  
  extension [Self <: ExplainExplanationDetail](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[ExplainExplanationDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: ExplainExplanationDetail*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setValue(value: float): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
