package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAttachDebugHeaderRequest extends StObject {
  
  /**
    * Whether to send a debug header.
    */
  var enabled: Boolean
}
object SetAttachDebugHeaderRequest {
  
  inline def apply(enabled: Boolean): SetAttachDebugHeaderRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttachDebugHeaderRequest]
  }
  
  extension [Self <: SetAttachDebugHeaderRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
