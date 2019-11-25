package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceWithNamedPorts extends js.Object {
  /** [Output Only] The URL of the instance. */
  var instance: js.UndefOr[String] = js.undefined
  /** [Output Only] The named ports that belong to this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.undefined
  /** [Output Only] The status of the instance. */
  var status: js.UndefOr[String] = js.undefined
}

object InstanceWithNamedPorts {
  @scala.inline
  def apply(instance: String = null, namedPorts: js.Array[NamedPort] = null, status: String = null): InstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceWithNamedPorts]
  }
}

