package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extra network settings. Only applicable in the App Engine flexible
  * environment.
  */
@js.native
trait Schema$Network extends js.Object {
  /**
    * List of ports, or port pairs, to forward from the virtual machine to the
    * application container. Only applicable in the App Engine flexible
    * environment.
    */
  var forwardedPorts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag to apply to the instance during creation. Only applicable in the App
    * Engine flexible environment.
    */
  var instanceTag: js.UndefOr[String] = js.native
  /**
    * Google Compute Engine network where the virtual machines are created.
    * Specify the short name, not the resource path.Defaults to default.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Enable session affinity. Only applicable in the App Engine flexible
    * environment.
    */
  var sessionAffinity: js.UndefOr[Boolean] = js.native
  /**
    * Google Cloud Platform sub-network where the virtual machines are created.
    * Specify the short name, not the resource path.If a subnetwork name is
    * specified, a network name will also be required unless it is for the
    * default network. If the network that the instance is being created in is
    * a Legacy network, then the IP address is allocated from the IPv4Range. If
    * the network that the instance is being created in is an auto Subnet Mode
    * Network, then only network name should be specified (not the
    * subnetwork_name) and the IP address is created from the IPCidrRange of
    * the subnetwork that exists in that zone for that network. If the network
    * that the instance is being created in is a custom Subnet Mode Network,
    * then the subnetwork_name must be specified and the IP address is created
    * from the IPCidrRange of the subnetwork.If specified, the subnetwork must
    * exist in the same region as the App Engine flexible environment
    * application.
    */
  var subnetworkName: js.UndefOr[String] = js.native
}

object Schema$Network {
  @scala.inline
  def apply(
    forwardedPorts: js.Array[String] = null,
    instanceTag: String = null,
    name: String = null,
    sessionAffinity: js.UndefOr[Boolean] = js.undefined,
    subnetworkName: String = null
  ): Schema$Network = {
    val __obj = js.Dynamic.literal()
    if (forwardedPorts != null) __obj.updateDynamic("forwardedPorts")(forwardedPorts.asInstanceOf[js.Any])
    if (instanceTag != null) __obj.updateDynamic("instanceTag")(instanceTag.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionAffinity)) __obj.updateDynamic("sessionAffinity")(sessionAffinity.asInstanceOf[js.Any])
    if (subnetworkName != null) __obj.updateDynamic("subnetworkName")(subnetworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Network]
  }
}

