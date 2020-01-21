package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies one claim request.
  */
@js.native
trait SchemaPartnerClaim extends js.Object {
  /**
    * Required. The ID of the customer for whom the device is being claimed.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Required. Device identifier of the device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  /**
    * Required. The metadata to attach to the device at claim.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object SchemaPartnerClaim {
  @scala.inline
  def apply(
    customerId: String = null,
    deviceIdentifier: SchemaDeviceIdentifier = null,
    deviceMetadata: SchemaDeviceMetadata = null,
    sectionType: String = null
  ): SchemaPartnerClaim = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartnerClaim]
  }
}

