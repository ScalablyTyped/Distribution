package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromePolicyV1AdditionalTargetKeyName extends StObject {
  
  /**
    * Key name.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key description.
    */
  var keyDescription: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromePolicyV1AdditionalTargetKeyName {
  
  inline def apply(): SchemaGoogleChromePolicyV1AdditionalTargetKeyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromePolicyV1AdditionalTargetKeyName]
  }
  
  extension [Self <: SchemaGoogleChromePolicyV1AdditionalTargetKeyName](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyDescription(value: String): Self = StObject.set(x, "keyDescription", value.asInstanceOf[js.Any])
    
    inline def setKeyDescriptionNull: Self = StObject.set(x, "keyDescription", null)
    
    inline def setKeyDescriptionUndefined: Self = StObject.set(x, "keyDescription", js.undefined)
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
