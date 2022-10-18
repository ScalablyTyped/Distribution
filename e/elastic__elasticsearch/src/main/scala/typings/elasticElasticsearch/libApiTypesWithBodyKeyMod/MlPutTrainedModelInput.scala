package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelInput extends StObject {
  
  var field_names: Names
}
object MlPutTrainedModelInput {
  
  inline def apply(field_names: Names): MlPutTrainedModelInput = {
    val __obj = js.Dynamic.literal(field_names = field_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelInput]
  }
  
  extension [Self <: MlPutTrainedModelInput](x: Self) {
    
    inline def setField_names(value: Names): Self = StObject.set(x, "field_names", value.asInstanceOf[js.Any])
    
    inline def setField_namesVarargs(value: Name*): Self = StObject.set(x, "field_names", js.Array(value*))
  }
}
