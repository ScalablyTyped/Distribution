package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Load balancing specific fields for network endpoint group.
  */
@js.native
trait SchemaNetworkEndpointGroupLbNetworkEndpointGroup extends js.Object {
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

object SchemaNetworkEndpointGroupLbNetworkEndpointGroup {
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupLbNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupLbNetworkEndpointGroup]
  }
  @scala.inline
  implicit class SchemaNetworkEndpointGroupLbNetworkEndpointGroupOps[Self <: SchemaNetworkEndpointGroupLbNetworkEndpointGroup] (val x: Self) extends AnyVal {
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
    def setDefaultPort(value: Double): Self = this.set("defaultPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPort: Self = this.set("defaultPort", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

