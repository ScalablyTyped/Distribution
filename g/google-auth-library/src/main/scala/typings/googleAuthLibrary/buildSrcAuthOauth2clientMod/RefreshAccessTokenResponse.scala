package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.buildSrcAuthCredentialsMod.Credentials
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshAccessTokenResponse] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setRes(value: GaxiosResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
  }
}
