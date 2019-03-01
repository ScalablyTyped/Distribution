package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceWithNamedPorts extends js.Object {
  /** [Output Only] The URL of the instance. */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The named ports that belong to this instance group. */
  var namedPorts: js.UndefOr[js.Array[NamedPort]] = js.undefined
  /** [Output Only] The status of the instance. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceWithNamedPorts {
  @scala.inline
  def apply(
    instance: java.lang.String = null,
    namedPorts: js.Array[NamedPort] = null,
    status: java.lang.String = null
  ): InstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[InstanceWithNamedPorts]
  }
}

