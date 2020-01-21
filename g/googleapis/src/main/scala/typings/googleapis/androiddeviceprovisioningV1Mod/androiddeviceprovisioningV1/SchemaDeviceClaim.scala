package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of a device claimed by a reseller for a customer. Devices claimed
  * for zero-touch enrollment have a claim with the type
  * `SECTION_TYPE_ZERO_TOUCH`. To learn more, read [Claim devices for
  * customers](/zero-touch/guides/how-it-works#claim).
  */
@js.native
trait SchemaDeviceClaim extends js.Object {
  /**
    * The ID of the Customer that purchased the device.
    */
  var ownerCompanyId: js.UndefOr[String] = js.native
  /**
    * The ID of the reseller that claimed the device.
    */
  var resellerId: js.UndefOr[String] = js.native
  /**
    * Output only. The type of claim made on the device.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object SchemaDeviceClaim {
  @scala.inline
  def apply(ownerCompanyId: String = null, resellerId: String = null, sectionType: String = null): SchemaDeviceClaim = {
    val __obj = js.Dynamic.literal()
    if (ownerCompanyId != null) __obj.updateDynamic("ownerCompanyId")(ownerCompanyId.asInstanceOf[js.Any])
    if (resellerId != null) __obj.updateDynamic("resellerId")(resellerId.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceClaim]
  }
}

