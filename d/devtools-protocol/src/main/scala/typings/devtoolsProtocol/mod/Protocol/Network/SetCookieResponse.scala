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
  
  @scala.inline
  def apply(success: Boolean): SetCookieResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookieResponse]
  }
  
  @scala.inline
  implicit class SetCookieResponseMutableBuilder[Self <: SetCookieResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
