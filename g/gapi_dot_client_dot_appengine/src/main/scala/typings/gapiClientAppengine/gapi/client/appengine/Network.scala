package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Network extends js.Object {
  /**
    * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable for App Engine flexible environment
    * versions.
    */
  var forwardedPorts: js.UndefOr[js.Array[String]] = js.native
  /** Tag to apply to the VM instance during creation. Only applicable for for App Engine flexible environment versions. */
  var instanceTag: js.UndefOr[String] = js.native
  /** Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default. */
  var name: js.UndefOr[String] = js.native
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
  var subnetworkName: js.UndefOr[String] = js.native
}

object Network {
  @scala.inline
  def apply(): Network = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Network]
  }
  @scala.inline
  implicit class NetworkOps[Self <: Network] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForwardedPortsVarargs(value: String*): Self = this.set("forwardedPorts", js.Array(value :_*))
    @scala.inline
    def setForwardedPorts(value: js.Array[String]): Self = this.set("forwardedPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardedPorts: Self = this.set("forwardedPorts", js.undefined)
    @scala.inline
    def setInstanceTag(value: String): Self = this.set("instanceTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTag: Self = this.set("instanceTag", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSubnetworkName(value: String): Self = this.set("subnetworkName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetworkName: Self = this.set("subnetworkName", js.undefined)
  }
  
}

