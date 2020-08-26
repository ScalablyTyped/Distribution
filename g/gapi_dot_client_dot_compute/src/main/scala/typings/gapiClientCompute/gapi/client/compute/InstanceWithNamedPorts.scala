package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceWithNamedPorts extends js.Object {
  /** [Output Only] The URL of the instance. */
  var instance: js.UndefOr[String] = js.native
  /** [Output Only] The named ports that belong to this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.native
  /** [Output Only] The status of the instance. */
  var status: js.UndefOr[String] = js.native
}

object InstanceWithNamedPorts {
  @scala.inline
  def apply(): InstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWithNamedPorts]
  }
  @scala.inline
  implicit class InstanceWithNamedPortsOps[Self <: InstanceWithNamedPorts] (val x: Self) extends AnyVal {
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
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setNamedPortsVarargs(value: NamedPort*): Self = this.set("namedPorts", js.Array(value :_*))
    @scala.inline
    def setNamedPorts(value: js.Array[NamedPort]): Self = this.set("namedPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedPorts: Self = this.set("namedPorts", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

