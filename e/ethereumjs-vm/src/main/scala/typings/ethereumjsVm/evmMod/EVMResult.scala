package typings.ethereumjsVm.evmMod

import typings.bnJs.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EVMResult extends js.Object {
  
  /**
    * Address of created account durint transaction, if any
    */
  var createdAddress: js.UndefOr[Buffer] = js.native
  
  /**
    * Contains the results from running the code, if any, as described in [[runCode]]
    */
  var execResult: ExecResult = js.native
  
  /**
    * Amount of gas used by the transaction
    */
  var gasUsed: ^ = js.native
}
object EVMResult {
  
  @scala.inline
  def apply(execResult: ExecResult, gasUsed: ^): EVMResult = {
    val __obj = js.Dynamic.literal(execResult = execResult.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[EVMResult]
  }
  
  @scala.inline
  implicit class EVMResultOps[Self <: EVMResult] (val x: Self) extends AnyVal {
    
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
    def setExecResult(value: ExecResult): Self = this.set("execResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: ^): Self = this.set("gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAddress(value: Buffer): Self = this.set("createdAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAddress: Self = this.set("createdAddress", js.undefined)
  }
}
