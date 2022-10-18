package typings.firebaseAuth.anon

import typings.firebaseAuth.distNodeSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distNodeSrcModelAuthMod.AppName
}
object `20` {
  
  inline def apply(_serverResponse: IdTokenMfaResponse, appName: typings.firebaseAuth.distNodeSrcModelAuthMod.AppName): `20` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distNodeSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
