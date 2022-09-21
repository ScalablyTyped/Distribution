package typings.ethereumjsCommon

import typings.ethereumjsCommon.anon.PartialChainConfig
import typings.ethereumjsCommon.enumsMod.CustomChain
import typings.ethereumjsCommon.typesMod.ChainConfig
import typings.ethereumjsCommon.typesMod.ChainsConfig
import typings.ethereumjsCommon.typesMod.CommonOpts
import typings.ethereumjsCommon.typesMod.CustomCommonOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethereumjs/common", "Chain")
  @js.native
  object Chain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ethereumjsCommon.enumsMod.Chain & Double] = js.native
    
    /* 5 */ val Goerli: typings.ethereumjsCommon.enumsMod.Chain.Goerli & Double = js.native
    
    /* 1 */ val Mainnet: typings.ethereumjsCommon.enumsMod.Chain.Mainnet & Double = js.native
    
    /* 4 */ val Rinkeby: typings.ethereumjsCommon.enumsMod.Chain.Rinkeby & Double = js.native
    
    /* 3 */ val Ropsten: typings.ethereumjsCommon.enumsMod.Chain.Ropsten & Double = js.native
    
    /* 11155111 */ val Sepolia: typings.ethereumjsCommon.enumsMod.Chain.Sepolia & Double = js.native
  }
  
  @JSImport("@ethereumjs/common", "Common")
  @js.native
  open class Common protected ()
    extends typings.ethereumjsCommon.commonMod.Common {
    def this(opts: CommonOpts) = this()
  }
  /* static members */
  object Common {
    
    @JSImport("@ethereumjs/common", "Common")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ethereumjs/common", "Common._getChainParams")
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
    inline def custom(chainParamsOrName: PartialChainConfig): typings.ethereumjsCommon.commonMod.Common = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsCommon.commonMod.Common]
    inline def custom(chainParamsOrName: PartialChainConfig, opts: CustomCommonOpts): typings.ethereumjsCommon.commonMod.Common = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsCommon.commonMod.Common]
    inline def custom(chainParamsOrName: CustomChain): typings.ethereumjsCommon.commonMod.Common = ^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any]).asInstanceOf[typings.ethereumjsCommon.commonMod.Common]
    inline def custom(chainParamsOrName: CustomChain, opts: CustomCommonOpts): typings.ethereumjsCommon.commonMod.Common = (^.asInstanceOf[js.Dynamic].applyDynamic("custom")(chainParamsOrName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.ethereumjsCommon.commonMod.Common]
    
    /**
      * Static method to determine if a {@link chainId} is supported as a standard chain
      * @param chainId bigint id (`1`) of a standard chain
      * @returns boolean
      */
    inline def isSupportedChainId(chainId: js.BigInt): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedChainId")(chainId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@ethereumjs/common", "ConsensusAlgorithm")
  @js.native
  object ConsensusAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethereumjsCommon.enumsMod.ConsensusAlgorithm & String] = js.native
    
    /* "casper" */ val Casper: typings.ethereumjsCommon.enumsMod.ConsensusAlgorithm.Casper & String = js.native
    
    /* "clique" */ val Clique: typings.ethereumjsCommon.enumsMod.ConsensusAlgorithm.Clique & String = js.native
    
    /* "ethash" */ val Ethash: typings.ethereumjsCommon.enumsMod.ConsensusAlgorithm.Ethash & String = js.native
  }
  
  @JSImport("@ethereumjs/common", "ConsensusType")
  @js.native
  object ConsensusType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethereumjsCommon.enumsMod.ConsensusType & String] = js.native
    
    /* "poa" */ val ProofOfAuthority: typings.ethereumjsCommon.enumsMod.ConsensusType.ProofOfAuthority & String = js.native
    
    /* "pos" */ val ProofOfStake: typings.ethereumjsCommon.enumsMod.ConsensusType.ProofOfStake & String = js.native
    
    /* "pow" */ val ProofOfWork: typings.ethereumjsCommon.enumsMod.ConsensusType.ProofOfWork & String = js.native
  }
  
  @JSImport("@ethereumjs/common", "CustomChain")
  @js.native
  object CustomChain extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethereumjsCommon.enumsMod.CustomChain & String] = js.native
    
    /* "arbitrum-rinkeby-testnet" */ val ArbitrumRinkebyTestnet: typings.ethereumjsCommon.enumsMod.CustomChain.ArbitrumRinkebyTestnet & String = js.native
    
    /* "optimistic-ethereum" */ val OptimisticEthereum: typings.ethereumjsCommon.enumsMod.CustomChain.OptimisticEthereum & String = js.native
    
    /* "optimistic-kovan" */ val OptimisticKovan: typings.ethereumjsCommon.enumsMod.CustomChain.OptimisticKovan & String = js.native
    
    /* "polygon-mainnet" */ val PolygonMainnet: typings.ethereumjsCommon.enumsMod.CustomChain.PolygonMainnet & String = js.native
    
    /* "polygon-mumbai" */ val PolygonMumbai: typings.ethereumjsCommon.enumsMod.CustomChain.PolygonMumbai & String = js.native
    
    /* "x-dai-chain" */ val xDaiChain: typings.ethereumjsCommon.enumsMod.CustomChain.xDaiChain & String = js.native
  }
  
  @JSImport("@ethereumjs/common", "Hardfork")
  @js.native
  object Hardfork extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethereumjsCommon.enumsMod.Hardfork & String] = js.native
    
    /* "arrowGlacier" */ val ArrowGlacier: typings.ethereumjsCommon.enumsMod.Hardfork.ArrowGlacier & String = js.native
    
    /* "berlin" */ val Berlin: typings.ethereumjsCommon.enumsMod.Hardfork.Berlin & String = js.native
    
    /* "byzantium" */ val Byzantium: typings.ethereumjsCommon.enumsMod.Hardfork.Byzantium & String = js.native
    
    /* "chainstart" */ val Chainstart: typings.ethereumjsCommon.enumsMod.Hardfork.Chainstart & String = js.native
    
    /* "constantinople" */ val Constantinople: typings.ethereumjsCommon.enumsMod.Hardfork.Constantinople & String = js.native
    
    /* "dao" */ val Dao: typings.ethereumjsCommon.enumsMod.Hardfork.Dao & String = js.native
    
    /* "grayGlacier" */ val GrayGlacier: typings.ethereumjsCommon.enumsMod.Hardfork.GrayGlacier & String = js.native
    
    /* "homestead" */ val Homestead: typings.ethereumjsCommon.enumsMod.Hardfork.Homestead & String = js.native
    
    /* "istanbul" */ val Istanbul: typings.ethereumjsCommon.enumsMod.Hardfork.Istanbul & String = js.native
    
    /* "london" */ val London: typings.ethereumjsCommon.enumsMod.Hardfork.London & String = js.native
    
    /* "merge" */ val Merge: typings.ethereumjsCommon.enumsMod.Hardfork.Merge & String = js.native
    
    /* "mergeForkIdTransition" */ val MergeForkIdTransition: typings.ethereumjsCommon.enumsMod.Hardfork.MergeForkIdTransition & String = js.native
    
    /* "muirGlacier" */ val MuirGlacier: typings.ethereumjsCommon.enumsMod.Hardfork.MuirGlacier & String = js.native
    
    /* "petersburg" */ val Petersburg: typings.ethereumjsCommon.enumsMod.Hardfork.Petersburg & String = js.native
    
    /* "shanghai" */ val Shanghai: typings.ethereumjsCommon.enumsMod.Hardfork.Shanghai & String = js.native
    
    /* "spuriousDragon" */ val SpuriousDragon: typings.ethereumjsCommon.enumsMod.Hardfork.SpuriousDragon & String = js.native
    
    /* "tangerineWhistle" */ val TangerineWhistle: typings.ethereumjsCommon.enumsMod.Hardfork.TangerineWhistle & String = js.native
  }
}
