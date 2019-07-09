package typings
package ethereumjsDashCommonLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapNode extends js.Object {
  var chainId: js.UndefOr[scala.Double] = js.undefined
  var comment: java.lang.String
  var id: java.lang.String
  var ip: java.lang.String
  var location: java.lang.String
  var network: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double | java.lang.String
}

object BootstrapNode {
  @scala.inline
  def apply(
    comment: java.lang.String,
    id: java.lang.String,
    ip: java.lang.String,
    location: java.lang.String,
    port: scala.Double | java.lang.String,
    chainId: scala.Int | scala.Double = null,
    network: java.lang.String = null
  ): BootstrapNode = {
    val __obj = js.Dynamic.literal(comment = comment, id = id, ip = ip, location = location, port = port.asInstanceOf[js.Any])
    if (chainId != null) __obj.updateDynamic("chainId")(chainId.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network)
    __obj.asInstanceOf[BootstrapNode]
  }
}

