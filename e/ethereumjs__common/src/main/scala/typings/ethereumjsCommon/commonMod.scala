package typings.ethereumjsCommon

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsCommon.anon.PartialChainConfig
import typings.ethereumjsCommon.enumsMod.Chain
import typings.ethereumjsCommon.enumsMod.ConsensusAlgorithm
import typings.ethereumjsCommon.enumsMod.ConsensusType
import typings.ethereumjsCommon.enumsMod.CustomChain
import typings.ethereumjsCommon.enumsMod.Hardfork
import typings.ethereumjsCommon.typesMod.BootstrapNodeConfig
import typings.ethereumjsCommon.typesMod.CasperConfig
import typings.ethereumjsCommon.typesMod.ChainConfig
import typings.ethereumjsCommon.typesMod.ChainsConfig
import typings.ethereumjsCommon.typesMod.CliqueConfig
import typings.ethereumjsCommon.typesMod.CommonOpts
import typings.ethereumjsCommon.typesMod.CustomCommonOpts
import typings.ethereumjsCommon.typesMod.EthashConfig
import typings.ethereumjsCommon.typesMod.GenesisBlockConfig
import typings.ethereumjsCommon.typesMod.HardforkConfig
import typings.ethereumjsUtil.typesMod.BigIntLike
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@ethereumjs/common/dist/common", "Common")
  @js.native
  open class Common protected () extends EventEmitter {
    def this(opts: CommonOpts) = this()
    
    val DEFAULT_HARDFORK: String | Hardfork = js.native
    
    /**
      * Internal helper function to calculate a fork hash
      * @param hardfork Hardfork name
      * @param genesisHash Genesis block hash of the chain
      * @returns Fork hash as hex string
      */
    def _calcForkHash(hardfork: String, genesisHash: Buffer): String = js.native
    def _calcForkHash(hardfork: Hardfork, genesisHash: Buffer): String = js.native
    
    /* private */ var _chainParams: Any = js.native
    
    /* private */ var _customChains: Any = js.native
    
    /* private */ var _eips: Any = js.native
    
    /**
      * Internal helper function, returns the params for the given hardfork for the chain set
      * @param hardfork Hardfork name
      * @returns Dictionary with hardfork params or null if hardfork not on chain
      */
    def _getHardfork(hardfork: String): HardforkConfig | Null = js.native
    def _getHardfork(hardfork: Hardfork): HardforkConfig | Null = js.native
    
    /* private */ var _hardfork: Any = js.native
    
    /**
      * Alias to hardforkIsActiveOnBlock when hardfork is set
      * @param blockNumber
      * @returns True if HF is active on block number
      */
    def activeOnBlock(blockNumber: BigIntLike): Boolean = js.native
    
    /**
      * Returns bootstrap nodes for the current chain
      * @returns {Dictionary} Dict with bootstrap nodes
      */
    def bootstrapNodes(): js.Array[BootstrapNodeConfig] = js.native
    
    /**
      * Returns the Id of current chain
      * @returns chain Id
      */
    def chainId(): js.BigInt = js.native
    
    /**
      * Returns the name of current chain
      * @returns chain name (lower case)
      */
    def chainName(): String = js.native
    
    /**
      * Returns the concrete consensus implementation
      * algorithm or protocol for the network
      * e.g. "ethash" for "pow" consensus type,
      * "clique" for "poa" consensus type or
      * "casper" for "pos" consensus type.
      *
      * Note: This value can update along a Hardfork.
      */
    def consensusAlgorithm(): String | ConsensusAlgorithm = js.native
    
    /**
      * Returns a dictionary with consensus configuration
      * parameters based on the consensus algorithm
      *
      * Expected returns (parameters must be present in
      * the respective chain json files):
      *
      * ethash: -
      * clique: period, epoch
      * aura: -
      * casper: -
      *
      * Note: This value can update along a Hardfork.
      */
    def consensusConfig(): StringDictionary[CliqueConfig | EthashConfig | CasperConfig] = js.native
    
    /**
      * Returns the consensus type of the network
      * Possible values: "pow"|"poa"|"pos"
      *
      * Note: This value can update along a Hardfork.
      */
    def consensusType(): String | ConsensusType = js.native
    
    /**
      * Returns a deep copy of this {@link Common} instance.
      */
    def copy(): Common = js.native
    
    /**
      * Returns DNS networks for the current chain
      * @returns {String[]} Array of DNS ENR urls
      */
    def dnsNetworks(): js.Array[String] = js.native
    
    /**
      * Returns the hardfork change block for eip
      * @param eip EIP number
      * @returns Block number or null if unscheduled
      */
    def eipBlock(eip: Double): js.BigInt | Null = js.native
    
    /**
      * Returns the active EIPs
      * @returns List of EIPs
      */
    def eips(): js.Array[Double] = js.native
    
    /**
      * Returns an eth/64 compliant fork hash (EIP-2124)
      * @param hardfork Hardfork name, optional if HF set
      * @param genesisHash Genesis block hash of the chain, optional if already defined and not needed to be calculated
      */
    def forkHash(): String = js.native
    def forkHash(hardfork: String): String = js.native
    def forkHash(hardfork: String, genesisHash: Buffer): String = js.native
    def forkHash(hardfork: Unit, genesisHash: Buffer): String = js.native
    def forkHash(hardfork: Hardfork): String = js.native
    def forkHash(hardfork: Hardfork, genesisHash: Buffer): String = js.native
    
    /**
      * Returns the Genesis parameters of the current chain
      * @returns Genesis dictionary
      */
    def genesis(): GenesisBlockConfig = js.native
    
    /**
      * Returns the hardfork based on the block number or an optional
      * total difficulty (Merge HF) provided.
      *
      * An optional TD takes precedence in case the corresponding HF block
      * is set to `null` or otherwise needs to match (if not an error
      * will be thrown).
      *
      * @param blockNumber
      * @param td
      * @returns The name of the HF
      */
    def getHardforkByBlockNumber(blockNumber: BigIntLike): String = js.native
    def getHardforkByBlockNumber(blockNumber: BigIntLike, td: BigIntLike): String = js.native
    
    /**
      * Alias to hardforkGteHardfork when hardfork is set
      * @param hardfork Hardfork name
      * @returns True if hardfork set is greater than hardfork provided
      */
    def gteHardfork(hardfork: String): Boolean = js.native
    def gteHardfork(hardfork: Hardfork): Boolean = js.native
    
    /**
      * Returns the hardfork set
      * @returns Hardfork name
      */
    def hardfork(): String | Hardfork = js.native
    
    /**
      * Returns the hardfork change block for hardfork provided or set
      * @param hardfork Hardfork name, optional if HF set
      * @returns Block number or null if unscheduled
      */
    def hardforkBlock(): js.BigInt | Null = js.native
    def hardforkBlock(hardfork: String): js.BigInt | Null = js.native
    def hardforkBlock(hardfork: Hardfork): js.BigInt | Null = js.native
    
    /**
      *
      * @param forkHash Fork hash as a hex string
      * @returns Array with hardfork data (name, block, forkHash)
      */
    def hardforkForForkHash(forkHash: String): HardforkConfig | Null = js.native
    
    /**
      * Sequence based check if given or set HF1 is greater than or equal HF2
      * @param hardfork1 Hardfork name or null (if set)
      * @param hardfork2 Hardfork name
      * @param opts Hardfork options
      * @returns True if HF1 gte HF2
      */
    def hardforkGteHardfork(hardfork1: String, hardfork2: String): Boolean = js.native
    def hardforkGteHardfork(hardfork1: String, hardfork2: Hardfork): Boolean = js.native
    def hardforkGteHardfork(hardfork1: Null, hardfork2: String): Boolean = js.native
    def hardforkGteHardfork(hardfork1: Null, hardfork2: Hardfork): Boolean = js.native
    def hardforkGteHardfork(hardfork1: Hardfork, hardfork2: String): Boolean = js.native
    def hardforkGteHardfork(hardfork1: Hardfork, hardfork2: Hardfork): Boolean = js.native
    
    /**
      * Checks if set or provided hardfork is active on block number
      * @param hardfork Hardfork name or null (for HF set)
      * @param blockNumber
      * @returns True if HF is active on block number
      */
    def hardforkIsActiveOnBlock(hardfork: String, blockNumber: BigIntLike): Boolean = js.native
    def hardforkIsActiveOnBlock(hardfork: Null, blockNumber: BigIntLike): Boolean = js.native
    def hardforkIsActiveOnBlock(hardfork: Hardfork, blockNumber: BigIntLike): Boolean = js.native
    
    /**
      * Returns the hardfork change total difficulty (Merge HF) for hardfork provided or set
      * @param hardfork Hardfork name, optional if HF set
      * @returns Total difficulty or null if no set
      */
    def hardforkTTD(): js.BigInt | Null = js.native
    def hardforkTTD(hardfork: String): js.BigInt | Null = js.native
    def hardforkTTD(hardfork: Hardfork): js.BigInt | Null = js.native
    
    /**
      * Returns the hardforks for current chain
      * @returns {Array} Array with arrays of hardforks
      */
    def hardforks(): js.Array[HardforkConfig] = js.native
    
    /**
      * Checks if an EIP is activated by either being included in the EIPs
      * manually passed in with the {@link CommonOpts.eips} or in a
      * hardfork currently being active
      *
      * Note: this method only works for EIPs being supported
      * by the {@link CommonOpts.eips} constructor option
      * @param eip
      */
    def isActivatedEIP(eip: Double): Boolean = js.native
    
    /**
      * True if block number provided is the hardfork (given or set) change block
      * @param blockNumber Number of the block to check
      * @param hardfork Hardfork name, optional if HF set
      * @returns True if blockNumber is HF block
      */
    def isHardforkBlock(blockNumber: BigIntLike): Boolean = js.native
    def isHardforkBlock(blockNumber: BigIntLike, hardfork: String): Boolean = js.native
    def isHardforkBlock(blockNumber: BigIntLike, hardfork: Hardfork): Boolean = js.native
    
    /**
      * True if block number provided is the hardfork change block following the hardfork given or set
      * @param blockNumber Number of the block to check
      * @param hardfork Hardfork name, optional if HF set
      * @returns True if blockNumber is HF block
      */
    def isNextHardforkBlock(blockNumber: BigIntLike): Boolean = js.native
    def isNextHardforkBlock(blockNumber: BigIntLike, hardfork: String): Boolean = js.native
    def isNextHardforkBlock(blockNumber: BigIntLike, hardfork: Hardfork): Boolean = js.native
    
    /**
      * Returns the Id of current network
      * @returns network Id
      */
    def networkId(): js.BigInt = js.native
    
    /**
      * Returns the change block for the next hardfork after the hardfork provided or set
      * @param hardfork Hardfork name, optional if HF set
      * @returns Block number or null if not available
      */
    def nextHardforkBlock(): js.BigInt | Null = js.native
    def nextHardforkBlock(hardfork: String): js.BigInt | Null = js.native
    def nextHardforkBlock(hardfork: Hardfork): js.BigInt | Null = js.native
    
    /**
      * Returns a parameter for the current chain setup
      *
      * If the parameter is present in an EIP, the EIP always takes precendence.
      * Otherwise the parameter if taken from the latest applied HF with
      * a change on the respective parameter.
      *
      * @param topic Parameter topic ('gasConfig', 'gasPrices', 'vm', 'pow')
      * @param name Parameter name (e.g. 'minGasLimit' for 'gasConfig' topic)
      * @returns The value requested or `BigInt(0)` if not found
      */
    def param(topic: String, name: String): js.BigInt = js.native
    
    /**
      * Returns a parameter for the hardfork active on block number or
      * optional provided total difficulty (Merge HF)
      * @param topic Parameter topic
      * @param name Parameter name
      * @param blockNumber Block number
      * @param td Total difficulty
      *    * @returns The value requested or `BigInt(0)` if not found
      */
    def paramByBlock(topic: String, name: String, blockNumber: BigIntLike): js.BigInt = js.native
    def paramByBlock(topic: String, name: String, blockNumber: BigIntLike, td: BigIntLike): js.BigInt = js.native
    
    /**
      * Returns a parameter corresponding to an EIP
      * @param topic Parameter topic ('gasConfig', 'gasPrices', 'vm', 'pow')
      * @param name Parameter name (e.g. 'minGasLimit' for 'gasConfig' topic)
      * @param eip Number of the EIP
      * @returns The value requested or `undefined` if not found
      */
    def paramByEIP(topic: String, name: String, eip: Double): js.UndefOr[js.BigInt] = js.native
    
    /**
      * Returns the parameter corresponding to a hardfork
      * @param topic Parameter topic ('gasConfig', 'gasPrices', 'vm', 'pow')
      * @param name Parameter name (e.g. 'minGasLimit' for 'gasConfig' topic)
      * @param hardfork Hardfork name
      * @returns The value requested or `BigInt(0)` if not found
      */
    def paramByHardfork(topic: String, name: String, hardfork: String): js.BigInt = js.native
    def paramByHardfork(topic: String, name: String, hardfork: Hardfork): js.BigInt = js.native
    
    /**
      * Sets the chain
      * @param chain String ('mainnet') or Number (1) chain representation.
      *              Or, a Dictionary of chain parameters for a private network.
      * @returns The dictionary with parameters set as chain
      */
    def setChain(chain: String): ChainConfig = js.native
    def setChain(chain: js.BigInt): ChainConfig = js.native
    def setChain(chain: js.Object): ChainConfig = js.native
    def setChain(chain: Double): ChainConfig = js.native
    def setChain(chain: Chain): ChainConfig = js.native
    
    /**
      * Sets the active EIPs
      * @param eips
      */
    def setEIPs(): Unit = js.native
    def setEIPs(eips: js.Array[Double]): Unit = js.native
    
    /**
      * Sets the hardfork to get params for
      * @param hardfork String identifier (e.g. 'byzantium') or {@link Hardfork} enum
      */
    def setHardfork(hardfork: String): Unit = js.native
    def setHardfork(hardfork: Hardfork): Unit = js.native
    
    /**
      * Sets a new hardfork based on the block number or an optional
      * total difficulty (Merge HF) provided.
      *
      * An optional TD takes precedence in case the corresponding HF block
      * is set to `null` or otherwise needs to match (if not an error
      * will be thrown).
      *
      * @param blockNumber
      * @param td
      * @returns The name of the HF set
      */
    def setHardforkByBlockNumber(blockNumber: BigIntLike): String = js.native
    def setHardforkByBlockNumber(blockNumber: BigIntLike, td: BigIntLike): String = js.native
  }
  /* static members */
  object Common {
    
    @JSImport("@ethereumjs/common/dist/common", "Common")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ethereumjs/common/dist/common", "Common._getChainParams")
    @js.native
    def _getChainParams: Any = js.native
    inline def _getChainParams_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getChainParams")(x.asInstanceOf[js.Any])
    
    inline def _getInitializedChains(): ChainsConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("_getInitializedChains")().asInstanceOf[ChainsConfig]
    inline def _getInitializedChains(customChains: js.Array[ChainConfig]): ChainsConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("_getInitializedChains")(customChains.asInstanceOf[js.Any]).asInstanceOf[ChainsConfig]
    
    /**
      * Creates a {@link Common} object for a custom chain, based on a standard one.
      *
      * It uses all the {@link Chain} parameters from the {@link baseChain} option except the ones overridden
      * in a provided {@link chainParamsOrName} dictionary. Some usage example:
      *
      * ```javascript
      * Common.custom({chainId: 123})
      * ```
      *
      * There are also selected supported custom chains which can be initialized by using one of the
      * {@link CustomChains} for {@link chainParamsOrName}, e.g.:
      *
      * ```javascript
      * Common.custom(CustomChains.MaticMumbai)
      * ```
      *
      * Note that these supported custom chains only provide some base parameters (usually the chain and
      * network ID and a name) and can only be used for selected use cases (e.g. sending a tx with
      * the `@ethereumjs/tx` library to a Layer-2 chain).
      *
      * @param chainParamsOrName Custom parameter dict (`name` will default to `custom-chain`) or string with name of a supported custom chain
      * @param opts Custom chain options to set the {@link CustomCommonOpts.baseChain}, selected {@link CustomCommonOpts.hardfork} and others
      */
    inline def custom(chainParamsOrName: PartialChainConfig): Common = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any]).asInstanceOf[Common]
    inline def custom(chainParamsOrName: PartialChainConfig, opts: CustomCommonOpts): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def custom(chainParamsOrName: CustomChain): Common = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any]).asInstanceOf[Common]
    inline def custom(chainParamsOrName: CustomChain, opts: CustomCommonOpts): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Common]
    
    /**
      * Static method to determine if a {@link chainId} is supported as a standard chain
      * @param chainId bigint id (`1`) of a standard chain
      * @returns boolean
      */
    inline def isSupportedChainId(chainId: js.BigInt): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedChainId")(chainId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
