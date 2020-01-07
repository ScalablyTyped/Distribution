package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The device resources for the user.
  */
@js.native
trait Schema$DevicesListResponse extends js.Object {
  /**
    * A managed device.
    */
  var device: js.UndefOr[js.Array[Schema$Device]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#devicesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DevicesListResponse {
  @scala.inline
  def apply(device: js.Array[Schema$Device] = null, kind: String = null): Schema$DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DevicesListResponse]
  }
}

