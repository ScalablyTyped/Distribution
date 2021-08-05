package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.TimeDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteWasmEvaluatorRequest extends StObject {
  
  /**
    * WebAssembly call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId
  
  /**
    * Code of the evaluator module.
    */
  var evaluator: String
  
  /**
    * Terminate execution after timing out (number of milliseconds).
    */
  var timeout: js.UndefOr[TimeDelta] = js.undefined
}
object ExecuteWasmEvaluatorRequest {
  
  inline def apply(callFrameId: CallFrameId, evaluator: String): ExecuteWasmEvaluatorRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], evaluator = evaluator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteWasmEvaluatorRequest]
  }
  
  extension [Self <: ExecuteWasmEvaluatorRequest](x: Self) {
    
    inline def setCallFrameId(value: CallFrameId): Self = StObject.set(x, "callFrameId", value.asInstanceOf[js.Any])
    
    inline def setEvaluator(value: String): Self = StObject.set(x, "evaluator", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TimeDelta): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
