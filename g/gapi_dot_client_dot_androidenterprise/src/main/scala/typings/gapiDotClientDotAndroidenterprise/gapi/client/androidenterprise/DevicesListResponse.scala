package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesListResponse extends js.Object {
  /** A managed device. */
  var device: js.UndefOr[js.Array[Device]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#devicesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object DevicesListResponse {
  @scala.inline
  def apply(device: js.Array[Device] = null, kind: String = null): DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesListResponse]
  }
}

