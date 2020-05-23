package typings.ethereumjsCommon.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapNode extends js.Object {
  var chainId: js.UndefOr[Double] = js.undefined
  var comment: String
  var id: String
  var ip: String
  var location: String
  var network: js.UndefOr[String] = js.undefined
  var port: Double | String
}

object BootstrapNode {
  @scala.inline
  def apply(
    comment: String,
    id: String,
    ip: String,
    location: String,
    port: Double | String,
    chainId: js.UndefOr[Double] = js.undefined,
    network: String = null
  ): BootstrapNode = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(chainId)) __obj.updateDynamic("chainId")(chainId.get.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapNode]
  }
}

