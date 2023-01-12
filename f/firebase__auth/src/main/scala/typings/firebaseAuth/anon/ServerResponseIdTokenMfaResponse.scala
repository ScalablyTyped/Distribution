package typings.firebaseAuth.anon

import typings.firebaseAuth.distCordovaSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerResponseIdTokenMfaResponse extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
}
object ServerResponseIdTokenMfaResponse {
  
  inline def apply(_serverResponse: IdTokenMfaResponse): ServerResponseIdTokenMfaResponse = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponseIdTokenMfaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerResponseIdTokenMfaResponse] (val x: Self) extends AnyVal {
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
