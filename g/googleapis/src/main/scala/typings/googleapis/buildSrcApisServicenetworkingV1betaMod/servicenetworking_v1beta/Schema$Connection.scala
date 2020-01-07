package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a private connection resource. A private connection is
  * implemented as a VPC Network Peering connection between a service
  * producer&#39;s VPC network and a service consumer&#39;s VPC network.
  */
@js.native
trait Schema$Connection extends js.Object {
  /**
    * The name of service consumer&#39;s VPC network that&#39;s connected with
    * service producer network, in the following format:
    * `projects/{project}/global/networks/{network}`. `{project}` is a project
    * number, such as in `12345` that includes the VPC service consumer&#39;s
    * VPC network. `{network}` is the name of the service consumer&#39;s VPC
    * network.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the VPC Network Peering connection that was
    * created by the service producer.
    */
  var peering: js.UndefOr[String] = js.native
  /**
    * The name of one or more allocated IP address ranges for this service
    * producer of type `PEERING`. Note that invoking this method with a
    * different range when connection is already established will not modify
    * already provisioned service producer subnetworks.
    */
  var reservedPeeringRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The name of the peering service that&#39;s associated with
    * this connection, in the following format: `services/{service name}`.
    */
  var service: js.UndefOr[String] = js.native
}

object Schema$Connection {
  @scala.inline
  def apply(
    network: String = null,
    peering: String = null,
    reservedPeeringRanges: js.Array[String] = null,
    service: String = null
  ): Schema$Connection = {
    val __obj = js.Dynamic.literal()
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (peering != null) __obj.updateDynamic("peering")(peering.asInstanceOf[js.Any])
    if (reservedPeeringRanges != null) __obj.updateDynamic("reservedPeeringRanges")(reservedPeeringRanges.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Connection]
  }
}

