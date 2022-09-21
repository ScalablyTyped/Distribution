package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import typings.googleAuthLibrary.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshAccessTokenResponse extends StObject {
  
  var credentials: Credentials
  
  var res: GaxiosResponse[Any] | Null
}
object RefreshAccessTokenResponse {
  
  inline def apply(credentials: Credentials): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], res = null)
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
  
  extension [Self <: RefreshAccessTokenResponse](x: Self) {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setRes(value: GaxiosResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
  }
}
