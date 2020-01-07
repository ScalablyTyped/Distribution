package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DeviceReference` is an API abstraction that lets you supply a _device_
  * argument to a method using one of the following identifier types:  * A
  * numeric API resource ID. * Real-world hardware IDs, such as IMEI number,
  * belonging to the manufactured   device.  Methods that operate on devices
  * take a `DeviceReference` as a parameter type because it&#39;s more flexible
  * for the caller. To learn more about device identifiers, read
  * [Identifiers](/zero-touch/guides/identifiers).
  */
@js.native
trait Schema$DeviceReference extends js.Object {
  /**
    * The ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The hardware IDs of the device.
    */
  var deviceIdentifier: js.UndefOr[Schema$DeviceIdentifier] = js.native
}

object Schema$DeviceReference {
  @scala.inline
  def apply(deviceId: String = null, deviceIdentifier: Schema$DeviceIdentifier = null): Schema$DeviceReference = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceReference]
  }
}

