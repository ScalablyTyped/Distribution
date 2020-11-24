package typings.ethereumjsVm.runTxMod

import typings.bnJs.mod.^
import typings.ethereumjsVm.evmMod.EVMResult
import typings.ethereumjsVm.evmMod.ExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunTxResult extends EVMResult {
  
  /**
    * The amount of ether used by this transaction
    */
  var amountSpent: ^ = js.native
  
  /**
    * Bloom filter resulted from transaction
    */
  var bloom: typings.ethereumjsVm.bloomMod.default = js.native
  
  /**
    * The amount of gas as that was refunded during the transaction (i.e. `gasUsed = totalGasConsumed - gasRefund`)
    */
  var gasRefund: js.UndefOr[^] = js.native
}
object RunTxResult {
  
  @scala.inline
  def apply(amountSpent: ^, bloom: typings.ethereumjsVm.bloomMod.default, execResult: ExecResult, gasUsed: ^): RunTxResult = {
    val __obj = js.Dynamic.literal(amountSpent = amountSpent.asInstanceOf[js.Any], bloom = bloom.asInstanceOf[js.Any], execResult = execResult.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunTxResult]
  }
  
  @scala.inline
  implicit class RunTxResultOps[Self <: RunTxResult] (val x: Self) extends AnyVal {
    
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
    def setAmountSpent(value: ^): Self = this.set("amountSpent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBloom(value: typings.ethereumjsVm.bloomMod.default): Self = this.set("bloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasRefund(value: ^): Self = this.set("gasRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasRefund: Self = this.set("gasRefund", js.undefined)
  }
}
