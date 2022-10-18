package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTokenResponse extends StObject {
  
  var res: GaxiosResponse[Any] | Null
  
  var tokens: Credentials
}
object GetTokenResponse {
  
  inline def apply(tokens: Credentials): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any], res = null)
    __obj.asInstanceOf[GetTokenResponse]
  }
  
  extension [Self <: GetTokenResponse](x: Self) {
    
    inline def setRes(value: GaxiosResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
    
    inline def setTokens(value: Credentials): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
