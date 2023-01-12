package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2Client extends StObject {
  
  def getAccessToken(): js.Promise[GetAccessTokenResponse]
}
object OAuth2Client {
  
  inline def apply(getAccessToken: () => js.Promise[GetAccessTokenResponse]): OAuth2Client = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
    __obj.asInstanceOf[OAuth2Client]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuth2Client] (val x: Self) extends AnyVal {
    
    inline def setGetAccessToken(value: () => js.Promise[GetAccessTokenResponse]): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction0(value))
  }
}
