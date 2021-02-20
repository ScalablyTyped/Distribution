package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessTokenResponse extends StObject {
  
  var res: js.UndefOr[GaxiosResponse[_] | Null] = js.native
  
  var token: js.UndefOr[String | Null] = js.native
}
object GetAccessTokenResponse {
  
  @scala.inline
  def apply(): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
  
  @scala.inline
  implicit class GetAccessTokenResponseMutableBuilder[Self <: GetAccessTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: GaxiosResponse[_]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResNull: Self = StObject.set(x, "res", null)
    
    @scala.inline
    def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNull: Self = StObject.set(x, "token", null)
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
