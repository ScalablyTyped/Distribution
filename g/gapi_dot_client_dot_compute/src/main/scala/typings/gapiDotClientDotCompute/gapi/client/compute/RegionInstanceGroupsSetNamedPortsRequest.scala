package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsSetNamedPortsRequest extends js.Object {
  /**
    * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the
    * named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure
    * that you do not overwrite changes that were applied from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** The list of named ports to set for this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.undefined
}

object RegionInstanceGroupsSetNamedPortsRequest {
  @scala.inline
  def apply(fingerprint: String = null, namedPorts: js.Array[NamedPort] = null): RegionInstanceGroupsSetNamedPortsRequest = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts)
    __obj.asInstanceOf[RegionInstanceGroupsSetNamedPortsRequest]
  }
}

