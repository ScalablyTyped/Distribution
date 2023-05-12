package typings.firebaseAuth.anon

import typings.firebaseAuth.distNodeEsmSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
}
object `22` {
  
  inline def apply(_serverResponse: IdTokenMfaResponse): `22` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `22`] (val x: Self) extends AnyVal {
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
