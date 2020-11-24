package typings.ethereumjsVm.interpreterMod

import typings.bnJs.mod.^
import typings.ethereumjsVm.opcodesMod.Opcode
import typings.ethereumjsVm.stateMod.StateManager
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpreterStep extends js.Object {
  
  var account: typings.ethereumjsAccount.mod.default = js.native
  
  var address: Buffer = js.native
  
  var codeAddress: Buffer = js.native
  
  var depth: Double = js.native
  
  var gasLeft: ^ = js.native
  
  var memory: js.Array[Double] = js.native
  
  var memoryWordCount: ^ = js.native
  
  var opcode: Opcode = js.native
  
  var pc: Double = js.native
  
  var stack: js.Array[^] = js.native
  
  var stateManager: StateManager = js.native
}
object InterpreterStep {
  
  @scala.inline
  def apply(
    account: typings.ethereumjsAccount.mod.default,
    address: Buffer,
    codeAddress: Buffer,
    depth: Double,
    gasLeft: ^,
    memory: js.Array[Double],
    memoryWordCount: ^,
    opcode: Opcode,
    pc: Double,
    stack: js.Array[^],
    stateManager: StateManager
  ): InterpreterStep = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], codeAddress = codeAddress.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], gasLeft = gasLeft.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryWordCount = memoryWordCount.asInstanceOf[js.Any], opcode = opcode.asInstanceOf[js.Any], pc = pc.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stateManager = stateManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpreterStep]
  }
  
  @scala.inline
  implicit class InterpreterStepOps[Self <: InterpreterStep] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: typings.ethereumjsAccount.mod.default): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: Buffer): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeAddress(value: Buffer): Self = this.set("codeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasLeft(value: ^): Self = this.set("gasLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryVarargs(value: Double*): Self = this.set("memory", js.Array(value :_*))
    
    @scala.inline
    def setMemory(value: js.Array[Double]): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryWordCount(value: ^): Self = this.set("memoryWordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpcode(value: Opcode): Self = this.set("opcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPc(value: Double): Self = this.set("pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: ^ *): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[^]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateManager(value: StateManager): Self = this.set("stateManager", value.asInstanceOf[js.Any])
  }
}
