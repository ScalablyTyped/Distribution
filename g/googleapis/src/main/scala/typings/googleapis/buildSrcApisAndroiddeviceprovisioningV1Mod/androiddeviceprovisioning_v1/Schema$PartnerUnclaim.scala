package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies one unclaim request.
  */
@js.native
trait Schema$PartnerUnclaim extends js.Object {
  /**
    * Device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Device identifier of the device.
    */
  var deviceIdentifier: js.UndefOr[Schema$DeviceIdentifier] = js.native
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object Schema$PartnerUnclaim {
  @scala.inline
  def apply(
    deviceId: String = null,
    deviceIdentifier: Schema$DeviceIdentifier = null,
    sectionType: String = null
  ): Schema$PartnerUnclaim = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PartnerUnclaim]
  }
}

