package typings.ethereumjsVm

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-vm", JSImport.Default)
  @js.native
  /**
    * Instantiates a new [[VM]] Object.
    * @param opts - Default values for the options are:
    *  - `chain`: 'mainnet'
    *  - `hardfork`: 'petersburg' [supported: 'byzantium', 'constantinople', 'petersburg', 'istanbul' (DRAFT) (will throw on unsupported)]
    *  - `activatePrecompiles`: false
    *  - `allowUnlimitedContractSize`: false [ONLY set to `true` during debugging]
    */
  class default () extends VM {
    def this(opts: VMOpts) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait VM extends StObject {
    
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
    implicit class VMMutableBuilder[Self <: VM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnlimitedContractSize(value: Boolean): Self = StObject.set(x, "allowUnlimitedContractSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockchain(value: typings.ethereumjsBlockchain.mod.default): Self = StObject.set(x, "blockchain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopy(value: () => VM): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpts(value: VMOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPStateManager(value: typings.ethereumjsVm.promisifiedMod.default): Self = StObject.set(x, "pStateManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunBlock(value: RunBlockOpts => js.Promise[RunBlockResult]): Self = StObject.set(x, "runBlock", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRunBlockchain(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "runBlockchain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRunCall(value: RunCallOpts => js.Promise[EVMResult]): Self = StObject.set(x, "runCall", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRunCode(value: RunCodeOpts => js.Promise[ExecResult]): Self = StObject.set(x, "runCode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRunTx(value: RunTxOpts => js.Promise[RunTxResult]): Self = StObject.set(x, "runTx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateManager(value: StateManager): Self = StObject.set(x, "stateManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_common(value: typings.ethereumjsCommon.mod.default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_emit(value: (String, js.Any) => js.Promise[Unit]): Self = StObject.set(x, "_emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_opcodes(value: OpcodeList): Self = StObject.set(x, "_opcodes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VMOpts extends StObject {
    
    /**
      * If true, create entries in the state tree for the precompiled contracts, saving some gas the
      * first time each of them is called.
      *
      * If this parameter is false, the first call to each of them has to pay an extra 25000 gas
      * for creating the account.
      *
      * Setting this to true has the effect of precompiled contracts' gas costs matching mainnet's from
      * the very first call, which is intended for testing networks.
      */
    var activatePrecompiles: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows unlimited contract sizes while debugging. By setting this to `true`, the check for contract size limit of 24KB (see [EIP-170](https://git.io/vxZkK)) is bypassed
      */
    var allowUnlimitedContractSize: js.UndefOr[Boolean] = js.native
    
    /**
      * A [blockchain](https://github.com/ethereumjs/ethereumjs-blockchain) object for storing/retrieving blocks
      */
    var blockchain: js.UndefOr[typings.ethereumjsBlockchain.mod.default] = js.native
    
    /**
      * The chain the VM operates on
      */
    var chain: js.UndefOr[String] = js.native
    
    var common: js.UndefOr[typings.ethereumjsCommon.mod.default] = js.native
    
    /**
      * Hardfork rules to be used
      */
    var hardfork: js.UndefOr[String] = js.native
    
    /**
      * A [merkle-patricia-tree](https://github.com/ethereumjs/merkle-patricia-tree) instance for the state tree (ignored if stateManager is passed)
      * @deprecated
      */
    var state: js.UndefOr[js.Any] = js.native
    
    /**
      * A [[StateManager]] instance to use as the state store (Beta API)
      */
    var stateManager: js.UndefOr[StateManager] = js.native
  }
  object VMOpts {
    
    @scala.inline
    def apply(): VMOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VMOpts]
    }
    
    @scala.inline
    implicit class VMOptsMutableBuilder[Self <: VMOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivatePrecompiles(value: Boolean): Self = StObject.set(x, "activatePrecompiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivatePrecompilesUndefined: Self = StObject.set(x, "activatePrecompiles", js.undefined)
      
      @scala.inline
      def setAllowUnlimitedContractSize(value: Boolean): Self = StObject.set(x, "allowUnlimitedContractSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnlimitedContractSizeUndefined: Self = StObject.set(x, "allowUnlimitedContractSize", js.undefined)
      
      @scala.inline
      def setBlockchain(value: typings.ethereumjsBlockchain.mod.default): Self = StObject.set(x, "blockchain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockchainUndefined: Self = StObject.set(x, "blockchain", js.undefined)
      
      @scala.inline
      def setChain(value: String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      @scala.inline
      def setCommon(value: typings.ethereumjsCommon.mod.default): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      @scala.inline
      def setHardfork(value: String): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateManager(value: StateManager): Self = StObject.set(x, "stateManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateManagerUndefined: Self = StObject.set(x, "stateManager", js.undefined)
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
