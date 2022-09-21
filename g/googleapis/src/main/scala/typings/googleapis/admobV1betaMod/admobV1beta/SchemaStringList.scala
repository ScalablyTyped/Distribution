package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStringList extends StObject {
  
  /**
    * The string values.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaStringList {
  
  inline def apply(): SchemaStringList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringList]
  }
  
  extension [Self <: SchemaStringList](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
