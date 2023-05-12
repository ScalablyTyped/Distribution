package typings.firebaseAuth.anon

import typings.firebaseAuth.distBrowserCjsSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameServerResponse extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AppName
}
object AppNameServerResponse {
  
  inline def apply(
    _serverResponse: IdTokenMfaResponse,
    appName: typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AppName
  ): AppNameServerResponse = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppNameServerResponse] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: typings.firebaseAuth.distBrowserCjsSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
