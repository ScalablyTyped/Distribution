package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Network extends js.Object {
  /**
    * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable for App Engine flexible environment
    * versions.
    */
  var forwardedPorts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Tag to apply to the VM instance during creation. Only applicable for for App Engine flexible environment versions. */
  var instanceTag: js.UndefOr[java.lang.String] = js.undefined
  /** Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is
    * specified, a network name will also be required unless it is for the default network.
    * If the network the VM instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
    * If the network the VM instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name)
    * and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
    * If the network the VM instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is
    * created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment
    * application.
    */
  var subnetworkName: js.UndefOr[java.lang.String] = js.undefined
}

object Network {
  @scala.inline
  def apply(
    forwardedPorts: js.Array[java.lang.String] = null,
    instanceTag: java.lang.String = null,
    name: java.lang.String = null,
    subnetworkName: java.lang.String = null
  ): Network = {
    val __obj = js.Dynamic.literal()
    if (forwardedPorts != null) __obj.updateDynamic("forwardedPorts")(forwardedPorts)
    if (instanceTag != null) __obj.updateDynamic("instanceTag")(instanceTag)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subnetworkName != null) __obj.updateDynamic("subnetworkName")(subnetworkName)
    __obj.asInstanceOf[Network]
  }
}

