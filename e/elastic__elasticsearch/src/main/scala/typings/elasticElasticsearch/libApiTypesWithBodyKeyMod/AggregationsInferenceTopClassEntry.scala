package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsInferenceTopClassEntry extends StObject {
  
  var class_name: FieldValue
  
  var class_probability: double
  
  var class_score: double
}
object AggregationsInferenceTopClassEntry {
  
  inline def apply(class_probability: double, class_score: double): AggregationsInferenceTopClassEntry = {
    val __obj = js.Dynamic.literal(class_probability = class_probability.asInstanceOf[js.Any], class_score = class_score.asInstanceOf[js.Any], class_name = null)
    __obj.asInstanceOf[AggregationsInferenceTopClassEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationsInferenceTopClassEntry] (val x: Self) extends AnyVal {
    
    inline def setClass_name(value: FieldValue): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    inline def setClass_nameNull: Self = StObject.set(x, "class_name", null)
    
    inline def setClass_probability(value: double): Self = StObject.set(x, "class_probability", value.asInstanceOf[js.Any])
    
    inline def setClass_score(value: double): Self = StObject.set(x, "class_score", value.asInstanceOf[js.Any])
  }
}
