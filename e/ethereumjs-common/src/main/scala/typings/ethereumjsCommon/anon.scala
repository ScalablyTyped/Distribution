package typings.ethereumjsCommon

import typings.ethereumjsCommon.distTypesMod.BootstrapNode
import typings.ethereumjsCommon.distTypesMod.GenesisBlock
import typings.ethereumjsCommon.distTypesMod.Hardfork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ethereumjs-common.ethereumjs-common/dist/types.Chain> */
  trait PartialChain extends StObject {
    
    var bootstrapNodes: js.UndefOr[js.Array[BootstrapNode]] = js.undefined
    
    var chainId: js.UndefOr[Double] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var genesis: js.UndefOr[GenesisBlock] = js.undefined
    
    var hardforks: js.UndefOr[js.Array[Hardfork]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var networkId: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PartialChain {
    
    inline def apply(): PartialChain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChain]
    }
    
    extension [Self <: PartialChain](x: Self) {
      
      inline def setBootstrapNodes(value: js.Array[BootstrapNode]): Self = StObject.set(x, "bootstrapNodes", value.asInstanceOf[js.Any])
      
      inline def setBootstrapNodesUndefined: Self = StObject.set(x, "bootstrapNodes", js.undefined)
      
      inline def setBootstrapNodesVarargs(value: BootstrapNode*): Self = StObject.set(x, "bootstrapNodes", js.Array(value*))
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setGenesis(value: GenesisBlock): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      inline def setGenesisUndefined: Self = StObject.set(x, "genesis", js.undefined)
      
      inline def setHardforks(value: js.Array[Hardfork]): Self = StObject.set(x, "hardforks", value.asInstanceOf[js.Any])
      
      inline def setHardforksUndefined: Self = StObject.set(x, "hardforks", js.undefined)
      
      inline def setHardforksVarargs(value: Hardfork*): Self = StObject.set(x, "hardforks", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
      
      inline def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
