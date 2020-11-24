package typings.ethereumjsVm.mod

import typings.ethereumjsVm.evmMod.EVMResult
import typings.ethereumjsVm.evmMod.ExecResult
import typings.ethereumjsVm.opcodesMod.OpcodeList
import typings.ethereumjsVm.runBlockMod.RunBlockOpts
import typings.ethereumjsVm.runBlockMod.RunBlockResult
import typings.ethereumjsVm.runCallMod.RunCallOpts
import typings.ethereumjsVm.runCodeMod.RunCodeOpts
import typings.ethereumjsVm.runTxMod.RunTxOpts
import typings.ethereumjsVm.runTxMod.RunTxResult
import typings.ethereumjsVm.stateMod.StateManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait VM extends js.Object {
  
  var _common: typings.ethereumjsCommon.mod.default = js.native
  
  def _emit(topic: String, data: js.Any): js.Promise[Unit] = js.native
  
  var _opcodes: OpcodeList = js.native
  
  var allowUnlimitedContractSize: Boolean = js.native
  
  var blockchain: typings.ethereumjsBlockchain.mod.default = js.native
  
  /**
    * Returns a copy of the [[VM]] instance.
    */
  def copy(): VM = js.native
  
  var opts: VMOpts = js.native
  
  val pStateManager: typings.ethereumjsVm.promisifiedMod.default = js.native
  
  /**
    * Processes the `block` running all of the transactions it contains and updating the miner's account
    *
    * This method modifies the state. If `generate` is `true`, the state modifications will be
    * reverted if an exception is raised. If it's `false`, it won't revert if the block's header is
    * invalid. If an error is thrown from an event handler, the state may or may not be reverted.
    *
    * @param opts - Default values for options:
    *  - `generate`: false
    */
  def runBlock(opts: RunBlockOpts): js.Promise[RunBlockResult] = js.native
  
  /**
    * Processes blocks and adds them to the blockchain.
    *
    * This method modifies the state.
    *
    * @param blockchain -  A [blockchain](https://github.com/ethereum/ethereumjs-blockchain) object to process
    */
  def runBlockchain(blockchain: js.Any): js.Promise[Unit] = js.native
  
  /**
    * runs a call (or create) operation.
    *
    * This method modifies the state.
    */
  def runCall(opts: RunCallOpts): js.Promise[EVMResult] = js.native
  
  /**
    * Runs EVM code.
    *
    * This method modifies the state.
    */
  def runCode(opts: RunCodeOpts): js.Promise[ExecResult] = js.native
  
  /**
    * Process a transaction. Run the vm. Transfers eth. Checks balances.
    *
    * This method modifies the state. If an error is thrown, the modifications are reverted, except
    * when the error is thrown from an event handler. In the latter case the state may or may not be
    * reverted.
    */
  def runTx(opts: RunTxOpts): js.Promise[RunTxResult] = js.native
  
  var stateManager: StateManager = js.native
}
object VM {
  
  @scala.inline
  def apply(
    _common: typings.ethereumjsCommon.mod.default,
    _emit: (String, js.Any) => js.Promise[Unit],
    _opcodes: OpcodeList,
    allowUnlimitedContractSize: Boolean,
    blockchain: typings.ethereumjsBlockchain.mod.default,
    copy: () => VM,
    opts: VMOpts,
    pStateManager: typings.ethereumjsVm.promisifiedMod.default,
    runBlock: RunBlockOpts => js.Promise[RunBlockResult],
    runBlockchain: js.Any => js.Promise[Unit],
    runCall: RunCallOpts => js.Promise[EVMResult],
    runCode: RunCodeOpts => js.Promise[ExecResult],
    runTx: RunTxOpts => js.Promise[RunTxResult],
    stateManager: StateManager
  ): VM = {
    val __obj = js.Dynamic.literal(_common = _common.asInstanceOf[js.Any], _emit = js.Any.fromFunction2(_emit), _opcodes = _opcodes.asInstanceOf[js.Any], allowUnlimitedContractSize = allowUnlimitedContractSize.asInstanceOf[js.Any], blockchain = blockchain.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), opts = opts.asInstanceOf[js.Any], pStateManager = pStateManager.asInstanceOf[js.Any], runBlock = js.Any.fromFunction1(runBlock), runBlockchain = js.Any.fromFunction1(runBlockchain), runCall = js.Any.fromFunction1(runCall), runCode = js.Any.fromFunction1(runCode), runTx = js.Any.fromFunction1(runTx), stateManager = stateManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[VM]
  }
  
  @scala.inline
  implicit class VMOps[Self <: VM] (val x: Self) extends AnyVal {
    
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
    def set_emit(value: (String, js.Any) => js.Promise[Unit]): Self = this.set("_emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_opcodes(value: OpcodeList): Self = this.set("_opcodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnlimitedContractSize(value: Boolean): Self = this.set("allowUnlimitedContractSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockchain(value: typings.ethereumjsBlockchain.mod.default): Self = this.set("blockchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => VM): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpts(value: VMOpts): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPStateManager(value: typings.ethereumjsVm.promisifiedMod.default): Self = this.set("pStateManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBlock(value: RunBlockOpts => js.Promise[RunBlockResult]): Self = this.set("runBlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunBlockchain(value: js.Any => js.Promise[Unit]): Self = this.set("runBlockchain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunCall(value: RunCallOpts => js.Promise[EVMResult]): Self = this.set("runCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunCode(value: RunCodeOpts => js.Promise[ExecResult]): Self = this.set("runCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunTx(value: RunTxOpts => js.Promise[RunTxResult]): Self = this.set("runTx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStateManager(value: StateManager): Self = this.set("stateManager", value.asInstanceOf[js.Any])
  }
}
