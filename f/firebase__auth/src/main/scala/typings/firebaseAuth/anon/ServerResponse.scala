package typings.firebaseAuth.anon

import typings.firebaseAuth.distAuthMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerResponse extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typings.firebaseAuth.distAuthMod.AppName
}
object ServerResponse {
  
  inline def apply(_serverResponse: IdTokenMfaResponse, appName: typings.firebaseAuth.distAuthMod.AppName): ServerResponse = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponse]
  }
  
  extension [Self <: ServerResponse](x: Self) {
    
    inline def setAppName(value: typings.firebaseAuth.distAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
