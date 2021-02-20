package typings.ethereumjsVm

import typings.bnJs.mod.^
import typings.ethereumjsVm.exceptionsMod.VmError
import typings.ethereumjsVm.opFnsMod.OpHandler
import typings.ethereumjsVm.opcodesMod.Opcode
import typings.ethereumjsVm.stateMod.StateManager
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpreterMod {
  
  @JSImport("ethereumjs-vm/dist/evm/interpreter", JSImport.Default)
  @js.native
  class default protected () extends Interpreter {
    def this(vm: js.Any, eei: typings.ethereumjsVm.eeiMod.default) = this()
  }
  
  @js.native
  trait Interpreter extends StObject {
    
    var _eei: typings.ethereumjsVm.eeiMod.default = js.native
    
    def _getValidJumpDests(code: Buffer): js.Array[Double] = js.native
    
    var _runState: RunState = js.native
    
    def _runStepHook(): js.Promise[Unit] = js.native
    
    var _state: typings.ethereumjsVm.promisifiedMod.default = js.native
    
    var _vm: js.Any = js.native
    
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
  
  @js.native
  trait InterpreterOpts extends StObject {
    
    var pc: js.UndefOr[Double] = js.native
  }
  object InterpreterOpts {
    
    @scala.inline
    def apply(): InterpreterOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpreterOpts]
    }
    
    @scala.inline
    implicit class InterpreterOptsMutableBuilder[Self <: InterpreterOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
    }
  }
  
  @js.native
  trait InterpreterResult extends StObject {
    
    var exceptionError: js.UndefOr[VmError] = js.native
    
    var runState: js.UndefOr[RunState] = js.native
  }
  object InterpreterResult {
    
    @scala.inline
    def apply(): InterpreterResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpreterResult]
    }
    
    @scala.inline
    implicit class InterpreterResultMutableBuilder[Self <: InterpreterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExceptionError(value: VmError): Self = StObject.set(x, "exceptionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionErrorUndefined: Self = StObject.set(x, "exceptionError", js.undefined)
      
      @scala.inline
      def setRunState(value: RunState): Self = StObject.set(x, "runState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunStateUndefined: Self = StObject.set(x, "runState", js.undefined)
    }
  }
  
  @js.native
  trait InterpreterStep extends StObject {
    
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
    implicit class InterpreterStepMutableBuilder[Self <: InterpreterStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccount(value: typings.ethereumjsAccount.mod.default): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeAddress(value: Buffer): Self = StObject.set(x, "codeAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLeft(value: ^): Self = StObject.set(x, "gasLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: js.Array[Double]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryVarargs(value: Double*): Self = StObject.set(x, "memory", js.Array(value :_*))
      
      @scala.inline
      def setMemoryWordCount(value: ^): Self = StObject.set(x, "memoryWordCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpcode(value: Opcode): Self = StObject.set(x, "opcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPc(value: Double): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: js.Array[^]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: ^ *): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      @scala.inline
      def setStateManager(value: StateManager): Self = StObject.set(x, "stateManager", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunState extends StObject {
    
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
    implicit class RunStateMutableBuilder[Self <: RunState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEei(value: typings.ethereumjsVm.eeiMod.default): Self = StObject.set(x, "eei", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighestMemCost(value: ^): Self = StObject.set(x, "highestMemCost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemory(value: typings.ethereumjsVm.memoryMod.default): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryWordCount(value: ^): Self = StObject.set(x, "memoryWordCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpCode(value: Double): Self = StObject.set(x, "opCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramCounter(value: Double): Self = StObject.set(x, "programCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: typings.ethereumjsVm.stackMod.default): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateManager(value: StateManager): Self = StObject.set(x, "stateManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidJumps(value: js.Array[Double]): Self = StObject.set(x, "validJumps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidJumpsVarargs(value: Double*): Self = StObject.set(x, "validJumps", js.Array(value :_*))
      
      @scala.inline
      def set_common(value: typings.ethereumjsCommon.mod.default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
    }
  }
}
