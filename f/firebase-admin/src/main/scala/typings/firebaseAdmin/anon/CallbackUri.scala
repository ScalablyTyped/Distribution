package typings.firebaseAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackUri extends StObject {
  
  var callbackUri: js.UndefOr[String] = js.undefined
  
  var spEntityId: js.UndefOr[String] = js.undefined
}
object CallbackUri {
  
  inline def apply(): CallbackUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackUri]
  }
  
  extension [Self <: CallbackUri](x: Self) {
    
    inline def setCallbackUri(value: String): Self = StObject.set(x, "callbackUri", value.asInstanceOf[js.Any])
    
    inline def setCallbackUriUndefined: Self = StObject.set(x, "callbackUri", js.undefined)
    
    inline def setSpEntityId(value: String): Self = StObject.set(x, "spEntityId", value.asInstanceOf[js.Any])
    
    inline def setSpEntityIdUndefined: Self = StObject.set(x, "spEntityId", js.undefined)
  }
}
