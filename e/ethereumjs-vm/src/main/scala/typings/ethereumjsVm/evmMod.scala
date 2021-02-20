package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.ethereumjsVm.exceptionsMod.VmError
import typings.ethereumjsVm.interpreterMod.InterpreterOpts
import typings.ethereumjsVm.interpreterMod.RunState
import typings.ethereumjsVm.typesMod.PrecompileFunc
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evmMod {
  
  @JSImport("ethereumjs-vm/dist/evm/evm", JSImport.Default)
  @js.native
  class default protected () extends EVM {
    def this(vm: js.Any, txContext: typings.ethereumjsVm.txContextMod.default, block: js.Any) = this()
  }
  
  @JSImport("ethereumjs-vm/dist/evm/evm", "OOGResult")
  @js.native
  def OOGResult(gasLimit: ^): ExecResult = js.native
  
  @js.native
  trait EVM extends StObject {
    
    def _addToBalance(toAccount: typings.ethereumjsAccount.mod.default, message: typings.ethereumjsVm.messageMod.default): js.Promise[Unit] = js.native
    
    var _block: js.Any = js.native
    
    def _executeCall(message: typings.ethereumjsVm.messageMod.default): js.Promise[EVMResult] = js.native
    
    def _executeCreate(message: typings.ethereumjsVm.messageMod.default): js.Promise[EVMResult] = js.native
    
    def _generateAddress(message: typings.ethereumjsVm.messageMod.default): js.Promise[Buffer] = js.native
    
    def _loadCode(message: typings.ethereumjsVm.messageMod.default): js.Promise[Unit] = js.native
    
    def _reduceSenderBalance(account: typings.ethereumjsAccount.mod.default, message: typings.ethereumjsVm.messageMod.default): js.Promise[Unit] = js.native
    
    /**
      * Amount of gas to refund from deleting storage values
      */
    var _refund: ^ = js.native
    
    var _state: typings.ethereumjsVm.promisifiedMod.default = js.native
    
    def _touchAccount(address: Buffer): js.Promise[Unit] = js.native
    
    var _tx: typings.ethereumjsVm.txContextMod.default = js.native
    
    var _vm: js.Any = js.native
    
    /**
      * Executes an EVM message, determining whether it's a call or create
      * based on the `to` address. It checkpoints the state and reverts changes
      * if an exception happens during the message execution.
      */
    def executeMessage(message: typings.ethereumjsVm.messageMod.default): js.Promise[EVMResult] = js.native
    
    /**
      * Returns code for precompile at the given address, or undefined
      * if no such precompile exists.
      */
    def getPrecompile(address: Buffer): PrecompileFunc = js.native
    
    /**
      * Starts the actual bytecode processing for a CALL or CREATE, providing
      * it with the [[EEI]].
      */
    def runInterpreter(message: typings.ethereumjsVm.messageMod.default): js.Promise[ExecResult] = js.native
    def runInterpreter(message: typings.ethereumjsVm.messageMod.default, opts: InterpreterOpts): js.Promise[ExecResult] = js.native
    
    /**
      * Executes a precompiled contract with given data and gas limit.
      */
    def runPrecompile(code: PrecompileFunc, data: Buffer, gasLimit: ^): ExecResult = js.native
  }
  
  @js.native
  trait EVMResult extends StObject {
    
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
    implicit class EVMResultMutableBuilder[Self <: EVMResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAddress(value: Buffer): Self = StObject.set(x, "createdAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAddressUndefined: Self = StObject.set(x, "createdAddress", js.undefined)
      
      @scala.inline
      def setExecResult(value: ExecResult): Self = StObject.set(x, "execResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUsed(value: ^): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecResult extends StObject {
    
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
    implicit class ExecResultMutableBuilder[Self <: ExecResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExceptionError(value: VmError): Self = StObject.set(x, "exceptionError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptionErrorUndefined: Self = StObject.set(x, "exceptionError", js.undefined)
      
      @scala.inline
      def setGas(value: ^): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasRefund(value: ^): Self = StObject.set(x, "gasRefund", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasRefundUndefined: Self = StObject.set(x, "gasRefund", js.undefined)
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      @scala.inline
      def setGasUsed(value: ^): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogs(value: js.Array[_]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      @scala.inline
      def setLogsVarargs(value: js.Any*): Self = StObject.set(x, "logs", js.Array(value :_*))
      
      @scala.inline
      def setReturnValue(value: Buffer): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunState(value: RunState): Self = StObject.set(x, "runState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunStateUndefined: Self = StObject.set(x, "runState", js.undefined)
      
      @scala.inline
      def setSelfdestruct(value: StringDictionary[Buffer]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfdestructUndefined: Self = StObject.set(x, "selfdestruct", js.undefined)
    }
  }
  
  @js.native
  trait NewContractEvent extends StObject {
    
    var address: Buffer = js.native
    
    var code: Buffer = js.native
  }
  object NewContractEvent {
    
    @scala.inline
    def apply(address: Buffer, code: Buffer): NewContractEvent = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewContractEvent]
    }
    
    @scala.inline
    implicit class NewContractEventMutableBuilder[Self <: NewContractEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
