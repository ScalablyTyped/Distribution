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
    val __obj = js.Dynamic.literal(bootstrapNodes = bootstrapNodes, chainId = chainId, comment = comment, genesis = genesis, hardforks = hardforks, name = name, networkId = networkId, url = url)
  
    __obj.asInstanceOf[Chain]
  }
}

