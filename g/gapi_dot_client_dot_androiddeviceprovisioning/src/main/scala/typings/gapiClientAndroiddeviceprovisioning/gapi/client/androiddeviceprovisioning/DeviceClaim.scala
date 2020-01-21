package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceClaim extends js.Object {
  /** Owner ID. */
  var ownerCompanyId: js.UndefOr[String] = js.undefined
  /** Section type of the device claim. */
  var sectionType: js.UndefOr[String] = js.undefined
}

object DeviceClaim {
  @scala.inline
  def apply(ownerCompanyId: String = null, sectionType: String = null): DeviceClaim = {
    val __obj = js.Dynamic.literal()
    if (ownerCompanyId != null) __obj.updateDynamic("ownerCompanyId")(ownerCompanyId.asInstanceOf[js.Any])
    if (sectionType != null) __obj.updateDynamic("sectionType")(sectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceClaim]
  }
}

