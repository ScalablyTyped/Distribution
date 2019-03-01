package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesListResponse extends js.Object {
  /** A managed device. */
  var device: js.UndefOr[js.Array[Device]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#devicesListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DevicesListResponse {
  @scala.inline
  def apply(device: js.Array[Device] = null, kind: java.lang.String = null): DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DevicesListResponse]
  }
}

