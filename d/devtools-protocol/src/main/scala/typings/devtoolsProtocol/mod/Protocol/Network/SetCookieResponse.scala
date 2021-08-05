package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCookieResponse extends StObject {
  
  /**
    * Always set to true. If an error occurs, the response indicates protocol error.
    */
  var success: Boolean
}
object SetCookieResponse {
  
  inline def apply(success: Boolean): SetCookieResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieResponse]
  }
  
  extension [Self <: SetCookieResponse](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
