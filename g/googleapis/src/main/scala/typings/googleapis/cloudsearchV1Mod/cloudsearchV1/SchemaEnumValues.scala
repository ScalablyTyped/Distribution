package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnumValues extends StObject {
  
  /**
    * The maximum allowable length for string values is 32 characters.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEnumValues {
  
  inline def apply(): SchemaEnumValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumValues]
  }
  
  extension [Self <: SchemaEnumValues](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
