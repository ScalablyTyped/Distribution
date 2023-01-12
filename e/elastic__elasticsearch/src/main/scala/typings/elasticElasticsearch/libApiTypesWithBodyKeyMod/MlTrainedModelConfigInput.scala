package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelConfigInput extends StObject {
  
  var field_names: js.Array[Field]
}
object MlTrainedModelConfigInput {
  
  inline def apply(field_names: js.Array[Field]): MlTrainedModelConfigInput = {
    val __obj = js.Dynamic.literal(field_names = field_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlTrainedModelConfigInput] (val x: Self) extends AnyVal {
    
    inline def setField_names(value: js.Array[Field]): Self = StObject.set(x, "field_names", value.asInstanceOf[js.Any])
    
    inline def setField_namesVarargs(value: Field*): Self = StObject.set(x, "field_names", js.Array(value*))
  }
}
