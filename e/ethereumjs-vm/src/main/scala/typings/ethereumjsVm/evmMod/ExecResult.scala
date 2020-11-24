package typings.ethereumjsVm.evmMod

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.ethereumjsVm.exceptionsMod.VmError
import typings.ethereumjsVm.interpreterMod.RunState
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecResult extends js.Object {
  
  /**
    * Description of the exception, if any occured
    */
  var exceptionError: js.UndefOr[VmError] = js.native
  
  /**
    * Amount of gas left
    */
  var gas: js.UndefOr[^] = js.native
  
  /**
    * Total amount of gas to be refunded from all nested calls.
    */
  var gasRefund: js.UndefOr[^] = js.native
  
  /**
    * Amount of gas the code used to run
    */
  var gasUsed: ^ = js.native
  
  /**
    * Array of logs that the contract emitted
    */
  var logs: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Return value from the contract
    */
  var returnValue: Buffer = js.native
  
  var runState: js.UndefOr[RunState] = js.native
  
  /**
    * A map from the accounts that have self-destructed to the addresses to send their funds to
    */
  var selfdestruct: js.UndefOr[StringDictionary[Buffer]] = js.native
}
object ExecResult {
  
  @scala.inline
  def apply(gasUsed: ^, returnValue: Buffer): ExecResult = {
    val __obj = js.Dynamic.literal(gasUsed = gasUsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecResult]
  }
  
  @scala.inline
  implicit class ExecResultOps[Self <: ExecResult] (val x: Self) extends AnyVal {
    
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
    def setGasUsed(value: ^): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Buffer): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionError(value: VmError): Self = this.set("exceptionError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionError: Self = this.set("exceptionError", js.undefined)
    
    @scala.inline
    def setGas(value: ^): Self = this.set("gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGas: Self = this.set("gas", js.undefined)
    
    @scala.inline
    def setGasRefund(value: ^): Self = this.set("gasRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasRefund: Self = this.set("gasRefund", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: js.Any*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[_]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setRunState(value: RunState): Self = this.set("runState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunState: Self = this.set("runState", js.undefined)
    
    @scala.inline
    def setSelfdestruct(value: StringDictionary[Buffer]): Self = this.set("selfdestruct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfdestruct: Self = this.set("selfdestruct", js.undefined)
  }
}
