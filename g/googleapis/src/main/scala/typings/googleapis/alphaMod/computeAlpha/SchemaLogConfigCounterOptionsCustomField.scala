package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogConfigCounterOptionsCustomField extends StObject {
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogConfigCounterOptionsCustomField {
  
  inline def apply(): SchemaLogConfigCounterOptionsCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCounterOptionsCustomField]
  }
  
  extension [Self <: SchemaLogConfigCounterOptionsCustomField](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
