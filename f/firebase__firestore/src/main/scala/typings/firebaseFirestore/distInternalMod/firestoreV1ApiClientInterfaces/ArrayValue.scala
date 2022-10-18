package typings.firebaseFirestore.distInternalMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayValue extends StObject {
  
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}
object ArrayValue {
  
  inline def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  
  extension [Self <: ArrayValue](x: Self) {
    
    inline def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
