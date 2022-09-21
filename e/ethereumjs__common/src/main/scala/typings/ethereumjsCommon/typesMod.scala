package typings.ethereumjsCommon

import org.scalablytyped.runtime.StringDictionary
import typings.ethereumjsCommon.anon.Algorithm
import typings.ethereumjsCommon.enumsMod.Chain
import typings.ethereumjsCommon.enumsMod.Hardfork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait BaseOpts extends StObject {
    
    /**
      * Selected EIPs which can be activated, please use an array for instantiation
      * (e.g. `eips: [ 2537, ]`)
      *
      * Currently supported:
      *
      * - [EIP-2537](https://eips.ethereum.org/EIPS/eip-2537) - BLS12-381 precompiles
      */
    var eips: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * String identifier ('byzantium') for hardfork or {@link Hardfork} enum.
      *
      * Default: Hardfork.London
      */
    var hardfork: js.UndefOr[String | Hardfork] = js.undefined
  }
  object BaseOpts {
    
    inline def apply(): BaseOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOpts]
    }
    
    extension [Self <: BaseOpts](x: Self) {
      
      inline def setEips(value: js.Array[Double]): Self = StObject.set(x, "eips", value.asInstanceOf[js.Any])
      
      inline def setEipsUndefined: Self = StObject.set(x, "eips", js.undefined)
      
      inline def setEipsVarargs(value: Double*): Self = StObject.set(x, "eips", js.Array(value*))
      
      inline def setHardfork(value: String | Hardfork): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      inline def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
    }
  }
  
  trait BootstrapNodeConfig extends StObject {
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var comment: String
    
    var id: String
    
    var ip: String
    
    var location: String
    
    var network: js.UndefOr[String] = js.undefined
    
    var port: Double | String
  }
  object BootstrapNodeConfig {
    
    inline def apply(comment: String, id: String, ip: String, location: String, port: Double | String): BootstrapNodeConfig = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapNodeConfig]
    }
    
    extension [Self <: BootstrapNodeConfig](x: Self) {
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type CasperConfig = js.Object
  
  trait ChainConfig extends StObject {
    
    var bootstrapNodes: js.Array[BootstrapNodeConfig]
    
    var chainId: Double | js.BigInt
    
    var comment: String
    
    var consensus: Algorithm
    
    var defaultHardfork: String
    
    var dnsNetworks: js.UndefOr[js.Array[String]] = js.undefined
    
    var genesis: GenesisBlockConfig
    
    var hardforks: js.Array[HardforkConfig]
    
    var name: String
    
    var networkId: Double | js.BigInt
    
    var url: String
  }
  object ChainConfig {
    
    inline def apply(
      bootstrapNodes: js.Array[BootstrapNodeConfig],
      chainId: Double | js.BigInt,
      comment: String,
      consensus: Algorithm,
      defaultHardfork: String,
      genesis: GenesisBlockConfig,
      hardforks: js.Array[HardforkConfig],
      name: String,
      networkId: Double | js.BigInt,
      url: String
    ): ChainConfig = {
      val __obj = js.Dynamic.literal(bootstrapNodes = bootstrapNodes.asInstanceOf[js.Any], chainId = chainId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], consensus = consensus.asInstanceOf[js.Any], defaultHardfork = defaultHardfork.asInstanceOf[js.Any], genesis = genesis.asInstanceOf[js.Any], hardforks = hardforks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChainConfig]
    }
    
    extension [Self <: ChainConfig](x: Self) {
      
      inline def setBootstrapNodes(value: js.Array[BootstrapNodeConfig]): Self = StObject.set(x, "bootstrapNodes", value.asInstanceOf[js.Any])
      
      inline def setBootstrapNodesVarargs(value: BootstrapNodeConfig*): Self = StObject.set(x, "bootstrapNodes", js.Array(value*))
      
      inline def setChainId(value: Double | js.BigInt): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setConsensus(value: Algorithm): Self = StObject.set(x, "consensus", value.asInstanceOf[js.Any])
      
      inline def setDefaultHardfork(value: String): Self = StObject.set(x, "defaultHardfork", value.asInstanceOf[js.Any])
      
      inline def setDnsNetworks(value: js.Array[String]): Self = StObject.set(x, "dnsNetworks", value.asInstanceOf[js.Any])
      
      inline def setDnsNetworksUndefined: Self = StObject.set(x, "dnsNetworks", js.undefined)
      
      inline def setDnsNetworksVarargs(value: String*): Self = StObject.set(x, "dnsNetworks", js.Array(value*))
      
      inline def setGenesis(value: GenesisBlockConfig): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      inline def setHardforks(value: js.Array[HardforkConfig]): Self = StObject.set(x, "hardforks", value.asInstanceOf[js.Any])
      
      inline def setHardforksVarargs(value: HardforkConfig*): Self = StObject.set(x, "hardforks", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNetworkId(value: Double | js.BigInt): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type ChainName = StringDictionary[String]
  
  type ChainsConfig = StringDictionary[ChainConfig | ChainName]
  
  trait CliqueConfig extends StObject {
    
    var epoch: Double
    
    var period: Double
  }
  object CliqueConfig {
    
    inline def apply(epoch: Double, period: Double): CliqueConfig = {
      val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
      __obj.asInstanceOf[CliqueConfig]
    }
    
    extension [Self <: CliqueConfig](x: Self) {
      
      inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonOpts
    extends StObject
       with BaseOpts {
    
    /**
      * Chain name ('mainnet'), id (1), or {@link Chain} enum,
      * either from a chain directly supported or a custom chain
      * passed in via {@link CommonOpts.customChains}.
      */
    var chain: String | Double | Chain | js.BigInt | js.Object
    
    /**
      * Initialize (in addition to the supported chains) with the selected
      * custom chains. Custom genesis state should be passed to the Blockchain class if used.
      *
      * Usage (directly with the respective chain initialization via the {@link CommonOpts.chain} option):
      *
      * ```javascript
      * import myCustomChain1 from '[PATH_TO_MY_CHAINS]/myCustomChain1.json'
      * const common = new Common({ chain: 'myCustomChain1', customChains: [ myCustomChain1 ]})
      * ```
      */
    var customChains: js.UndefOr[js.Array[ChainConfig]] = js.undefined
  }
  object CommonOpts {
    
    inline def apply(chain: String | Double | Chain | js.BigInt | js.Object): CommonOpts = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonOpts]
    }
    
    extension [Self <: CommonOpts](x: Self) {
      
      inline def setChain(value: String | Double | Chain | js.BigInt | js.Object): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      inline def setCustomChains(value: js.Array[ChainConfig]): Self = StObject.set(x, "customChains", value.asInstanceOf[js.Any])
      
      inline def setCustomChainsUndefined: Self = StObject.set(x, "customChains", js.undefined)
      
      inline def setCustomChainsVarargs(value: ChainConfig*): Self = StObject.set(x, "customChains", js.Array(value*))
    }
  }
  
  trait CustomCommonOpts
    extends StObject
       with BaseOpts {
    
    /**
      * The name (`mainnet`), id (`1`), or {@link Chain} enum of
      * a standard chain used to base the custom chain params on.
      */
    var baseChain: js.UndefOr[String | Double | Chain | js.BigInt] = js.undefined
  }
  object CustomCommonOpts {
    
    inline def apply(): CustomCommonOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomCommonOpts]
    }
    
    extension [Self <: CustomCommonOpts](x: Self) {
      
      inline def setBaseChain(value: String | Double | Chain | js.BigInt): Self = StObject.set(x, "baseChain", value.asInstanceOf[js.Any])
      
      inline def setBaseChainUndefined: Self = StObject.set(x, "baseChain", js.undefined)
    }
  }
  
  type EthashConfig = js.Object
  
  trait GenesisBlockConfig extends StObject {
    
    var baseFeePerGas: js.UndefOr[String] = js.undefined
    
    var difficulty: Double
    
    var extraData: String
    
    var gasLimit: Double
    
    var nonce: String
    
    var timestamp: js.UndefOr[String] = js.undefined
  }
  object GenesisBlockConfig {
    
    inline def apply(difficulty: Double, extraData: String, gasLimit: Double, nonce: String): GenesisBlockConfig = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenesisBlockConfig]
    }
    
    extension [Self <: GenesisBlockConfig](x: Self) {
      
      inline def setBaseFeePerGas(value: String): Self = StObject.set(x, "baseFeePerGas", value.asInstanceOf[js.Any])
      
      inline def setBaseFeePerGasUndefined: Self = StObject.set(x, "baseFeePerGas", js.undefined)
      
      inline def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      inline def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait HardforkConfig extends StObject {
    
    var block: Double | Null
    
    var forkHash: js.UndefOr[String | Null] = js.undefined
    
    var name: Hardfork | String
    
    var ttd: js.UndefOr[js.BigInt | String] = js.undefined
  }
  object HardforkConfig {
    
    inline def apply(name: Hardfork | String): HardforkConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = null)
      __obj.asInstanceOf[HardforkConfig]
    }
    
    extension [Self <: HardforkConfig](x: Self) {
      
      inline def setBlock(value: Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockNull: Self = StObject.set(x, "block", null)
      
      inline def setForkHash(value: String): Self = StObject.set(x, "forkHash", value.asInstanceOf[js.Any])
      
      inline def setForkHashNull: Self = StObject.set(x, "forkHash", null)
      
      inline def setForkHashUndefined: Self = StObject.set(x, "forkHash", js.undefined)
      
      inline def setName(value: Hardfork | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTtd(value: js.BigInt | String): Self = StObject.set(x, "ttd", value.asInstanceOf[js.Any])
      
      inline def setTtdUndefined: Self = StObject.set(x, "ttd", js.undefined)
    }
  }
}
