package typings.ethereumjsCommon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait BootstrapNode extends StObject {
    
    var chainId: js.UndefOr[Double] = js.native
    
    var comment: String = js.native
    
    var id: String = js.native
    
    var ip: String = js.native
    
    var location: String = js.native
    
    var network: js.UndefOr[String] = js.native
    
    var port: Double | String = js.native
  }
  object BootstrapNode {
    
    @scala.inline
    def apply(comment: String, id: String, ip: String, location: String, port: Double | String): BootstrapNode = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootstrapNode]
    }
    
    @scala.inline
    implicit class BootstrapNodeMutableBuilder[Self <: BootstrapNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Chain extends StObject {
    
    var bootstrapNodes: js.Array[BootstrapNode] = js.native
    
    var chainId: Double = js.native
    
    var comment: String = js.native
    
    var genesis: GenesisBlock = js.native
    
    var hardforks: js.Array[Hardfork] = js.native
    
    var name: String = js.native
    
    var networkId: Double = js.native
    
    var url: String = js.native
  }
  object Chain {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ChainMutableBuilder[Self <: Chain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapNodes(value: js.Array[BootstrapNode]): Self = StObject.set(x, "bootstrapNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapNodesVarargs(value: BootstrapNode*): Self = StObject.set(x, "bootstrapNodes", js.Array(value :_*))
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenesis(value: GenesisBlock): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardforks(value: js.Array[Hardfork]): Self = StObject.set(x, "hardforks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardforksVarargs(value: Hardfork*): Self = StObject.set(x, "hardforks", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GenesisBlock extends StObject {
    
    var difficulty: Double = js.native
    
    var extraData: String = js.native
    
    var gasLimit: Double = js.native
    
    var hash: String = js.native
    
    var nonce: String = js.native
    
    var stateRoot: String = js.native
    
    var timestamp: String | Null = js.native
  }
  object GenesisBlock {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      hash: String,
      nonce: String,
      stateRoot: String
    ): GenesisBlock = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenesisBlock]
    }
    
    @scala.inline
    implicit class GenesisBlockMutableBuilder[Self <: GenesisBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    }
  }
  
  @js.native
  trait Hardfork extends StObject {
    
    var block: Double | Null = js.native
    
    var consensus: String = js.native
    
    var finality: js.Any = js.native
    
    var name: String = js.native
  }
  object Hardfork {
    
    @scala.inline
    def apply(consensus: String, finality: js.Any, name: String): Hardfork = {
      val __obj = js.Dynamic.literal(consensus = consensus.asInstanceOf[js.Any], finality = finality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hardfork]
    }
    
    @scala.inline
    implicit class HardforkMutableBuilder[Self <: Hardfork] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Double): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNull: Self = StObject.set(x, "block", null)
      
      @scala.inline
      def setConsensus(value: String): Self = StObject.set(x, "consensus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinality(value: js.Any): Self = StObject.set(x, "finality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait chainsType
    extends /* key */ StringDictionary[js.Any] {
    
    var names: StringDictionary[String] = js.native
  }
  object chainsType {
    
    @scala.inline
    def apply(names: StringDictionary[String]): chainsType = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[chainsType]
    }
    
    @scala.inline
    implicit class chainsTypeMutableBuilder[Self <: chainsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNames(value: StringDictionary[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait genesisStatesType
    extends /* key */ StringDictionary[js.Object] {
    
    var names: StringDictionary[String] = js.native
  }
  object genesisStatesType {
    
    @scala.inline
    def apply(names: StringDictionary[String]): genesisStatesType = {
      val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[genesisStatesType]
    }
    
    @scala.inline
    implicit class genesisStatesTypeMutableBuilder[Self <: genesisStatesType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNames(value: StringDictionary[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    }
  }
}
