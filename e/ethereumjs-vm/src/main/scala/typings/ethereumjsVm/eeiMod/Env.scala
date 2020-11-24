package typings.ethereumjsVm.eeiMod

import typings.bnJs.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends js.Object {
  
  var address: Buffer = js.native
  
  var block: js.Any = js.native
  
  var blockchain: typings.ethereumjsBlockchain.mod.default = js.native
  
  var callData: Buffer = js.native
  
  var callValue: ^ = js.native
  
  var caller: Buffer = js.native
  
  var code: Buffer = js.native
  
  var codeAddress: Buffer = js.native
  
  var contract: typings.ethereumjsAccount.mod.default = js.native
  
  var depth: Double = js.native
  
  var gasPrice: Buffer = js.native
  
  var isStatic: Boolean = js.native
  
  var origin: Buffer = js.native
}
object Env {
  
  @scala.inline
  def apply(
    address: Buffer,
    block: js.Any,
    blockchain: typings.ethereumjsBlockchain.mod.default,
    callData: Buffer,
    callValue: ^,
    caller: Buffer,
    code: Buffer,
    codeAddress: Buffer,
    contract: typings.ethereumjsAccount.mod.default,
    depth: Double,
    gasPrice: Buffer,
    isStatic: Boolean,
    origin: Buffer
  ): Env = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], blockchain = blockchain.asInstanceOf[js.Any], callData = callData.asInstanceOf[js.Any], callValue = callValue.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], codeAddress = codeAddress.asInstanceOf[js.Any], contract = contract.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit class EnvOps[Self <: Env] (val x: Self) extends AnyVal {
    
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
    def setBlock(value: js.Any): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockchain(value: typings.ethereumjsBlockchain.mod.default): Self = this.set("blockchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallData(value: Buffer): Self = this.set("callData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallValue(value: ^): Self = this.set("callValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaller(value: Buffer): Self = this.set("caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Buffer): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeAddress(value: Buffer): Self = this.set("codeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContract(value: typings.ethereumjsAccount.mod.default): Self = this.set("contract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasPrice(value: Buffer): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Buffer): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
