package typings.ethereumjsCommon.anon

import typings.ethereumjsCommon.typesMod.BootstrapNode
import typings.ethereumjsCommon.typesMod.GenesisBlock
import typings.ethereumjsCommon.typesMod.Hardfork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ethereumjs-common.ethereumjs-common/dist/types.Chain> */
@js.native
trait PartialChain extends js.Object {
  
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
  implicit class PartialChainOps[Self <: PartialChain] (val x: Self) extends AnyVal {
    
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
    def setBootstrapNodesVarargs(value: BootstrapNode*): Self = this.set("bootstrapNodes", js.Array(value :_*))
    
    @scala.inline
    def setBootstrapNodes(value: js.Array[BootstrapNode]): Self = this.set("bootstrapNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrapNodes: Self = this.set("bootstrapNodes", js.undefined)
    
    @scala.inline
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChainId: Self = this.set("chainId", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setGenesis(value: GenesisBlock): Self = this.set("genesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenesis: Self = this.set("genesis", js.undefined)
    
    @scala.inline
    def setHardforksVarargs(value: Hardfork*): Self = this.set("hardforks", js.Array(value :_*))
    
    @scala.inline
    def setHardforks(value: js.Array[Hardfork]): Self = this.set("hardforks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardforks: Self = this.set("hardforks", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkId(value: Double): Self = this.set("networkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkId: Self = this.set("networkId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
