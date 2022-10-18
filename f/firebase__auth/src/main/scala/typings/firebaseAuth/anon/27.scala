package typings.firebaseAuth.anon

import typings.firebaseAuth.distRnSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `27` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distRnSrcModelAuthMod.AppName
}
object `27` {
  
  inline def apply(_serverResponse: IdTokenMfaResponse, appName: typings.firebaseAuth.distRnSrcModelAuthMod.AppName): `27` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`27`]
  }
  
  extension [Self <: `27`](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distRnSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
