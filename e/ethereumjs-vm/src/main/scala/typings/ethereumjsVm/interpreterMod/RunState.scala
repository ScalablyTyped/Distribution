package typings.ethereumjsVm.interpreterMod

import typings.bnJs.mod.^
import typings.ethereumjsVm.stateMod.StateManager
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunState extends js.Object {
  
  var _common: typings.ethereumjsCommon.mod.default = js.native
  
  var code: Buffer = js.native
  
  var eei: typings.ethereumjsVm.eeiMod.default = js.native
  
  var highestMemCost: ^ = js.native
  
  var memory: typings.ethereumjsVm.memoryMod.default = js.native
  
  var memoryWordCount: ^ = js.native
  
  var opCode: Double = js.native
  
  var programCounter: Double = js.native
  
  var stack: typings.ethereumjsVm.stackMod.default = js.native
  
  var stateManager: StateManager = js.native
  
  var validJumps: js.Array[Double] = js.native
}
object RunState {
  
  @scala.inline
  def apply(
    _common: typings.ethereumjsCommon.mod.default,
    code: Buffer,
    eei: typings.ethereumjsVm.eeiMod.default,
    highestMemCost: ^,
    memory: typings.ethereumjsVm.memoryMod.default,
    memoryWordCount: ^,
    opCode: Double,
    programCounter: Double,
    stack: typings.ethereumjsVm.stackMod.default,
    stateManager: StateManager,
    validJumps: js.Array[Double]
  ): RunState = {
    val __obj = js.Dynamic.literal(_common = _common.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], eei = eei.asInstanceOf[js.Any], highestMemCost = highestMemCost.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryWordCount = memoryWordCount.asInstanceOf[js.Any], opCode = opCode.asInstanceOf[js.Any], programCounter = programCounter.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stateManager = stateManager.asInstanceOf[js.Any], validJumps = validJumps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunState]
  }
  
  @scala.inline
  implicit class RunStateOps[Self <: RunState] (val x: Self) extends AnyVal {
    
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
    def set_common(value: typings.ethereumjsCommon.mod.default): Self = this.set("_common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: Buffer): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEei(value: typings.ethereumjsVm.eeiMod.default): Self = this.set("eei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighestMemCost(value: ^): Self = this.set("highestMemCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: typings.ethereumjsVm.memoryMod.default): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryWordCount(value: ^): Self = this.set("memoryWordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpCode(value: Double): Self = this.set("opCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramCounter(value: Double): Self = this.set("programCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: typings.ethereumjsVm.stackMod.default): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateManager(value: StateManager): Self = this.set("stateManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidJumpsVarargs(value: Double*): Self = this.set("validJumps", js.Array(value :_*))
    
    @scala.inline
    def setValidJumps(value: js.Array[Double]): Self = this.set("validJumps", value.asInstanceOf[js.Any])
  }
}
