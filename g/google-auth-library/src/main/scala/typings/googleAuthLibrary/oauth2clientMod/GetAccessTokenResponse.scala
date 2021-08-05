package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessTokenResponse extends StObject {
  
  var res: js.UndefOr[GaxiosResponse[js.Any] | Null] = js.undefined
  
  var token: js.UndefOr[String | Null] = js.undefined
}
object GetAccessTokenResponse {
  
  inline def apply(): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
  
  extension [Self <: GetAccessTokenResponse](x: Self) {
    
    inline def setRes(value: GaxiosResponse[js.Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
    
    inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
