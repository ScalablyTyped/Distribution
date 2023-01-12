package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainExplanation extends StObject {
  
  var description: String
  
  var details: js.Array[ExplainExplanationDetail]
  
  var value: float
}
object ExplainExplanation {
  
  inline def apply(description: String, details: js.Array[ExplainExplanationDetail], value: float): ExplainExplanation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainExplanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainExplanation] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[ExplainExplanationDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsVarargs(value: ExplainExplanationDetail*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setValue(value: float): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
