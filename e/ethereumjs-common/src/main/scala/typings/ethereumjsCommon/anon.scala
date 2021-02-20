package typings.ethereumjsCommon

import typings.ethereumjsCommon.typesMod.BootstrapNode
import typings.ethereumjsCommon.typesMod.GenesisBlock
import typings.ethereumjsCommon.typesMod.Hardfork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ethereumjs-common.ethereumjs-common/dist/types.Chain> */
  @js.native
  trait PartialChain extends StObject {
    
    var bootstrapNodes: js.UndefOr[js.Array[BootstrapNode]] = js.native
    
    var chainId: js.UndefOr[Double] = js.native
    
    var comment: js.UndefOr[String] = js.native
    
    var genesis: js.UndefOr[GenesisBlock] = js.native
    
    var hardforks: js.UndefOr[js.Array[Hardfork]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var networkId: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object PartialChain {
    
    @scala.inline
    def apply(): PartialChain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialChain]
    }
    
    @scala.inline
    implicit class PartialChainMutableBuilder[Self <: PartialChain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapNodes(value: js.Array[BootstrapNode]): Self = StObject.set(x, "bootstrapNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBootstrapNodesUndefined: Self = StObject.set(x, "bootstrapNodes", js.undefined)
      
      @scala.inline
      def setBootstrapNodesVarargs(value: BootstrapNode*): Self = StObject.set(x, "bootstrapNodes", js.Array(value :_*))
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setGenesis(value: GenesisBlock): Self = StObject.set(x, "genesis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenesisUndefined: Self = StObject.set(x, "genesis", js.undefined)
      
      @scala.inline
      def setHardforks(value: js.Array[Hardfork]): Self = StObject.set(x, "hardforks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardforksUndefined: Self = StObject.set(x, "hardforks", js.undefined)
      
      @scala.inline
      def setHardforksVarargs(value: Hardfork*): Self = StObject.set(x, "hardforks", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNetworkId(value: Double): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
