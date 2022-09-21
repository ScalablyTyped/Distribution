package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListValue. */
trait IListValue extends StObject {
  
  /** ListValue values */
  var values: js.UndefOr[js.Array[IValue] | Null] = js.undefined
}
object IListValue {
  
  inline def apply(): IListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListValue]
  }
  
  extension [Self <: IListValue](x: Self) {
    
    inline def setValues(value: js.Array[IValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: IValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
