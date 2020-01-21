package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** Claims. */
  var claims: js.UndefOr[js.Array[DeviceClaim]] = js.undefined
  /**
    * The resource name of the configuration.
    * Only set for customers.
    */
  var configuration: js.UndefOr[String] = js.undefined
  /** Device ID. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Device metadata. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** Resource name in `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. */
  var name: js.UndefOr[String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    claims: js.Array[DeviceClaim] = null,
    configuration: String = null,
    deviceId: String = null,
    deviceIdentifier: DeviceIdentifier = null,
    deviceMetadata: DeviceMetadata = null,
    name: String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

