package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllCookiesResponse extends StObject {
  
  /**
    * Array of cookie objects.
    */
  var cookies: js.Array[Cookie] = js.native
}
object GetAllCookiesResponse {
  
  @scala.inline
  def apply(cookies: js.Array[Cookie]): GetAllCookiesResponse = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllCookiesResponse]
  }
  
  @scala.inline
  implicit class GetAllCookiesResponseMutableBuilder[Self <: GetAllCookiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value :_*))
  }
}
