package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTotalFeatureImportanceClass extends StObject {
  
  var class_name: Name
  
  var importance: js.Array[MlTotalFeatureImportanceStatistics]
}
object MlTotalFeatureImportanceClass {
  
  inline def apply(class_name: Name, importance: js.Array[MlTotalFeatureImportanceStatistics]): MlTotalFeatureImportanceClass = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTotalFeatureImportanceClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTotalFeatureImportanceClass] (val x: Self) extends AnyVal {
    
    inline def setClass_name(value: Name): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: js.Array[MlTotalFeatureImportanceStatistics]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceVarargs(value: MlTotalFeatureImportanceStatistics*): Self = StObject.set(x, "importance", js.Array(value*))
  }
}
