package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2GetKeyStringResponse extends StObject {
  
  /**
    * An encrypted and signed value of the key.
    */
  var keyString: js.UndefOr[String | Null] = js.undefined
}
object SchemaV2GetKeyStringResponse {
  
  inline def apply(): SchemaV2GetKeyStringResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2GetKeyStringResponse]
  }
  
  extension [Self <: SchemaV2GetKeyStringResponse](x: Self) {
    
    inline def setKeyString(value: String): Self = StObject.set(x, "keyString", value.asInstanceOf[js.Any])
    
    inline def setKeyStringNull: Self = StObject.set(x, "keyString", null)
    
    inline def setKeyStringUndefined: Self = StObject.set(x, "keyString", js.undefined)
  }
}
