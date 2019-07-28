package typings.ethereumjsDashCommon.distTypesMod

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
    chainId: Int | Double = null,
    network: String = null
  ): BootstrapNode = {
    val __obj = js.Dynamic.literal(comment = comment, id = id, ip = ip, location = location, port = port.asInstanceOf[js.Any])
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network)
    __obj.asInstanceOf[BootstrapNode]
  }
}

