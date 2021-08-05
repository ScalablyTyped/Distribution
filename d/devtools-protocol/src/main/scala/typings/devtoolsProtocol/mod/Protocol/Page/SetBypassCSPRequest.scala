package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBypassCSPRequest extends StObject {
  
  /**
    * Whether to bypass page CSP.
    */
  var enabled: Boolean
}
object SetBypassCSPRequest {
  
  inline def apply(enabled: Boolean): SetBypassCSPRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBypassCSPRequest]
  }
  
  extension [Self <: SetBypassCSPRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
