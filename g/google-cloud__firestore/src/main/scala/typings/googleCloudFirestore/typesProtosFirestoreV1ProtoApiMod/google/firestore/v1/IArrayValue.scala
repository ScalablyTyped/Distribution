package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ArrayValue. */
trait IArrayValue extends StObject {
  
  /** ArrayValue values */
  var values: js.UndefOr[js.Array[IValue] | Null] = js.undefined
}
object IArrayValue {
  
  inline def apply(): IArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArrayValue]
  }
  
  extension [Self <: IArrayValue](x: Self) {
    
    inline def setValues(value: js.Array[IValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: IValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
