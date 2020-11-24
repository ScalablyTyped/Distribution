package typings.ethereumjsVm.mod

import typings.ethereumjsVm.stateMod.StateManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VMOpts extends js.Object {
  
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
  implicit class VMOptsOps[Self <: VMOpts] (val x: Self) extends AnyVal {
    
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
    def setActivatePrecompiles(value: Boolean): Self = this.set("activatePrecompiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivatePrecompiles: Self = this.set("activatePrecompiles", js.undefined)
    
    @scala.inline
    def setAllowUnlimitedContractSize(value: Boolean): Self = this.set("allowUnlimitedContractSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnlimitedContractSize: Self = this.set("allowUnlimitedContractSize", js.undefined)
    
    @scala.inline
    def setBlockchain(value: typings.ethereumjsBlockchain.mod.default): Self = this.set("blockchain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockchain: Self = this.set("blockchain", js.undefined)
    
    @scala.inline
    def setChain(value: String): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    
    @scala.inline
    def setCommon(value: typings.ethereumjsCommon.mod.default): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setHardfork(value: String): Self = this.set("hardfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardfork: Self = this.set("hardfork", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateManager(value: StateManager): Self = this.set("stateManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateManager: Self = this.set("stateManager", js.undefined)
  }
}
