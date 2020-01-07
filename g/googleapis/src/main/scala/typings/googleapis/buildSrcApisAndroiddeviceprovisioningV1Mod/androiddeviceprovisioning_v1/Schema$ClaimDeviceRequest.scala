package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to claim a device on behalf of a customer.
  */
@js.native
trait Schema$ClaimDeviceRequest extends js.Object {
  /**
    * Required. The ID of the customer for whom the device is being claimed.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Required. The device identifier of the device to claim.
    */
  var deviceIdentifier: js.UndefOr[Schema$DeviceIdentifier] = js.native
  /**
    * Optional. The metadata to attach to the device.
    */
  var deviceMetadata: js.UndefOr[Schema$DeviceMetadata] = js.native
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object Schema$ClaimDeviceRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    deviceIdentifier: Schema$DeviceIdentifier = null,
    deviceMetadata: Schema$DeviceMetadata = null,
    sectionType: String = null
  ): Schema$ClaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClaimDeviceRequest]
  }
}

