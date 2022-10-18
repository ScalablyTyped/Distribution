package typings.ethereumjsCommon

import typings.ethereumjsCommon.distEnumsMod.ConsensusAlgorithm
import typings.ethereumjsCommon.distEnumsMod.ConsensusType
import typings.ethereumjsCommon.distTypesMod.BootstrapNodeConfig
import typings.ethereumjsCommon.distTypesMod.CasperConfig
import typings.ethereumjsCommon.distTypesMod.CliqueConfig
import typings.ethereumjsCommon.distTypesMod.EthashConfig
import typings.ethereumjsCommon.distTypesMod.GenesisBlockConfig
import typings.ethereumjsCommon.distTypesMod.HardforkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: ConsensusAlgorithm | String
    
    var casper: js.UndefOr[CasperConfig] = js.undefined
    
    var clique: js.UndefOr[CliqueConfig] = js.undefined
    
    var ethash: js.UndefOr[EthashConfig] = js.undefined
    
    var `type`: ConsensusType | String
  }
  object Algorithm {
    
    inline def apply(algorithm: ConsensusAlgorithm | String, `type`: ConsensusType | String): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: ConsensusAlgorithm | String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCasper(value: CasperConfig): Self = StObject.set(x, "casper", value.asInstanceOf[js.Any])
      
      inline def setCasperUndefined: Self = StObject.set(x, "casper", js.undefined)
      
      inline def setClique(value: CliqueConfig): Self = StObject.set(x, "clique", value.asInstanceOf[js.Any])
      
      inline def setCliqueUndefined: Self = StObject.set(x, "clique", js.undefined)
      
      inline def setEthash(value: EthashConfig): Self = StObject.set(x, "ethash", value.asInstanceOf[js.Any])
      
      inline def setEthashUndefined: Self = StObject.set(x, "ethash", js.undefined)
      
      inline def setType(value: ConsensusType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@ethereumjs/common.@ethereumjs/common/dist/types.ChainConfig> */
  trait PartialChainConfig extends StObject {
    
    var bootstrapNodes: js.UndefOr[js.Array[BootstrapNodeConfig]] = js.undefined
    
    var chainId: js.UndefOr[Double | js.BigInt] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var consensus: js.UndefOr[Algorithm] = js.undefined
    
    var defaultHardfork: js.UndefOr[String] = js.undefined
    
    var dnsNetworks: js.UndefOr[js.Array[String]] = js.undefined
    
    var genesis: js.UndefOr[GenesisBlockConfig] = js.undefined
    
    var hardforks: js.UndefOr[js.Array[HardforkConfig]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var networkId: js.UndefOr[Double | js.BigInt] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PartialChainConfig {
    
    inline def apply(): PartialChainConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChainConfig]
    }
    
    extension [Self <: PartialChainConfig](x: Self) {
      
      inline def setBootstrapNodes(value: js.Array[BootstrapNodeConfig]): Self = StObject.set(x, "bootstrapNodes", value.asInstanceOf[js.Any])
      
      inline def setBootstrapNodesUndefined: Self = StObject.set(x, "bootstrapNodes", js.undefined)
      
      inline def setBootstrapNodesVarargs(value: BootstrapNodeConfig*): Self = StObject.set(x, "bootstrapNodes", js.Array(value*))
      
      inline def setChainId(value: Double | js.BigInt): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setConsensus(value: Algorithm): Self = StObject.set(x, "consensus", value.asInstanceOf[js.Any])
      
      inline def setConsensusUndefined: Self = StObject.set(x, "consensus", js.undefined)
      
      inline def setDefaultHardfork(value: String): Self = StObject.set(x, "defaultHardfork", value.asInstanceOf[js.Any])
      
      inline def setDefaultHardforkUndefined: Self = StObject.set(x, "defaultHardfork", js.undefined)
      
      inline def setDnsNetworks(value: js.Array[String]): Self = StObject.set(x, "dnsNetworks", value.asInstanceOf[js.Any])
      
      inline def setDnsNetworksUndefined: Self = StObject.set(x, "dnsNetworks", js.undefined)
      
      inline def setDnsNetworksVarargs(value: String*): Self = StObject.set(x, "dnsNetworks", js.Array(value*))
      
      inline def setGenesis(value: GenesisBlockConfig): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      inline def setGenesisUndefined: Self = StObject.set(x, "genesis", js.undefined)
      
      inline def setHardforks(value: js.Array[HardforkConfig]): Self = StObject.set(x, "hardforks", value.asInstanceOf[js.Any])
      
      inline def setHardforksUndefined: Self = StObject.set(x, "hardforks", js.undefined)
      
      inline def setHardforksVarargs(value: HardforkConfig*): Self = StObject.set(x, "hardforks", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetworkId(value: Double | js.BigInt): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
      
      inline def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
