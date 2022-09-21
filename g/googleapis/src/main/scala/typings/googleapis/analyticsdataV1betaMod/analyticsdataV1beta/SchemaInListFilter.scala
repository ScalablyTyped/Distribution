package typings.googleapis.analyticsdataV1betaMod.analyticsdataV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInListFilter extends StObject {
  
  /**
    * If true, the string value is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The list of string values. Must be non-empty.
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaInListFilter {
  
  inline def apply(): SchemaInListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInListFilter]
  }
  
  extension [Self <: SchemaInListFilter](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
