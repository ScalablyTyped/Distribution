package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a subnet that was created or discovered by a private access
  * management service.
  */
@js.native
trait Schema$GoogleCloudServicenetworkingV1betaSubnetwork extends js.Object {
  /**
    * Subnetwork CIDR range in `10.x.x.x/y` format.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
    */
  var name: js.UndefOr[String] = js.native
  /**
    * In the Shared VPC host project, the VPC network that&#39;s peered with
    * the consumer network. For example:
    * `projects/1234321/global/networks/host-network`
    */
  var network: js.UndefOr[String] = js.native
  /**
    * This is a discovered subnet that is not within the current consumer
    * allocated ranges.
    */
  var outsideAllocation: js.UndefOr[Boolean] = js.native
}

object Schema$GoogleCloudServicenetworkingV1betaSubnetwork {
  @scala.inline
  def apply(
    ipCidrRange: String = null,
    name: String = null,
    network: String = null,
    outsideAllocation: js.UndefOr[Boolean] = js.undefined
  ): Schema$GoogleCloudServicenetworkingV1betaSubnetwork = {
    val __obj = js.Dynamic.literal()
    if (ipCidrRange != null) __obj.updateDynamic("ipCidrRange")(ipCidrRange.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (!js.isUndefined(outsideAllocation)) __obj.updateDynamic("outsideAllocation")(outsideAllocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicenetworkingV1betaSubnetwork]
  }
}

