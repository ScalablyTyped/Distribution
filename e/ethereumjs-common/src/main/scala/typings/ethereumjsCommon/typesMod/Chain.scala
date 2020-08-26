package typings.ethereumjsCommon.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain extends js.Object {
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
  implicit class ChainOps[Self <: Chain] (val x: Self) extends AnyVal {
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
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenesis(value: GenesisBlock): Self = this.set("genesis", value.asInstanceOf[js.Any])
    @scala.inline
    def setHardforksVarargs(value: Hardfork*): Self = this.set("hardforks", js.Array(value :_*))
    @scala.inline
    def setHardforks(value: js.Array[Hardfork]): Self = this.set("hardforks", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkId(value: Double): Self = this.set("networkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

