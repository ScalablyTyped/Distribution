package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device resources for the user.
  */
@js.native
trait SchemaDevicesListResponse extends js.Object {
  /**
    * A managed device.
    */
  var device: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#devicesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDevicesListResponse {
  @scala.inline
  def apply(device: js.Array[SchemaDevice] = null, kind: String = null): SchemaDevicesListResponse = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDevicesListResponse]
  }
}

