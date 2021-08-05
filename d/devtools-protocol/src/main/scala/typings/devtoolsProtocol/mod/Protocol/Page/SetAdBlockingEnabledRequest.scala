package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAdBlockingEnabledRequest extends StObject {
  
  /**
    * Whether to block ads.
    */
  var enabled: Boolean
}
object SetAdBlockingEnabledRequest {
  
  inline def apply(enabled: Boolean): SetAdBlockingEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAdBlockingEnabledRequest]
  }
  
  extension [Self <: SetAdBlockingEnabledRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
