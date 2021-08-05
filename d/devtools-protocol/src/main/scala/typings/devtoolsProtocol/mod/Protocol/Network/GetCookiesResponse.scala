package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCookiesResponse extends StObject {
  
  /**
    * Array of cookie objects.
    */
  var cookies: js.Array[Cookie]
}
object GetCookiesResponse {
  
  inline def apply(cookies: js.Array[Cookie]): GetCookiesResponse = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCookiesResponse]
  }
  
  extension [Self <: GetCookiesResponse](x: Self) {
    
    inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value :_*))
  }
}
