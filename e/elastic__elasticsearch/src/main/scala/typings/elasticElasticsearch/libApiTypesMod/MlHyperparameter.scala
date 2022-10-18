package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlHyperparameter extends StObject {
  
  var absolute_importance: js.UndefOr[double] = js.undefined
  
  var name: Name
  
  var relative_importance: js.UndefOr[double] = js.undefined
  
  var supplied: Boolean
  
  var value: double
}
object MlHyperparameter {
  
  inline def apply(name: Name, supplied: Boolean, value: double): MlHyperparameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supplied = supplied.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlHyperparameter]
  }
  
  extension [Self <: MlHyperparameter](x: Self) {
    
    inline def setAbsolute_importance(value: double): Self = StObject.set(x, "absolute_importance", value.asInstanceOf[js.Any])
    
    inline def setAbsolute_importanceUndefined: Self = StObject.set(x, "absolute_importance", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelative_importance(value: double): Self = StObject.set(x, "relative_importance", value.asInstanceOf[js.Any])
    
    inline def setRelative_importanceUndefined: Self = StObject.set(x, "relative_importance", js.undefined)
    
    inline def setSupplied(value: Boolean): Self = StObject.set(x, "supplied", value.asInstanceOf[js.Any])
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
