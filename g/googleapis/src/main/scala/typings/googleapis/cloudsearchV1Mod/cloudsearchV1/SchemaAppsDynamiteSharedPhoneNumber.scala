package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedPhoneNumber extends StObject {
  
  /**
    * The phone number type, e.g., work, mobile, etc.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The actual phone number.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedPhoneNumber {
  
  inline def apply(): SchemaAppsDynamiteSharedPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedPhoneNumber]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedPhoneNumber](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
