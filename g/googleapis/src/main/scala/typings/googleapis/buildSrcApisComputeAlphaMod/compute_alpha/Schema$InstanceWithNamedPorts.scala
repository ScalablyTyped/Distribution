package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceWithNamedPorts extends js.Object {
  /**
    * [Output Only] The URL of the instance.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * [Output Only] The named ports that belong to this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[Schema$NamedPort]] = js.native
  /**
    * [Output Only] The status of the instance.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$InstanceWithNamedPorts {
  @scala.inline
  def apply(instance: String = null, namedPorts: js.Array[Schema$NamedPort] = null, status: String = null): Schema$InstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceWithNamedPorts]
  }
}

