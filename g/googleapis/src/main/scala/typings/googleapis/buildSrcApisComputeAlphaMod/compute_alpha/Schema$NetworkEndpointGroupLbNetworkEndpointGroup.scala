package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Load balancing specific fields for network endpoint group.
  */
@js.native
trait Schema$NetworkEndpointGroupLbNetworkEndpointGroup extends js.Object {
  /**
    * The default port used if the port number is not specified in the network
    * endpoint. [Deprecated] This field is deprecated.
    */
  var defaultPort: js.UndefOr[Double] = js.native
  /**
    * The URL of the network to which all network endpoints in the NEG belong.
    * Uses &quot;default&quot; project network if unspecified. [Deprecated]
    * This field is deprecated.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG
    * belong. [Deprecated] This field is deprecated.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL of the zone where the network endpoint group is
    * located. [Deprecated] This field is deprecated.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$NetworkEndpointGroupLbNetworkEndpointGroup {
  @scala.inline
  def apply(
    defaultPort: Int | Double = null,
    network: String = null,
    subnetwork: String = null,
    zone: String = null
  ): Schema$NetworkEndpointGroupLbNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointGroupLbNetworkEndpointGroup]
  }
}

