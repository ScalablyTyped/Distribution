package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsSetNamedPortsRequest extends js.Object {
  /**
    * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the
    * named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure
    * that you do not overwrite changes that were applied from another concurrent request.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /** The list of named ports to set for this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.native
}

object InstanceGroupsSetNamedPortsRequest {
  @scala.inline
  def apply(): InstanceGroupsSetNamedPortsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsSetNamedPortsRequest]
  }
  @scala.inline
  implicit class InstanceGroupsSetNamedPortsRequestOps[Self <: InstanceGroupsSetNamedPortsRequest] (val x: Self) extends AnyVal {
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setNamedPortsVarargs(value: NamedPort*): Self = this.set("namedPorts", js.Array(value :_*))
    @scala.inline
    def setNamedPorts(value: js.Array[NamedPort]): Self = this.set("namedPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedPorts: Self = this.set("namedPorts", js.undefined)
  }
  
}

