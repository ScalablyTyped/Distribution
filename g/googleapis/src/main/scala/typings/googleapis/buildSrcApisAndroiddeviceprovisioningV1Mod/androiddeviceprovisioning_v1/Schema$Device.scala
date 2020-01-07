package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android device registered for zero-touch enrollment.
  */
@js.native
trait Schema$Device extends js.Object {
  /**
    * Output only. The provisioning claims for a device. Devices claimed for
    * zero-touch enrollment have a claim with the type
    * `SECTION_TYPE_ZERO_TOUCH`. Call `partners.devices.unclaim` or
    * `partners.devices.unclaimAsync` to remove the device from zero-touch
    * enrollment.
    */
  var claims: js.UndefOr[js.Array[Schema$DeviceClaim]] = js.native
  /**
    * Not available to resellers.
    */
  var configuration: js.UndefOr[String] = js.native
  /**
    * Output only. The ID of the device. Assigned by the server.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The hardware IDs that identify a manufactured device. To learn more, read
    * [Identifiers](/zero-touch/guides/identifiers).
    */
  var deviceIdentifier: js.UndefOr[Schema$DeviceIdentifier] = js.native
  /**
    * The metadata attached to the device. Structured as key-value pairs. To
    * learn more, read [Device metadata](/zero-touch/guides/metadata).
    */
  var deviceMetadata: js.UndefOr[Schema$DeviceMetadata] = js.native
  /**
    * Output only. The API resource name in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. Assigned by the server.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Device {
  @scala.inline
  def apply(
    claims: js.Array[Schema$DeviceClaim] = null,
    configuration: String = null,
    deviceId: String = null,
    deviceIdentifier: Schema$DeviceIdentifier = null,
    deviceMetadata: Schema$DeviceMetadata = null,
    name: String = null
  ): Schema$Device = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Device]
  }
}

