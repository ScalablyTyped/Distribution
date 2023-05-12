package typings.firebaseAuth.anon

import typings.firebaseAuth.distNodeSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distNodeSrcModelAuthMod.AppName
}
object `27` {
  
  inline def apply(_serverResponse: IdTokenMfaResponse, appName: typings.firebaseAuth.distNodeSrcModelAuthMod.AppName): `27` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `27`] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distNodeSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
