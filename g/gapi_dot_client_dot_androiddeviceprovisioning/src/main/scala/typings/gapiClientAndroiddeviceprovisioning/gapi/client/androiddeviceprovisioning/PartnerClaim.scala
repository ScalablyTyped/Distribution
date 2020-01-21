package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerClaim extends js.Object {
  /** Customer ID to claim for. */
  var customerId: js.UndefOr[String] = js.undefined
  /** Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Metadata to set at claim. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** Section type to claim. */
  var sectionType: js.UndefOr[String] = js.undefined
}

object PartnerClaim {
  @scala.inline
  def apply(
    customerId: String = null,
    deviceIdentifier: DeviceIdentifier = null,
    deviceMetadata: DeviceMetadata = null,
    sectionType: String = null
  ): PartnerClaim = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerClaim]
  }
}

