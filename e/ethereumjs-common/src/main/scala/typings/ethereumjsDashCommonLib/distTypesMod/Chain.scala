package typings
package ethereumjsDashCommonLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain extends js.Object {
  var bootstrapNodes: js.Array[BootstrapNode]
  var chainId: scala.Double
  var comment: java.lang.String
  var genesis: GenesisBlock
  var hardforks: js.Array[Hardfork]
  var name: java.lang.String
  var networkId: scala.Double
  var url: java.lang.String
}

object Chain {
  @scala.inline
  def apply(
    bootstrapNodes: js.Array[BootstrapNode],
    chainId: scala.Double,
    comment: java.lang.String,
    genesis: GenesisBlock,
    hardforks: js.Array[Hardfork],
    name: java.lang.String,
    networkId: scala.Double,
    url: java.lang.String
  ): Chain = {
    val __obj = js.Dynamic.literal(bootstrapNodes = bootstrapNodes, chainId = chainId, comment = comment, genesis = genesis, hardforks = hardforks, name = name, networkId = networkId, url = url)
  
    __obj.asInstanceOf[Chain]
  }
}

