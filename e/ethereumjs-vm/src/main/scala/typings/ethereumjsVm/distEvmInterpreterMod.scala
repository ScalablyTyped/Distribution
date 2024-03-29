package typings.ethereumjsVm

import typings.bnJs.mod.^
import typings.ethereumjsVm.distEvmOpFnsMod.OpHandler
import typings.ethereumjsVm.distEvmOpcodesMod.Opcode
import typings.ethereumjsVm.distExceptionsMod.VmError
import typings.ethereumjsVm.distStateMod.StateManager
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmInterpreterMod {
  
  @JSImport("ethereumjs-vm/dist/evm/interpreter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Interpreter {
    def this(vm: Any, eei: typings.ethereumjsVm.distEvmEeiMod.default) = this()
  }
  
  @js.native
  trait Interpreter extends StObject {
    
    var _eei: typings.ethereumjsVm.distEvmEeiMod.default = js.native
    
    def _getValidJumpDests(code: Buffer): js.Array[Double] = js.native
    
    var _runState: RunState = js.native
    
    def _runStepHook(): js.Promise[Unit] = js.native
    
    var _state: typings.ethereumjsVm.distStatePromisifiedMod.default = js.native
    
    var _vm: Any = js.native
    
    /**
      * Get the handler function for an opcode.
      */
    def getOpHandler(opInfo: Opcode): OpHandler = js.native
    
    /**
      * Get info for an opcode from VM's list of opcodes.
      */
    def lookupOpInfo(op: Double): Opcode = js.native
    def lookupOpInfo(op: Double, full: Boolean): Opcode = js.native
    
    def run(code: Buffer): js.Promise[InterpreterResult] = js.native
    def run(code: Buffer, opts: InterpreterOpts): js.Promise[InterpreterResult] = js.native
    
    /**
      * Executes the opcode to which the program counter is pointing,
      * reducing it's base gas cost, and increments the program counter.
      */
    def runStep(): js.Promise[Unit] = js.native
  }
  
  trait InterpreterOpts extends StObject {
    
    var pc: js.UndefOr[Double] = js.undefined
  }
  object InterpreterOpts {
    
    inline def apply(): InterpreterOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpreterOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpreterOpts] (val x: Self) extends AnyVal {
      
      inline def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      inline def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
    }
  }
  
  trait InterpreterResult extends StObject {
    
    var exceptionError: js.UndefOr[VmError] = js.undefined
    
    var runState: js.UndefOr[RunState] = js.undefined
  }
  object InterpreterResult {
    
    inline def apply(): InterpreterResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpreterResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpreterResult] (val x: Self) extends AnyVal {
      
      inline def setExceptionError(value: VmError): Self = StObject.set(x, "exceptionError", value.asInstanceOf[js.Any])
      
      inline def setExceptionErrorUndefined: Self = StObject.set(x, "exceptionError", js.undefined)
      
      inline def setRunState(value: RunState): Self = StObject.set(x, "runState", value.asInstanceOf[js.Any])
      
      inline def setRunStateUndefined: Self = StObject.set(x, "runState", js.undefined)
    }
  }
  
  trait InterpreterStep extends StObject {
    
    var account: typings.ethereumjsAccount.mod.default
    
    var address: Buffer
    
    var codeAddress: Buffer
    
    var depth: Double
    
    var gasLeft: ^
    
    var memory: js.Array[Double]
    
    var memoryWordCount: ^
    
    var opcode: Opcode
    
    var pc: Double
    
    var stack: js.Array[^]
    
    var stateManager: StateManager
  }
  object InterpreterStep {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: InterpreterStep] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: typings.ethereumjsAccount.mod.default): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCodeAddress(value: Buffer): Self = StObject.set(x, "codeAddress", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setGasLeft(value: ^): Self = StObject.set(x, "gasLeft", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: js.Array[Double]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryVarargs(value: Double*): Self = StObject.set(x, "memory", js.Array(value*))
      
      inline def setMemoryWordCount(value: ^): Self = StObject.set(x, "memoryWordCount", value.asInstanceOf[js.Any])
      
      inline def setOpcode(value: Opcode): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
      
      inline def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[^]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: ^ *): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setStateManager(value: StateManager): Self = StObject.set(x, "stateManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunState extends StObject {
    
    var _common: typings.ethereumjsCommon.mod.default
    
    var code: Buffer
    
    var eei: typings.ethereumjsVm.distEvmEeiMod.default
    
    var highestMemCost: ^
    
    var memory: typings.ethereumjsVm.distEvmMemoryMod.default
    
    var memoryWordCount: ^
    
    var opCode: Double
    
    var programCounter: Double
    
    var stack: typings.ethereumjsVm.distEvmStackMod.default
    
    var stateManager: StateManager
    
    var validJumps: js.Array[Double]
  }
  object RunState {
    
    inline def apply(
      _common: typings.ethereumjsCommon.mod.default,
      code: Buffer,
      eei: typings.ethereumjsVm.distEvmEeiMod.default,
      highestMemCost: ^,
      memory: typings.ethereumjsVm.distEvmMemoryMod.default,
      memoryWordCount: ^,
      opCode: Double,
      programCounter: Double,
      stack: typings.ethereumjsVm.distEvmStackMod.default,
      stateManager: StateManager,
      validJumps: js.Array[Double]
    ): RunState = {
      val __obj = js.Dynamic.literal(_common = _common.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], eei = eei.asInstanceOf[js.Any], highestMemCost = highestMemCost.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], memoryWordCount = memoryWordCount.asInstanceOf[js.Any], opCode = opCode.asInstanceOf[js.Any], programCounter = programCounter.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], stateManager = stateManager.asInstanceOf[js.Any], validJumps = validJumps.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunState] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEei(value: typings.ethereumjsVm.distEvmEeiMod.default): Self = StObject.set(x, "eei", value.asInstanceOf[js.Any])
      
      inline def setHighestMemCost(value: ^): Self = StObject.set(x, "highestMemCost", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: typings.ethereumjsVm.distEvmMemoryMod.default): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryWordCount(value: ^): Self = StObject.set(x, "memoryWordCount", value.asInstanceOf[js.Any])
      
      inline def setOpCode(value: Double): Self = StObject.set(x, "opCode", value.asInstanceOf[js.Any])
      
      inline def setProgramCounter(value: Double): Self = StObject.set(x, "programCounter", value.asInstanceOf[js.Any])
      
      inline def setStack(value: typings.ethereumjsVm.distEvmStackMod.default): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStateManager(value: StateManager): Self = StObject.set(x, "stateManager", value.asInstanceOf[js.Any])
      
      inline def setValidJumps(value: js.Array[Double]): Self = StObject.set(x, "validJumps", value.asInstanceOf[js.Any])
      
      inline def setValidJumpsVarargs(value: Double*): Self = StObject.set(x, "validJumps", js.Array(value*))
      
      inline def set_common(value: typings.ethereumjsCommon.mod.default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
    }
  }
}
