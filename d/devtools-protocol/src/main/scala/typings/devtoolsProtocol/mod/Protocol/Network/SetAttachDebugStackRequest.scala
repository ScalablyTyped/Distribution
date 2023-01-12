package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAttachDebugStackRequest extends StObject {
  
  /**
    * Whether to attach a page script stack for debugging purpose.
    */
  var enabled: Boolean
}
object SetAttachDebugStackRequest {
  
  inline def apply(enabled: Boolean): SetAttachDebugStackRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttachDebugStackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetAttachDebugStackRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
