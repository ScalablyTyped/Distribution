package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartFrameRequest extends StObject {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId
}
object RestartFrameRequest {
  
  inline def apply(callFrameId: CallFrameId): RestartFrameRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameRequest]
  }
  
  extension [Self <: RestartFrameRequest](x: Self) {
    
    inline def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
  }
}
