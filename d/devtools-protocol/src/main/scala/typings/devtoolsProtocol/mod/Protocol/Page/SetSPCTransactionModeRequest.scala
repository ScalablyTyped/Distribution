package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSPCTransactionModeRequest extends StObject {
  
  var mode: AutoResponseMode
}
object SetSPCTransactionModeRequest {
  
  inline def apply(mode: AutoResponseMode): SetSPCTransactionModeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSPCTransactionModeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSPCTransactionModeRequest] (val x: Self) extends AnyVal {
    
    inline def setMode(value: AutoResponseMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
