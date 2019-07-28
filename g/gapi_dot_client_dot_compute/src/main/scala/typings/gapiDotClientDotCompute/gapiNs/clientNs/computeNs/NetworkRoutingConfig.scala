package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkRoutingConfig extends js.Object {
  /**
    * The network-wide routing mode to use. If set to REGIONAL, this network's cloud routers will only advertise routes with subnetworks of this network in
    * the same region as the router. If set to GLOBAL, this network's cloud routers will advertise routes with all subnetworks of this network, across
    * regions.
    */
  var routingMode: js.UndefOr[String] = js.undefined
}

object NetworkRoutingConfig {
  @scala.inline
  def apply(routingMode: String = null): NetworkRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (routingMode != null) __obj.updateDynamic("routingMode")(routingMode)
    __obj.asInstanceOf[NetworkRoutingConfig]
  }
}

