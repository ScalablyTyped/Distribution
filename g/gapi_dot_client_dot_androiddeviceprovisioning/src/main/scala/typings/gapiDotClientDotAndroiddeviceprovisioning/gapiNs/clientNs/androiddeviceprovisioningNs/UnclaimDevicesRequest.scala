package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnclaimDevicesRequest extends js.Object {
  /** List of devices to unclaim. */
  var unclaims: js.UndefOr[js.Array[PartnerUnclaim]] = js.undefined
}

object UnclaimDevicesRequest {
  @scala.inline
  def apply(unclaims: js.Array[PartnerUnclaim] = null): UnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (unclaims != null) __obj.updateDynamic("unclaims")(unclaims)
    __obj.asInstanceOf[UnclaimDevicesRequest]
  }
}

