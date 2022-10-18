package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTopClassEntry extends StObject {
  
  var class_name: String
  
  var class_probability: double
  
  var class_score: double
}
object MlTopClassEntry {
  
  inline def apply(class_name: String, class_probability: double, class_score: double): MlTopClassEntry = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], class_probability = class_probability.asInstanceOf[js.Any], class_score = class_score.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTopClassEntry]
  }
  
  extension [Self <: MlTopClassEntry](x: Self) {
    
    inline def setClass_name(value: String): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    inline def setClass_probability(value: double): Self = StObject.set(x, "class_probability", value.asInstanceOf[js.Any])
    
    inline def setClass_score(value: double): Self = StObject.set(x, "class_score", value.asInstanceOf[js.Any])
  }
}
