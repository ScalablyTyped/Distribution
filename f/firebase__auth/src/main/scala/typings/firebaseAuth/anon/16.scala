package typings.firebaseAuth.anon

import typings.firebaseAuth.distEsm5SrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
}
object `16` {
  
  inline def apply(_serverResponse: IdTokenMfaResponse): `16` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
