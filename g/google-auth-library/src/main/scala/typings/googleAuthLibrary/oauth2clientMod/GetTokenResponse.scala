package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import typings.googleAuthLibrary.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTokenResponse extends StObject {
  
  var res: GaxiosResponse[js.Any] | Null
  
  var tokens: Credentials
}
object GetTokenResponse {
  
  @scala.inline
  def apply(tokens: Credentials): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any], res = null)
    __obj.asInstanceOf[GetTokenResponse]
  }
  
  @scala.inline
  implicit class GetTokenResponseMutableBuilder[Self <: GetTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: GaxiosResponse[js.Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResNull: Self = StObject.set(x, "res", null)
    
    @scala.inline
    def setTokens(value: Credentials): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
