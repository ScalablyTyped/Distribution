package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceWithNamedPorts extends js.Object {
  /**
    * [Output Only] The URL of the instance.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * [Output Only] The named ports that belong to this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.native
  /**
    * [Output Only] The status of the instance.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaInstanceWithNamedPorts {
  @scala.inline
  def apply(instance: String = null, namedPorts: js.Array[SchemaNamedPort] = null, status: String = null): SchemaInstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceWithNamedPorts]
  }
}

