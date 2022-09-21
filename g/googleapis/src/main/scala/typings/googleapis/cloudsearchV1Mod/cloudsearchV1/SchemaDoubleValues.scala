package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleValues extends StObject {
  
  var values: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaDoubleValues {
  
  inline def apply(): SchemaDoubleValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleValues]
  }
  
  extension [Self <: SchemaDoubleValues](x: Self) {
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
