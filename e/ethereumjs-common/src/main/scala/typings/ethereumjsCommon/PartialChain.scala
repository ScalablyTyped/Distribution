package typings.ethereumjsCommon

import typings.ethereumjsCommon.typesMod.BootstrapNode
import typings.ethereumjsCommon.typesMod.GenesisBlock
import typings.ethereumjsCommon.typesMod.Hardfork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ethereumjs-common.ethereumjs-common/dist/types.Chain> */
trait PartialChain extends js.Object {
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
  @scala.inline
  def apply(
    bootstrapNodes: js.Array[BootstrapNode] = null,
    chainId: Int | Double = null,
    comment: String = null,
    genesis: GenesisBlock = null,
    hardforks: js.Array[Hardfork] = null,
    name: String = null,
    networkId: Int | Double = null,
    url: String = null
  ): PartialChain = {
    val __obj = js.Dynamic.literal()
    if (bootstrapNodes != null) __obj.updateDynamic("bootstrapNodes")(bootstrapNodes.asInstanceOf[js.Any])
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (genesis != null) __obj.updateDynamic("genesis")(genesis.asInstanceOf[js.Any])
    if (hardforks != null) __obj.updateDynamic("hardforks")(hardforks.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkId != null) __obj.updateDynamic("networkId")(networkId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChain]
  }
}

