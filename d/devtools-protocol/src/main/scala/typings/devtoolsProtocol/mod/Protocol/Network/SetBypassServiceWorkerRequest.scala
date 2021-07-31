package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBypassServiceWorkerRequest extends StObject {
  
  /**
    * Bypass service worker and load from network.
    */
  var bypass: Boolean
}
object SetBypassServiceWorkerRequest {
  
  @scala.inline
  def apply(bypass: Boolean): SetBypassServiceWorkerRequest = {
    val __obj = js.Dynamic.literal(bypass = bypass.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBypassServiceWorkerRequest]
  }
  
  @scala.inline
  implicit class SetBypassServiceWorkerRequestMutableBuilder[Self <: SetBypassServiceWorkerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypass(value: Boolean): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
  }
}
