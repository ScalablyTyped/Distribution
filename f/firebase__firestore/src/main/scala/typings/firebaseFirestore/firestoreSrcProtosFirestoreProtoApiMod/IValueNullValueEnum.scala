package typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueNullValueEnum extends StObject {
  
  var NULL_VALUE: ValueNullValue
  
  def values(): js.Array[ValueNullValue]
}
object IValueNullValueEnum {
  
  inline def apply(NULL_VALUE: ValueNullValue, values: () => js.Array[ValueNullValue]): IValueNullValueEnum = {
    val __obj = js.Dynamic.literal(NULL_VALUE = NULL_VALUE.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IValueNullValueEnum]
  }
  
  extension [Self <: IValueNullValueEnum](x: Self) {
    
    inline def setNULL_VALUE(value: ValueNullValue): Self = StObject.set(x, "NULL_VALUE", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[ValueNullValue]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
