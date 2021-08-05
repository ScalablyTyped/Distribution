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
  
  inline def apply(bypass: Boolean): SetBypassServiceWorkerRequest = {
    val __obj = js.Dynamic.literal(bypass = bypass.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBypassServiceWorkerRequest]
  }
  
  extension [Self <: SetBypassServiceWorkerRequest](x: Self) {
    
    inline def setBypass(value: Boolean): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
  }
}
