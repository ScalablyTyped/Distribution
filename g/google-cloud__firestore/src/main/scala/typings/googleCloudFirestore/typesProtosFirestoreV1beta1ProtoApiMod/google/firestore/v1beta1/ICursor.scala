package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Cursor. */
trait ICursor extends StObject {
  
  /** Cursor before */
  var before: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Cursor values */
  var values: js.UndefOr[js.Array[IValue] | Null] = js.undefined
}
object ICursor {
  
  inline def apply(): ICursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICursor]
  }
  
  extension [Self <: ICursor](x: Self) {
    
    inline def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeNull: Self = StObject.set(x, "before", null)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setValues(value: js.Array[IValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: IValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
