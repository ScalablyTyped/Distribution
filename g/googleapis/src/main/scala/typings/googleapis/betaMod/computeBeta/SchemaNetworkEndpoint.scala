package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The network endpoint.
  */
@js.native
trait SchemaNetworkEndpoint extends js.Object {
  /**
    * The name for a specific VM instance that the IP address belongs to. This
    * is required for network endpoints of type GCE_VM_IP_PORT. The instance
    * must be in the same zone of network endpoint group.  The name must be
    * 1-63 characters long, and comply with RFC1035.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * Optional IPv4 address of network endpoint. The IP address must belong to
    * a VM in GCE (either the primary IP or as part of an aliased IP range). If
    * the IP address is not specified, then the primary IP address for the VM
    * instance in the network that the network endpoint group belongs to will
    * be used.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * Optional port number of network endpoint. If not specified and the
    * NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the
    * defaultPort for the network endpoint group will be used.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaNetworkEndpoint {
  @scala.inline
  def apply(instance: String = null, ipAddress: String = null, port: js.UndefOr[Double] = js.undefined): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
}

