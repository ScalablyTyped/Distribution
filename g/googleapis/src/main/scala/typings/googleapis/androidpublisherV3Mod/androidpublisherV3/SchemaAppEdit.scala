package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppEdit extends StObject {
  
  /**
    * Output only. The time (as seconds since Epoch) at which the edit will expire and will be no longer valid for use.
    */
  var expiryTimeSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Identifier of the edit. Can be used in subsequent API calls.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppEdit {
  
  inline def apply(): SchemaAppEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEdit]
  }
  
  extension [Self <: SchemaAppEdit](x: Self) {
    
    inline def setExpiryTimeSeconds(value: String): Self = StObject.set(x, "expiryTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeSecondsNull: Self = StObject.set(x, "expiryTimeSeconds", null)
    
    inline def setExpiryTimeSecondsUndefined: Self = StObject.set(x, "expiryTimeSeconds", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
