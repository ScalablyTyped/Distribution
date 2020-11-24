package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.TimeDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteWasmEvaluatorRequest extends js.Object {
  
  /**
    * WebAssembly call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
  
  /**
    * Code of the evaluator module.
    */
  var evaluator: String = js.native
  
  /**
    * Terminate execution after timing out (number of milliseconds).
    */
  var timeout: js.UndefOr[TimeDelta] = js.native
}
object ExecuteWasmEvaluatorRequest {
  
  @scala.inline
  def apply(callFrameId: CallFrameId, evaluator: String): ExecuteWasmEvaluatorRequest = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], evaluator = evaluator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteWasmEvaluatorRequest]
  }
  
  @scala.inline
  implicit class ExecuteWasmEvaluatorRequestOps[Self <: ExecuteWasmEvaluatorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallFrameId(value: CallFrameId): Self = this.set("callFrameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluator(value: String): Self = this.set("evaluator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: TimeDelta): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
