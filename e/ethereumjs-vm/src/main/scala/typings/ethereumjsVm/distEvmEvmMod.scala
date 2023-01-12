package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsVm.distEvmInterpreterMod.InterpreterOpts
import typings.ethereumjsVm.distEvmInterpreterMod.RunState
import typings.ethereumjsVm.distEvmPrecompilesTypesMod.PrecompileFunc
import typings.ethereumjsVm.distExceptionsMod.VmError
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmEvmMod {
  
  @JSImport("ethereumjs-vm/dist/evm/evm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethereumjs-vm/dist/evm/evm", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EVM {
    def this(vm: Any, txContext: typings.ethereumjsVm.distEvmTxContextMod.default, block: Any) = this()
  }
  
  inline def OOGResult(gasLimit: typings.bnJs.mod.^): ExecResult = ^.asInstanceOf[js.Dynamic].applyDynamic("OOGResult")(gasLimit.asInstanceOf[js.Any]).asInstanceOf[ExecResult]
  
  @js.native
  trait EVM extends StObject {
    
    def _addToBalance(
      toAccount: typings.ethereumjsAccount.mod.default,
      message: typings.ethereumjsVm.distEvmMessageMod.default
    ): js.Promise[Unit] = js.native
    
    var _block: Any = js.native
    
    def _executeCall(message: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[EVMResult] = js.native
    
    def _executeCreate(message: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[EVMResult] = js.native
    
    def _generateAddress(message: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[Buffer] = js.native
    
    def _loadCode(message: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[Unit] = js.native
    
    def _reduceSenderBalance(
      account: typings.ethereumjsAccount.mod.default,
      message: typings.ethereumjsVm.distEvmMessageMod.default
    ): js.Promise[Unit] = js.native
    
    /**
      * Amount of gas to refund from deleting storage values
      */
    var _refund: typings.bnJs.mod.^ = js.native
    
    var _state: typings.ethereumjsVm.distStatePromisifiedMod.default = js.native
    
    def _touchAccount(address: Buffer): js.Promise[Unit] = js.native
    
    var _tx: typings.ethereumjsVm.distEvmTxContextMod.default = js.native
    
    var _vm: Any = js.native
    
    /**
      * Executes an EVM message, determining whether it's a call or create
      * based on the `to` address. It checkpoints the state and reverts changes
      * if an exception happens during the message execution.
      */
    def executeMessage(message: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[EVMResult] = js.native
    
    /**
      * Returns code for precompile at the given address, or undefined
      * if no such precompile exists.
      */
    def getPrecompile(address: Buffer): PrecompileFunc = js.native
    
    /**
      * Starts the actual bytecode processing for a CALL or CREATE, providing
      * it with the [[EEI]].
      */
    def runInterpreter(message: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[ExecResult] = js.native
    def runInterpreter(message: typings.ethereumjsVm.distEvmMessageMod.default, opts: InterpreterOpts): js.Promise[ExecResult] = js.native
    
    /**
      * Executes a precompiled contract with given data and gas limit.
      */
    def runPrecompile(code: PrecompileFunc, data: Buffer, gasLimit: typings.bnJs.mod.^): ExecResult = js.native
  }
  
  trait EVMResult extends StObject {
    
    /**
      * Address of created account durint transaction, if any
      */
    var createdAddress: js.UndefOr[Buffer] = js.undefined
    
    /**
      * Contains the results from running the code, if any, as described in [[runCode]]
      */
    var execResult: ExecResult
    
    /**
      * Amount of gas used by the transaction
      */
    var gasUsed: typings.bnJs.mod.^
  }
  object EVMResult {
    
    inline def apply(execResult: ExecResult, gasUsed: typings.bnJs.mod.^): EVMResult = {
      val __obj = js.Dynamic.literal(execResult = execResult.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any])
      __obj.asInstanceOf[EVMResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EVMResult] (val x: Self) extends AnyVal {
      
      inline def setCreatedAddress(value: Buffer): Self = StObject.set(x, "createdAddress", value.asInstanceOf[js.Any])
      
      inline def setCreatedAddressUndefined: Self = StObject.set(x, "createdAddress", js.undefined)
      
      inline def setExecResult(value: ExecResult): Self = StObject.set(x, "execResult", value.asInstanceOf[js.Any])
      
      inline def setGasUsed(value: typings.bnJs.mod.^): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecResult extends StObject {
    
    /**
      * Description of the exception, if any occured
      */
    var exceptionError: js.UndefOr[VmError] = js.undefined
    
    /**
      * Amount of gas left
      */
    var gas: js.UndefOr[typings.bnJs.mod.^] = js.undefined
    
    /**
      * Total amount of gas to be refunded from all nested calls.
      */
    var gasRefund: js.UndefOr[typings.bnJs.mod.^] = js.undefined
    
    /**
      * Amount of gas the code used to run
      */
    var gasUsed: typings.bnJs.mod.^
    
    /**
      * Array of logs that the contract emitted
      */
    var logs: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Return value from the contract
      */
    var returnValue: Buffer
    
    var runState: js.UndefOr[RunState] = js.undefined
    
    /**
      * A map from the accounts that have self-destructed to the addresses to send their funds to
      */
    var selfdestruct: js.UndefOr[StringDictionary[Buffer]] = js.undefined
  }
  object ExecResult {
    
    inline def apply(gasUsed: typings.bnJs.mod.^, returnValue: Buffer): ExecResult = {
      val __obj = js.Dynamic.literal(gasUsed = gasUsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecResult] (val x: Self) extends AnyVal {
      
      inline def setExceptionError(value: VmError): Self = StObject.set(x, "exceptionError", value.asInstanceOf[js.Any])
      
      inline def setExceptionErrorUndefined: Self = StObject.set(x, "exceptionError", js.undefined)
      
      inline def setGas(value: typings.bnJs.mod.^): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasRefund(value: typings.bnJs.mod.^): Self = StObject.set(x, "gasRefund", value.asInstanceOf[js.Any])
      
      inline def setGasRefundUndefined: Self = StObject.set(x, "gasRefund", js.undefined)
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setGasUsed(value: typings.bnJs.mod.^): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      inline def setLogs(value: js.Array[Any]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
      
      inline def setLogsVarargs(value: Any*): Self = StObject.set(x, "logs", js.Array(value*))
      
      inline def setReturnValue(value: Buffer): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setRunState(value: RunState): Self = StObject.set(x, "runState", value.asInstanceOf[js.Any])
      
      inline def setRunStateUndefined: Self = StObject.set(x, "runState", js.undefined)
      
      inline def setSelfdestruct(value: StringDictionary[Buffer]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
      
      inline def setSelfdestructUndefined: Self = StObject.set(x, "selfdestruct", js.undefined)
    }
  }
  
  trait NewContractEvent extends StObject {
    
    var address: Buffer
    
    var code: Buffer
  }
  object NewContractEvent {
    
    inline def apply(address: Buffer, code: Buffer): NewContractEvent = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewContractEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewContractEvent] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
