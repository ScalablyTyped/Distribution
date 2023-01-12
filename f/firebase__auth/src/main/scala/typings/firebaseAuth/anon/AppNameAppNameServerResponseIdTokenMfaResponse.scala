package typings.firebaseAuth.anon

import typings.firebaseAuth.distEsm5SrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameAppNameServerResponseIdTokenMfaResponse extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distEsm5SrcModelAuthMod.AppName
}
object AppNameAppNameServerResponseIdTokenMfaResponse {
  
  inline def apply(_serverResponse: IdTokenMfaResponse, appName: typings.firebaseAuth.distEsm5SrcModelAuthMod.AppName): AppNameAppNameServerResponseIdTokenMfaResponse = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameAppNameServerResponseIdTokenMfaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppNameAppNameServerResponseIdTokenMfaResponse] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distEsm5SrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
