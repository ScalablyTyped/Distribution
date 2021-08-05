package typings.ethereumjsCommon

import typings.ethereumjsCommon.anon.PartialChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-common", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Common {
    /**
      * @constructor
      * @param chain String ('mainnet') or Number (1) chain
      * @param hardfork String identifier ('byzantium') for hardfork (optional)
      * @param supportedHardforks Limit parameter returns to the given hardforks (optional)
      */
    def this(chain: String) = this()
    def this(chain: js.Object) = this()
    def this(chain: Double) = this()
    def this(chain: String, hardfork: String) = this()
    def this(chain: js.Object, hardfork: String) = this()
    def this(chain: Double, hardfork: String) = this()
    def this(chain: String, hardfork: String, supportedHardforks: js.Array[String]) = this()
    def this(chain: String, hardfork: Null, supportedHardforks: js.Array[String]) = this()
    def this(chain: String, hardfork: Unit, supportedHardforks: js.Array[String]) = this()
    def this(chain: js.Object, hardfork: String, supportedHardforks: js.Array[String]) = this()
    def this(chain: js.Object, hardfork: Null, supportedHardforks: js.Array[String]) = this()
    def this(chain: js.Object, hardfork: Unit, supportedHardforks: js.Array[String]) = this()
    def this(chain: Double, hardfork: String, supportedHardforks: js.Array[String]) = this()
    def this(chain: Double, hardfork: Null, supportedHardforks: js.Array[String]) = this()
    def this(chain: Double, hardfork: Unit, supportedHardforks: js.Array[String]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ethereumjs-common", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereumjs-common", "default._getChainParams")
    @js.native
    def _getChainParams: js.Any = js.native
    inline def _getChainParams_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getChainParams")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a Common object for a custom chain, based on a standard one. It uses all the [[Chain]]
      * params from [[baseChain]] except the ones overridden in [[customChainParams]].
      *
      * @param baseChain The name (`mainnet`) or id (`1`) of a standard chain used to base the custom
      * chain params on.
      * @param customChainParams The custom parameters of the chain.
      * @param hardfork String identifier ('byzantium') for hardfork (optional)
      * @param supportedHardforks Limit parameter returns to the given hardforks (optional)
      */
    inline def forCustomChain(baseChain: String, customChainParams: PartialChain): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(baseChain: String, customChainParams: PartialChain, hardfork: String): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(
      baseChain: String,
      customChainParams: PartialChain,
      hardfork: String,
      supportedHardforks: js.Array[String]
    ): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any], supportedHardforks.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(
      baseChain: String,
      customChainParams: PartialChain,
      hardfork: Null,
      supportedHardforks: js.Array[String]
    ): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any], supportedHardforks.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(
      baseChain: String,
      customChainParams: PartialChain,
      hardfork: Unit,
      supportedHardforks: js.Array[String]
    ): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any], supportedHardforks.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(baseChain: Double, customChainParams: PartialChain): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(baseChain: Double, customChainParams: PartialChain, hardfork: String): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(
      baseChain: Double,
      customChainParams: PartialChain,
      hardfork: String,
      supportedHardforks: js.Array[String]
    ): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any], supportedHardforks.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(
      baseChain: Double,
      customChainParams: PartialChain,
      hardfork: Null,
      supportedHardforks: js.Array[String]
    ): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any], supportedHardforks.asInstanceOf[js.Any])).asInstanceOf[Common]
    inline def forCustomChain(
      baseChain: Double,
      customChainParams: PartialChain,
      hardfork: Unit,
      supportedHardforks: js.Array[String]
    ): Common = (^.asInstanceOf[js.Dynamic].applyDynamic("forCustomChain")(baseChain.asInstanceOf[js.Any], customChainParams.asInstanceOf[js.Any], hardfork.asInstanceOf[js.Any], supportedHardforks.asInstanceOf[js.Any])).asInstanceOf[Common]
  }
  
  @js.native
  trait Common extends StObject {
    
    /* private */ var _chainParams: js.Any = js.native
    
    /**
      * Internal helper function to choose between hardfork set and hardfork provided as param
      * @param hardfork Hardfork given to function as a parameter
      * @returns Hardfork chosen to be used
      */
    def _chooseHardfork(): String = js.native
    def _chooseHardfork(hardfork: String): String = js.native
    def _chooseHardfork(hardfork: String, onlySupported: Boolean): String = js.native
    def _chooseHardfork(hardfork: Null, onlySupported: Boolean): String = js.native
    def _chooseHardfork(hardfork: Unit, onlySupported: Boolean): String = js.native
    
    /**
      * Internal helper function, returns the params for the given hardfork for the chain set
      * @param hardfork Hardfork name
      * @returns Dictionary with hardfork params
      */
    def _getHardfork(hardfork: String): js.Any = js.native
    
    /* private */ var _hardfork: js.Any = js.native
    
    /**
      * Internal helper function to check if a hardfork is set to be supported by the library
      * @param hardfork Hardfork name
      * @returns True if hardfork is supported
      */
    def _isSupportedHardfork(): Boolean = js.native
    def _isSupportedHardfork(hardfork: String): Boolean = js.native
    
    /* private */ var _supportedHardforks: js.Any = js.native
    
    /**
      * Returns the latest active hardfork name for chain or block or throws if unavailable
      * @param blockNumber up to block if provided, otherwise for the whole chain
      * @param opts Hardfork options (onlyActive unused)
      * @return Hardfork name
      */
    def activeHardfork(): String = js.native
    def activeHardfork(blockNumber: Double): String = js.native
    def activeHardfork(blockNumber: Double, opts: hardforkOptions): String = js.native
    def activeHardfork(blockNumber: Null, opts: hardforkOptions): String = js.native
    def activeHardfork(blockNumber: Unit, opts: hardforkOptions): String = js.native
    
    /**
      * Returns the active hardfork switches for the current chain
      * @param blockNumber up to block if provided, otherwise for the whole chain
      * @param opts Hardfork options (onlyActive unused)
      * @return Array with hardfork arrays
      */
    def activeHardforks(): js.Array[js.Any] = js.native
    def activeHardforks(blockNumber: Double): js.Array[js.Any] = js.native
    def activeHardforks(blockNumber: Double, opts: hardforkOptions): js.Array[js.Any] = js.native
    def activeHardforks(blockNumber: Null, opts: hardforkOptions): js.Array[js.Any] = js.native
    def activeHardforks(blockNumber: Unit, opts: hardforkOptions): js.Array[js.Any] = js.native
    
    /**
      * Alias to hardforkIsActiveOnBlock when hardfork is set
      * @param blockNumber
      * @param opts Hardfork options (onlyActive unused)
      * @returns True if HF is active on block number
      */
    def activeOnBlock(blockNumber: Double): Boolean = js.native
    def activeOnBlock(blockNumber: Double, opts: hardforkOptions): Boolean = js.native
    
    /**
      * Returns bootstrap nodes for the current chain
      * @returns {Dictionary} Dict with bootstrap nodes
      */
    def bootstrapNodes(): js.Any = js.native
    
    /**
      * Returns the Id of current chain
      * @returns chain Id
      */
    def chainId(): Double = js.native
    
    /**
      * Returns the name of current chain
      * @returns chain name (lower case)
      */
    def chainName(): String = js.native
    
    /**
      * Provide the consensus type for the hardfork set or provided as param
      * @param hardfork Hardfork name, optional if hardfork set
      * @returns Consensus type (e.g. 'pow', 'poa')
      */
    def consensus(): String = js.native
    def consensus(hardfork: String): String = js.native
    
    /**
      * Provide the finality type for the hardfork set or provided as param
      * @param {String} hardfork Hardfork name, optional if hardfork set
      * @returns {String} Finality type (e.g. 'pos', null of no finality)
      */
    def finality(): String = js.native
    def finality(hardfork: String): String = js.native
    
    /**
      * Returns the Genesis parameters of current chain
      * @returns Genesis dictionary
      */
    def genesis(): js.Any = js.native
    
    /**
      * Alias to hardforkGteHardfork when hardfork is set
      * @param hardfork Hardfork name
      * @param opts Hardfork options
      * @returns True if hardfork set is greater than hardfork provided
      */
    def gteHardfork(hardfork: String): Boolean = js.native
    def gteHardfork(hardfork: String, opts: hardforkOptions): Boolean = js.native
    
    /**
      * Returns the hardfork set
      * @returns Hardfork name
      */
    def hardfork(): String | Null = js.native
    
    /**
      * Returns the hardfork change block for hardfork provided or set
      * @param hardfork Hardfork name, optional if HF set
      * @returns Block number
      */
    def hardforkBlock(): Double = js.native
    def hardforkBlock(hardfork: String): Double = js.native
    
    /**
      * Sequence based check if given or set HF1 is greater than or equal HF2
      * @param hardfork1 Hardfork name or null (if set)
      * @param hardfork2 Hardfork name
      * @param opts Hardfork options
      * @returns True if HF1 gte HF2
      */
    def hardforkGteHardfork(hardfork1: String, hardfork2: String): Boolean = js.native
    def hardforkGteHardfork(hardfork1: String, hardfork2: String, opts: hardforkOptions): Boolean = js.native
    def hardforkGteHardfork(hardfork1: Null, hardfork2: String): Boolean = js.native
    def hardforkGteHardfork(hardfork1: Null, hardfork2: String, opts: hardforkOptions): Boolean = js.native
    
    /**
      * Checks if set or provided hardfork is active on block number
      * @param hardfork Hardfork name or null (for HF set)
      * @param blockNumber
      * @param opts Hardfork options (onlyActive unused)
      * @returns True if HF is active on block number
      */
    def hardforkIsActiveOnBlock(hardfork: String, blockNumber: Double): Boolean = js.native
    def hardforkIsActiveOnBlock(hardfork: String, blockNumber: Double, opts: hardforkOptions): Boolean = js.native
    def hardforkIsActiveOnBlock(hardfork: Null, blockNumber: Double): Boolean = js.native
    def hardforkIsActiveOnBlock(hardfork: Null, blockNumber: Double, opts: hardforkOptions): Boolean = js.native
    
    /**
      * Checks if given or set hardfork is active on the chain
      * @param hardfork Hardfork name, optional if HF set
      * @param opts Hardfork options (onlyActive unused)
      * @returns True if hardfork is active on the chain
      */
    def hardforkIsActiveOnChain(): Boolean = js.native
    def hardforkIsActiveOnChain(hardfork: String): Boolean = js.native
    def hardforkIsActiveOnChain(hardfork: String, opts: hardforkOptions): Boolean = js.native
    def hardforkIsActiveOnChain(hardfork: Null, opts: hardforkOptions): Boolean = js.native
    def hardforkIsActiveOnChain(hardfork: Unit, opts: hardforkOptions): Boolean = js.native
    
    /**
      * Returns the hardforks for current chain
      * @returns {Array} Array with arrays of hardforks
      */
    def hardforks(): js.Any = js.native
    
    /**
      * True if block number provided is the hardfork (given or set) change block of the current chain
      * @param blockNumber Number of the block to check
      * @param hardfork Hardfork name, optional if HF set
      * @returns True if blockNumber is HF block
      */
    def isHardforkBlock(blockNumber: Double): Boolean = js.native
    def isHardforkBlock(blockNumber: Double, hardfork: String): Boolean = js.native
    
    /**
      * Returns the Id of current network
      * @returns network Id
      */
    def networkId(): Double = js.native
    
    /**
      * Returns the parameter corresponding to a hardfork
      * @param topic Parameter topic ('gasConfig', 'gasPrices', 'vm', 'pow', 'casper', 'sharding')
      * @param name Parameter name (e.g. 'minGasLimit' for 'gasConfig' topic)
      * @param hardfork Hardfork name, optional if hardfork set
      */
    def param(topic: String, name: String): js.Any = js.native
    def param(topic: String, name: String, hardfork: String): js.Any = js.native
    
    /**
      * Returns a parameter for the hardfork active on block number
      * @param topic Parameter topic
      * @param name Parameter name
      * @param blockNumber Block number
      */
    def paramByBlock(topic: String, name: String, blockNumber: Double): js.Any = js.native
    
    /**
      * Sets the chain
      * @param chain String ('mainnet') or Number (1) chain
      *     representation. Or, a Dictionary of chain parameters for a private network.
      * @returns The dictionary with parameters set as chain
      */
    def setChain(chain: String): js.Any = js.native
    def setChain(chain: js.Object): js.Any = js.native
    def setChain(chain: Double): js.Any = js.native
    
    /**
      * Sets the hardfork to get params for
      * @param hardfork String identifier ('byzantium')
      */
    def setHardfork(): Unit = js.native
    def setHardfork(hardfork: String): Unit = js.native
  }
  
  trait hardforkOptions extends StObject {
    
    /** optional, only active HFs (default: false) */
    var onlyActive: js.UndefOr[Boolean] = js.undefined
    
    /** optional, only allow supported HFs (default: false) */
    var onlySupported: js.UndefOr[Boolean] = js.undefined
  }
  object hardforkOptions {
    
    inline def apply(): hardforkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[hardforkOptions]
    }
    
    extension [Self <: hardforkOptions](x: Self) {
      
      inline def setOnlyActive(value: Boolean): Self = StObject.set(x, "onlyActive", value.asInstanceOf[js.Any])
      
      inline def setOnlyActiveUndefined: Self = StObject.set(x, "onlyActive", js.undefined)
      
      inline def setOnlySupported(value: Boolean): Self = StObject.set(x, "onlySupported", value.asInstanceOf[js.Any])
      
      inline def setOnlySupportedUndefined: Self = StObject.set(x, "onlySupported", js.undefined)
    }
  }
}
