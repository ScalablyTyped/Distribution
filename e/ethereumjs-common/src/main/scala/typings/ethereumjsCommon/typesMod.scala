package typings.ethereumjsCommon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait BootstrapNode extends StObject {
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var comment: String
    
    var id: String
    
    var ip: String
    
    var location: String
    
    var network: js.UndefOr[String] = js.undefined
    
    var port: Double | String
  }
  object BootstrapNode {
    
    inline def apply(comment: String, id: String, ip: String, location: String, port: Double | String): BootstrapNode = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapNode]
    }
    
    extension [Self <: BootstrapNode](x: Self) {
      
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
  
  trait Chain extends StObject {
    
    var bootstrapNodes: js.Array[BootstrapNode]
    
    var chainId: Double
    
    var comment: String
    
    var genesis: GenesisBlock
    
    var hardforks: js.Array[Hardfork]
    
    var name: String
    
    var networkId: Double
    
    var url: String
  }
  object Chain {
    
    inline def apply(
      bootstrapNodes: js.Array[BootstrapNode],
      chainId: Double,
      comment: String,
      genesis: GenesisBlock,
      hardforks: js.Array[Hardfork],
      name: String,
      networkId: Double,
      url: String
    ): Chain = {
      val __obj = js.Dynamic.literal(bootstrapNodes = bootstrapNodes.asInstanceOf[js.Any], chainId = chainId.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], genesis = genesis.asInstanceOf[js.Any], hardforks = hardforks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chain]
    }
    
    extension [Self <: Chain](x: Self) {
      
      inline def setBootstrapNodes(value: js.Array[BootstrapNode]): Self = StObject.set(x, "bootstrapNodes", value.asInstanceOf[js.Any])
      
      inline def setBootstrapNodesVarargs(value: BootstrapNode*): Self = StObject.set(x, "bootstrapNodes", js.Array(value :_*))
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setGenesis(value: GenesisBlock): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      inline def setHardforks(value: js.Array[Hardfork]): Self = StObject.set(x, "hardforks", value.asInstanceOf[js.Any])
      
      inline def setHardforksVarargs(value: Hardfork*): Self = StObject.set(x, "hardforks", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait GenesisBlock extends StObject {
    
    var difficulty: Double
    
    var extraData: String
    
    var gasLimit: Double
    
    var hash: String
    
    var nonce: String
    
    var stateRoot: String
    
    var timestamp: String | Null
  }
  object GenesisBlock {
    
    inline def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      hash: String,
      nonce: String,
      stateRoot: String
    ): GenesisBlock = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = null)
      __obj.asInstanceOf[GenesisBlock]
    }
    
    extension [Self <: GenesisBlock](x: Self) {
      
      inline def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      inline def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    }
  }
  
  trait Hardfork extends StObject {
    
    var block: Double | Null
    
    var consensus: String
    
    var finality: js.Any
    
    var name: String
  }
  object Hardfork {
    
    inline def apply(consensus: String, finality: js.Any, name: String): Hardfork = {
      val __obj = js.Dynamic.literal(consensus = consensus.asInstanceOf[js.Any], finality = finality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], block = null)
      __obj.asInstanceOf[Hardfork]
    }
    
    extension [Self <: Hardfork](x: Self) {
      
      inline def setBlock(value: Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockNull: Self = StObject.set(x, "block", null)
      
      inline def setConsensus(value: String): Self = StObject.set(x, "consensus", value.asInstanceOf[js.Any])
      
      inline def setFinality(value: js.Any): Self = StObject.set(x, "finality", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait chainsType
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var names: StringDictionary[String]
  }
  object chainsType {
    
    inline def apply(names: StringDictionary[String]): chainsType = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[chainsType]
    }
    
    extension [Self <: chainsType](x: Self) {
      
      inline def setNames(value: StringDictionary[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    }
  }
  
  trait genesisStatesType
    extends StObject
       with /* key */ StringDictionary[js.Object] {
    
    var names: StringDictionary[String]
  }
  object genesisStatesType {
    
    inline def apply(names: StringDictionary[String]): genesisStatesType = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[genesisStatesType]
    }
    
    extension [Self <: genesisStatesType](x: Self) {
      
      inline def setNames(value: StringDictionary[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    }
  }
}
