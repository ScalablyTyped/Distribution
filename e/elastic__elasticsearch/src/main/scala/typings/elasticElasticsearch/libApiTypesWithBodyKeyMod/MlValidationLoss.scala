package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlValidationLoss extends StObject {
  
  var fold_values: js.Array[String]
  
  var loss_type: String
}
object MlValidationLoss {
  
  inline def apply(fold_values: js.Array[String], loss_type: String): MlValidationLoss = {
    val __obj = js.Dynamic.literal(fold_values = fold_values.asInstanceOf[js.Any], loss_type = loss_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlValidationLoss]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlValidationLoss] (val x: Self) extends AnyVal {
    
    inline def setFold_values(value: js.Array[String]): Self = StObject.set(x, "fold_values", value.asInstanceOf[js.Any])
    
    inline def setFold_valuesVarargs(value: String*): Self = StObject.set(x, "fold_values", js.Array(value*))
    
    inline def setLoss_type(value: String): Self = StObject.set(x, "loss_type", value.asInstanceOf[js.Any])
  }
}
