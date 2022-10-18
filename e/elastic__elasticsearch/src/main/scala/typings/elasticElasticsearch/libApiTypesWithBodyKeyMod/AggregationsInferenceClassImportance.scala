package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsInferenceClassImportance extends StObject {
  
  var class_name: String
  
  var importance: double
}
object AggregationsInferenceClassImportance {
  
  inline def apply(class_name: String, importance: double): AggregationsInferenceClassImportance = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsInferenceClassImportance]
  }
  
  extension [Self <: AggregationsInferenceClassImportance](x: Self) {
    
    inline def setClass_name(value: String): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
  }
}
