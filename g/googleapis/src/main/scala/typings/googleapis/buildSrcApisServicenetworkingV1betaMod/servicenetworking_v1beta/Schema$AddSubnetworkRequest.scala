package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a subnetwork in a previously peered service network.
  */
@js.native
trait Schema$AddSubnetworkRequest extends js.Object {
  /**
    * Required. A resource that represents the service consumer, such as
    * `projects/123456`. The project number can be different from the value in
    * the consumer network parameter. For example, the network might be part of
    * a Shared VPC network. In those cases, Service Networking validates that
    * this resource belongs to that Shared VPC.
    */
  var consumer: js.UndefOr[String] = js.native
  /**
    * Required. The name of the service consumer&#39;s VPC network. The network
    * must have an existing private connection that was provisioned through the
    * connections.create method. The name must be in the following format:
    * `projects/{project}/global/networks/{network}`, where {project} is a
    * project number, such as `12345`. {network} is the name of a VPC network
    * in the project.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  /**
    * An optional description of the subnet.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The prefix length of the subnet&#39;s IP address range.  Use
    * CIDR range notation, such as `30` to provision a subnet with an
    * `x.x.x.x/30` CIDR range. The IP address range is drawn from a pool of
    * available ranges in the service consumer&#39;s allocated range.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  /**
    * Required. The name of a [region](/compute/docs/regions-zones) for the
    * subnet, such `europe-west1`.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The starting address of a range. The address must be a valid
    * IPv4 address in the x.x.x.x format. This value combined with the IP
    * prefix range is the CIDR range for the subnet. The range must be within
    * the allocated range that is assigned to the private connection. If the
    * CIDR range isn&#39;t available, the call fails.
    */
  var requestedAddress: js.UndefOr[String] = js.native
  /**
    * Required. A name for the new subnet. For information about the naming
    * requirements, see
    * [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute
    * API documentation.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * A list of members that are granted the `compute.networkUser` role on the
    * subnet.
    */
  var subnetworkUsers: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AddSubnetworkRequest {
  @scala.inline
  def apply(
    consumer: String = null,
    consumerNetwork: String = null,
    description: String = null,
    ipPrefixLength: Int | Double = null,
    region: String = null,
    requestedAddress: String = null,
    subnetwork: String = null,
    subnetworkUsers: js.Array[String] = null
  ): Schema$AddSubnetworkRequest = {
    val __obj = js.Dynamic.literal()
    if (consumer != null) __obj.updateDynamic("consumer")(consumer.asInstanceOf[js.Any])
    if (consumerNetwork != null) __obj.updateDynamic("consumerNetwork")(consumerNetwork.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ipPrefixLength != null) __obj.updateDynamic("ipPrefixLength")(ipPrefixLength.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (requestedAddress != null) __obj.updateDynamic("requestedAddress")(requestedAddress.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (subnetworkUsers != null) __obj.updateDynamic("subnetworkUsers")(subnetworkUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddSubnetworkRequest]
  }
}

