package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnumValuePair extends StObject {
  
  /**
    * The integer value of the EnumValuePair which must be non-negative. Optional.
    */
  var integerValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The string value of the EnumValuePair. The maximum length is 32 characters.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnumValuePair {
  
  inline def apply(): SchemaEnumValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumValuePair]
  }
  
  extension [Self <: SchemaEnumValuePair](x: Self) {
    
    inline def setIntegerValue(value: Double): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueNull: Self = StObject.set(x, "integerValue", null)
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
