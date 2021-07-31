package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCookieRequest extends StObject {
  
  /**
    * Name of the cookie to remove.
    */
  var cookieName: String
  
  /**
    * URL to match cooke domain and path.
    */
  var url: String
}
object DeleteCookieRequest {
  
  @scala.inline
  def apply(cookieName: String, url: String): DeleteCookieRequest = {
    val __obj = js.Dynamic.literal(cookieName = cookieName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCookieRequest]
  }
  
  @scala.inline
  implicit class DeleteCookieRequestMutableBuilder[Self <: DeleteCookieRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
