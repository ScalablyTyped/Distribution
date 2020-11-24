package typings.ethereumjsVm.runCodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunCodeOpts extends js.Object {
  
  /**
    * The address of the account that is executing this code. The address should be a `Buffer` of bytes. Defaults to `0`
    */
  var address: js.UndefOr[Buffer] = js.native
  
  /**
    * The [`Block`](https://github.com/ethereumjs/ethereumjs-block) the `tx` belongs to. If omitted a blank block will be used
    */
  var block: js.UndefOr[js.Any] = js.native
  
  /**
    * The address that ran this code. The address should be a `Buffer` of 20 bits. Defaults to `0`
    */
  var caller: js.UndefOr[Buffer] = js.native
  
  /**
    * The EVM code to run
    */
  var code: js.UndefOr[Buffer] = js.native
  
  /**
    * The input data
    */
  var data: js.UndefOr[Buffer] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var evm: js.UndefOr[typings.ethereumjsVm.evmMod.default] = js.native
  
  /**
    * Gas limit
    */
  var gasLimit: js.UndefOr[Buffer] = js.native
  
  var gasPrice: js.UndefOr[Buffer] = js.native
  
  var isStatic: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[typings.ethereumjsVm.messageMod.default] = js.native
  
  /**
    * The address where the call originated from. The address should be a `Buffer` of 20 bits. Defaults to `0`
    */
  var origin: js.UndefOr[Buffer] = js.native
  
  /**
    * The initial program counter. Defaults to `0`
    */
  var pc: js.UndefOr[Double] = js.native
  
  var selfdestruct: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var txContext: js.UndefOr[typings.ethereumjsVm.txContextMod.default] = js.native
  
  /**
    * The value in ether that is being sent to `opt.address`. Defaults to `0`
    */
  var value: js.UndefOr[Buffer] = js.native
}
object RunCodeOpts {
  
  @scala.inline
  def apply(): RunCodeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunCodeOpts]
  }
  
  @scala.inline
  implicit class RunCodeOptsOps[Self <: RunCodeOpts] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Buffer): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBlock(value: js.Any): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setCaller(value: Buffer): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaller: Self = this.set("caller", js.undefined)
    
    @scala.inline
    def setCode(value: Buffer): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setEvm(value: typings.ethereumjsVm.evmMod.default): Self = this.set("evm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvm: Self = this.set("evm", js.undefined)
    
    @scala.inline
    def setGasLimit(value: Buffer): Self = this.set("gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasLimit: Self = this.set("gasLimit", js.undefined)
    
    @scala.inline
    def setGasPrice(value: Buffer): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStatic: Self = this.set("isStatic", js.undefined)
    
    @scala.inline
    def setMessage(value: typings.ethereumjsVm.messageMod.default): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOrigin(value: Buffer): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPc(value: Double): Self = this.set("pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePc: Self = this.set("pc", js.undefined)
    
    @scala.inline
    def setSelfdestruct(value: StringDictionary[Boolean]): Self = this.set("selfdestruct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfdestruct: Self = this.set("selfdestruct", js.undefined)
    
    @scala.inline
    def setTxContext(value: typings.ethereumjsVm.txContextMod.default): Self = this.set("txContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxContext: Self = this.set("txContext", js.undefined)
    
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
