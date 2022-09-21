package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.StepInto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartFrameRequest extends StObject {
  
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId
  
  /**
    * The `mode` parameter must be present and set to 'StepInto', otherwise
    * `restartFrame` will error out. (RestartFrameRequestMode enum)
    */
  var mode: js.UndefOr[StepInto] = js.undefined
}
object RestartFrameRequest {
  
  inline def apply(callFrameId: CallFrameId): RestartFrameRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameRequest]
  }
  
  extension [Self <: RestartFrameRequest](x: Self) {
    
    inline def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
    inline def setMode(value: StepInto): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
