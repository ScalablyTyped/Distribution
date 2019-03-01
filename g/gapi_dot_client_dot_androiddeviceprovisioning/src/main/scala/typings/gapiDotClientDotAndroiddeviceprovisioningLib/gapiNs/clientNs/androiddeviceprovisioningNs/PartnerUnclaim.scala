package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerUnclaim extends js.Object {
  /** Device ID of the device. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Section type to unclaim. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

object PartnerUnclaim {
  @scala.inline
  def apply(
    deviceId: java.lang.String = null,
    deviceIdentifier: DeviceIdentifier = null,
    sectionType: java.lang.String = null
  ): PartnerUnclaim = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier)
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType)
    __obj.asInstanceOf[PartnerUnclaim]
  }
}

