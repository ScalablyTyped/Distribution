package typings.firebaseAuth.anon

import typings.firebaseAuth.distEsm2017SrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameAppName extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distEsm2017SrcModelAuthMod.AppName
}
object AppNameAppName {
  
  inline def apply(
    _serverResponse: IdTokenMfaResponse,
    appName: typings.firebaseAuth.distEsm2017SrcModelAuthMod.AppName
  ): AppNameAppName = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameAppName]
  }
  
  extension [Self <: AppNameAppName](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distEsm2017SrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
