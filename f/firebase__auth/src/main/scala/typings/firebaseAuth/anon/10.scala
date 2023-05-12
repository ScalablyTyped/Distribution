package typings.firebaseAuth.anon

import typings.firebaseAuth.distEsm2017SrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
}
object `10` {
  
  inline def apply(_serverResponse: IdTokenMfaResponse): `10` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
