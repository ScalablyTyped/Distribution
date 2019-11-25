package typings.ethereumjsDashCommon.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain extends js.Object {
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
}

