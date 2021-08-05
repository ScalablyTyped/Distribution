package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanClearBrowserCookiesResponse extends StObject {
  
  /**
    * True if browser cookies can be cleared.
    */
  var result: Boolean
}
object CanClearBrowserCookiesResponse {
  
  inline def apply(result: Boolean): CanClearBrowserCookiesResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanClearBrowserCookiesResponse]
  }
  
  extension [Self <: CanClearBrowserCookiesResponse](x: Self) {
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
